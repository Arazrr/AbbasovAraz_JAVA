package semester1.Practice_10_Abbasov_Araz.practice10.homework;


public class Task3NumericalCalculusAndRootPolymorphism {
    public static void main(String[] args) {
        System.out.println("================ ЧИСЕЛЬНИЙ АНАЛІЗ: ІНТЕРФЕЙСИ ТА ПОЛІМОРФІЗМ ================");
        System.out.println("Дослідження поліморфного масиву AbstractMathFunction[3] на відрізку [0.00; 3.00]:\n");

        PolynomialFunction poly = new PolynomialFunction(-5.0, -2.0, 0.0, 1.0);
        AbstractMathFunction[] functions = {
                poly,
                new DampedHarmonyFunction(4.0, 0.5, 2.0),
                new StepHeavisideFunction(1.5, 2.0, 5.0)
        };
        double[] startGuesses = {2.0, 0.7};
        double[] derivPoints = {2.0, 1.0};

        double a = 0.0;
        double b = 3.0;

        for (int i = 0; i < functions.length; i++) {
            AbstractMathFunction fn = functions[i];
            String kind = fn.getClass().getSimpleName();
            if (fn instanceof PolynomialFunction) {
                kind = "final " + kind;
            }
            System.out.printf("%d. Функція: %s [%s]%n", i + 1, fn.getFormulaTitle(), kind);

            int n = (fn instanceof NewtonRootFindable) ? 100 : 1000;
            double integral = fn.integrateSimpson(a, b, n);
            if (fn instanceof PolynomialFunction p) {
                System.out.printf(
                        "   -> Інтеграл Сімпсона на [%.1f; %.1f] (N=%d): %.6f (Точне значення: %.6f)%n",
                        a, b, n, integral, p.exactIntegral(a, b));
            } else {
                System.out.printf(
                        "   -> Інтеграл Сімпсона на [%.1f; %.1f] (N=%d): %.6f%n", a, b, n, integral);
            }

            if (fn instanceof NewtonRootFindable rf) {
                double xp = derivPoints[i];
                String name = fn.getFormulaTitle().substring(0, 1);
                System.out.printf(
                        "   -> [Differentiable1D] Похідна %s'(%.1f): аналітична = %.6f | чисельна = %.6f%n",
                        name, xp, rf.derivative(xp), rf.numericalDerivative(xp));

                double x0 = startGuesses[i];
                double root = rf.findRootNewton(x0, 50);
                System.out.printf(
                        "   -> [NewtonRootFindable] Корінь %s(x) = 0 (старт x0=%.1f): x* = %.7f (Перевірка %s(x*) = %.2e)%n",
                        name, x0, root, name, rf.evaluate(root));
            } else {
                System.out.println("   -> [Info] Функція розривна (не реалізує Differentiable1D / "
                        + "NewtonRootFindable) — пошук дотичних пропущено.");
            }
            System.out.println();
        }
        System.out.println("==============================================================================");
    }
}


interface Evaluable1D {
    double EPSILON = 1e-7;

    double evaluate(double x);
}

interface Integrable1D extends Evaluable1D {
    default double integrateSimpson(double a, double b, int n) {
        if (n < 2) {
            n = 100;
        }
        if (n % 2 != 0) {
            n++;
        }
        double h = (b - a) / n;
        double sumOdd = 0.0;
        double sumEven = 0.0;
        for (int i = 1; i < n; i++) {
            double fx = evaluate(a + i * h);
            if (i % 2 != 0) {
                sumOdd += fx;
            } else {
                sumEven += fx;
            }
        }
        return h / 3.0 * (evaluate(a) + evaluate(b) + 4.0 * sumOdd + 2.0 * sumEven);
    }
}

interface Differentiable1D extends Evaluable1D {
    double derivative(double x);

    default double numericalDerivative(double x) {
        double h = 1e-5;
        return (evaluate(x + h) - evaluate(x - h)) / (2 * h);
    }
}

interface NewtonRootFindable extends Differentiable1D {
    default double findRootNewton(double x0, int maxIter) {
        double x = x0;
        int iter = 0;
        while (Math.abs(evaluate(x)) > EPSILON && iter < maxIter) {
            double d = derivative(x);
            if (Math.abs(d) < 1e-12) {
                break; // захист від ділення на нуль
            }
            x = x - evaluate(x) / d;
            iter++;
        }
        return x;
    }
}


abstract class AbstractMathFunction implements Integrable1D {
    private final String formulaTitle;

    public AbstractMathFunction(String formulaTitle) {
        this.formulaTitle = formulaTitle;
    }

    public final String getFormulaTitle() {
        return formulaTitle;
    }
}


final class PolynomialFunction extends AbstractMathFunction implements NewtonRootFindable {
    private final double[] coeffs;

    public PolynomialFunction(double... coeffs) {
        super(buildTitle(coeffs));
        this.coeffs = coeffs.clone();
    }

    public double[] getCoeffs() {
        return coeffs.clone();
    }

    private static String buildTitle(double[] c) {
        StringBuilder sb = new StringBuilder("P(x) = ");
        for (int i = 0; i < c.length; i++) {
            double v = c[i];
            String term;
            if (i == 0) {
                term = String.format("%.2f", v);
            } else {
                String sign = v < 0 ? " - " : " + ";
                String power = (i == 1) ? "x" : "x^" + i;
                term = sign + String.format("%.2f*%s", Math.abs(v), power);
            }
            sb.append(term);
        }
        return sb.toString();
    }

    @Override
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = coeffs.length - 1; i >= 0; i--) { // схема Горнера
            result = result * x + coeffs[i];
        }
        return result;
    }

    @Override
    public double derivative(double x) {
        double result = 0.0;
        for (int i = coeffs.length - 1; i >= 1; i--) {
            result = result * x + i * coeffs[i];
        }
        return result;
    }

    public double exactIntegral(double a, double b) {
        return antiderivative(b) - antiderivative(a);
    }

    private double antiderivative(double x) {
        double sum = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            sum += coeffs[i] * Math.pow(x, i + 1) / (i + 1);
        }
        return sum;
    }
}

class DampedHarmonyFunction extends AbstractMathFunction implements NewtonRootFindable {
    private final double amplitude;
    private final double decayRate;
    private final double omega;

    public DampedHarmonyFunction(double amplitude, double decayRate, double omega) {
        super(String.format("D(x) = %.2f * exp(-%.2f*x) * cos(%.2f*x)",
                amplitude, decayRate, omega));
        this.amplitude = amplitude;
        this.decayRate = decayRate;
        this.omega = omega;
    }

    @Override
    public double evaluate(double x) {
        return amplitude * Math.exp(-decayRate * x) * Math.cos(omega * x);
    }

    @Override
    public double derivative(double x) {
        return -amplitude * Math.exp(-decayRate * x)
                * (decayRate * Math.cos(omega * x) + omega * Math.sin(omega * x));
    }
}

class StepHeavisideFunction extends AbstractMathFunction {
    private final double threshold;
    private final double lowValue;
    private final double highValue;

    public StepHeavisideFunction(double threshold, double lowValue, double highValue) {
        super(String.format("Step(x) = {%.1f при x < %.1f; %.1f при x >= %.1f}",
                lowValue, threshold, highValue, threshold));
        this.threshold = threshold;
        this.lowValue = lowValue;
        this.highValue = highValue;
    }

    @Override
    public double evaluate(double x) {
        return x < threshold ? lowValue : highValue;
    }
}

