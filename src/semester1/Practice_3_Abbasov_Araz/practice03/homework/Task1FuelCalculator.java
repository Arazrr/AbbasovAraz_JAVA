package semester1.Practice_3_Abbasov_Araz.practice03.homework;

// КНД-12 Аббасов Араз

import java.util.Scanner;

public class Task1FuelCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== КАЛЬКУЛЯТОР ПОЇЗДКИ ТА ПАЛЬНОГО ===");

        System.out.print("Введіть відстань поїздки (км): ");
        double distance = scanner.nextDouble();

        System.out.print("Введіть середню витрату на 100 км (л): ");
        double vtrata = scanner.nextDouble();

        System.out.print("Оберіть тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int Type = scanner.nextInt();

        if (distance <= 0 || vtrata <= 0) {
            System.out.println("Помилка: відстань та витрата повинні бути більше 0.");
            return;
        }

        double pricelitr;
        String Name;

        switch (Type) {
            case 1:
                pricelitr = 56.50;
                Name = "Бензин А-95";
                break;

            case 2:
                pricelitr = 52.80;
                Name = "Дизель";
                break;

            case 3:
                pricelitr = 29.40;
                Name = "Газ";
                break;

            default:
                System.out.println("Помилка: невідомий тип пального.");
                return;
        }

        double Fuellllllllllllllllllll = distance * vtrata / 100.0;
        double baseCost = Fuellllllllllllllllllll * pricelitr;

        double finalCost = baseCost >= 2000.0 ? baseCost * 0.95 : baseCost;
        double discount = baseCost >= 2000.0 ? baseCost * 0.05 : 0;

        System.out.println();
        System.out.println("---------------- ЗВІТ ПОЇЗДКИ ----------------");
        System.out.println("Обране пальне:               " + Name + " (" + pricelitr + " грн/л)");
        System.out.println("Необхідно пального:          " + Fuellllllllllllllllllll + " л");
        System.out.println("Базова вартість:             " + baseCost + " грн");
        System.out.println("Знижка АЗС (5%):             " + discount + " грн");
        System.out.println("----------------------------------------------");
        System.out.println("Підсумкова сума до сплати:   " + finalCost + " грн");
        System.out.println("==============================================");
    }
}