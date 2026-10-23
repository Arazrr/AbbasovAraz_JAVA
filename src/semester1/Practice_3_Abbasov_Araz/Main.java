package semester1.Practice_3_Abbasov_Araz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice Task 3");
        System.out.println("-----------1 завдання----------(КНД-12 Аббасов Араз)");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur name: "); // вибачаюсь, мені просто англійською легше писати (знаю, це не потужно)
        String name = scanner.nextLine();

        System.out.print("Enter ur surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.println("=== ВХІДНІ ДАНІ ===");
        System.out.println("Your name : " + name);
        System.out.println("Your surname : " + surname);
        System.out.println("Your age : " + age);
        System.out.println("Your city : " + city);
        System.out.println("Hello " + name + " " + surname + " from " + city + "! Your age is " + age);

        System.out.println("-----------2 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Enter the first number :");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        double suma = a + b;
        double minus = a - b;
        double multiplication = a * b;
        double ostatok = a % b;

        System.out.println("Сума: " + suma);
        System.out.println("Різниця: " + minus);
        System.out.println("Добуток: " + multiplication);
        System.out.println("Остача від ділення: " + ostatok);

        System.out.println("-----------3 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Enter the sum in UAH: ");
        double sumauah = scanner.nextDouble();

        System.out.print("Enter the sum in USD: ");
        double sumausd = scanner.nextDouble();

        System.out.println("Сума до видачі: " + (sumauah / sumausd));

        System.out.println("-----------4 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть номер квитка: "); // я вже пишу українською, це потужно!
        int kvitok = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть повне ім'я студента: ");
        String NameStudent = scanner.nextLine();

        System.out.print("Назва спеціальності: ");
        String NameSpeciality = scanner.nextLine();

        System.out.println("Студент: " + NameStudent + ", квиток №" + kvitok + ", спеціальність: " + NameSpeciality);

        System.out.println("-----------5 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Ваш зріст (м): ");
        double height = scanner.nextDouble();

        System.out.print("Ваша вага (кг): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Розрахований BMI: " + bmi);

        System.out.println("-----------6 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть символ: ");
        char ch = scanner.next().charAt(0);

        int code = (int) ch;

        System.out.println("Символ: " + ch + " | Код символу: " + code); // я вже втомився :(

        System.out.println("-----------7 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Катет A: ");
        double katet = scanner.nextDouble();

        System.out.print("Катет B: ");
        double katet1 = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(katet, 2) + Math.pow(katet1, 2));

        System.out.println("Гіпотенуза: " + hypotenuse);
        System.out.println("Периметр: " + (katet + katet1 + hypotenuse));
        System.out.println("Площа: " + (katet * katet1) / 2);

        System.out.println("-----------8 завдання----------(КНД-12 Аббасов Араз)");
        scanner.nextLine();

        System.out.print("Товар: ");
        String product = scanner.nextLine();

        System.out.print("Ціна: ");
        double price = scanner.nextDouble();

        System.out.print("Кількість: ");
        int kilkist = scanner.nextInt();

        double total = price * kilkist;
        double vat = total * 0.20;

        System.out.println("Загальна сума: " + total + " грн (з них ПДВ 20%: " + vat + " грн)");

        System.out.println("-----------9 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число додатне");
        } else if (number == 0) {
            System.out.println("Число = 0");
        } else {
            System.out.println("Число від'ємне");
        }

        System.out.println("-----------10 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть число: ");
        int nunber = scanner.nextInt();

        if (nunber == 0) {
            System.out.println("Число = 0");
        } else if (nunber % 2 == 0) {
            System.out.println("Число парне");
        } else {
            System.out.println("Число непарне");
        }

        System.out.println("-----------11 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть вік: ");
        int age11 = scanner.nextInt();

        if (age11 < 0) {
            System.out.println("Некоректний вік");
        } else if (age11 <= 12) {
            System.out.println("Дитина");
        } else if (age11 <= 17) {
            System.out.println("Підліток");
        } else if (age11 <= 64) {
            System.out.println("Дорослий");
        } else if (age11 <= 120) {
            System.out.println("Пенсіонер");
        } else {
            System.out.println("Некоректний вік");
        }

        System.out.println("-----------12 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть бал: ");
        int score = scanner.nextInt();

        if (score < 0) {
            System.out.println("Помилка: некоректний бал!");
        } else if (score >= 90) {
            System.out.println("Відмінно (A)");
        } else if (score >= 82) {
            System.out.println("Дуже добре (B)");
        } else if (score >= 74) {
            System.out.println("Добре (C)");
        } else if (score >= 64) {
            System.out.println("Задовільно (D)");
        } else if (score >= 60) {
            System.out.println("Достатньо (E)");
        } else {
            System.out.println("Незадовільно (F)");
        }

        System.out.println("-----------13 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть 3 числа: ");
        int a13 = scanner.nextInt();
        int b13 = scanner.nextInt();
        int c13 = scanner.nextInt();

        int max = a13;
        int min = a13;

        if (b13 > max) {
            max = b13;
        }

        if (c13 > max) {
            max = c13;
        }

        if (b13 < min) {
            min = b13;
        }

        if (c13 < min) {
            min = c13;
        }

        System.out.println("Максимум: " + max);
        System.out.println("Мінімум: " + min);

        System.out.println("-----------14 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть X: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть Y: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у початку координат.");
        } else if (x == 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться на осі OY.");
        } else if (y == 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться на осі OX.");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у I чверті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у II чверті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у III чверті.");
        } else {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV чверті.");
        }

        System.out.println("-----------15 завдання----------(КНД-12 Аббасов Араз)");
        {
            int x15 = 5;
            int y15 = 20;

            if (x15 > 10)
                if (y15 > 10)
                    System.out.println("x > 10 та y > 10");
                else
                    System.out.println("x < 10 та y < 10");

            System.out.println("Оскільки x = 5, умова x > 10 хибна, тому жоден з println вище не виконався — else насправді належить до найближчого if (y > 10), а не до зовнішнього if (x > 10).");

            if (x15 > 10) {
                if (y15 > 10) {
                    System.out.println("x > 10 та y > 10");
                }
            } else {
                System.out.println("x < 10 та y < 10");
            }
        }

        System.out.println("-----------16 завдання----------(КНД-12 Аббасов Араз)");
        {
            System.out.print("Спожито електроенергії (кВт·год): ");
            double trata = scanner.nextDouble();

            double payment = (trata <= 100)
                    ? trata * 2.64
                    : 100 * 2.64 + (trata - 100) * 4.32;

            System.out.println("Сума до сплати: " + payment + " грн");
        }

        System.out.println("-----------17 завдання----------(КНД-12 Аббасов Араз)");
        {
            System.out.print("Введіть X: ");
            int x17 = scanner.nextInt();

            System.out.print("Введіть Y: ");
            int y17 = scanner.nextInt();

            int max17 = (x17 > y17) ? x17 : y17;

            System.out.println("Більше число: " + max17);
        }

        System.out.println("-----------18 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть число: ");
        int n18 = scanner.nextInt();

        int abs = (n18 < 0) ? -n18 : n18;

        System.out.println("Модуль числа: " + abs);

        System.out.println("-----------19 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть число: ");
        int n19 = scanner.nextInt();

        String result = (n19 % 2 == 0) ? "Парне" : "Непарне";
        System.out.println(result);

        System.out.println("-----------20 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть бал: ");
        int bal = scanner.nextInt();

        System.out.println("Результат: " + (bal >= 60 ? "Зараховано" : "Незараховано"));

        System.out.println("-----------21 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть число: ");
        int nn = scanner.nextInt();

        String status = (nn > 0) ? "Додатне" : (nn < 0) ? "Від'ємне" : "Нуль";
        System.out.println(status);

        System.out.println("-----------22 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Сума покупки: ");
        double buyshop = scanner.nextDouble();

        System.out.println("До сплати зі знижкою: " +
                ((buyshop > 1000) ? buyshop * 0.90 : buyshop * 0.98));

        System.out.println("-----------23 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть перше число: ");
        double nuumber = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double nuumber2 = scanner.nextDouble();

        if (nuumber2 != 0) {
            double dividedby = nuumber / nuumber2;
            System.out.println("Результат: " + dividedby);
        } else {
            System.out.println("Результат: Помилка! Неможливо ділити на нуль");
        }

        System.out.println("-----------24 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Кількість знайдених помилок: ");
        int countt = scanner.nextInt();

        String sms = (countt == 1)
                ? "Знайдено 1 помилку"
                : "Знайдено " + countt + " помилок";

        System.out.println(sms);

        System.out.println("-----------25 завдання----------(КНД-12 Аббасов Араз)");
        int x25 = 10;
        int divisor = 0;

        if (divisor != 0 && (x25 / divisor > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }

        System.out.println("&& не обчислює (x / divisor), якщо divisor != 0 вже false");

        System.out.println("-----------26 завдання----------(КНД-12 Аббасов Араз)");
        int counter1 = 0;
        int counter2 = 0;

        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);

        System.out.println("counter1 = " + counter1);
        System.out.println("counter2 = " + counter2);
        System.out.println("&& зупиняється одразу");

        System.out.println("-----------27 завдання----------(КНД-12 Аббасов Араз)");
        int number27 = 5;

        if (number27 > 0 || (10 / 0 == 0)) {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        }

        System.out.println("-----------28 завдання----------(КНД-12 Аббасов Араз)");
        int counterA = 0;
        int counterB = 0;

        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);

        System.out.println("counterA = " + counterA);
        System.out.println("counterB = " + counterB);
        System.out.println("| обчислює обидві частини, тому counter B збільшився до 1.");

        System.out.println("-----------29 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть години: ");
        int hours = scanner.nextInt();

        System.out.print("Введіть хвилини: ");
        int minutes = scanner.nextInt();

        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);

        if (isValidTime) {
            System.out.println("Час: " + hours + ":" + minutes);
        } else {
            System.out.println("Помилка: некоректний час");
        }

        System.out.println("-----------30 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть сторону A: ");
        double a30 = scanner.nextDouble();

        System.out.print("Введіть сторону B: ");
        double b30 = scanner.nextDouble();

        System.out.print("Введіть сторону C: ");
        double c30 = scanner.nextDouble();

        boolean triangleExists = (a30 + b30 > c30) &&
                (a30 + c30 > b30) &&
                (b30 + c30 > a30);

        System.out.println("Трикутник існує: " + triangleExists);

        System.out.println("-----------31 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть число: ");
        int n31 = scanner.nextInt();

        boolean isEvenBitwise = (n31 & 1) == 0;
        boolean isEvenNormal = n31 % 2 == 0;

        System.out.println("Парне через &: " + isEvenBitwise);
        System.out.println("Парне через %: " + isEvenNormal);
        System.out.println("& 1 перевіряє останній двійковий біт числа.");

        System.out.println("-----------32 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("PIN-код правильний: ");
        boolean isPinCorrect = scanner.nextBoolean();

        System.out.print("Картка активна: ");
        boolean isCardActive = scanner.nextBoolean();

        System.out.print("Баланс достатній: ");
        boolean hasSufficientBalance = scanner.nextBoolean();

        System.out.print("Добовий ліміт перевищено: ");
        boolean isDailyLimitExceeded = scanner.nextBoolean();

        boolean sixseven = isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded;

        System.out.println("Транзакція дозволена: " + sixseven);

        System.out.println("-----------33 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть номер дня: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
        }

        System.out.println("-----------34 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть номер дня тижня: ");
        int day34 = scanner.nextInt();

        switch (day34) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будній (робочий) день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
        }

        System.out.println("-----------35 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть номер місяця: ");
        int month = scanner.nextInt();

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        if (days == 0) {
            System.out.println("Неіснуючий місяць");
        } else {
            System.out.println("Кількість днів: " + days);
        }

        System.out.println("-----------36 завдання----------(КНД-12 Аббасов Араз)");
        scanner.nextLine();

        System.out.print("Введіть місяць: ");
        String monthName = scanner.nextLine();

        String season = switch (monthName.toLowerCase()) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Некоректний місяць";
        };

        System.out.println("Пора року: " + season);

        System.out.println("-----------37 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Введіть вагу товару: ");
        double weight37 = scanner.nextDouble();

        System.out.print("Оберіть спосіб доставки: ");
        int delivery = scanner.nextInt();

        int deliveryPrice = switch (delivery) {
            case 1 -> 0;
            case 2 -> {
                if (weight37 > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };

        System.out.println("Вартість доставки: " + deliveryPrice + " грн");

        System.out.println("-----------38 завдання----------(КНД-12 Аббасов Араз)");
        System.out.print("Число 1: ");
        double a38 = scanner.nextDouble();

        System.out.print("Оберіть операцію (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Число 2: ");
        double b38 = scanner.nextDouble();

        double result38 = switch (op) {
            case '+' -> a38 + b38;
            case '-' -> a38 - b38;
            case '*' -> a38 * b38;
            case '/' -> b38 == 0 ? 0 : a38 / b38;
            default -> 0;
        };

        if (op == '/' && b38 == 0) {
            System.out.println("неможливо ділити на нуль");
        } else {
            System.out.println("Результат: " + result38);
        }

        System.out.println("-----------39 завдання----------(КНД-12 Аббасов Араз)");
        scanner.nextLine(); // .

        System.out.print("Введіть команду: ");
        String command = scanner.nextLine();

        boolean startCheck = command == "start";

        if (command.equalsIgnoreCase("start")) {
            System.out.println("Система успішно запущена!");
        }

        switch (command.toLowerCase()) {
            case "start" -> System.out.println("Система успішно запущена!");
            case "pause" -> System.out.println("Система призупинена!");
            case "stop" -> System.out.println("Система зупинена!");
            case "exit" -> System.out.println("Вихід із системи!");
            default -> System.out.println("Невідома команда");
        }

        System.out.println("-----------40 завдання----------(КНД-12 Аббасов Араз)");
        System.out.println("================ БАНКОМАТ ================");

        System.out.print("Введіть PIN: ");
        int pin = scanner.nextInt();

        if (pin != 1234) {
            System.out.println("Невірний PIN-код");
        } else {
            System.out.println("Авторизація успішна!");

            double balance = 5000.0;

            System.out.println();
            System.out.println("1: Перевірити баланс");
            System.out.println("2: Поповнити рахунок");
            System.out.println("3: Зняти готівку");
            System.out.println("4: Завершити роботу");

            System.out.print("Оберіть дію: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Баланс: " + balance + " грн");

                case 2 -> {
                    System.out.print("Введіть суму поповнення: ");
                    double add = scanner.nextDouble();

                    balance = balance + add;

                    System.out.println("Новий баланс: " + balance + " грн");
                }

                case 3 -> {
                    System.out.print("Введіть суму зняття: ");
                    double amount = scanner.nextDouble();

                    if (amount > 0 && amount <= balance) {
                        double commission = amount > 1000 ? amount * 0.01 : 0;

                        balance = balance - amount - commission;

                        System.out.println("Комісія операції: " + commission + " грн");
                        System.out.println("Видано: " + amount + " грн. Залишок на рахунку: " + balance + " грн");
                    } else {
                        System.out.println("Помилка: некоректна сума або недостатньо коштів");
                    }
                }

                case 4 -> System.out.println("Завершення роботи");

                default -> System.out.println("Некоректний вибір");
            }
        }
    }
}