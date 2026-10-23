package semester1.Practice_6_Abbasov_Araz.practice06.homework;


// КНД-12 Аббасов Араз


public class Task2QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("=== РОЗВ'ЯЗУВАЧ КВАДРАТНИХ РІВНЯНЬ ===");

        QuadraticEquation eq1 = new QuadraticEquation();
        eq1.setCoefficients(1.0, -5.0, 6.0);
        System.out.println("Тест 1:");
        eq1.printSolution();
        System.out.println("--------------------------------------");

        QuadraticEquation eq2 = new QuadraticEquation();
        eq2.setCoefficients(1.0, -4.0, 4.0);
        System.out.println("Тест 2:");
        eq2.printSolution();
        System.out.println("--------------------------------------");

        QuadraticEquation eq3 = new QuadraticEquation();
        eq3.setCoefficients(1.0, 2.0, 5.0);
        System.out.println("Тест 3:");
        eq3.printSolution();
        System.out.println("======================================");
    }

    static class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        public void setCoefficients(double a, double b, double c) {
            if (a == 0) {
                System.out.println("Увага: коефіцієнт 'a' не може дорівнювати 0 (це лінійне рівняння)!");
                this.a = 1.0;
            } else {
                this.a = a;
            }
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            return (b * b) - (4 * a * c);
        }

        public boolean hasRealRoots() {
            return getDiscriminant() >= 0;
        }

        public double getRoot1() {
            double d = getDiscriminant();
            if (d < 0) {
                return Double.NaN;
            }
            return (-b + Math.sqrt(d)) / (2 * a);
        }

        public double getRoot2() {
            double d = getDiscriminant();
            if (d < 0) {
                return Double.NaN;
            }
            return (-b - Math.sqrt(d)) / (2 * a);
        }

        public void printSolution() {
            System.out.println("Рівняння: " + a + "*x^2 + " + "(" + b + ")" + "*x + " + c + " = 0");
            double d = getDiscriminant();
            System.out.println("Дискримінант D = " + d);

            if (d > 0) {
                System.out.println("Рівняння має 2 дійсні корені:");
                System.out.println("  x1 = " + getRoot1());
                System.out.println("  x2 = " + getRoot2());
            } else if (d == 0) {
                System.out.println("Рівняння має один дійсний корінь:");
                System.out.println("  x = " + (-b / (2 * a)));
            } else {
                System.out.println("Рівняння не має дійсних коренів (D < 0)");
            }
        }
    }
}