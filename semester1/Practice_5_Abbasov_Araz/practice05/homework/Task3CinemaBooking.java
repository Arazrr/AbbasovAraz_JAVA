package Practice_5_Abbasov_Araz.practice05.homework;

import java.util.Scanner;


// КНД-12 Аббасов Араз


public class Task3CinemaBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int rows = 5;
        final int seats = 6;
        final double price = 180.0;

        char[][] hall = new char[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                hall[i][j] = 'O';
            }
        }

        int choice = -1;

        while (choice != 0) {
            System.out.println("\n=== ТЕРМІНАЛ КІНОТЕАТРУ: ЗАЛ №1 ===");
            System.out.println("1 - Показати схему залу");
            System.out.println("2 - Забронювати квиток");
            System.out.println("3 - Фінансова каса залу");
            System.out.println("0 - Завершити роботу");
            System.out.print("Ваш вибір: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Помилка! Введіть число від 0 до 3.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n      1  2  3  4  5  6");
                    for (int r = 0; r < rows; r++) {
                        System.out.print("Р" + (r + 1) + ": ");
                        for (int c = 0; c < seats; c++) {
                            System.out.print("[" + hall[r][c] + "]");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Введіть номер ряду (1-5): ");
                    int rowss = scanner.nextInt();

                    System.out.print("Введіть номер місця (1-6): ");
                    int seatttt = scanner.nextInt();

                    int r = rowss - 1;
                    int c = seatttt - 1;

                    if (r < 0 || r >= rows || c < 0 || c >= seats) {
                        System.out.println("❌ Помилка! Некоректні координати залу.");
                    } else if (hall[r][c] == 'X') {
                        System.out.println("⚠️ Місце [Ряд " + rowss + ", Місце " + seatttt + "] уже заброньоване!");
                    } else {
                        hall[r][c] = 'X';
                        System.out.println("✅ Місце [Ряд " + rowss + ", Місце " + seatttt + "] успішно заброньовано!");
                    }
                    break;

                case 3:
                    int busy = 0;
                    int free = 0;

                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < seats; j++) {
                            if (hall[i][j] == 'X') {
                                busy++;
                            } else {
                                free++;
                            }
                        }
                    }

                    int totalseats = rows * seats;
                    double hdhdhd = (double) Math.round(((double) busy / totalseats) * 10000.0) / 100.0;
                    double totall = busy * price;

                    System.out.println("\n--- СТАТИСТИКА ЗАЛУ ---");
                    System.out.println("Усього місць:       " + totalseats);
                    System.out.println("Зайнятих місць:     " + busy);
                    System.out.println("Вільних місць:      " + free);
                    System.out.println("Заповненість залу:  " + hdhdhd + "%");
                    System.out.println("Загальна виручка:   " + totall + " грн");
                    System.out.println("=======================");
                    break;

                case 0:
                    System.out.println("Роботу касового терміналу завершено.");
                    break;

                default:
                    System.out.println("❌ Помилка! Некоректний вибір у меню.");
                    break;
            }
        }
    }
}