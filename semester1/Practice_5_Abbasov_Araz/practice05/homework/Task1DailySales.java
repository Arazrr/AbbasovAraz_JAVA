package Practice_5_Abbasov_Araz.practice05.homework;

import java.util.Scanner;


// КНД-12 Аббасов Араз


public class Task1DailySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        double[] sales = new double[7];

        System.out.println("=== ФІНАНСОВИЙ ЗВІТ КАВ'ЯРНІ ЗА ТИЖДЕНЬ ===");

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Введіть виторг за " + days[i] + " (грн): ");
            sales[i] = scanner.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        double average = total / sales.length;

        int max = 0;
        int min = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[max]) {
                max = i;
            }
            if (sales[i] < sales[min]) {
                min = i;
            }
        }

        System.out.println("\n---------------- ПІДСУМКИ ----------------");
        System.out.println("Загальний тижневий виторг: " + total + " грн");
        System.out.println("Середній виторг на день:    " + average + " грн");
        System.out.println("Найкращий день:            " + days[max] + " (" + sales[max] + " грн)");
        System.out.println("Найгірший день:            " + days[min] + " (" + sales[min] + " грн)");

        System.out.println("\nДні з виторгом вище середнього:");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                System.out.println("- " + days[i] + ": " + sales[i] + " грн");
            }
        }

        System.out.println("==========================================");
    }
}
