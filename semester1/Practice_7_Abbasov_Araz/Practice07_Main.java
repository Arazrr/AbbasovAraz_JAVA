package Practice_7_Abbasov_Araz;

public class Practice07_Main {
    public static void main(String[] args) {
        System.out.println("----------------------1 завдання-------------------------");
        Book book1 = new Book();
        Book book2 = new Book("Хороший парень", "Араз", 2026, 800000);
        book1.printInfo();
        book2.printInfo();
        System.out.println("----------------------2 завдання-------------------------");
        Student student1 = new Student("Ботан", 19, 4.8);
        Student student2 = new Student("Ну хтось то там", 12, 4.2);

        student1.printStudent();
        System.out.println("---------------------------------------------------------");
        student2.printStudent();
        System.out.println("----------------------3 завдання-------------------------");
        BankAccount account = new BankAccount("UA12345", "Іван Іванюк", 1000.0);
        account.deposit(500.0);
        boolean success = account.withdraw(1800.0);
        System.out.println("Спроба зняття 1800 успішна? " + success);
        account.withdraw(200.0);
        account.printAccount();
        System.out.println("----------------------4 завдання-------------------------");
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(3.0, 4.0);
        p1.printPoint();
        p2.printPoint();
        System.out.println("Відстань p2 до початку координат: " + p2.distanceToOrigin());
        System.out.println("----------------------5 завдання-------------------------");
        Product product = new Product("Ноутбук", 25000.0, 5, "Електроніка");
        product.applyDiscount(20.0);
        product.printProduct();
        System.out.println("----------------------6 завдання-------------------------");
        Time time = new Time(23, 59, 58);
        System.out.println(time.toUniversalString());
        time.tick();
        System.out.println("Після тіка: " + time.toUniversalString());
        time.tick();
        System.out.println("Після другого тіка (перехід доби): " + time.toUniversalString());
        System.out.println("Стандартний формат: " + time.toStandardString());
        System.out.println("----------------------7 завдання-------------------------");
        Rectangle rect = new Rectangle(4.0, 5.0);
        Rectangle square = new Rectangle(4.0);
        System.out.println("Прямокутник площа: " + rect.getArea() + ", периметр: " + rect.getPerimeter());
        System.out.println("Квадрат площа: " + square.getArea() + ", периметр: " + square.getPerimeter());
        System.out.println("----------------------8 завдання-------------------------");
        Employee emp = new Employee(1, "Олена Коваль", "Developer", 30000.0);
        emp.raiseSalary(15.0);
        emp.printBadge();
        System.out.println("Новий річний дохід: " + emp.getAnnualSalary());
        System.out.println("----------------------9 завдання-------------------------");
        User u1 = new User("admin", "admin@site.com", "ADMIN", true);
        User u2 = new User("manager", "manager@site.com");
        User u3 = new User("developer");
        User u4 = new User();
        u1.printProfile();
        u2.printProfile();
        u3.printProfile();
        u4.printProfile();
        System.out.println("----------------------10 завдання-------------------------");
        Fraction f1 = new Fraction(6, -9);
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction();
        f1.print();
        f2.print();
        f3.print();
        System.out.println("Десяткове значення f1: " + f1.toDouble());
        System.out.println("----------------------11 завдання-------------------------");
        System.out.println("----------------------11 завдання-------------------------");
        Car car1 = new Car("Toyota", "Camry", 2023);
        car1.drive(150.0);
        car1.startEngine();
        car1.drive(150.0);
        car1.printCar();
        Car car2 = new Car();
        car2.printCar();
        System.out.println("----------------------12 завдання-------------------------");
        SmartBulb bulb1 = new SmartBulb(80, 3000, false);
        SmartBulb bulb2 = new SmartBulb(120);
        SmartBulb bulb3 = new SmartBulb();
        bulb1.printStatus();
        bulb2.printStatus();
        bulb3.printStatus();
        System.out.println("----------------------13 завдання-------------------------");
        String sql = new QueryBuilder("users").select("id, name, email").where("age >= 18").build();
        System.out.println(sql);
        String sql2 = new QueryBuilder("orders").build();
        System.out.println(sql2);
        System.out.println("----------------------14 завдання-------------------------");
        CoffeeOrder coffee1 = new CoffeeOrder("Лате", "Large", 2, true);
        CoffeeOrder coffee2 = new CoffeeOrder("Капучино", "Small");
        CoffeeOrder coffee3 = new CoffeeOrder("Еспресо");
        coffee1.printReceipt();
        coffee2.printReceipt();
        coffee3.printReceipt();
        System.out.println("----------------------15 завдання-------------------------");
        Box box1 = new Box(3.0, "Картон");
        Box box2 = new Box(box1);
        box1.printBox();
        box2.printBox();
        System.out.println("Об'єми однакові? " + (box1.getVolume() == box2.getVolume()));
        System.out.println("----------------------16 завдання-------------------------");
        FlightTicket ticket = new FlightTicket("TK-1001", "Олена Коваль", "PS-101", "Київ", "Львів");
        ticket.assignSeat("12A");
        ticket.printBoardingPass();
        System.out.println("----------------------17 завдання-------------------------");
        MathOperations math = new MathOperations();
        System.out.println("add(2, 3) = " + math.add(2, 3));
        System.out.println("add(2.5, 3.5) = " + math.add(2.5, 3.5));
        System.out.println("add(1, 2, 3) = " + math.add(1, 2, 3));
        System.out.println("add(\"Привіт\", \"світ\") = " + math.add("Привіт", "світ"));
        System.out.println("multiply(4, 5) = " + math.multiply(4, 5));
        System.out.println("multiply(1.5, 4.0) = " + math.multiply(1.5, 4.0));
        System.out.println("multiply(\"ha\", 3) = " + math.multiply("ha", 3));
        System.out.println("----------------------18 завдання-------------------------");
        DocumentPrinter printer = new DocumentPrinter();
        String[] lines = {"Перший рядок", "Другий рядок", "Третій рядок"};
        printer.print("Звичайне повідомлення");
        printer.print(123);
        printer.print(3.14159, 2);
        printer.print(lines);
        printer.print("це великими літерами", true);
        System.out.println("----------------------19 завдання-------------------------");
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Квадрат: " + calc.calculateArea(5.0));
        System.out.println("Прямокутник: " + calc.calculateArea(4.0, 6.0));
        System.out.println("Круг: " + calc.calculateArea(3.0, true));
        System.out.println("Трикутник: " + calc.calculateArea(3.0, 4.0, 5.0));
        System.out.println("Трапеція: " + calc.calculateArea(4.0, 6.0, 5.0, true));
        System.out.println("----------------------20 завдання-------------------------");
        Logger logger = new Logger();
        logger.log("Програму запущено");
        logger.log("WARN", "Мало місця на диску");
        logger.log("ERROR", 404, "Файл не знайдено");
        logger.log("DB", "З'єднання встановлено", true);
        System.out.println("----------------------21 завдання-------------------------");
        ArraySearcher finder = new ArraySearcher();
        int[] nums = {4, 8, 15, 16, 23, 42, 8};
        String[] words = {"яблуко", "Груша", "банан", "груша"};
        System.out.println("Число 8: " + finder.find(nums, 8));
        System.out.println("Число 8 з індексу 2: " + finder.find(nums, 8, 2));
        System.out.println("Число 99: " + finder.find(nums, 99));
        System.out.println("Слово \"груша\": " + finder.find(words, "груша"));
        System.out.println("Слово \"груша\" без урахування регістру: " + finder.find(words, "груша", true));
        System.out.println("----------------------22 завдання-------------------------");
        DateService date = new DateService(15, 3, 2024);
        date.printDate();
        date.add(20);
        date.printDate();
        date.add(0, 3);
        date.printDate();
        System.out.println("----------------------23 завдання-------------------------");
        SalaryCalculator salary = new SalaryCalculator();
        System.out.println("Лише ставка: " + salary.calculate(20000.0));
        System.out.println("Ставка + премія: " + salary.calculate(20000.0, 3000.0));
        System.out.println("З бонусом 10% і податком: " + salary.calculate(20000.0, 10.0, true));
        System.out.println("Зі зверхурочними: " + salary.calculate(20000.0, 10, 150.0));
        System.out.println("----------------------24 завдання-------------------------");
        ArrayFilter filt = new ArrayFilter();
        int[] arr = {12, 5, 8, 19, 24, 3, 16};
        System.out.print("Більше 10: ");
        printArray(filt.filter(arr, 10));
        System.out.print("Від 5 до 16: ");
        printArray(filt.filter(arr, 5, 16));
        System.out.print("Парні: ");
        printArray(filt.filter(arr, true));
        System.out.print("Непарні: ");
        printArray(filt.filter(arr, false));
        System.out.println("----------------------25 завдання-------------------------");
        UserAccount acc1 = new UserAccount("alex", "alex@mail.com");
        UserAccount acc2 = new UserAccount("maria", "maria@mail.com");
        UserAccount acc3 = new UserAccount("oleg", "oleg@mail.com");
        acc1.printUser();
        acc2.printUser();
        acc3.printUser();
        System.out.println("Наступний вільний ID: " + UserAccount.getNextAvailableId());
        UserAccount.resetIdSequence(2000);
        System.out.println("Після скидання наступний ID: " + UserAccount.getNextAvailableId());
        System.out.println("----------------------26 завдання-------------------------");
        for (int i = 1; i <= 6; i++) {
            boolean ok = ServerConfig.connect();
            System.out.println("Користувач " + i + " підключився? " + ok);
        }
        ServerConfig.printServerStatus();
        ServerConfig.disconnect();
        ServerConfig.printServerStatus();
        System.out.println("----------------------27 завдання-------------------------");
        System.out.println("Факторіал 5: " + MathUtils.factorial(5));
        System.out.println("2 в степені 10: " + MathUtils.power(2.0, 10));
        System.out.println("2 в степені -2: " + MathUtils.power(2.0, -2));
        System.out.println("НСД(48, 18): " + MathUtils.gcd(48, 18));
        System.out.println("clamp(15, 0, 10): " + MathUtils.clamp(15, 0, 10));
        System.out.println("PI = " + MathUtils.PI + ", E = " + MathUtils.E);
        System.out.println("----------------------28 завдання-------------------------");
        System.out.println("100 USD = " + CurrencyExchange.usdToUah(100.0) + " UAH");
        System.out.println("50 EUR = " + CurrencyExchange.eurToUah(50.0) + " UAH");
        System.out.println("8300 UAH = " + CurrencyExchange.uahToUsd(8300.0) + " USD");
        CurrencyExchange.updateRates(42.0, 46.0);
        System.out.println("Після зміни курсу:");
        System.out.println("100 USD = " + CurrencyExchange.usdToUah(100.0) + " UAH");
        System.out.println("50 EUR = " + CurrencyExchange.eurToUah(50.0) + " UAH");
        System.out.println("8400 UAH = " + CurrencyExchange.uahToUsd(8400.0) + " USD");
        System.out.println("----------------------29 завдання-------------------------");
        FleetCar fc1 = new FleetCar("VIN001", 12000.0);
        FleetCar fc2 = new FleetCar("VIN002", 5000.0);
        FleetCar fc3 = new FleetCar("VIN003", 0.0);
        fc1.addTrip(150.0);
        fc2.addTrip(200.0);
        fc3.addTrip(80.0);
        FleetCar.printFleetSummary();
        System.out.println("----------------------30 завдання-------------------------");
        System.out.println("Паліндром? " + StringUtils.isPalindrome("А роза упала на лапу Азора"));
        System.out.println("Паліндром? " + StringUtils.isPalindrome("Hello"));
        System.out.println("Реверс: " + StringUtils.reverse("Привіт"));
        System.out.println("Голосних: " + StringUtils.countVowels("Programming in Java"));
        System.out.println("Картка: " + StringUtils.maskCardNumber("1234 5678 9012 3456"));
        System.out.println("----------------------31 завдання-------------------------");
        GameSession s1 = GameSession.createSession("Макс");
        GameSession s2 = GameSession.createSession("Оля");
        GameSession s3 = GameSession.createSession("Дима");
        GameSession s4 = GameSession.createSession("Олег");
        s1.printSession();
        s2.printSession();
        s3.printSession();
        System.out.println("Четверта сесія null? " + (s4 == null));
        s1.terminate();
        GameSession s5 = GameSession.createSession("Олег");
        s5.printSession();
        System.out.println("----------------------32 завдання-------------------------");
        System.out.println("Енергія спокою 1 грама: " + PhysicsEngine.restEnergy(0.001) + " Дж");
        System.out.println("Падіння за 5 секунд: " + PhysicsEngine.freeFallDistance(5.0) + " м");
        System.out.println("Кінетична енергія (10 кг, 20 м/с): " + PhysicsEngine.kineticEnergy(10.0, 20.0) + " Дж");
        System.out.println("----------------------33 завдання-------------------------");
        LineSegment seg = new LineSegment(new Point(1.0, 2.0), new Point(7.0, 10.0));
        seg.printSegment();
        System.out.println("Довжина: " + seg.getLength());
        Point mid = seg.getMidPoint();
        System.out.println("Середина: (" + mid.getX() + "; " + mid.getY() + ")");
        LineSegment seg2 = new LineSegment(0.0, 0.0, 3.0, 4.0);
        seg2.printSegment();
        System.out.println("Довжина: " + seg2.getLength());
        System.out.println("----------------------34 завдання-------------------------");
        ClientAccount ivan = new ClientAccount("UA001", "Іван", 10000.0);
        ClientAccount maria = new ClientAccount("UA002", "Марія", 2000.0);
        boolean done = ivan.transferTo(maria, 3500.0);
        System.out.println("Переказ успішний? " + done);
        System.out.println("Переказ самому собі? " + ivan.transferTo(ivan, 100.0));
        ivan.printAccount();
        maria.printAccount();
        System.out.println("----------------------35 завдання-------------------------");
        Engine engine = new Engine("EN-2024-001", 150);
        CarWithEngine bmw = new CarWithEngine("BMW", "X5", engine);
        bmw.printSpecs();
        bmw.startCar();
        bmw.printSpecs();
        bmw.turnOff();
        bmw.printSpecs();
        System.out.println("----------------------36 завдання-------------------------");
        Processor cpu = new Processor("Intel Core i5", 3.5, 8000.0);
        Memory ram1 = new Memory(16, 3200, 2500.0);
        Memory ram2 = new Memory(32, 3600, 5000.0);
        Computer pc = new Computer("Домашній ПК", cpu, ram1, 3000.0);
        pc.printSpecs();
        System.out.println("Ціна: " + pc.calculateTotalPrice());
        pc.upgradeMemory(ram2);
        pc.printSpecs();
        System.out.println("Нова ціна: " + pc.calculateTotalPrice());
        System.out.println("----------------------37 завдання-------------------------");
        Hero knight = new Hero("Лицар", 100, 25, 5);
        Hero orc = new Hero("Орк", 120, 20, 3);
        while (knight.isAlive() && orc.isAlive()) {
            knight.attack(orc);
            if (orc.isAlive()) {
                orc.attack(knight);
            }
        }
        if (knight.isAlive()) {
            System.out.println("Переміг: " + knight.getName());
        } else {
            System.out.println("Переміг: " + orc.getName());
        }
        System.out.println("----------------------38 завдання-------------------------");
        ShopProduct mouse = new ShopProduct(1, "Миша", 500.0);
        ShopProduct keyboard = new ShopProduct(2, "Клавіатура", 1200.0);
        ShopProduct monitor = new ShopProduct(3, "Монітор", 6500.0);
        Customer rich = new Customer("Богдан", 10000.0);
        Customer poor = new Customer("Таня", 800.0);
        Order order1 = new Order(rich, 5);
        order1.addProduct(mouse);
        order1.addProduct(keyboard);
        order1.checkout();
        Order order2 = new Order(poor, 5);
        order2.addProduct(monitor);
        order2.checkout();
        System.out.println("----------------------39 завдання-------------------------");
        Vector3D v1 = new Vector3D(1, 0, 0);
        Vector3D v2 = new Vector3D(0, 1, 0);
        Vector3D v3 = new Vector3D(1, 0, 0);
        Vector3D v4 = new Vector3D();
        v1.add(v2).print();
        System.out.println("Скалярний добуток: " + v1.dotProduct(v2));
        v1.crossProduct(v2).print();
        System.out.println("Перпендикулярні? " + v1.isOrthogonalTo(v2));
        System.out.println("v1 == v2 за значенням? " + v1.isEqualTo(v2));
        System.out.println("v1 == v3 за значенням? " + v1.isEqualTo(v3));
        v4.print();
        System.out.println("----------------------40 завдання-------------------------");
        LibraryCatalog library = new LibraryCatalog(5);
        library.addBook(new BookItem("978-966-01", "Кобзар", "Тарас Шевченко"));
        library.addBook(new BookItem("978-966-02", "Тіні забутих предків", "Михайло Коцюбинський"));
        library.addBook(new BookItem("978-966-03", "Лісова пісня", "Леся Українка"));
        library.printCatalog();
        System.out.println("Взяти \"Кобзар\": " + library.borrowBook("Кобзар"));
        library.printCatalog();
        System.out.println("Взяти \"Кобзар\" ще раз: " + library.borrowBook("Кобзар"));
        System.out.println("Взяти \"Енеїда\": " + library.borrowBook("Енеїда"));

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static class LibraryCatalog {
        private BookItem[] books;
        private int size;

        public LibraryCatalog(int capacity) {
            this.books = new BookItem[capacity];
            this.size = 0;
        }

        public void addBook(BookItem book) {
            if (size < books.length) {
                books[size] = book;
                size++;
            } else {
                System.out.println("Каталог заповнений, книгу не додано!");
            }
        }

        public BookItem findBookByTitle(String title) {
            for (int i = 0; i < size; i++) {
                if (books[i].getTitle().equals(title)) {
                    return books[i];
                }
            }
            return null;
        }

        public boolean borrowBook(String title) {
            BookItem book = findBookByTitle(title);
            if (book == null) {
                System.out.println("Книгу не знайдено: " + title);
                return false;
            }
            if (!book.isAvailable()) {
                System.out.println("Книга вже видана: " + title);
                return false;
            }
            book.borrowBook();
            return true;
        }

        public void printCatalog() {
            System.out.println("Каталог (" + size + " книг):");
            for (int i = 0; i < size; i++) {
                books[i].printBook();
            }
        }
    }

    public static class BookItem {
        private String isbn;
        private String title;
        private String author;
        private boolean isAvailable;

        public BookItem(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public String getTitle() {
            return title;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void borrowBook() {
            isAvailable = false;
        }

        public void returnBook() {
            isAvailable = true;
        }

        public void printBook() {
            String status = isAvailable ? "в наявності" : "видана";
            System.out.println("ISBN: " + isbn + " | " + title + " | " + author + " | " + status);
        }
    }

    public static class Vector3D {
        private double x;
        private double y;
        private double z;

        public Vector3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Vector3D() {
            this(0, 0, 0);
        }

        public Vector3D add(Vector3D other) {
            return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
        }

        public double dotProduct(Vector3D other) {
            return this.x * other.x + this.y * other.y + this.z * other.z;
        }

        public Vector3D crossProduct(Vector3D other) {
            return new Vector3D(
                    this.y * other.z - this.z * other.y,
                    this.z * other.x - this.x * other.z,
                    this.x * other.y - this.y * other.x);
        }

        public boolean isOrthogonalTo(Vector3D other) {
            return dotProduct(other) == 0;
        }

        public boolean isEqualTo(Vector3D other) {
            return this.x == other.x && this.y == other.y && this.z == other.z;
        }

        public void print() {
            System.out.println("Вектор(" + x + "; " + y + "; " + z + ")");
        }
    }

    public static class Order {
        private Customer customer;
        private ShopProduct[] items;
        private int itemCount;

        public Order(Customer customer, int maxItems) {
            this.customer = customer;
            this.items = new ShopProduct[maxItems];
            this.itemCount = 0;
        }

        public void addProduct(ShopProduct p) {
            if (itemCount < items.length) {
                items[itemCount] = p;
                itemCount++;
            } else {
                System.out.println("Замовлення заповнене, товар не додано!");
            }
        }

        public double calculateTotal() {
            double total = 0.0;
            for (int i = 0; i < itemCount; i++) {
                total += items[i].getPrice();
            }
            return total;
        }

        public boolean checkout() {
            double total = calculateTotal();
            if (customer.pay(total)) {
                System.out.println("----- ЧЕК -----");
                System.out.println("Клієнт: " + customer.getName());
                for (int i = 0; i < itemCount; i++) {
                    System.out.println(items[i].getTitle() + " - " + items[i].getPrice());
                }
                System.out.println("Разом: " + total + " | Залишок на рахунку: " + customer.getWalletBalance());
                return true;
            } else {
                System.out.println("Клієнту " + customer.getName() + " не вистачає коштів! Потрібно: " + total
                        + ", є: " + customer.getWalletBalance());
                return false;
            }
        }
    }

    public static class Customer {
        private String name;
        private double walletBalance;

        public Customer(String name, double walletBalance) {
            this.name = name;
            this.walletBalance = walletBalance;
        }

        public String getName() {
            return name;
        }

        public double getWalletBalance() {
            return walletBalance;
        }

        public boolean pay(double amount) {
            if (amount > 0 && walletBalance >= amount) {
                walletBalance -= amount;
                return true;
            }
            return false;
        }
    }

    public static class ShopProduct {
        private int id;
        private String title;
        private double price;

        public ShopProduct(int id, String title, double price) {
            this.id = id;
            this.title = title;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }
    }

    public static class Hero {
        private String name;
        private int health;
        private int attackPower;
        private int defense;

        public Hero(String name, int health, int attackPower, int defense) {
            this.name = name;
            this.health = health;
            this.attackPower = attackPower;
            this.defense = defense;
        }

        public String getName() {
            return name;
        }

        public void attack(Hero target) {
            int damage = this.attackPower - target.defense;
            if (damage <= 0) {
                damage = 1;
            }
            target.health -= damage;
            if (target.health < 0) {
                target.health = 0;
            }
            System.out.println(this.name + " б'є " + target.name + " і завдає " + damage
                    + " шкоди. У " + target.name + " залишилось HP: " + target.health);
        }

        public boolean isAlive() {
            return this.health > 0;
        }
    }

    public static class Computer {
        private String title;
        private Processor cpu;
        private Memory ram;
        private double casePrice;

        public Computer(String title, Processor cpu, Memory ram, double casePrice) {
            this.title = title;
            this.cpu = cpu;
            this.ram = ram;
            this.casePrice = casePrice;
        }

        public double calculateTotalPrice() {
            return cpu.getPrice() + ram.getPrice() + casePrice;
        }

        public void upgradeMemory(Memory newRam) {
            System.out.println("Апгрейд пам'яті: " + ram.getSizeGB() + " GB -> " + newRam.getSizeGB() + " GB");
            this.ram = newRam;
        }

        public void printSpecs() {
            System.out.println(title + " | Процесор: " + cpu.getModel() + " " + cpu.getFrequencyGHz()
                    + " GHz | Пам'ять: " + ram.getSizeGB() + " GB " + ram.getFrequencyMHz() + " MHz");
        }
    }

    public static class Memory {
        private int sizeGB;
        private int frequencyMHz;
        private double price;

        public Memory(int sizeGB, int frequencyMHz, double price) {
            this.sizeGB = sizeGB;
            this.frequencyMHz = frequencyMHz;
            this.price = price;
        }

        public int getSizeGB() {
            return sizeGB;
        }

        public int getFrequencyMHz() {
            return frequencyMHz;
        }

        public double getPrice() {
            return price;
        }
    }

    public static class Processor {
        private String model;
        private double frequencyGHz;
        private double price;

        public Processor(String model, double frequencyGHz, double price) {
            this.model = model;
            this.frequencyGHz = frequencyGHz;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public double getFrequencyGHz() {
            return frequencyGHz;
        }

        public double getPrice() {
            return price;
        }
    }

    public static class CarWithEngine {
        private String brand;
        private String model;
        private Engine engine;

        public CarWithEngine(String brand, String model, Engine engine) {
            this.brand = brand;
            this.model = model;
            this.engine = engine;
        }

        public void startCar() {
            this.engine.start();
            System.out.println(brand + " готовий до руху!");
        }

        public void turnOff() {
            this.engine.stop();
        }

        public void printSpecs() {
            System.out.println("Авто: " + brand + " " + model + " | Двигун: " + engine.getHorsePower()
                    + " к.с. | Працює: " + engine.isRunning());
        }
    }

    public static class Engine {
        private String serialNumber;
        private int horsePower;
        private boolean isRunning;

        public Engine(String serialNumber, int horsePower) {
            this.serialNumber = serialNumber;
            this.horsePower = horsePower;
            this.isRunning = false;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void start() {
            isRunning = true;
            System.out.println("Двигун " + serialNumber + " запущено");
        }

        public void stop() {
            isRunning = false;
            System.out.println("Двигун " + serialNumber + " зупинено");
        }

        public boolean isRunning() {
            return isRunning;
        }
    }

    public static class ClientAccount {
        private String iban;
        private String owner;
        private double balance;

        public ClientAccount(String iban, String owner, double balance) {
            this.iban = iban;
            this.owner = owner;
            this.balance = balance;
        }

        public boolean transferTo(ClientAccount recipient, double amount) {
            if (recipient == null || recipient == this) {
                return false;
            }
            if (amount > 0 && this.balance >= amount) {
                this.balance -= amount;
                recipient.balance += amount;
                return true;
            }
            return false;
        }

        public void printAccount() {
            System.out.println("IBAN: " + iban + " | Власник: " + owner + " | Баланс: " + balance);
        }
    }

    public static class LineSegment {
        private Point start;
        private Point end;

        public LineSegment(Point start, Point end) {
            this.start = start;
            this.end = end;
        }

        public LineSegment(double x1, double y1, double x2, double y2) {
            this.start = new Point(x1, y1);
            this.end = new Point(x2, y2);
        }

        public double getLength() {
            double dx = end.getX() - start.getX();
            double dy = end.getY() - start.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }

        public Point getMidPoint() {
            return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
        }

        public void printSegment() {
            System.out.println("Відрізок: (" + start.getX() + "; " + start.getY() + ") - ("
                    + end.getX() + "; " + end.getY() + ")");
        }
    }

    public static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    public static class PhysicsEngine {
        public static final double G = 9.80665;
        public static final double SPEED_OF_LIGHT = 299792458.0;

        private PhysicsEngine() {
        }

        public static double freeFallDistance(double seconds) {
            return G * seconds * seconds / 2;
        }

        public static double kineticEnergy(double massKg, double velocityMs) {
            return massKg * velocityMs * velocityMs / 2;
        }

        public static double restEnergy(double massKg) {
            return massKg * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
        }
    }

    public static class GameSession {
        private static int activeSessionsCount = 0;
        private static int tokenCounter = 1;
        public static final int MAX_SESSIONS = 3;

        private String sessionToken;
        private String hostPlayer;
        private boolean isActive;

        private GameSession(String host) {
            this.sessionToken = "TKN-" + tokenCounter;
            tokenCounter++;
            this.hostPlayer = host;
            this.isActive = true;
        }

        public static GameSession createSession(String host) {
            if (activeSessionsCount >= MAX_SESSIONS) {
                System.out.println("Помилка: усі сервера перевантажені!");
                return null;
            }
            activeSessionsCount++;
            return new GameSession(host);
        }

        public void terminate() {
            if (isActive) {
                isActive = false;
                activeSessionsCount--;
            }
        }

        public void printSession() {
            System.out.println("Токен: " + sessionToken + " | Хост: " + hostPlayer + " | Активна: " + isActive);
        }
    }

    public static class StringUtils {
        private StringUtils() {
        }

        public static boolean isPalindrome(String s) {
            String low = s.toLowerCase();
            String clean = "";
            for (int i = 0; i < low.length(); i++) {
                if (low.charAt(i) != ' ') {
                    clean += low.charAt(i);
                }
            }
            int left = 0;
            int right = clean.length() - 1;
            while (left < right) {
                if (clean.charAt(left) != clean.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static String reverse(String s) {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        }

        public static int countVowels(String s) {
            String vowels = "aeiouаеєиіїоуюя";
            String low = s.toLowerCase();
            int count = 0;
            for (int i = 0; i < low.length(); i++) {
                if (vowels.indexOf(low.charAt(i)) != -1) {
                    count++;
                }
            }
            return count;
        }

        public static String maskCardNumber(String cardNumber) {
            String result = "";
            int digits = 0;
            for (int i = cardNumber.length() - 1; i >= 0; i--) {
                char c = cardNumber.charAt(i);
                if (c >= '0' && c <= '9') {
                    digits++;
                    if (digits > 4) {
                        result = "*" + result;
                    } else {
                        result = c + result;
                    }
                } else {
                    result = c + result;
                }
            }
            return result;
        }
    }

    public static class FleetCar {
        private static int totalCars = 0;
        private static double totalCompanyMileage = 0.0;

        private String vinCode;
        private double currentMileage;

        public FleetCar(String vinCode, double initialMileage) {
            this.vinCode = vinCode;
            this.currentMileage = initialMileage;
            totalCars++;
            totalCompanyMileage += initialMileage;
        }

        public void addTrip(double km) {
            this.currentMileage += km;
            totalCompanyMileage += km;
        }

        public static void printFleetSummary() {
            System.out.println("Автомобілів у парку: " + totalCars + " | Загальний пробіг: " + totalCompanyMileage + " км");
        }
    }

    public static class CurrencyExchange {
        private static double usdToUahRate = 41.5;
        private static double eurToUahRate = 45.2;

        public static void updateRates(double newUsd, double newEur) {
            if (newUsd > 0 && newEur > 0) {
                usdToUahRate = newUsd;
                eurToUahRate = newEur;
            }
        }

        public static double uahToUsd(double uah) {
            return uah / usdToUahRate;
        }

        public static double usdToUah(double usd) {
            return usd * usdToUahRate;
        }

        public static double eurToUah(double eur) {
            return eur * eurToUahRate;
        }
    }

    public static class MathUtils {
        public static final double PI = 3.1415926535;
        public static final double E = 2.7182818284;

        private MathUtils() {
        }

        public static long factorial(int n) {
            if (n < 0) {
                return -1;
            }
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static double power(double base, int exp) {
            double result = 1.0;
            int n = exp < 0 ? -exp : exp;
            for (int i = 0; i < n; i++) {
                result *= base;
            }
            if (exp < 0) {
                return 1.0 / result;
            }
            return result;
        }

        public static int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int rest = a % b;
                a = b;
                b = rest;
            }
            return a;
        }

        public static int clamp(int val, int min, int max) {
            if (val < min) {
                return min;
            }
            if (val > max) {
                return max;
            }
            return val;
        }
    }

    public static class ServerConfig {
        public static final String SERVER_NAME = "AlphaEnterprise";
        public static final int MAX_CONNECTIONS = 5;
        private static int activeConnections = 0;

        public static boolean connect() {
            if (activeConnections < MAX_CONNECTIONS) {
                activeConnections++;
                return true;
            }
            return false;
        }

        public static void disconnect() {
            if (activeConnections > 0) {
                activeConnections--;
            }
        }

        public static void printServerStatus() {
            System.out.println("Сервер " + SERVER_NAME + ": підключень " + activeConnections
                    + " з " + MAX_CONNECTIONS + ", вільних слотів: " + (MAX_CONNECTIONS - activeConnections));
        }
    }

    public static class UserAccount {
        private static int nextId = 1001;

        private int id;
        private String username;
        private String email;

        public UserAccount(String username, String email) {
            this.id = nextId++;
            this.username = username;
            this.email = email;
        }

        public static int getNextAvailableId() {
            return nextId;
        }

        public static void resetIdSequence(int startId) {
            nextId = startId;
        }

        public void printUser() {
            System.out.println("ID: " + id + " | Логін: " + username + " | Email: " + email);
        }
    }

    public static class ArrayFilter {
        public int[] filter(int[] arr, int threshold) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > threshold) {
                    count++;
                }
            }
            int[] result = new int[count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > threshold) {
                    result[index] = arr[i];
                    index++;
                }
            }
            return result;
        }

        public int[] filter(int[] arr, int min, int max) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= min && arr[i] <= max) {
                    count++;
                }
            }
            int[] result = new int[count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= min && arr[i] <= max) {
                    result[index] = arr[i];
                    index++;
                }
            }
            return result;
        }

