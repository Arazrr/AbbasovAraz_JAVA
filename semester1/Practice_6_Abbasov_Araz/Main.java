package Practice_6_Abbasov_Araz;
import java.util.Scanner;

// КНД-12 Аббасов Араз

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------1 завдання-------------------------");
        Student s1 = new Student();
        s1.name = "Денис";
        s1.age = 19;
        s1.gpa = 4.75;
        System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);
        System.out.println("----------------------2 завдання-------------------------");
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;

        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;

        System.out.println(
                "Brand: " + car1.brand +
                "\nModel: " + car1.model +
                "\nYear: " + car1.year +
                "\nSpeed: " + car1.speed
        );

        System.out.println("-------");
        System.out.println(
                "Brand: " + car2.brand +
                "\nModel: " + car2.model +
                "\nYear: " + car2.year +
                "\nSpeed: " + car2.speed
        );
        System.out.println();
        if (car1.year > car2.year) {
            System.out.println(car1.brand + " " + car1.model + " (" + car1.year + ") новіший, ніж " + car2.brand + " " + car2.model + " (" + car2.year + ")");
        } else {
            System.out.println(car2.brand + " " + car2.model + " (" + car2.year + ") новіший, ніж " + car1.brand + " " + car1.model + " (" + car1.year + ")");
        }
        System.out.println("----------------------3 завдання-------------------------");
        Book emptyBook = new Book();

        System.out.println(
                "Title: " + emptyBook.title +
                "\nAuthor: " + emptyBook.author +
                "\nPages: " + emptyBook.pages +
                "\nis Read: " + emptyBook.isRead
        );
        System.out.println("----------------------4 завдання-------------------------");
        Rectangle Rectangle = new Rectangle();
        Rectangle.height = 4.0;
        Rectangle.width = 7.5;

        double S = Rectangle.width * Rectangle.height;

        double P = 2 * (Rectangle.width + Rectangle.height);

        System.out.println("Площа: " + S + "\nПериметр: " + P);
        System.out.println("----------------------5 завдання-------------------------");
        Product product = new Product();
        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;
        double suma = product.price * product.quantity;
        System.out.println(suma + " грн");
        System.out.println("----------------------6 завдання-------------------------");
        Smartphone Smartphone = new Smartphone();
        Smartphone.model = "Потужна модель";
        Smartphone.batteryLevel = 100;
        Smartphone.isTurnedOn = true;

        Smartphone.batteryLevel -= 35;

        if (Smartphone.batteryLevel <= 0) {
            Smartphone.isTurnedOn = false;
            System.out.println(Smartphone.batteryLevel + "%" + ". Телефон разрядился :(");
        } else {
            System.out.println(Smartphone.batteryLevel + "%" + ". Телефон працює :)");
        }
        System.out.println("----------------------7 завдання-------------------------");
        Point2D pointA = new Point2D();
        pointA.x = 0.0;
        pointA.y = 0.0;

        Point2D pointB = new Point2D();
        pointB.x = 3.0;
        pointB.y = 4.0;
        double d = Math.sqrt(Math.pow(pointB.x - pointA.x, 2) + Math.pow(pointB.y - pointA.y, 2));
        System.out.println("Відстань: " + d);
        System.out.println("----------------------8 завдання-------------------------");
        Student first = new Student();

        first.name = "Іван";
        Student second = first;
        second.name = "Петро";
        System.out.println(first.name); // сам в шоке насправді. Але так сталося бо змінні вказують на одного й того самого студента, тому зміна імені через другу змінну змінює його й для першої
        System.out.println("----------------------9 завдання-------------------------");
        Greeter greeter = new Greeter();
        greeter.sayHello();
        greeter.sayHelloTo("Araz");
        System.out.println("----------------------10 завдання-------------------------");
        Animal cat = new Animal();
        cat.species = "Кот";
        cat.name = "Потужний 67";

        Animal dog = new Animal();
        dog.species = "Собака";
        dog.name = "Рекс";

        cat.printInfo();
        cat.makeSound();

        System.out.println();

        dog.printInfo();
        dog.makeSound();
        System.out.println("----------------------11 завдання-------------------------");
        Counter Counter = new Counter();
        Counter.increment();
        Counter.increment();
        Counter.increment();

        Counter.decrement();
        Counter.printCount();
        System.out.println("----------------------12 завдання-------------------------");
        TrafficLight light = new TrafficLight();

        light.changeColor("Червоний");
        System.out.print("Колір: " + light.currentColor + " -> ");
        light.showSignal();

        light.changeColor("Жовтий");
        System.out.print("Колір: " + light.currentColor + " -> ");
        light.showSignal();

        light.changeColor("Зелений");
        System.out.print("Колір: " + light.currentColor + " -> ");
        light.showSignal();
        System.out.println("----------------------13 завдання-------------------------");
        Player player = new Player();
        player.nickname = "Araz2026";

        System.out.println("Гравець: " + player.nickname + ", Здоров'я: " + player.health);
        player.takeDamage(40);
        System.out.println("Здоров'я після шкоди: " + player.health);

        player.heal(20);
        System.out.println("Здоров'я після лікування: " + player.health);
        System.out.println("----------------------14 завдання-------------------------");
        Lamp lamp = new Lamp();
        lamp.status();

        lamp.turnOn();
        lamp.status();

        System.out.println("Перевірка toggle двічі поспіль:");
        lamp.toggle();
        lamp.status();

        lamp.toggle();
        lamp.status();

        System.out.println("----------------------15 завдання-------------------------");
        Stopwatch watch = new Stopwatch();
        watch.addSeconds(125);
        System.out.print("Час після додавання 125 секунд: ");
        watch.displayTime();

        watch.tick();
        System.out.print("Час після tick: ");
        watch.displayTime();
        System.out.println("----------------------16 завдання-------------------------");
        Printer Printer = new Printer();
        Printer Printer1 = new Printer();

        Printer.model = "Потужна модель Араз";
        Printer.paperCount = 50;

        Printer1.model = "JavaModel";
        Printer1.paperCount = 10;

        System.out.println("--- Друк №1 ---");
        Printer.printDocument("Складні практичні", 20);

        System.out.println("--- Друк №2 ---");
        Printer1.printDocument("Складна лекція", 40);
        System.out.println("----------------------17 завдання-------------------------");
        SimpleCalculator SimpleCalculator = new SimpleCalculator();


        int add = SimpleCalculator.add(20, 5);
        int subtract = SimpleCalculator.subtract(20, 5);
        int multiply = SimpleCalculator.multiply(4, 5);
        double divide = SimpleCalculator.divide(20, 4);

        System.out.println("Сума: " + add);
        System.out.println("Різниця: " + subtract);
        System.out.println("Добуток: " + multiply);
        System.out.println("Частка: " + divide);
        System.out.println("----------------------18 завдання-------------------------");
        Circle circle = new Circle();

        circle.radius = 5.0;
        System.out.println("Радіус: " + circle.radius);
        System.out.println("Площа круга: " + circle.getArea());
        System.out.println("Довжина кола: " + circle.getCircumference());
        System.out.println("----------------------19 завдання-------------------------");
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25.0;
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        double backToCelsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(celsius + "°C у Фаренгейтах: " + fahrenheit);
        System.out.println("Назад у Цельсіях: " + backToCelsius);
        System.out.println("----------------------20 завдання-------------------------");
        NumberChecker checker = new NumberChecker();

        int[] testNumbers = {7, 12, -5};
        for (int n : testNumbers) {
            System.out.println("Число: " + n);
            System.out.println("  - Парне: " + checker.isEven(n));
            System.out.println("  - Додатне: " + checker.isPositive(n));
            System.out.println("  - Просте: " + checker.isPrime(n));
        }
        System.out.println("----------------------21 завдання-------------------------");
        CurrencyExchange exchange = new CurrencyExchange(41.5);

        double uahAmount = 10000.0;
        double usdResult = exchange.toUSD(uahAmount);

        System.out.print("10 000 грн у доларах: " + usdResult);
        System.out.println("----------------------22 завдання-------------------------");
        Employee emp = new Employee();

        emp.name = "Олександр";
        emp.baseSalary = 30000.0;
        emp.bonusPercentage = 15.0;

        System.out.println("Працівник: " + emp.name);
        System.out.println("Повна зарплата з бонусом: " + emp.calculateTotalSalary() + " грн");
        System.out.println("Податок (19.5%): " + emp.calculateTax() + " грн");
        System.out.println("----------------------23 завдання-------------------------");
        TextFormatter formatter = new TextFormatter();

        String word = "Програмування";
        System.out.println("Форматоване заголовок: " + formatter.formatTitle(word));
        System.out.println("Кількість голосних: " + formatter.countVowels(word));
        System.out.println("----------------------24 завдання-------------------------");
        Triangle triangle = new Triangle();

        triangle.a = 3.0;
        triangle.b = 4.0;
        triangle.c = 5.0;
        System.out.println("Трикутник валідний? " + triangle.isValid());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площа (за формулою Герона): " + triangle.getArea());
        System.out.println("----------------------25 завдання-------------------------");
        SecretVault vault = new SecretVault();

        System.out.println("Спроба вірного коду 'Pass123': " + vault.verifyCode("Pass123"));
        System.out.println("Спроба невірного коду '1111': " + vault.verifyCode("1111"));
        System.out.println("----------------------26 завдання-------------------------");
        UserAccount account = new UserAccount();

        account.setCredentials("admin", "qwerty123");
        System.out.println("Логін з невірним паролем: " + account.login("admin", "wrong"));
        System.out.println("Логін з вірними даними: " + account.login("admin", "qwerty123"));
        account.changePassword("qwerty123", "newPass999");
        System.out.println("----------------------27 завдання-------------------------");
        BankAccount bankAccount = new BankAccount("UA12345", 1000.0);

        bankAccount.deposit(500.0);
        bankAccount.withdraw(1200.0);
        bankAccount.withdraw(500.0);
        System.out.println("----------------------28 завдання-------------------------");
        Thermometer thermo = new Thermometer();

        thermo.setTemperature(-300.0);
        thermo.setTemperature(36.6);
        System.out.println("----------------------29 завдання-------------------------");
        CarSpeedometer speedometer = new CarSpeedometer();
        speedometer.accelerate(200);
        System.out.println("Швидкість після розгону на 200: " + speedometer.getSpeed());
        speedometer.accelerate(100);
        System.out.println("Швидкість після спроби розігнатися вище ліміту: " + speedometer.getSpeed());
        speedometer.brake(50);
        System.out.println("Швидкість після гальмування: " + speedometer.getSpeed());

        System.out.println("----------------------30 завдання-------------------------");
        Person p1 = new Person();
        p1.setName("Олег");
        p1.setAge(25);
        p1.printSummary();

        Person p2 = new Person();
        p2.setName("Марія");
        p2.setAge(150);
        p2.setAge(30);
        p2.printSummary();
        System.out.println("----------------------31 завдання-------------------------");
        DiscountCard card = new DiscountCard();
        card.setOwnerName("Олексій");
        card.printCardInfo();

        System.out.println("Покупка на 3 000 грн ");
        card.addPurchase(3000.0);
        card.printCardInfo();

        System.out.println("Покупка ще на 10001 грн ");
        card.addPurchase(10001.0);
        card.printCardInfo();

        System.out.println("Покупка ще на 4 000 грн ");
        card.addPurchase(4000.0);
        card.printCardInfo();
        System.out.println("----------------------32 завдання-------------------------");
        SmartDoorLock lock = new SmartDoorLock();
        lock.enterPin(1111);
        lock.enterPin(2222);
        lock.enterPin(3333);
        lock.enterPin(1234);
        System.out.println("----------------------33 завдання-------------------------");
        GradeBook gradeBook = new GradeBook();
        int[] studentGrades = {85, 92, 78, 96, 65};
        gradeBook.setData("Максим", studentGrades);
        gradeBook.printInfo();
        System.out.println("----------------------34 завдання-------------------------");
        ArrayStats stats = new ArrayStats();
        int[] numbersArray = {4, 7, 12, 15, 22, 33, 40, 5, 8, 11};
        stats.setNumbers(numbersArray);
        System.out.println("Кількість парних: " + stats.countEvens());
        System.out.println("Кількість непарних: " + stats.countOdds());
        System.out.println("Сума елементів: " + stats.calculateSum());
        System.out.println("----------------------35 завдання-------------------------");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(150.0);
        cart.addItem(300.0);
        cart.addItem(450.0);
        System.out.println("\nЧек до знижки:");
        cart.printReceipt();
        cart.applyDiscount(15.0);
        System.out.println("\nЧек після знижки 15%:");
        cart.printReceipt();
        System.out.println("----------------------36 завдання-------------------------");
        TemperatureTracker tracker = new TemperatureTracker();
        double[] weekTemps = {18.5, 22.0, 25.5, 19.0, 24.0, 27.5, 21.0};
        tracker.setTemps(weekTemps);
        tracker.printWeeklyReport();
        System.out.println("Днів з температурою вище 22.0°C: " + tracker.countDaysAbove(22.0));
        System.out.println("----------------------37 завдання-------------------------");
        ArraySearcher searcher = new ArraySearcher();
        searcher.setData(new int[]{10, 25, 42, 58, 77});
        System.out.println("Містить число 42? " + searcher.contains(42));
        System.out.println("Індекс числа 42: " + searcher.findIndex(42));
        System.out.println("Містить число 100? " + searcher.contains(100));
        System.out.println("Індекс числа 100: " + searcher.findIndex(100));
        System.out.println("----------------------38 завдання-------------------------");

        Vector3D vector = new Vector3D();
        vector.setCoords(2.0, 3.0, 6.0);

        System.out.print("Початковий вектор: ");
        vector.printVector();
        System.out.println("Довжина вектора: " + vector.getMagnitude());
        vector.multiplyByScalar(2.0);
        System.out.print("Вектор після множення на 2: ");
        vector.printVector();
        System.out.println("----------------------39 завдання-------------------------");
        Matrix2D matrix2D = new Matrix2D();
        int[][] gridData = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrix2D.setGrid(gridData);
        matrix2D.printMatrix();
        System.out.println("Загальна сума елементів матриці: " + matrix2D.getTotalSum());
        System.out.println("Сума елементів 1-го рядка (індекс 1): " + matrix2D.getRowSum(1));
        System.out.println("----------------------40 завдання-------------------------");

        MatrixDiagonals diagonals = new MatrixDiagonals();
        diagonals.setMatrix(gridData);

        System.out.println("Сума головної діагоналі: " + diagonals.getMainDiagonalSum());
        System.out.println("Сума побічної діагоналі: " + diagonals.getAntiDiagonalSum());
        System.out.println("Діагоналі симетричні? " + diagonals.isDiagonalSymmetric());
    }
}
