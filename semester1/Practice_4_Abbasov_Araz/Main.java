package Practice_4_Abbasov_Araz;
import java.util.Scanner;
// кнд-12 Аббасов Араз

public class Main {
    public static void main(String[] args) {
        System.out.println("------------Завдання 1------------- (Аббасов Араз КНД-12)");
        for (int i = 0; i < 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
        System.out.println("------------Завдання 2------------- (Аббасов Араз КНД-12)");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        System.out.print("Введіть число N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "] " + text);
        }
        System.out.println("------------Завдання 3------------- (Аббасов Араз КНД-12)");
        int money = 500;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Місяць [" + i + "]" + " " + money + "грн");
            money += 500;
        }
        System.out.println("------------Завдання 4------------- (Аббасов Араз КНД-12)");
        System.out.print("Введіть курс євро до гривні (наприклад, 44.5): ");
        double rate = scanner.nextDouble();

        System.out.println("\n--- Таблиця еквівалентності (Курс: " + rate + " UAH) ---");

        // Цикл від 10 до 100 включно з кроком 10
        for (int eur = 10; eur <= 100; eur += 10) {
            double uah = eur * rate;
            // Виводимо за допомогою звичайного конкатенування рядків
            System.out.println(eur + " євро = " + uah + " грн");
        }
        System.out.println("------------Завдання 5------------- (Аббасов Араз КНД-12)");
        System.out.print("Введіть ширину рамки (кількість символів): ");
        int width = scanner.nextInt();

        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }

        System.out.println();
        System.out.println("------------Завдання 6------------- (Аббасов Араз КНД-12)");
        int count = 10;

        while(count != 0) {
            System.out.println("Поїхали! Ракета запущена!");
            count -= 1;
        }
        System.out.println("------------Завдання 7------------- (Аббасов Араз КНД-12)");
        int sum = 0;

        System.out.println("Вводьте цілі числа (введіть 0 для завершення):");
        int number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            number = scanner.nextInt();
        }

        System.out.println("Загальна сума всіх введених чисел: " + sum);
        System.out.println("------------Завдання 8------------- (Аббасов Араз КНД-12)");
        System.out.print("Введіть число M: ");
        int m = scanner.nextInt();

        int power = 1;

        System.out.println("Степені двійки, менші або рівні за " + m + ":");

        while (power <= m) {
            System.out.print(power + " ");
            power *= 2;
        }
        System.out.println("------------Завдання 9------------- (Аббасов Араз КНД-12)");
        System.out.print("Введіть ціле додатне число: ");
        int numberr = scanner.nextInt();

        int tempr = number;
        int countr = 0;
        int sumr = 0;

        if (numberr == 0) {
            countr = 1;
            sumr = 0;
        } else {
            while (tempr > 0) {
                sum += tempr % 10;
                count++;
                tempr /= 10;
            }
        }

        System.out.println("Кількість цифр у числі: " + count);
        System.out.println("Сума всіх його цифр: " + sum);

        System.out.println("------------Завдання 10------------- (Аббасов Араз КНД-12)");
        int numbers = 12345;
        int reversedNumber = 0;

        while (numbers > 0) {
            int digit = numbers % 10;                 // Отримуємо останню цифру
            reversedNumber = reversedNumber * 10 + digit; // Зсуваємо розряд і додаємо цифру
            numbers /= 10;                            // Відсікаємо останню цифру
        }

        System.out.println("Оригінальне число: 12345");
        System.out.println("Реверснуте число: " + reversedNumber);
        System.out.println("------------Завдання 11------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть початковий внесок S (грн):");
        double s = scanner.nextDouble();
        System.out.println("Введіть річний відсоток P (%):");
        double p = scanner.nextDouble();
        double currentDeposit = s;
        int years = 0;
        while (currentDeposit < s * 2) {
            currentDeposit += currentDeposit * (p / 100.0);
            years++;
        }
        System.out.println("Кількість років: " + years);
        System.out.println("Підсумкова сума: " + currentDeposit);

        System.out.println("------------Завдання 12------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть число N (N > 1):");
        int n12 = scanner.nextInt();
        int divisor = 2;
        while (n12 % divisor != 0) {
            divisor++;
        }
        System.out.println("Найменший дільник: " + divisor);

        System.out.println("------------Завдання 13------------- (Аббасов Араз КНД-12)");
        System.out.println("Гра «Вгадай число». Комп'ютер загадав число від 1 до 100.");
        int secret = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts13 = 0;
        while (guess != secret) {
            System.out.println("Введіть ваш варіант:");
            guess = scanner.nextInt();
            attempts13++;
            if (guess < secret) {
                System.out.println("Більше!");
            } else if (guess > secret) {
                System.out.println("Менше!");
            }
        }
        System.out.println("Вітаємо! Ви вгадали число. Кількість спроб: " + attempts13);

        System.out.println("------------Завдання 14------------- (Аббасов Араз КНД-12)");
        int menuChoice;
        do {
            System.out.println("1. Розпочати нову гру");
            System.out.println("2. Завантажити збереження");
            System.out.println("3. Налаштування");
            System.out.println("0. Вихід");
            System.out.println("Оберіть пункт меню:");
            menuChoice = scanner.nextInt();

            if (menuChoice == 1) {
                System.out.println("Нова гра розпочата");
            } else if (menuChoice == 2) {
                System.out.println("Завантаження гри");
            } else if (menuChoice == 3) {
                System.out.println("Відкрито налаштування");
            } else if (menuChoice == 0) {
                System.out.println("Вихід з меню");
            } else {
                System.out.println("Некоректний вибір, спробуйте ще раз");
            }
        } while (menuChoice != 0);

        System.out.println("------------Завдання 15------------- (Аббасов Араз КНД-12)");
        int age;
        do {
            System.out.println("Введіть ваш вік (від 1 до 120):");
            age = scanner.nextInt();
            if (age < 1 || age > 120) {
                System.out.println("Некоректний вік! Спробуйте ще раз.");
            }
        } while (age < 1 || age > 120);
        System.out.println("Вік підтверджено: " + age);

        System.out.println("------------Завдання 16------------- (Аббасов Араз КНД-12)");
        int correctPin = 1234;
        int inputPin;
        int pinAttempts = 0;
        boolean accessGranted = false;
        do {
            System.out.println("Введіть PIN-код:");
            inputPin = scanner.nextInt();
            pinAttempts++;
            if (inputPin == correctPin) {
                accessGranted = true;
                break;
            } else {
                System.out.println("Невірний PIN-код!");
            }
        } while (pinAttempts < 3);

        if (accessGranted) {
            System.out.println("Доступ надано");
        } else {
            System.out.println("Карту заблоковано!");
        }

        System.out.println("------------Завдання 17------------- (Аббасов Араз КНД-12)");
        char continueChoice;
        do {
            System.out.println("Введіть перше число:");
            double a = scanner.nextDouble();
            System.out.println("Введіть друге число:");
            double b = scanner.nextDouble();
            System.out.println("Результат додавання: " + (a + b));
            System.out.println("Бажаєте продовжити? (y/n):");
            continueChoice = scanner.next().toLowerCase().charAt(0);
        } while (continueChoice == 'y');

        System.out.println("------------Завдання 18------------- (Аббасов Араз КНД-12)");
        int dice1, dice2;
        int diceRolls = 0;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            diceRolls++;
            System.out.println("Кидок " + diceRolls + ": " + dice1 + " і " + dice2);
        } while (dice1 != dice2);
        System.out.println("Випав дубль! Кількість спроб: " + diceRolls);

        System.out.println("------------Завдання 19------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть чисельник:");
        double numerator = scanner.nextDouble();
        double denominator;
        do {
            System.out.println("Введіть знаменник (значення не повинно дорівнювати 0):");
            denominator = scanner.nextDouble();
            if (denominator == 0) {
                System.out.println("Помилка! Ділення на нуль неможливе.");
            }
        } while (denominator == 0);
        System.out.println("Результат ділення: " + (numerator / denominator));

        System.out.println("------------Завдання 20------------- (Аббасов Араз КНД-12)");
        double gradeSum = 0;
        int gradeCount = 0;
        double inputGrade;
        do {
            System.out.println("Введіть бал за тест (від 0 до 100) або від'ємне число для завершення:");
            inputGrade = scanner.nextDouble();
            if (inputGrade >= 0 && inputGrade <= 100) {
                gradeSum += inputGrade;
                gradeCount++;
            } else if (inputGrade > 100) {
                System.out.println("Некоректний бал! Оцінка має бути в межах від 0 до 100.");
            }
        } while (inputGrade >= 0);

        if (gradeCount > 0) {
            System.out.println("Середній бал: " + (gradeSum / gradeCount));
        } else {
            System.out.println("Не було введено жодної коректної оцінки.");
        }

        System.out.println("------------Завдання 21------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть число A:");
        int a21 = scanner.nextInt();
        System.out.println("Введіть число B (B >= A):");
        int b21 = scanner.nextInt();
        System.out.println("Парні числа у заданому проміжку:");
        for (int i = a21; i <= b21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("------------Завдання 22------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть число N (від 0 до 20):");
        int n22 = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n22; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал " + n22 + "! = " + factorial);

        System.out.println("------------Завдання 23------------- (Аббасов Араз КНД-12)");
        System.out.println("Число | Квадрат | Куб");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " | " + (i * i) + " | " + (i * i * i));
        }

        System.out.println("------------Завдання 24------------- (Аббасов Араз КНД-12)");
        System.out.println("Числа від 1 до 50, які не діляться ні на 3, ні на 5:");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("------------Завдання 25------------- (Аббасов Араз КНД-12)");
        System.out.println("Перше число у діапазоні від 100 до 200, яке ділиться і на 13, і на 7:");
        for (int i = 100; i <= 200; i++) {
            if (i % 13 == 0 && i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("------------Завдання 26------------- (Аббасов Араз КНД-12)");
        System.out.println("------------Завдання 26------------- (Аббасов Араз КНД-12)");
        System.out.println("Латинський алфавіт з ASCII кодами:");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " - " + (int) c);
        }

        System.out.println("------------Завдання 27------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть кількість елементів N:");
        int n27 = scanner.nextInt();
        int sum27 = 0;
        for (int i = 1; i <= n27; i++) {
            if (i % 2 != 0) {
                sum27 += i;
            } else {
                sum27 -= i;
            }
        }
        System.out.println("Знакозмінна сума: " + sum27);

        System.out.println("------------Завдання 28------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть перший член прогресії a1:");
        double a1 = scanner.nextDouble();
        System.out.println("Введіть різницю d:");
        double d28 = scanner.nextDouble();
        System.out.println("Введіть кількість членів n:");
        int n28 = scanner.nextInt();
        double sum28 = 0;
        System.out.println("Члени прогресії:");
        for (int i = 0; i < n28; i++) {
            double term = a1 + i * d28;
            System.out.print(term + " ");
            sum28 += term;
        }
        System.out.println();
        System.out.println("Сума членів прогресії: " + sum28);

        System.out.println("------------Завдання 29------------- (Аббасов Араз КНД-12)");
        byte b = 125;
        System.out.println("Початкове значення b: " + b);
        for (int i = 0; i < 6; i++) {
            b = (byte) (b + 1);
            System.out.println("Крок " + (i + 1) + ": " + b);
        }
        System.out.println("Пояснення: Тип byte приймає значення від -128 до 127. При додаванні 1 до 127 відбувається переповнення і число переходить у від'ємний діапазон (-128).");

        System.out.println("------------Завдання 30------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть кількість чисел N:");
        int n30 = scanner.nextInt();
        int sum30 = 0;
        for (int i = 1; i <= n30; i++) {
            System.out.println("Введіть число " + i + ":");
            sum30 += scanner.nextInt();
        }
        double exactAvg = (double) sum30 / n30;
        int intAvg = sum30 / n30;
        System.out.println("Точне середнє (з приведеним double): " + exactAvg);
        System.out.println("Результат без приведення (цілочисельне ділення): " + intAvg);

        System.out.println("------------Завдання 31------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть слово з 5 символів:");
        String word31 = scanner.next();
        String encrypted = "";
        for (int i = 0; i < word31.length(); i++) {
            char ch = word31.charAt(i);
            encrypted += (char) (ch + 1);
        }
        System.out.println("Зашифрований рядок: " + encrypted);

        System.out.println("------------Завдання 32------------- (Аббасов Араз КНД-12)");
        double[] prices = {19.99, 45.50, 12.10, 99.95, 3.40};
        int totalHryvnias = 0;
        double totalKopecks = 0.0;
        for (int i = 0; i < prices.length; i++) {
            totalHryvnias += (int) prices[i];
            totalKopecks += (prices[i] - (int) prices[i]);
        }
        System.out.println("Загальна сума цілих гривень: " + totalHryvnias);
        System.out.println("Сума відкинутих копійок: " + totalKopecks);

        System.out.println("------------Завдання 33------------- (Аббасов Араз КНД-12)");
        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }

        System.out.println("------------Завдання 34------------- (Аббасов Араз КНД-12)");
        long bigNumber = 3000000000L;
        int castedNumber = (int) bigNumber;
        System.out.println("Значення long: " + bigNumber);
        System.out.println("Значення після (int): " + castedNumber);
        System.out.println("Пояснення: Значення перевищує Integer.MAX_VALUE (2147483647), тому старші біти відсікаються і результат стає викривленим.");

        System.out.println("------------Завдання 35------------- (Аббасов Араз КНД-12)");
        System.out.println("Цикл double d += 0.1 (накопичення похибки):");
        for (double d = 0.0; d <= 1.0; d += 0.1) {
            System.out.println(d);
        }
        System.out.println("Правильний цикл через int i:");
        for (int i = 0; i <= 10; i++) {
            double val = i / 10.0;
            System.out.println(val);
        }

        System.out.println("------------Завдання 36------------- (Аббасов Араз КНД-12)");
        System.out.println("Таблиця множення Піфагора:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

        System.out.println("------------Завдання 37------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть висоту H:");
        int h37 = scanner.nextInt();
        System.out.println("Введіть ширину W:");
        int w37 = scanner.nextInt();
        for (int i = 0; i < h37; i++) {
            for (int j = 0; j < w37; j++) {
                if (i == 0 || i == h37 - 1 || j == 0 || j == w37 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("------------Завдання 38------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть висоту трикутника N:");
        int n38 = scanner.nextInt();
        for (int i = 1; i <= n38; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------Завдання 39------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть число N (N >= 2):");
        int n39 = scanner.nextInt();
        System.out.println("Прості числа у діапазоні від 2 до " + n39 + ":");
        for (int i = 2; i <= n39; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("------------Завдання 40------------- (Аббасов Араз КНД-12)");
        System.out.println("Введіть розмір шахівниці N:");
        int n40 = scanner.nextInt();
        for (int i = 0; i < n40; i++) {
            for (int j = 0; j < n40; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}