        public int[] filter(int[] arr, boolean keepEvens) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                boolean even = arr[i] % 2 == 0;
                if (even == keepEvens) {
                    count++;
                }
            }
            int[] result = new int[count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                boolean even = arr[i] % 2 == 0;
                if (even == keepEvens) {
                    result[index] = arr[i];
                    index++;
                }
            }
            return result;
        }
    }

    public static class SalaryCalculator {
        public double calculate(double baseRate) {
            return baseRate;
        }

        public double calculate(double baseRate, double fixedBonus) {
            return baseRate + fixedBonus;
        }

        public double calculate(double baseRate, double bonusPercent, boolean isTaxDeducted) {
            double total = baseRate + baseRate * bonusPercent / 100.0;
            if (isTaxDeducted) {
                total -= total * 0.195;
            }
            return total;
        }

        public double calculate(double baseRate, int overtimeHours, double overtimeHourlyRate) {
            return baseRate + overtimeHours * overtimeHourlyRate;
        }
    }

    public static class DateService {
        private int day;
        private int month;
        private int year;

        public DateService(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void add(int days) {
            this.add(days, 0, 0);
        }

        public void add(int days, int months) {
            this.add(days, months, 0);
        }

        public void add(int days, int months, int years) {
            this.day += days;
            this.month += months;
            this.year += years;
            while (this.day > 30) {
                this.day -= 30;
                this.month++;
            }
            while (this.month > 12) {
                this.month -= 12;
                this.year++;
            }
        }

        public void printDate() {
            System.out.println(String.format("%02d.%02d.%d", day, month, year));
        }
    }

    public static class ArraySearcher {
        public int find(int[] arr, int target) {
            return find(arr, target, 0);
        }

        public int find(int[] arr, int target, int startIndex) {
            if (startIndex < 0) {
                startIndex = 0;
            }
            for (int i = startIndex; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public int find(String[] arr, String target) {
            return find(arr, target, false);
        }

        public int find(String[] arr, String target, boolean ignoreCase) {
            for (int i = 0; i < arr.length; i++) {
                if (ignoreCase) {
                    if (arr[i].equalsIgnoreCase(target)) {
                        return i;
                    }
                } else {
                    if (arr[i].equals(target)) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }

    public static class Logger {
        public void log(String message) {
            System.out.println("[INFO] " + message);
        }

        public void log(String level, String message) {
            System.out.println("[" + level + "] " + message);
        }

        public void log(String level, int errorCode, String message) {
            System.out.println("[" + level + "] (Code: " + errorCode + "): " + message);
        }

        public void log(String tag, String message, boolean timestamp) {
            if (timestamp) {
                System.out.println("[" + tag + "] " + message + " | time: " + System.currentTimeMillis());
            } else {
                System.out.println("[" + tag + "] " + message);
            }
        }
    }

    public static class AreaCalculator {
        public double calculateArea(double side) {
            return side * side;
        }

        public double calculateArea(double width, double height) {
            return width * height;
        }

        public double calculateArea(double radius, boolean isCircle) {
            return Math.PI * radius * radius;
        }

        public double calculateArea(double a, double b, double c) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        public double calculateArea(double base1, double base2, double height, boolean isTrapezoid) {
            return (base1 + base2) / 2 * height;
        }
    }

    public static class DocumentPrinter {
        public void print(String message) {
            System.out.println(message);
        }

        public void print(int number) {
            System.out.println("[INT]: " + number);
        }

        public void print(double number, int decimals) {
            System.out.println(String.format("%." + decimals + "f", number));
        }

        public void print(String[] lines) {
            for (int i = 0; i < lines.length; i++) {
                System.out.println((i + 1) + ". " + lines[i]);
            }
        }

        public void print(String message, boolean uppercase) {
            if (uppercase) {
                System.out.println(message.toUpperCase());
            } else {
                System.out.println(message);
            }
        }
    }

    public static class MathOperations {
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public String add(String a, String b) {
            return a + " " + b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public String multiply(String text, int times) {
            String result = "";
            for (int i = 0; i < times; i++) {
                result += text;
            }
            return result;
        }
    }

    public static class FlightTicket {
        private String ticketNumber;
        private String passengerName;
        private String flightNumber;
        private String departureCity;
        private String arrivalCity;
        private String seatNumber;
        private boolean hasBaggage;

        public FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity,
                            String arrivalCity, String seatNumber, boolean hasBaggage) {
            this.ticketNumber = ticketNumber;
            this.passengerName = passengerName;
            this.flightNumber = flightNumber;
            this.departureCity = departureCity;
            this.arrivalCity = arrivalCity;
            this.seatNumber = seatNumber;
            this.hasBaggage = hasBaggage;
        }

        public FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity,
                            String arrivalCity) {
            this(ticketNumber, passengerName, flightNumber, departureCity, arrivalCity, "UNASSIGNED", false);
        }

        public void assignSeat(String seat) {
            this.seatNumber = seat;
        }

        public void printBoardingPass() {
            System.out.println("Квиток: " + ticketNumber + " | Пасажир: " + passengerName + " | Рейс: " + flightNumber);
            System.out.println("Маршрут: " + departureCity + " -> " + arrivalCity + " | Місце: " + seatNumber
                    + " | Багаж: " + hasBaggage);
        }
    }

    public static class Box {
        private double width;
        private double height;
        private double depth;
        private String material;

        public Box(double width, double height, double depth, String material) {
            this.width = width;
            this.height = height;
            this.depth = depth;
            this.material = material;
        }

        public Box(double size, String material) {
            this(size, size, size, material);
        }

        public Box(Box other) {
            this(other.width, other.height, other.depth, other.material);
        }

        public double getVolume() {
            return width * height * depth;
        }

        public double getSurfaceArea() {
            return 2 * (width * height + width * depth + height * depth);
        }

        public void printBox() {
            System.out.println("Коробка " + width + "x" + height + "x" + depth + " | Матеріал: " + material
                    + " | Об'єм: " + getVolume() + " | Площа поверхні: " + getSurfaceArea());
        }
    }

    public static class CoffeeOrder {
        private String type;
        private String size;
        private int sugarCount;
        private boolean withSyrup;
        private double finalPrice;

        public CoffeeOrder(String type, String size, int sugarCount, boolean withSyrup) {
            this.type = type;
            this.size = size;
            this.sugarCount = sugarCount;
            this.withSyrup = withSyrup;
            this.finalPrice = calculatePrice();
        }

        public CoffeeOrder(String type, String size) {
            this(type, size, 0, false);
        }

        public CoffeeOrder(String type) {
            this(type, "Medium");
        }

        private double calculatePrice() {
            double base = 0.0;
            if (type.equals("Еспресо")) {
                base = 40.0;
            } else if (type.equals("Капучино")) {
                base = 55.0;
            } else if (type.equals("Лате")) {
                base = 60.0;
            }

            double coef = 1.0;
            if (size.equals("Medium")) {
                coef = 1.3;
            } else if (size.equals("Large")) {
                coef = 1.6;
            }

            double total = base * coef;
            if (withSyrup) {
                total += 15.0;
            }
            return total;
        }

        public void printReceipt() {
            String syrup = withSyrup ? "так" : "ні";
            System.out.println("Чек: " + type + " (" + size + ") | Цукор: " + sugarCount + " | Сироп: " + syrup
                    + " | До сплати: " + finalPrice + " грн");
        }
    }

    public static class QueryBuilder {
        private String table;
        private String fields = "*";
        private String whereClause = "";

        public QueryBuilder(String table) {
            this.table = table;
        }

        public QueryBuilder select(String fields) {
            this.fields = fields;
            return this;
        }

        public QueryBuilder where(String condition) {
            this.whereClause = condition;
            return this;
        }

        public String build() {
            return "SELECT " + fields + " FROM " + table + (whereClause.isEmpty() ? "" : " WHERE " + whereClause) + ";";
        }
    }

    public static class SmartBulb {
        private int brightness;
        private int colorTemp;
        private boolean isOn;

        public SmartBulb(int brightness, int colorTemp, boolean isOn) {
            if (brightness < 0) {
                this.brightness = 0;
            } else if (brightness > 100) {
                this.brightness = 100;
            } else {
                this.brightness = brightness;
            }

            if (colorTemp < 2700) {
                this.colorTemp = 2700;
            } else if (colorTemp > 6500) {
                this.colorTemp = 6500;
            } else {
                this.colorTemp = colorTemp;
            }

            this.isOn = isOn;
        }

        public SmartBulb(int brightness) {
            this(brightness, 4000, true);
        }

        public SmartBulb() {
            this(50);
        }

        public void printStatus() {
            String state = isOn ? "увімкнена" : "вимкнена";
            System.out.println("Лампочка: " + state + " | Яскравість: " + brightness + "% | Температура: " + colorTemp + " K");
        }
    }

    public static class Car {
        private String brand;
        private String model;
        private int year;
        private double mileage;
        private boolean engineStarted;

        public Car(String brand, String model, int year, double mileage) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.mileage = mileage;
            this.engineStarted = false;
        }

        public Car(String brand, String model, int year) {
            this(brand, model, year, 0.0);
        }

        public Car() {
            this("Unknown", "Standard", 2024);
        }

        public void startEngine() {
            engineStarted = true;
        }

        public void stopEngine() {
            engineStarted = false;
        }

        public void drive(double distance) {
            if (engineStarted) {
                mileage += distance;
            } else {
                System.out.println("Спершу заведіть двигун!");
            }
        }

        public void printCar() {
            String engine = engineStarted ? "заведений" : "заглушений";
            System.out.println("Авто: " + brand + " " + model + " | Рік: " + year + " | Пробіг: " + mileage
                    + " км | Двигун: " + engine);
        }
    }

    public static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                System.out.println("Помилка: знаменник не може бути нулем! Встановлено 1.");
                this.denominator = 1;
            } else if (denominator < 0) {
                this.numerator = -numerator;
                this.denominator = -denominator;
            } else {
                this.numerator = numerator;
                this.denominator = denominator;
            }
            reduce();
        }

        public Fraction(int wholeNumber) {
            this(wholeNumber, 1);
        }

        public Fraction() {
            this(0, 1);
        }

        private int gcd(int a, int b) {
            return b == 0 ? Math.abs(a) : gcd(b, a % b);
        }

        private void reduce() {
            if (numerator == 0) {
                denominator = 1;
                return;
            }
            int common = gcd(numerator, denominator);
            numerator /= common;
            denominator /= common;
        }

        public void print() {
            if (denominator == 1) {
                System.out.println(numerator);
            } else {
                System.out.println(numerator + "/" + denominator);
            }
        }

        public double toDouble() {
            return (double) numerator / denominator;
        }
    }

    public static class User {
        private String login;
        private String email;
        private String role;
        private boolean isActive;

        public User(String login, String email, String role, boolean isActive) {
            this.login = login;
            this.email = email;
            this.role = role;
            this.isActive = isActive;
        }

        public User(String login, String email) {
            this(login, email, "USER", true);
        }

        public User(String login) {
            this(login, login + "@domain.com");
        }

        public User() {
            this("guest");
        }

        public void printProfile() {
            System.out.println("Login: " + login + ", Email: " + email + ", Role: " + role + ", Active: " + isActive);
        }
    }

    public static class Employee {
        private int id;
        private String fullName;
        private String position;
        private double monthlySalary;

        public Employee(int id, String fullName, String position, double monthlySalary) {
            this.id = id;
            this.fullName = fullName;
            this.position = position;
            this.monthlySalary = monthlySalary < 0 ? 0 : monthlySalary;
        }

        public void raiseSalary(double percent) {
            if (percent > 0) {
                monthlySalary += monthlySalary * (percent / 100.0);
            }
        }

        public double getAnnualSalary() {
            return monthlySalary * 12;
        }

        public void printBadge() {
            System.out.println("ID: " + id + " | ПІБ: " + fullName + " | Посада: " + position + " | Зарплата: " + monthlySalary);
        }
    }

    public static class Rectangle {
        private double width;
        private double height;

        public Rectangle() {
            this(1.0, 1.0);
        }

        public Rectangle(double size) {
            this(size, size);
        }

        public Rectangle(double width, double height) {
            this.width = width > 0 ? width : 1.0;
            this.height = height > 0 ? height : 1.0;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public boolean isSquare() {
            return width == height;
        }
    }

    public static class Time {
        private int hours;
        private int minutes;
        private int seconds;

        public Time(int hours, int minutes, int seconds) {
            this.hours = (hours >= 0 && hours <= 23) ? hours : 0;
            this.minutes = (minutes >= 0 && minutes <= 59) ? minutes : 0;
            this.seconds = (seconds >= 0 && seconds <= 59) ? seconds : 0;
        }

        public void tick() {
            seconds++;
            if (seconds > 59) {
                seconds = 0;
                minutes++;
                if (minutes > 59) {
                    minutes = 0;
                    hours++;
                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
        }

        public String toUniversalString() {
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        }

        public String toStandardString() {
            int h = hours;
            String period = "AM";
            if (h == 0) {
                h = 12;
            } else if (h == 12) {
                period = "PM";
            } else if (h > 12) {
                h -= 12;
                period = "PM";
            }
            return String.format("%d:%02d:%02d %s", h, minutes, seconds, period);
        }
    }

    public static class Product {
        private String name;
        private double price;
        private int quantity;
        private String category;

        public Product(String name, double price, int quantity, String category) {
            this.name = name;
            this.price = price < 0 ? 0.0 : price;
            this.quantity = quantity < 0 ? 0 : quantity;
            this.category = category;
        }

        public double getTotalValue() {
            return price * quantity;
        }

        public void applyDiscount(double percent) {
            if (percent >= 0 && percent <= 100) {
                price -= price * (percent / 100.0);
            }
        }

        public void printProduct() {
            System.out.println("Товар: " + name + " | Категорія: " + category +
                    " | Ціна: " + price + " | Кількість: " + quantity +
                    " | Загальна вартість: " + getTotalValue());
        }
    }

    public static class Point2D {
        private double x;
        private double y;

        public Point2D() {
            this(0.0, 0.0);
        }

        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distanceToOrigin() {
            return Math.sqrt(x * x + y * y);
        }

        public double distanceTo(double targetX, double targetY) {
            double dx = targetX - x;
            double dy = targetY - y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public void printPoint() {
            System.out.println("Point(" + x + "; " + y + ")");
        }
    }

    public static class BankAccount {
        private String accountNumber;
        private String ownerName;
        private double balance;

        public BankAccount(String accountNumber, String ownerName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = initialBalance < 0 ? 0.0 : initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                return false;
            }
            balance -= amount;
            return true;
        }

        public void printAccount() {
            System.out.println("Рахунок: " + accountNumber + ", Власник: " + ownerName + ", Баланс: " + balance);
        }
    }

    static class Student {
        private String name;
        private int age;
        private double gpa;

        public Student(String name, int age, double gpa) {
            this.name = name;

            if (age < 15 || age > 80) {
                this.age = 18;
            } else {
                this.age = age;
            }

            if (gpa < 0.0 || gpa > 5.0) {
                this.gpa = 0.0;
            } else {
                this.gpa = gpa;
            }
        }

        public boolean isHonorStudent() {
            if (gpa >= 4.5) {
                return true;
            } else {
                return false;
            }
        }

        public void printStudent() {
            String status = isHonorStudent() ? "Відмінник" : "Звичайний студент";
            System.out.println("Ім'я: " + name + "\t Вік: " + age + "\t Середній бал: " + gpa + "\t Статус: " + status);
        }
    }

    static class Book {
        private String title;
        private String author;
        private int year;
        private double price;

        public Book() {
            this.title = "Невідомо";
            this.author = "Невідомий";
            this.year = 2000;
            this.price = 0.0;
        }

        public Book(String title, String author, int year, double price) {
            this.title = title;
            this.author = author;
            this.year = (year < 0) ? 2000 : year;
            this.price = (price < 0.0) ? 0.0 : price;
        }

        public void printInfo() {
            System.out.println("Назва: " + title + " | Автор: " + author + " | Рік: " + year + " | Ціна: " + price + " грн");
        }
    }
}
