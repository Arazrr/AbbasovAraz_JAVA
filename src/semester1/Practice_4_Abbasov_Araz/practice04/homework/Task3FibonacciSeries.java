package semester1.Practice_4_Abbasov_Araz.practice04.homework;

// КНД-12 Аббасов Араз

import java.util.Scanner;

public class Task3FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ЧИСЛА ФІБОНАЧЧІ ТА ЗОЛОТИЙ ПЕРЕТИН ===");

        int n;
        int f1 = 1;
        int f2 = 1;
        do {
            System.out.print("Скільки чисел згенерувати (N від 3 до 30): ");
            n = scanner.nextInt();

            if (n < 3 || n > 30) {
                System.out.println("Помилка! N повинно бути від 3 до 30. Спробуйте ще раз!");
            }
        } while (n < 3 || n > 30);


        System.out.println();
        System.out.printf("№ 1 | Число: %d%n", f1);
        System.out.printf("№ 2 | Число: %d%n", f2);

        double ratio = 0;

        for (int i = 3; i <= n; i++) {
            int next = f1 + f2;
            ratio = (double) next / f2;

            System.out.printf("№ %-2d | Число: %-8d | Відношення F(n)/F(n-1) = %.6f%n", i, next, ratio);
            f1 = f2;
            f2 = next;
        }


        double goldenRatio = 1.6180339;
        System.out.println();
        System.out.printf("Підсумок: знайдено наближення Золотого перетину: %.6f%n", ratio);
        System.out.printf("Еталонне значення: %.6f%n", goldenRatio);
        System.out.println("=========================================");
    }
}