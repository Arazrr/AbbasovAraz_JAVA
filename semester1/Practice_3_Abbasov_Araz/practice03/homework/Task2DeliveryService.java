package Practice_3_Abbasov_Araz.practice03.homework;

// КНД-12 Аббасов Араз

import java.util.Scanner;

public class Task2DeliveryService {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ТАРИФІКАТОР СЛУЖБИ ДОСТАВКИ ===");

        System.out.print("Введіть вагу відправлення (кг): ");
        double vaga = scanner.nextDouble();

        System.out.print("Введіть відстань транспортування (км): ");
        int distance = scanner.nextInt();

        System.out.print("Оберіть пункт призначення (1 - Відділення, 2 - Поштомат, 3 - Кур'єр): ");
        int Type = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Чи є у вас карта Premium? (так/ні): ");
        String premium = scanner.nextLine();

        if (vaga <= 0 || vaga > 50.0) {
            System.out.println("Помилка: вага повинна бути більше 0 та не більше 50 кг.");
            return;
        } else if (distance <= 0) {
            System.out.println("Помилка: відстань повинна бути більше 0 км.");
            return;
        }

        double Tariff = switch (Type) {
            case 1 -> 50.0;
            case 2 -> {
                if (vaga > 15.0) {
                    System.out.println("Помилка: поштомат не приймає посилки вагою більше 15 кг.");
                    yield -1;
                } else {
                    yield 60.0;
                }
            }
            case 3 -> 100.0;
            default -> -1;
        };

        if (Tariff == -1) {
            System.out.println("Помилка: невідомий тип доставки.");
            return;
        }

        String deliveryname;

        switch (Type) {
            case 1:
                deliveryname = "Відділення";
                break;
            case 2:
                deliveryname = "Поштомат";
                break;
            default:
                deliveryname = "Кур'єр";
        }

        double distanceFee;

        if (distance <= 50) {
            distanceFee = 0;
        } else if (distance <= 200) {
            distanceFee = 35.0;
        } else {
            distanceFee = 80.0;
        }

        double totalBeforeDiscount = Tariff + distanceFee;

        boolean guPremium = premium.equalsIgnoreCase("так");

        double finalCost = guPremium ? totalBeforeDiscount * 0.80 : totalBeforeDiscount;

        System.out.println();
        System.out.println("------------- НАКЛАДНА ДОСТАВКИ -------------");
        System.out.println("Тип доставки:              " + deliveryname + " (базовий тариф: " + Tariff + " грн)");
        System.out.println("Доплата за відстань:       " + distanceFee + " грн (" + distance + " км)");
        System.out.println("Сума до знижки:            " + totalBeforeDiscount + " грн");

        if (guPremium) {
            System.out.println("Статус клієнта:            Premium (-20%)");
        } else {
            System.out.println("Статус клієнта:            Звичайний клієнт");
        }

        System.out.println("---------------------------------------------");
        System.out.println("РАЗОМ ДО СПЛАТИ:           " + finalCost + " грн");
        System.out.println("=============================================");

        scanner.close(); // обов'язково, без цього ніяк! :)
    }
}