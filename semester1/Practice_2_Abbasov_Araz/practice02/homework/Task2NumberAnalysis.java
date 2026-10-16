package Practice_2_Abbasov_Araz.practice02.homework;

// КНД-12 Аббасов Араз

public class Task2NumberAnalysis {
    public static void main(String[] args) {
        int number = 742;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        int sum = hundreds + tens + units;
        int times = hundreds * tens * units;
        int reversed = units * 100 + tens * 10 + hundreds;
        boolean h = sum % 2 == 0;
        System.out.println("Початкове число:\t\t\t" + number);
        System.out.println("Розряди:\t\t\t\t\tСотні = " + hundreds + ", Десятки = " + tens + ", Одиниці = " + units);
        System.out.println("Сума цифр:\t\t\t\t\t" + sum);
        System.out.println("Добуток цифр:\t\t\t\t" + times);
        System.out.println("Перевернуте число:\t\t\t" + reversed);
        System.out.println("Чи є сума цифр парною?\t\t" + h);
    }
}
