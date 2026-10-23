package semester1.Practice_6_Abbasov_Araz.practice06.homework;

// КНД-12 Аббасов Араз


public class Task1Fraction {
    public static void main(String[] args) {
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

        Fraction f1 = new Fraction();
        f1.setValues(8, 12);
        System.out.print("Дріб 1: ");
        f1.printFraction();
        System.out.println();
        f1.simplify();
        System.out.print("Після скорочення: ");
        f1.printFraction();
        System.out.print(" (десятковий вигляд: " + f1.toDecimal() + ")" + "\n\n");
        System.out.println("Додаємо дріб 3/4 до 2/3...");
        System.out.println("Формула: 2/3 + 3/4 = (2*4 + 3*3) / (3*4) = 17/12");

        f1.add(3, 4);
        System.out.print("Результат додавання: ");
        f1.printFraction();
        System.out.print(" (десятковий вигляд: " + f1.toDecimal() + "\n");
        System.out.println("=====================================");
    }

    static class Fraction {
        private int numerator;
        private int denominator;

        public void setValues(int num, int den) {
            if (den == 0) {
                System.out.println("Помилка: знаменник не може дорівнювати 0!");
                denominator = 1;
                numerator = num;
            } else if (den < 0) {
                numerator = -num;
                denominator = -den;
            } else {
                numerator = num;
                denominator = den;
            }
        }

        private int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // 4. Метод скорочення дробу
        public void simplify() {
            int commonDivisor = gcd(numerator, denominator);
            if (commonDivisor != 0) {
                numerator /= commonDivisor;
                denominator /= commonDivisor;
            }
        }

        public double toDecimal() {
            return (double) numerator / denominator;
        }

        public void add(int otherNum, int otherDen) {
            int newNumerator = (this.numerator * otherDen) + (otherNum * this.denominator);
            int newDenominator = this.denominator * otherDen;

            this.numerator = newNumerator;
            this.denominator = newDenominator;

            simplify();
        }

        public void printFraction() {
            if (denominator == 1) {
                System.out.print(numerator);
            } else {
                System.out.print(numerator + "/" + denominator);
            }
        }
    }
}