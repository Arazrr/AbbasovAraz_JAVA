package semester1.Practice_8_Abbasov_Araz;

import java.util.Arrays;

public class Practice08_Main {
    public static void main(String[] args) {
        System.out.println("----------------------1 завдання-------------------------");
        Student Sigma = new Student("Sigma", 1, 50);
        System.out.println(Sigma);

        Student Araz = new Student("Araz", 10, 150.0);
        System.out.println(Araz);
        System.out.println("----------------------2 завдання-------------------------");
        Product milk = new Product("MILK-001", "Молоково", 60.09, 2);
        System.out.println(milk);

        Product bread = new Product("BREAD-997", "Рідний хліб", -30.0, -1);
        System.out.println(bread);
        System.out.println("----------------------3 завдання-------------------------");
        Circle c1 = new Circle(5.0);
        System.out.println("1. Нормальний радіус (5.0):");
        System.out.println(c1);
        System.out.println();

        Circle c2 = new Circle(-3.5);
        System.out.println("2. Від'ємний радіус у конструкторі (-3.5):");
        System.out.println(c2);
        System.out.println();

        Circle c3 = new Circle(0.0);
        System.out.println("3. Нульовий радіус у конструкторі (0.0):");
        System.out.println(c3);
        System.out.println();
        System.out.println("----------------------4 завдання-------------------------");
        CardWallet myWallet = new CardWallet("2988888800002832", "7000", 12500.00);
        System.out.println(myWallet);
        boolean change = myWallet.changePin("7001", "1234");
        System.out.println("\nChanged: " + change);
        boolean change1 = myWallet.changePin("7000", "1234");
        System.out.println("\nChanged: " + change1);
        System.out.println(myWallet);
        System.out.println("----------------------5 завдання-------------------------");
        SensorNode sensor = new SensorNode("PRESS-05", -0.5, 101.3);
        System.out.println(sensor);
        sensor.calibrationOffset = 1.5;
        System.out.println("Після зміни зміщення:");
        System.out.println(sensor);
        System.out.println("----------------------6 завдання-------------------------");
        double[] originalTemps = {12.5, 14.0, 18.2, 22.1, 19.5, 15.0};
        WeatherDay day1 = new WeatherDay("2026-10-26", originalTemps);
        originalTemps[0] = 999.9;
        System.out.println(day1);
        System.out.println("Мінімальна температура: " + day1.getMinTemp() + "°C");
        System.out.println("Максимальна температура: " + day1.getMaxTemp() + "°C");
        System.out.printf("Середня температура: %.2f°C\n", day1.getAverageTemp());
        System.out.println("----------------------7 завдання-------------------------");
        IntRange range1 = new IntRange(10, 25);
        IntRange range2 = new IntRange(50, 20);
        System.out.println("Range 1: " + range1);
        System.out.println("Range 2 (автозаміна): " + range2);
        System.out.println("Чи містить Range 1 число 15? " + range1.contains(15));
        System.out.println("Довжина Range 2: " + range2.getLength());
        System.out.println("----------------------8 завдання-------------------------");
        InvoiceItem item = new InvoiceItem("Бездротова миша", 2, 750.0, 10.0);
        String message = "Позиція чека: " + item;
        System.out.println(message);
        System.out.println("----------------------9 завдання-------------------------");
        Employee employee9 = new Employee("Олег", 20000.0);
        Developer developer9 = new Developer("Марія", 45000.0, "Java");
        System.out.println(employee9);
        System.out.println(developer9);
        System.out.println("----------------------10 завдання------------------------");
        Dog dog10 = new Dog("Рекс", 4, 28.5, "Лабрадор");
        Cat cat10 = new Cat("Мурка", 2, 4.2, true);
        System.out.println(dog10);
        System.out.println(dog10.fetchStick());
        System.out.println(cat10);
        System.out.println(cat10.purr());
        System.out.println("----------------------11 завдання------------------------");
        PassengerCar car11 = new PassengerCar("Toyota", 190, 55.0, 5);
        CargoTruck truck11 = new CargoTruck("MAN", 110, 400.0, 12.5);
        System.out.println(car11);
        System.out.println(truck11);
        System.out.println("Витрата пального вантажівки при повному завантаженні: "
                + r2(truck11.getFuelConsumptionPer100Km()) + " л/100 км");
        System.out.println("----------------------12 завдання------------------------");
        Rectangle rect12 = new Rectangle(3.0, 4.0);
        Box3D box12 = new Box3D(3.0, 4.0, 5.0);
        System.out.println(rect12);
        System.out.println(box12);
        System.out.println("Об'єм паралелепіпеда: " + box12.getVolume());
        System.out.println("----------------------13 завдання------------------------");
        UniversityStudent student13 = new UniversityStudent("Іваненко Іван", 2005, "ST-1001", "Інформатика", 2000);
        Professor professor13 = new Professor("Петренко Петро", 1975, "доцент", 42);
        System.out.println(student13);
        System.out.println("Вік студента у 2026: " + student13.getAge(2026));
        System.out.println(professor13);
        System.out.println("Вік професора у 2026: " + professor13.getAge(2026));
        System.out.println("----------------------14 завдання------------------------");
        Smartphone phone14a = new Smartphone("Samsung", 25000.0, 256, true);
        Smartphone phone14b = new Smartphone("Xiaomi", 12000.0, 128);
        Smartphone phone14c = new Smartphone("Nokia");
        System.out.println("Повний конструктор: " + phone14a);
        System.out.println("Середній конструктор: " + phone14b);
        System.out.println("Мінімальний конструктор: " + phone14c);
        System.out.println("----------------------15 завдання------------------------");
        PrintedBook book15 = new PrintedBook("Кобзар", "Тарас Шевченко", 1840, 320, "тверда");
        AudioBook audio15 = new AudioBook("Майстер і Маргарита", "Михайло Булгаков", 1967, 485, "Іван Петров");
        System.out.println(book15);
        System.out.println(audio15);
        System.out.println("----------------------16 завдання------------------------");
        ProEsportsPlayer player16a = new ProEsportsPlayer("Sigma", 8500, "Team Spirit", 120000.0, 5);
        ProEsportsPlayer player16b = new ProEsportsPlayer("Rookie", 900, "No Team", 0.0, 0);
        System.out.println(player16a);
        System.out.println("Середній приз за перемогу: " + r2(player16a.getAveragePrizePerWin()) + " USD");
        System.out.println(player16b);
        System.out.println("Середній приз за перемогу (0 перемог): " + player16b.getAveragePrizePerWin() + " USD");
        System.out.println("----------------------17 завдання------------------------");
        Manager manager17 = new Manager("Анна", 30000.0, 8000.0);
        SalesPerson sales17 = new SalesPerson("Богдан", 15000.0, 200000.0, 3.5);
        System.out.println(manager17);
        System.out.println(sales17);
        System.out.println("----------------------18 завдання------------------------");
        StandardTransfer transfer18a = new StandardTransfer(1000.0);
        InternationalTransfer transfer18b = new InternationalTransfer(1000.0, "PL");
        System.out.println(transfer18a);
        System.out.println(transfer18b);
        System.out.println("----------------------19 завдання------------------------");
        Ticket ticket19a = new Ticket("Концерт", 800.0);
        StudentTicket ticket19b = new StudentTicket("Концерт", 800.0, "KV123456");
        VipTicket ticket19c = new VipTicket("Концерт", 800.0, true, 500.0);
        System.out.println(ticket19a);
        System.out.println(ticket19b);
        System.out.println(ticket19c);
        System.out.println("----------------------20 завдання------------------------");
        Weapon weapon20 = new Weapon("Залізний меч", 30);
        EnchantedSword sword20 = new EnchantedSword("Крижаний клинок", 30, "Лід", 12, 4);
        System.out.println(weapon20);
        System.out.println(sword20);
        System.out.println("----------------------21 завдання------------------------");
        Parcel parcel21a = new Parcel("UA-0001", 2.5);
        FragileParcel parcel21b = new FragileParcel("UA-0002", 2.5, true, 3000.0);
        System.out.println(parcel21a);
        System.out.println(parcel21b);
        System.out.println("----------------------22 завдання------------------------");
        EcoHeater heater22a = new EcoHeater("Thermo-2000", 2000.0, true);
        EcoHeater heater22b = new EcoHeater("Thermo-2000", 2000.0, false);
        System.out.println(heater22a);
        System.out.println(heater22b);
        System.out.println("----------------------23 завдання------------------------");
        Point2D point23a = new Point2D(3.0, 4.0);
        Point3D point23b = new Point3D(2.0, 3.0, 6.0);
        System.out.println(point23a + " -> відстань до початку координат: " + point23a.distanceToOrigin());
        System.out.println(point23b + " -> відстань до початку координат: " + point23b.distanceToOrigin());
        System.out.println("----------------------24 завдання------------------------");
        Coffee coffee24 = new Coffee("середнє обсмаження", 200, 60.0);
        LatteWithAddons latte24 = new LatteWithAddons("середнє обсмаження", 300, 70.0, "рослинне", 2);
        System.out.println(coffee24);
        System.out.println(latte24);
        System.out.println("----------------------25 завдання------------------------");
        DotaHero hero25a = new DotaHero("Generic Hero", "універсал", 200);
        StrengthHero hero25b = new StrengthHero("Axe", "сила", 200, 25);
        AlchemistHero hero25c = new AlchemistHero("Alchemist", "сила", 200, 23, 150);
        System.out.println(hero25a);
        System.out.println(hero25b);
        System.out.println(hero25c);
        System.out.println(hero25c.chemicalRage());
        System.out.println("----------------------26 завдання------------------------");
        ElectricCar car26 = new ElectricCar("Tesla", 2024, 670, 4, 82.0, 560);
        System.out.println(car26);
        System.out.println("----------------------27 завдання------------------------");
        CashbackPlatinumCard card27 = new CashbackPlatinumCard("Araz", 10000.0, 3000.0, 5.0);
        System.out.println(card27);
        System.out.println("Оплата 1000: " + card27.pay(1000.0));
        System.out.println("Оплата 5000 (більше ліміту): " + card27.pay(5000.0));
        System.out.println("Оплата 2500: " + card27.pay(2500.0));
        System.out.println("Оплата 9000 (більше балансу): " + card27.pay(9000.0));
        System.out.println(card27);
        System.out.println("----------------------28 завдання------------------------");
        CustomTerminal terminal28 = new CustomTerminal("admin");
        System.out.println(terminal28.getWelcomeBanner());
        System.out.println("Підпис: " + terminal28.generateAuthHash("admin"));
        System.out.println("----------------------29 завдання------------------------");
        ImmutableServerCredentials credentials29 = new ImmutableServerCredentials("192.168.0.10", 8080, "my-super-key");
        System.out.println(credentials29);
        System.out.println("Хост: " + credentials29.getHost() + ", порт: " + credentials29.getPort());
        System.out.println("----------------------30 завдання------------------------");
        Segment1D segment30 = new Segment1D(2.0);
        Square2D square30 = new Square2D(2.0);
        Cube3D cube30 = new Cube3D(2.0);
        System.out.println(segment30);
        System.out.println(square30);
        System.out.println(cube30);
        System.out.println("----------------------31 завдання------------------------");
        PostgraduateStudent post31a = new PostgraduateStudent(1, "araz@univ.ua", "KN-51", 92.5, "Методи машинного навчання", "Проф. Коваленко");
        PostgraduateStudent post31b = new PostgraduateStudent(2, "max@univ.ua", "KN-52", 80.0, "", "Доц. Мельник");
        System.out.println(post31a);
        System.out.println("Допущений до захисту? " + post31a.canDefendThesis());
        System.out.println(post31b);
        System.out.println("Допущений до захисту? " + post31b.canDefendThesis());
        System.out.println("----------------------32 завдання------------------------");
        Medicine medicine32a = new Medicine("Аспірин", 45.0, false);
        PrescriptionMedicine medicine32b = new PrescriptionMedicine("Амоксицилін", 120.0, false, "LIC-777");
        ControlledSubstance medicine32c = new ControlledSubstance("Морфін", 500.0, false, "LIC-888", 30);
        ControlledSubstance medicine32d = new ControlledSubstance("Морфін", 500.0, false, "LIC-888", 16);
        System.out.println(medicine32a);
        System.out.println(medicine32b);
        System.out.println("Рецептурний, є рецепт: " + medicine32b.canSell(true));
        System.out.println("Рецептурний, немає рецепта: " + medicine32b.canSell(false));
        System.out.println(medicine32c);
        System.out.println("Контрольований, 30 років, є рецепт: " + medicine32c.canSell(true));
        System.out.println(medicine32d);
        System.out.println("Контрольований, 16 років, є рецепт: " + medicine32d.canSell(true));
        System.out.println("Контрольований, 30 років, немає рецепта: " + medicine32c.canSell(false));
        System.out.println("----------------------33 завдання------------------------");
        ArithmeticProgression arith33 = new ArithmeticProgression(2.0, 3.0);
        GeometricProgression geom33 = new GeometricProgression(1.0, 2.0);
        System.out.println(arith33);
        System.out.println(geom33);
        System.out.println("Перші 8 членів арифметичної: " + Arrays.toString(arith33.generateFirstN(8)));
        System.out.println("----------------------34 завдання------------------------");
        int[] grades34 = {80, 90, 70};
        double[] weights34 = {1.0, 2.0, 1.0};
        GradeSheet sheet34a = new GradeSheet("Araz", grades34);
        WeightedGradeSheet sheet34b = new WeightedGradeSheet("Araz", grades34, weights34);
        System.out.println(sheet34a);
        System.out.println(sheet34b);
        System.out.println("----------------------35 завдання------------------------");
        LinearFunction linear35 = new LinearFunction(2.0, 1.0);
        QuadraticFunction quad35 = new QuadraticFunction(1.0, -4.0, 3.0);
        System.out.println(linear35);
        System.out.println("f(3) = " + linear35.evaluate(3.0));
        System.out.println(quad35);
        System.out.println("f(5) = " + quad35.evaluate(5.0));
        System.out.println("Вершина параболи: x0 = " + quad35.getVertexX() + ", y0 = " + quad35.evaluate(quad35.getVertexX()));
        System.out.println("----------------------36 завдання------------------------");
        double[] prices36 = {20000.0, 21000.0, 19500.0};
        WarehouseItem warehouse36a = new WarehouseItem("Ноутбук", 5, prices36);
        DiscountedWarehouseItem warehouse36b = new DiscountedWarehouseItem("Ноутбук (вітрина)", 3, prices36, "подряпини на корпусі", 15.0);
        System.out.println(warehouse36a);
        System.out.println(warehouse36b);
        System.out.println("----------------------37 завдання------------------------");
        CinemaHall hall37a = new CinemaHall("Зал №1", 4, 5, 150.0);
        hall37a.bookSeat(0, 0);
        hall37a.bookSeat(1, 2);
        hall37a.bookSeat(3, 4);
        System.out.println(hall37a);
        System.out.println();
        VipCinemaHall hall37b = new VipCinemaHall("VIP-зал", 4, 5, 150.0, 40.0);
        hall37b.bookSeat(0, 0);
        hall37b.bookSeat(1, 2);
        hall37b.bookSeat(3, 4);
        hall37b.bookSeat(3, 0);
        System.out.println(hall37b);
        System.out.println("----------------------38 завдання------------------------");
        TeamLead lead38 = new TeamLead("Дмитро", 80000.0, "Java", 3);
        lead38.addTeamMember(new Developer("Марія", 45000.0, "Java"));
        lead38.addTeamMember(new Developer("Олексій", 40000.0, "Python"));
        lead38.addTeamMember(new Developer("Ірина", 52000.0, "Kotlin"));
        lead38.addTeamMember(new Developer("Зайвий", 30000.0, "C#"));
        System.out.println(lead38);
        System.out.println("----------------------39 завдання------------------------");
        CharacterUnit unit39 = new CharacterUnit("Воїн", 100, 5);
        ShieldedPaladin paladin39 = new ShieldedPaladin("Артур", 100, 5, 30);
        System.out.println(unit39);
        unit39.takeDamage(25);
        System.out.println("Воїн отримав 25 шкоди:");
        System.out.println(unit39);
        System.out.println(paladin39);
        paladin39.takeDamage(20);
        System.out.println("Паладин отримав 20 шкоди (щит поглинув):");
        System.out.println(paladin39);
        paladin39.takeDamage(25);
        System.out.println("Паладин отримав 25 шкоди (щит пробито):");
        System.out.println(paladin39);
    }

    public static class IntRange {
        private int min;
        private int max;

        public IntRange(int min, int max) {
            setRange(min, max);
        }

        public void setRange(int min, int max) {
            if (min > max) {
                this.min = max;
                this.max = min;
            } else {
                this.min = min;
                this.max = max;
            }
        }

        public boolean contains(int value) {
            return value >= min && value <= max;
        }

        public int getLength() {
            return max - min;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        @Override
        public String toString() {
            return "[" + min + " .. " + max + "] (довжина: " + getLength() + ")";
        }
    }

    public static class InvoiceItem {
        private String description;
        private int quantity;
        private double unitPrice;
        private double discountPercent;

        public InvoiceItem(String description, int quantity, double unitPrice, double discountPercent) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            if (discountPercent < 0) this.discountPercent = 0;
            else if (discountPercent > 50) this.discountPercent = 50;
            else this.discountPercent = discountPercent;
        }

        public double getFinalAmount() {
            double subtotal = quantity * unitPrice;
            double discountAmount = subtotal * (discountPercent / 100.0);
            return subtotal - discountAmount;
        }

        @Override
        public String toString() {
            return String.format("Товар: '%s', Кількість: %d, Ціна за од.: %.2f, Знижка: %.1f%%, Разом: %.2f",
                    description, quantity, unitPrice, discountPercent, getFinalAmount());
        }
    }

    public static class WeatherDay {
        private String date;
        private double[] hourlyTemps;

        public WeatherDay(String date, double[] hourlyTemps) {
            this.date = date;

            if (hourlyTemps == null || hourlyTemps.length == 0) {
                this.hourlyTemps = new double[0];
            } else {
                this.hourlyTemps = new double[hourlyTemps.length];
                for (int i = 0; i < hourlyTemps.length; i++) {
                    this.hourlyTemps[i] = hourlyTemps[i];
                }
            }
        }

        public String getDate() {
            return date;
        }

        public double[] getHourlyTemps() {
            double[] copy = new double[this.hourlyTemps.length];
            for (int i = 0; i < this.hourlyTemps.length; i++) {
                copy[i] = this.hourlyTemps[i];
            }
            return copy;
        }

        public double getMinTemp() {
            if (hourlyTemps.length == 0) {
                return 0.0;
            }

            double min = hourlyTemps[0];
            for (int i = 1; i < hourlyTemps.length; i++) {
                if (hourlyTemps[i] < min) {
                    min = hourlyTemps[i];
                }
            }
            return min;
        }

        public double getMaxTemp() {
            if (hourlyTemps.length == 0) {
                return 0.0;
            }

            double max = hourlyTemps[0];
            for (int i = 1; i < hourlyTemps.length; i++) {
                if (hourlyTemps[i] > max) {
                    max = hourlyTemps[i];
                }
            }
            return max;
        }

        public double getAverageTemp() {
            if (hourlyTemps.length == 0) {
                return 0.0;
            }

            double sum = 0.0;
            for (double temp : hourlyTemps) {
                sum += temp;
            }
            return sum / hourlyTemps.length;
        }

        @Override
        public String toString() {
            return String.format("Дата: %s | Температури: %s | Середня температура: %.2f°C",
                    date, Arrays.toString(hourlyTemps), getAverageTemp());
        }
    }

    public static class SensorNode {
        private String sensorId;
        protected double calibrationOffset;
        private double rawValue;

        public SensorNode(String sensorId, double calibrationOffset, double rawValue) {
            this.sensorId = sensorId;
            this.calibrationOffset = calibrationOffset;
            this.rawValue = rawValue;
        }

        public String getSensorId() {
            return sensorId;
        }

        public double getRawValue() {
            return rawValue;
        }

        public void setRawValue(double rawValue) {
            this.rawValue = rawValue;
        }

        public double getCalibratedValue() {
            return rawValue + calibrationOffset;
        }

        @Override
        public String toString() {
            return "ID: " + sensorId + ", Сирий: " + rawValue + ", Відкалібрований: " + getCalibratedValue();
        }
    }

    public static class CardWallet {
        private String cardNumber;
        private String pinCode;
        private double balance;

        public CardWallet(String cardNumber, String pinCode, double balance) {
            if (cardNumber.length() == 16) { // something like "1234567890123456"
                this.cardNumber = cardNumber;
            } else if (cardNumber.length() == 19) { // if user card has enter gap between digits (for example "1234 5678 9012 3456")
                this.cardNumber = cardNumber;
            } else {
                this.cardNumber = "0000 0000 0000 0000";
            }

            if (pinCode.length() == 4) {
                this.pinCode = pinCode;
            } else {
                this.pinCode = "0000";
            }

            if (balance >= 0) {
                this.balance = balance;
            } else {
                this.balance = 0;
            }
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            }
        }

        public boolean changePin(String oldPin, String newPin) {
            if (this.pinCode.equals(oldPin)) {
                if (newPin != null && newPin.length() == 4) {
                    this.pinCode = newPin;
                    return true;
                }
            }
            return false;
        }

        @Override
        public String toString() {
            String last4 = "";
            if (cardNumber != null && cardNumber.length() >= 4) {
                last4 = cardNumber.substring(cardNumber.length() - 4);
            } else {
                last4 = "0000";
            }

            String maskedCard = "**** **** **** " + last4;

            return String.format("CardWallet{card='%s', balance=%.2f UAH}", maskedCard, balance);
        }
    }

    public static class Circle {
        private double radius;

        public Circle(double radius) {
            setRadius(radius);
        }

        private void setRadius(double radius) {
            if (radius <= 0) {
                this.radius = 1.0;
            } else {
                this.radius = radius;
            }
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Circle [radius=" + radius + ", area=" + getArea() + ", circumference=" + getCircumference() + "]";
        }
    }



    public static class Product {
        private String sku;
        private String title;
        private double price;
        private int stock;

        public Product(String sku, String title, double price, int stock) {
            this.sku = sku;
            this.title = title;

            if (price >= 0.0) {
                this.price = price;
            } else {
                this.price = 0.0;
            }

            if (stock >= 0) {
                this.stock = stock;
            } else {
                this.stock = 0;
            }
        }

        public String getSku() {
            return sku;
        }

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        public void setPrice(double price) {
            if (price >= 0.0) {
                this.price = price;
            } else {
                this.price = 0.0;
            }
        }

        public void setStock(int stock) {
            if(stock >= 0) {
                this.stock = stock;
            } else {
                this.stock = 0;
            }
        }

        public double getTotalCost() {
            return price * stock;
        }

        @Override
        public String toString() {
            return String.format("[SKU: %s] %s | Ціна: %.2f грн | Залишок: %d шт. | Разом: %.2f грн", sku, title, price, stock, getTotalCost());
        }
    }

    public static class Student {
        private String name;
        private int course;
        private double gpa;


        public Student(String name, int course, double gpa) {
            this.name = name;

            if (course >= 1 && course <= 6) {
                this.course = course;
            } else {
                this.course = 1;
            }

            if (gpa >= 0.0 && gpa <= 100.0) {
                this.gpa = gpa;
            } else {
                this.gpa = 60.0;
            }
        }

        public String getName() {
            return name;
        }

        public int getCourse() {
            return course;
        }

        public double getGpa() {
            return gpa;
        }

        public void setCourse(int newCourse) {
            if (newCourse >= 1 && newCourse <= 6) {
                course = newCourse;
            } else {
                course = 1;
            }
        }

        public void setGpa(double newGpa) {
            if (newGpa >= 0.0 && newGpa <= 100.0) {
                gpa = newGpa;
            } else {
                gpa = 60.0;
            }
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', course=" + course + ", gpa=" + gpa + "}";
        }
    }

    private static double r2(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static class Employee {
        private String name;
        protected double salary;

        public Employee(String name, double salary) {
            this.name = name;
            if (salary >= 0) {
                this.salary = salary;
            } else {
                this.salary = 0;
            }
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', salary=" + salary + "}";
        }
    }

    public static class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, double salary, String programmingLanguage) {
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }

        public String getProgrammingLanguage() {
            return programmingLanguage;
        }

        @Override
        public String toString() {
            return "Developer{name='" + getName() + "', salary=" + salary + ", language='" + programmingLanguage + "'}";
        }
    }

    public static class Animal {
        private String name;
        private int age;
        private double weight;

        public Animal(String name, int age, double weight) {
            this.name = name;
            if (age >= 0) {
                this.age = age;
            } else {
                this.age = 0;
            }
            if (weight > 0) {
                this.weight = weight;
            } else {
                this.weight = 1.0;
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
        }
    }

    public static class Dog extends Animal {
        private String breed;

        public Dog(String name, int age, double weight, String breed) {
            super(name, age, weight);
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        public String fetchStick() {
            return getName() + " (" + breed + ") приносить палицю!";
        }

        @Override
        public String toString() {
            return "Dog{name='" + getName() + "', age=" + getAge() + ", weight=" + getWeight() + ", breed='" + breed + "'}";
        }
    }

    public static class Cat extends Animal {
        private boolean isIndoor;

        public Cat(String name, int age, double weight, boolean isIndoor) {
            super(name, age, weight);
            this.isIndoor = isIndoor;
        }

        public boolean isIndoor() {
            return isIndoor;
        }

        public String purr() {
            return getName() + " муркоче: мррр-мяу!";
        }

        @Override
        public String toString() {
            return "Cat{name='" + getName() + "', age=" + getAge() + ", weight=" + getWeight()
                    + ", isIndoor=" + (isIndoor ? "хатній" : "вуличний") + "}";
        }
    }

    public static class Vehicle {
        protected String brand;
        protected int maxSpeed;
        protected double fuelTankCapacity;

        public Vehicle(String brand, int maxSpeed, double fuelTankCapacity) {
            this.brand = brand;
            if (maxSpeed > 0) {
                this.maxSpeed = maxSpeed;
            } else {
                this.maxSpeed = 1;
            }
            if (fuelTankCapacity > 0) {
                this.fuelTankCapacity = fuelTankCapacity;
            } else {
                this.fuelTankCapacity = 1.0;
            }
        }

        @Override
        public String toString() {
            return "Vehicle{brand='" + brand + "', maxSpeed=" + maxSpeed + " км/год, бак=" + fuelTankCapacity + " л}";
        }
    }

    public static class PassengerCar extends Vehicle {
        private int passengerSeats;

        public PassengerCar(String brand, int maxSpeed, double fuelTankCapacity, int passengerSeats) {
            super(brand, maxSpeed, fuelTankCapacity);
            if (passengerSeats > 0) {
                this.passengerSeats = passengerSeats;
            } else {
                this.passengerSeats = 1;
            }
        }

        @Override
        public String toString() {
            return "PassengerCar{brand='" + brand + "', maxSpeed=" + maxSpeed + " км/год, бак=" + fuelTankCapacity
                    + " л, місць=" + passengerSeats + "}";
        }
    }

    public static class CargoTruck extends Vehicle {
        private double maxLoadTons;

        public CargoTruck(String brand, int maxSpeed, double fuelTankCapacity, double maxLoadTons) {
            super(brand, maxSpeed, fuelTankCapacity);
            if (maxLoadTons > 0) {
                this.maxLoadTons = maxLoadTons;
            } else {
                this.maxLoadTons = 1.0;
            }
        }

        public double getFuelConsumptionPer100Km() {
            return 15.0 + maxLoadTons * 2.5;
        }

        @Override
        public String toString() {
            return "CargoTruck{brand='" + brand + "', maxSpeed=" + maxSpeed + " км/год, бак=" + fuelTankCapacity
                    + " л, вантажопідйомність=" + maxLoadTons + " т}";
        }
    }

    public static class Rectangle {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            if (width > 0) {
                this.width = width;
            } else {
                this.width = 1.0;
            }
            if (height > 0) {
                this.height = height;
            } else {
                this.height = 1.0;
            }
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public double getArea() {
            return width * height;
        }

        @Override
        public String toString() {
            return "Rectangle{width=" + width + ", height=" + height + ", area=" + getArea() + "}";
        }
    }

    public static class Box3D extends Rectangle {
        private double depth;

        public Box3D(double width, double height, double depth) {
            super(width, height);
            if (depth > 0) {
                this.depth = depth;
            } else {
                this.depth = 1.0;
            }
        }

        public double getVolume() {
            return super.getArea() * depth;
        }

        @Override
        public String toString() {
            return "Box3D{width=" + getWidth() + ", height=" + getHeight() + ", depth=" + depth
                    + ", площа основи=" + super.getArea() + ", об'єм=" + getVolume() + "}";
        }
    }

    public static class Person {
        private String fullName;
        private int birthYear;

        public Person(String fullName, int birthYear) {
            this.fullName = fullName;
            this.birthYear = birthYear;
        }

        public String getFullName() {
            return fullName;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public int getAge(int currentYear) {
            return currentYear - birthYear;
        }

        @Override
        public String toString() {
            return "Person{fullName='" + fullName + "', birthYear=" + birthYear + "}";
        }
    }

    public static class UniversityStudent extends Person {
        private String studentId;
        private String major;
        private int scholarship;

        public UniversityStudent(String fullName, int birthYear, String studentId, String major, int scholarship) {
            super(fullName, birthYear);
            this.studentId = studentId;
            this.major = major;
            if (scholarship >= 0) {
                this.scholarship = scholarship;
            } else {
                this.scholarship = 0;
            }
        }

        @Override
        public String toString() {
            return "UniversityStudent{fullName='" + getFullName() + "', birthYear=" + getBirthYear()
                    + ", studentId='" + studentId + "', major='" + major + "', scholarship=" + scholarship + " грн}";
        }
    }

    public static class Professor extends Person {
        private String academicTitle;
        private int publicationsCount;

        public Professor(String fullName, int birthYear, String academicTitle, int publicationsCount) {
            super(fullName, birthYear);
            this.academicTitle = academicTitle;
            if (publicationsCount >= 0) {
                this.publicationsCount = publicationsCount;
            } else {
                this.publicationsCount = 0;
            }
        }

        @Override
        public String toString() {
            return "Professor{fullName='" + getFullName() + "', birthYear=" + getBirthYear()
                    + ", academicTitle='" + academicTitle + "', publications=" + publicationsCount + "}";
        }
    }

    public static class Gadget {
        private String brand;
        private double price;

        public Gadget(String brand, double price) {
            this.brand = brand;
            if (price >= 0) {
                this.price = price;
            } else {
                this.price = 0;
            }
        }

        public String getBrand() {
            return brand;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Gadget{brand='" + brand + "', price=" + price + "}";
        }
    }

    public static class Smartphone extends Gadget {
        private int memoryGb;
        private boolean has5G;

        public Smartphone(String brand, double price, int memoryGb, boolean has5G) {
            super(brand, price);
            this.memoryGb = memoryGb;
            this.has5G = has5G;
        }

        public Smartphone(String brand, double price, int memoryGb) {
            this(brand, price, memoryGb, true);
        }

        public Smartphone(String brand) {
            this(brand, 9999.0, 128, false);
        }

        @Override
        public String toString() {
            return "Smartphone{brand='" + getBrand() + "', price=" + getPrice() + " грн, пам'ять=" + memoryGb
                    + " ГБ, 5G=" + (has5G ? "так" : "ні") + "}";
        }
    }

    public static class Publication {
        private String title;
        private String author;
        private int releaseYear;

        public Publication(String title, String author, int releaseYear) {
            this.title = title;
            this.author = author;
            this.releaseYear = releaseYear;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        @Override
        public String toString() {
            return "Publication{title='" + title + "', author='" + author + "', year=" + releaseYear + "}";
        }
    }

    public static class PrintedBook extends Publication {
        private int pageCount;
        private String coverType;

        public PrintedBook(String title, String author, int releaseYear, int pageCount, String coverType) {
            super(title, author, releaseYear);
            if (pageCount > 0) {
                this.pageCount = pageCount;
            } else {
                this.pageCount = 1;
            }
            this.coverType = coverType;
        }

        @Override
        public String toString() {
            return "PrintedBook{title='" + getTitle() + "', author='" + getAuthor() + "', year=" + getReleaseYear()
                    + ", сторінок=" + pageCount + ", обкладинка='" + coverType + "'}";
        }
    }

    public static class AudioBook extends Publication {
        private int durationMinutes;
        private String narrator;

        public AudioBook(String title, String author, int releaseYear, int durationMinutes, String narrator) {
            super(title, author, releaseYear);
            if (durationMinutes >= 0) {
                this.durationMinutes = durationMinutes;
            } else {
                this.durationMinutes = 0;
            }
            this.narrator = narrator;
        }

        // Форматування тривалості у вигляді "X год Y хв"
        public String formatDuration() {
            int hours = durationMinutes / 60;
            int minutes = durationMinutes % 60;
            return hours + " год " + minutes + " хв";
        }

        @Override
        public String toString() {
            return "AudioBook{title='" + getTitle() + "', author='" + getAuthor() + "', year=" + getReleaseYear()
                    + ", тривалість=" + formatDuration() + ", диктор='" + narrator + "'}";
        }
    }

    public static class Gamer {
        private String nickname;
        private int hoursPlayed;

        public Gamer(String nickname, int hoursPlayed) {
            this.nickname = nickname;
            if (hoursPlayed >= 0) {
                this.hoursPlayed = hoursPlayed;
            } else {
                this.hoursPlayed = 0;
            }
        }

        public String getNickname() {
            return nickname;
        }

        public int getHoursPlayed() {
            return hoursPlayed;
        }

        @Override
        public String toString() {
            return "Gamer{nickname='" + nickname + "', hoursPlayed=" + hoursPlayed + "}";
        }
    }

    public static class ProEsportsPlayer extends Gamer {
        private String teamName;
        private double prizeMoneyUSD;
        private int tournamentsWon;

        public ProEsportsPlayer(String nickname, int hoursPlayed, String teamName, double prizeMoneyUSD, int tournamentsWon) {
            super(nickname, hoursPlayed);
            this.teamName = teamName;
            if (prizeMoneyUSD >= 0) {
                this.prizeMoneyUSD = prizeMoneyUSD;
            } else {
                this.prizeMoneyUSD = 0;
            }
            if (tournamentsWon >= 0) {
                this.tournamentsWon = tournamentsWon;
            } else {
                this.tournamentsWon = 0;
            }
        }

        // Захист від ділення на нуль
        public double getAveragePrizePerWin() {
            if (tournamentsWon == 0) {
                return 0.0;
            }
            return prizeMoneyUSD / tournamentsWon;
        }

        @Override
        public String toString() {
            return "ProEsportsPlayer{nickname='" + getNickname() + "', hoursPlayed=" + getHoursPlayed()
                    + ", team='" + teamName + "', призові=" + prizeMoneyUSD + " USD, перемог=" + tournamentsWon + "}";
        }
    }

    public static class StaffMember {
        private String name;
        private double baseSalary;

        public StaffMember(String name, double baseSalary) {
            this.name = name;
            if (baseSalary >= 0) {
                this.baseSalary = baseSalary;
            } else {
                this.baseSalary = 0;
            }
        }

        public String getName() {
            return name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public double calculateMonthlyPay() {
            return baseSalary;
        }

        @Override
        public String toString() {
            return "StaffMember{name='" + name + "', базова ставка=" + baseSalary
                    + ", до виплати=" + r2(calculateMonthlyPay()) + "}";
        }
    }

    public static class Manager extends StaffMember {
        private double teamBonus;

        public Manager(String name, double baseSalary, double teamBonus) {
            super(name, baseSalary);
            if (teamBonus >= 0) {
                this.teamBonus = teamBonus;
            } else {
                this.teamBonus = 0;
            }
        }

        @Override
        public double calculateMonthlyPay() {
            return super.calculateMonthlyPay() + teamBonus;
        }

        @Override
        public String toString() {
            return "Manager{name='" + getName() + "', базова ставка=" + getBaseSalary() + ", бонус команди=" + teamBonus
                    + ", до виплати=" + r2(calculateMonthlyPay()) + "}";
        }
    }

    public static class SalesPerson extends StaffMember {
        private double salesVolume;
        private double commissionRate; // відсоток від продажів

        public SalesPerson(String name, double baseSalary, double salesVolume, double commissionRate) {
            super(name, baseSalary);
            if (salesVolume >= 0) {
                this.salesVolume = salesVolume;
            } else {
                this.salesVolume = 0;
            }
            if (commissionRate >= 0) {
                this.commissionRate = commissionRate;
            } else {
                this.commissionRate = 0;
            }
        }

        @Override
        public double calculateMonthlyPay() {
            return super.calculateMonthlyPay() + salesVolume * (commissionRate / 100.0);
        }

        @Override
        public String toString() {
            return "SalesPerson{name='" + getName() + "', базова ставка=" + getBaseSalary() + ", продажі=" + salesVolume
                    + ", комісія=" + commissionRate + "%, до виплати=" + r2(calculateMonthlyPay()) + "}";
        }
    }

    public static class StandardTransfer {
        protected double amount;

        public StandardTransfer(double amount) {
            if (amount >= 0) {
                this.amount = amount;
            } else {
                this.amount = 0;
            }
        }

        public double getFee() {
            return amount * 0.01;
        }

        public double getTotalWithFee() {
            return amount + getFee(); // викличе перевизначений getFee() у нащадку
        }

        @Override
        public String toString() {
            return "StandardTransfer{сума=" + amount + ", комісія=" + r2(getFee()) + ", разом=" + r2(getTotalWithFee()) + "}";
        }
    }

    public static class InternationalTransfer extends StandardTransfer {
        private String countryCode;
        private final double swiftFee = 15.0;

        public InternationalTransfer(double amount, String countryCode) {
            super(amount);
            this.countryCode = countryCode;
        }

        @Override
        public double getFee() {
            return super.getFee() * 2 + swiftFee; // 2% + 15
        }

        @Override
        public String toString() {
            return "InternationalTransfer{країна='" + countryCode + "', сума=" + amount + ", комісія (2% + SWIFT "
                    + swiftFee + ")=" + r2(getFee()) + ", разом=" + r2(getTotalWithFee()) + "}";
        }
    }

    public static class Ticket {
        private String eventName;
        private double basePrice;

        public Ticket(String eventName, double basePrice) {
            this.eventName = eventName;
            if (basePrice >= 0) {
                this.basePrice = basePrice;
            } else {
                this.basePrice = 0;
            }
        }

        public String getEventName() {
            return eventName;
        }

        public double getBasePrice() {
            return basePrice;
        }

        public double getFinalPrice() {
            return basePrice;
        }

        @Override
        public String toString() {
            return "Квиток на '" + eventName + "' | базова ціна: " + basePrice + " грн | до сплати: " + r2(getFinalPrice()) + " грн";
        }
    }

    public static class StudentTicket extends Ticket {
        private String studentCardNumber;

        public StudentTicket(String eventName, double basePrice, String studentCardNumber) {
            super(eventName, basePrice);
            this.studentCardNumber = studentCardNumber;
        }

        @Override
        public double getFinalPrice() {
            return super.getFinalPrice() * 0.5;
        }

        @Override
        public String toString() {
            return "[СТУДЕНТСЬКИЙ] " + super.toString() + " | студентський: " + studentCardNumber;
        }
    }

    public static class VipTicket extends Ticket {
        private boolean includesBackstage;
        private double loungeFee;

        public VipTicket(String eventName, double basePrice, boolean includesBackstage, double loungeFee) {
            super(eventName, basePrice);
            this.includesBackstage = includesBackstage;
            if (loungeFee >= 0) {
                this.loungeFee = loungeFee;
            } else {
                this.loungeFee = 0;
            }
        }

        @Override
        public double getFinalPrice() {
            return super.getFinalPrice() + loungeFee;
        }

        @Override
        public String toString() {
            return "[VIP] " + super.toString() + " | бекстейдж: " + (includesBackstage ? "так" : "ні")
                    + " | збір за лаунж: " + loungeFee + " грн";
        }
    }

    public static class Weapon {
        private String title;
        private int baseDamage;

        public Weapon(String title, int baseDamage) {
            this.title = title;
            if (baseDamage >= 0) {
                this.baseDamage = baseDamage;
            } else {
                this.baseDamage = 0;
            }
        }

        public String getTitle() {
            return title;
        }

        public int getBaseDamage() {
            return baseDamage;
        }

        public int calculateDamage() {
            return baseDamage;
        }

        @Override
        public String toString() {
            return "Weapon{title='" + title + "', шкода=" + calculateDamage() + "}";
        }
    }

    public static class EnchantedSword extends Weapon {
        private String element;
        private int magicPower;
        private int enchantmentLevel;

        public EnchantedSword(String title, int baseDamage, String element, int magicPower, int enchantmentLevel) {
            super(title, baseDamage);
            this.element = element;
            if (magicPower >= 0) {
                this.magicPower = magicPower;
            } else {
                this.magicPower = 0;
            }
            if (enchantmentLevel >= 0) {
                this.enchantmentLevel = enchantmentLevel;
            } else {
                this.enchantmentLevel = 0;
            }
        }

        @Override
        public int calculateDamage() {
            return super.calculateDamage() + magicPower * enchantmentLevel;
        }

        @Override
        public String toString() {
            int magicDamage = magicPower * enchantmentLevel;
            return "EnchantedSword{title='" + getTitle() + "', стихія='" + element + "'}\n"
                    + "  Фізична шкода: " + getBaseDamage() + "\n"
                    + "  Магічна шкода: " + magicPower + " x " + enchantmentLevel + " = " + magicDamage + "\n"
                    + "  Загальна шкода: " + calculateDamage();
        }
    }

    public static class Parcel {
        private String trackingCode;
        private double weightKg;

        public Parcel(String trackingCode, double weightKg) {
            this.trackingCode = trackingCode;
            if (weightKg > 0) {
                this.weightKg = weightKg;
            } else {
                this.weightKg = 0.1;
            }
        }

        public String getTrackingCode() {
            return trackingCode;
        }

        public double getWeightKg() {
            return weightKg;
        }

        public double calculateShippingCost() {
            return 50.0 + weightKg * 12.0;
        }

        @Override
        public String toString() {
            return "Накладна{трек-код='" + trackingCode + "', вага=" + weightKg + " кг, вартість доставки="
                    + r2(calculateShippingCost()) + " грн}";
        }
    }

    public static class FragileParcel extends Parcel {
        private boolean requiresWoodenBox;
        private double insuranceValue;

        public FragileParcel(String trackingCode, double weightKg, boolean requiresWoodenBox, double insuranceValue) {
            super(trackingCode, weightKg);
            this.requiresWoodenBox = requiresWoodenBox;
            if (insuranceValue >= 0) {
                this.insuranceValue = insuranceValue;
            } else {
                this.insuranceValue = 0;
            }
        }

        @Override
        public double calculateShippingCost() {
            double cost = super.calculateShippingCost();
            cost += insuranceValue * 0.015; // страховий збір 1.5%
            if (requiresWoodenBox) {
                cost += 120.0; // обрешітка
            }
            return cost;
        }

        @Override
        public String toString() {
            return "Накладна (КРИХКЕ){трек-код='" + getTrackingCode() + "', вага=" + getWeightKg()
                    + " кг, страхова вартість=" + insuranceValue + " грн, дерев'яна обрешітка="
                    + (requiresWoodenBox ? "так" : "ні") + ", вартість доставки=" + r2(calculateShippingCost()) + " грн}";
        }
    }

    public static class Appliance {
        private String model;
        private double powerWatts;

        public Appliance(String model, double powerWatts) {
            this.model = model;
            if (powerWatts >= 0) {
                this.powerWatts = powerWatts;
            } else {
                this.powerWatts = 0;
            }
        }

        public String getModel() {
            return model;
        }

        public double getPowerWatts() {
            return powerWatts;
        }

        public double getDailyConsumptionKWh(int hours) {
            return (powerWatts * hours) / 1000.0;
        }

        @Override
        public String toString() {
            return "Appliance{model='" + model + "', потужність=" + powerWatts + " Вт}";
        }
    }

    public static class EcoHeater extends Appliance {
        private boolean ecoModeActive;

        public EcoHeater(String model, double powerWatts, boolean ecoModeActive) {
            super(model, powerWatts);
            this.ecoModeActive = ecoModeActive;
        }

        @Override
        public double getDailyConsumptionKWh(int hours) {
            double normal = super.getDailyConsumptionKWh(hours);
            if (ecoModeActive) {
                return normal * 0.75; // економія 25%
            }
            return normal;
        }

        @Override
        public String toString() {
            return "EcoHeater{model='" + getModel() + "', потужність=" + getPowerWatts() + " Вт, режим економії: "
                    + (ecoModeActive ? "УВІМКНЕНО" : "ВИМКНЕНО") + ", споживання за 8 год: "
                    + r2(getDailyConsumptionKWh(8)) + " кВт·год}";
        }
    }

    public static class Point2D {
        private double x;
        private double y;

        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double distanceToOrigin() {
            return Math.sqrt(x * x + y * y);
        }

        @Override
        public String toString() {
            return "(" + x + "; " + y + ")";
        }
    }

    public static class Point3D extends Point2D {
        private double z;

        public Point3D(double x, double y, double z) {
            super(x, y);
            this.z = z;
        }

        public double getZ() {
            return z;
        }

        @Override
        public double distanceToOrigin() {
            return Math.sqrt(Math.pow(super.distanceToOrigin(), 2) + z * z);
        }

        @Override
        public String toString() {
            return "(" + getX() + "; " + getY() + "; " + z + ")";
        }
    }

    public static class Coffee {
        private String roastType;
        private int volumeMl;
        private double basePrice;

        public Coffee(String roastType, int volumeMl, double basePrice) {
            this.roastType = roastType;
            if (volumeMl > 0) {
                this.volumeMl = volumeMl;
            } else {
                this.volumeMl = 100;
            }
            if (basePrice >= 0) {
                this.basePrice = basePrice;
            } else {
                this.basePrice = 0;
            }
        }

        public String getRoastType() {
            return roastType;
        }

        public int getVolumeMl() {
            return volumeMl;
        }

        public double getBasePrice() {
            return basePrice;
        }

        // Демид потужний та найкращий викладач!

        public double getCalories() {
            return volumeMl * 0.05;
        }

        public double getPrice() {
            return basePrice;
        }

        @Override
        public String toString() {
            return "======== КАВ'ЯРНЯ ========\n"
                    + "Напій: Кава (" + roastType + ")\n"
                    + "Обсяг: " + volumeMl + " мл\n"
                    + "Калорії: " + r2(getCalories()) + " ккал\n"
                    + "Ціна: " + r2(getPrice()) + " грн\n"
                    + "==========================";
        }
    }

    public static class LatteWithAddons extends Coffee {
        private String milkType;
        private int syrupPumps;

        public LatteWithAddons(String roastType, int volumeMl, double basePrice, String milkType, int syrupPumps) {
            super(roastType, volumeMl, basePrice);
            this.milkType = milkType;
            if (syrupPumps >= 0) {
                this.syrupPumps = syrupPumps;
            } else {
                this.syrupPumps = 0;
            }
        }

        private boolean isPlantMilk() {
            return milkType.equalsIgnoreCase("рослинне");
        }

        @Override
        public double getCalories() {
            // молоко займає 80% обсягу: коров'яче 0.5 ккал/мл, рослинне 0.3 ккал/мл; помпа сиропу = 20 ккал
            double milkVolume = getVolumeMl() * 0.8;
            double milkCalories;
            if (isPlantMilk()) {
                milkCalories = milkVolume * 0.3;
            } else {
                milkCalories = milkVolume * 0.5;
            }
            return super.getCalories() + milkCalories + syrupPumps * 20.0;
        }

        @Override
        public double getPrice() {
            double price = super.getPrice();
            if (isPlantMilk()) {
                price += 20.0;
            }
            price += syrupPumps * 12.0;
            return price;
        }

        @Override
        public String toString() {
            return "======== КАВ'ЯРНЯ ========\n"
                    + "Напій: Лате (" + getRoastType() + ")\n"
                    + "Обсяг: " + getVolumeMl() + " мл\n"
                    + "Молоко: " + milkType + (isPlantMilk() ? " (+20 грн)" : "") + "\n"
                    + "Сироп: " + syrupPumps + " помп (+" + (syrupPumps * 12) + " грн)\n"
                    + "Калорії: " + r2(getCalories()) + " ккал\n"
                    + "Ціна: " + r2(getPrice()) + " грн\n"
                    + "==========================";
        }
    }

    public static class DotaHero {
        private String name;
        private String primaryAttribute;
        private int baseHp;

        public DotaHero(String name, String primaryAttribute, int baseHp) {
            this.name = name;
            this.primaryAttribute = primaryAttribute;
            if (baseHp > 0) {
                this.baseHp = baseHp;
            } else {
                this.baseHp = 1;
            }
        }

        public String getName() {
            return name;
        }

        public int getMaxHp() {
            return baseHp;
        }

        @Override
        public String toString() {
            return "DotaHero{name='" + name + "', атрибут='" + primaryAttribute + "', maxHp=" + getMaxHp() + "}";
        }
    }

    public static class StrengthHero extends DotaHero {
        private int strength;

        public StrengthHero(String name, String primaryAttribute, int baseHp, int strength) {
            super(name, primaryAttribute, baseHp);
            if (strength >= 0) {
                this.strength = strength;
            } else {
                this.strength = 0;
            }
        }

        public int getStrength() {
            return strength;
        }

        @Override
        public int getMaxHp() {
            return super.getMaxHp() + strength * 22;
        }

        @Override
        public String toString() {
            return super.toString() + " -> StrengthHero{сила=" + strength + ", бонус HP від сили=" + (strength * 22) + "}";
        }
    }

    public static class AlchemistHero extends StrengthHero {
        private int greevilsGreedBonusGold;

        public AlchemistHero(String name, String primaryAttribute, int baseHp, int strength, int greevilsGreedBonusGold) {
            super(name, primaryAttribute, baseHp, strength);
            if (greevilsGreedBonusGold >= 0) {
                this.greevilsGreedBonusGold = greevilsGreedBonusGold;
            } else {
                this.greevilsGreedBonusGold = 0;
            }
        }

        public String chemicalRage() {
            return getName() + " активує Chemical Rage! Макс. HP: " + getMaxHp();
        }

        @Override
        public String toString() {
            return super.toString() + " -> AlchemistHero{бонус золота Greevil's Greed=" + greevilsGreedBonusGold + "}";
        }
    }

    public static class BaseVehicle {
        private String brand;
        private int year;

        public BaseVehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }

        public String getBrand() {
            return brand;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "BaseVehicle{brand='" + brand + "', year=" + year + "}";
        }
    }

    public static class MotorCar extends BaseVehicle {
        private int horsePower;
        private int doorsCount;

        public MotorCar(String brand, int year, int horsePower, int doorsCount) {
            super(brand, year);
            this.horsePower = horsePower;
            this.doorsCount = doorsCount;
        }

        @Override
        public String toString() {
            return super.toString() + " -> MotorCar{потужність=" + horsePower + " к.с., дверей=" + doorsCount + "}";
        }
    }

    public static class ElectricCar extends MotorCar {
        private double batteryCapacityKWh;
        private int rangeKm;

        public ElectricCar(String brand, int year, int horsePower, int doorsCount, double batteryCapacityKWh, int rangeKm) {
            super(brand, year, horsePower, doorsCount);
            this.batteryCapacityKWh = batteryCapacityKWh;
            this.rangeKm = rangeKm;
        }

        @Override
        public String toString() {
            return super.toString() + " -> ElectricCar{батарея=" + batteryCapacityKWh + " кВт·год, запас ходу=" + rangeKm + " км}";
        }
    }

    public static class PaymentCard {
        private String cardHolder;
        protected double balance;

        public PaymentCard(String cardHolder, double balance) {
            this.cardHolder = cardHolder;
            if (balance >= 0) {
                this.balance = balance;
            } else {
                this.balance = 0;
            }
        }

        public String getCardHolder() {
            return cardHolder;
        }

        public double getBalance() {
            return balance;
        }

        public boolean pay(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "PaymentCard{власник='" + cardHolder + "', баланс=" + r2(balance) + " грн}";
        }
    }

    public static class DebitCard extends PaymentCard {
        private double dailyLimit;

        public DebitCard(String cardHolder, double balance, double dailyLimit) {
            super(cardHolder, balance);
            if (dailyLimit >= 0) {
                this.dailyLimit = dailyLimit;
            } else {
                this.dailyLimit = 0;
            }
        }

        @Override
        public boolean pay(double amount) {
            if (amount > dailyLimit) {
                return false;
            }
            return super.pay(amount);
        }

        @Override
        public String toString() {
            return super.toString() + " -> DebitCard{денний ліміт=" + dailyLimit + " грн}";
        }
    }

    public static class CashbackPlatinumCard extends DebitCard {
        private double cashbackPercent;
        private double accumulatedCashback;

        public CashbackPlatinumCard(String cardHolder, double balance, double dailyLimit, double cashbackPercent) {
            super(cardHolder, balance, dailyLimit);
            if (cashbackPercent >= 0) {
                this.cashbackPercent = cashbackPercent;
            } else {
                this.cashbackPercent = 0;
            }
            this.accumulatedCashback = 0;
        }

        @Override
        public boolean pay(double amount) {
            boolean success = super.pay(amount);
            if (success) {
                accumulatedCashback += amount * (cashbackPercent / 100.0);
            }
            return success;
        }

        @Override
        public String toString() {
            return super.toString() + " -> CashbackPlatinumCard{кешбек=" + cashbackPercent
                    + "%, накопичено=" + r2(accumulatedCashback) + " грн}";
        }
    }

    public static class SecurityTerminal {
        // final-метод: його не можна перевизначити в підкласах
        public final String generateAuthHash(String user) {
            return "AUTH-SHA-" + user.toUpperCase();
        }

        public String getWelcomeBanner() {
            return "Welcome to SecurityTerminal";
        }
    }

    public static class CustomTerminal extends SecurityTerminal {
        private String user;

        public CustomTerminal(String user) {
            this.user = user;
        }

        @Override
        public String getWelcomeBanner() {
            return "*** Ласкаво просимо до CustomTerminal, " + user + "! *** Ваш підпис: " + generateAuthHash(user);
        }

    }

    public static final class ImmutableServerCredentials {
        private final String host;
        private final int port;
        private final String apiKey;

        public ImmutableServerCredentials(String host, int port, String apiKey) {
            this.host = host;
            this.port = port;
            this.apiKey = apiKey;
        }

        public String getHost() {
            return host;
        }

        public int getPort() {
            return port;
        }

        public String getApiKey() {
            return apiKey;
        }


        @Override
        public String toString() {
            return "ImmutableServerCredentials{host='" + host + "', port=" + port + ", apiKey='***SECRET***'}";
        }
    }

    public static class Segment1D {
        protected double length;

        public Segment1D(double length) {
            if (length > 0) {
                this.length = length;
            } else {
                this.length = 1.0;
            }
        }

        @Override
        public String toString() {
            return "Segment1D{довжина=" + length + "}";
        }
    }

    public static class Square2D extends Segment1D {
        public Square2D(double side) {
            super(side);
        }

        public double getPerimeter() {
            return 4 * length;
        }

        public double getArea() {
            return length * length;
        }

        @Override
        public String toString() {
            return "Square2D{сторона=" + length + ", периметр=" + getPerimeter() + ", площа=" + getArea() + "}";
        }
    }

    public static class Cube3D extends Square2D {
        public Cube3D(double edge) {
            super(edge);
        }

        // Площа повної поверхні куба
        @Override
        public double getArea() {
            return 6 * super.getArea();
        }

        public double getVolume() {
            return length * length * length;
        }

        @Override
        public String toString() {
            return "Cube3D{ребро=" + length + ", площа повної поверхні=" + getArea() + ", об'єм=" + getVolume() + "}";
        }
    }

    public static class User {
        private int id;
        private String email;

        public User(int id, String email) {
            this.id = id;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "User{id=" + id + ", email='" + email + "'}";
        }
    }

    public static class StudentUser extends User {
        private String groupCode;
        private double gpa;

        public StudentUser(int id, String email, String groupCode, double gpa) {
            super(id, email);
            this.groupCode = groupCode;
            if (gpa >= 0.0 && gpa <= 100.0) {
                this.gpa = gpa;
            } else {
                this.gpa = 60.0;
            }
        }

        public String getGroupCode() {
            return groupCode;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return super.toString() + " -> StudentUser{група='" + groupCode + "', gpa=" + gpa + "}";
        }
    }

    public static class PostgraduateStudent extends StudentUser {
        private String thesisTopic;
        private String supervisorName;

        public PostgraduateStudent(int id, String email, String groupCode, double gpa, String thesisTopic, String supervisorName) {
            super(id, email, groupCode, gpa);
            this.thesisTopic = thesisTopic;
            this.supervisorName = supervisorName;
        }

        public boolean canDefendThesis() {
            return getGpa() >= 85.0 && thesisTopic != null && !thesisTopic.trim().isEmpty();
        }

        @Override
        public String toString() {
            return super.toString() + " -> PostgraduateStudent{тема='" + thesisTopic + "', керівник='" + supervisorName + "'}";
        }
    }

    public static class Medicine {
        private String name;
        private double price;
        private boolean isExpired;

        public Medicine(String name, double price, boolean isExpired) {
            this.name = name;
            if (price >= 0) {
                this.price = price;
            } else {
                this.price = 0;
            }
            this.isExpired = isExpired;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public boolean isExpired() {
            return isExpired;
        }

        @Override
        public String toString() {
            return "Medicine{назва='" + name + "', ціна=" + price + " грн, прострочено=" + (isExpired ? "так" : "ні") + "}";
        }
    }

    public static class PrescriptionMedicine extends Medicine {
        private String doctorLicense;

        public PrescriptionMedicine(String name, double price, boolean isExpired, String doctorLicense) {
            super(name, price, isExpired);
            this.doctorLicense = doctorLicense;
        }

        public boolean canSell(boolean hasPrescription) {
            return !isExpired() && hasPrescription;
        }

        @Override
        public String toString() {
            return super.toString() + " -> PrescriptionMedicine{ліцензія лікаря='" + doctorLicense + "'}";
        }
    }

    public static class ControlledSubstance extends PrescriptionMedicine {
        private int patientAge;

        public ControlledSubstance(String name, double price, boolean isExpired, String doctorLicense, int patientAge) {
            super(name, price, isExpired, doctorLicense);
            this.patientAge = patientAge;
        }

        @Override
        public boolean canSell(boolean hasPrescription) {
            return super.canSell(hasPrescription) && patientAge >= 18;
        }

        @Override
        public String toString() {
            return super.toString() + " -> ControlledSubstance{вік пацієнта=" + patientAge + "}";
        }
    }

    public static class Progression {
        protected double firstTerm;
        protected double step;

        public Progression(double firstTerm, double step) {
            this.firstTerm = firstTerm;
            this.step = step;
        }

        public double getTerm(int n) {
            return firstTerm;
        }

        public double[] generateFirstN(int n) {
            if (n <= 0) {
                return new double[0];
            }
            double[] result = new double[n];
            for (int i = 1; i <= n; i++) {
                result[i - 1] = getTerm(i);
            }
            return result;
        }

        @Override
        public String toString() {
            return "Progression{a1=" + firstTerm + ", крок=" + step + "}";
        }
    }

    public static class ArithmeticProgression extends Progression {
        public ArithmeticProgression(double firstTerm, double d) {
            super(firstTerm, d);
        }

        @Override
        public double getTerm(int n) {
            return firstTerm + (n - 1) * step;
        }

        @Override
        public String toString() {
            return "Арифметична прогресія: an = " + firstTerm + " + (n - 1) * " + step
                    + " | перші 5 членів: " + Arrays.toString(generateFirstN(5));
        }
    }

    public static class GeometricProgression extends Progression {
        public GeometricProgression(double firstTerm, double q) {
            super(firstTerm, q);
        }

        @Override
        public double getTerm(int n) {
            return firstTerm * Math.pow(step, n - 1);
        }

        @Override
        public String toString() {
            return "Геометрична прогресія: bn = " + firstTerm + " * " + step + "^(n - 1)"
                    + " | перші 5 членів: " + Arrays.toString(generateFirstN(5));
        }
    }

    public static class GradeSheet {
        private String studentName;
        protected int[] grades;

        public GradeSheet(String studentName, int[] grades) {
            this.studentName = studentName;
            if (grades == null) {
                this.grades = new int[0];
            } else {
                this.grades = new int[grades.length];
                for (int i = 0; i < grades.length; i++) {
                    this.grades[i] = grades[i];
                }
            }
        }

        public String getStudentName() {
            return studentName;
        }

        public double calculateScore() {
            if (grades.length == 0) {
                return 0.0;
            }
            double sum = 0.0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum / grades.length;
        }

        @Override
        public String toString() {
            return "GradeSheet{студент='" + studentName + "', оцінки=" + Arrays.toString(grades)
                    + ", середній бал=" + r2(calculateScore()) + "}";
        }
    }

    public static class WeightedGradeSheet extends GradeSheet {
        private double[] weights;

        public WeightedGradeSheet(String studentName, int[] grades, double[] weights) {
            super(studentName, grades);
            this.weights = new double[this.grades.length];
            for (int i = 0; i < this.grades.length; i++) {
                // Якщо ваг не вистачає — вважаємо вагу рівною 1.0
                if (weights != null && i < weights.length) {
                    this.weights[i] = weights[i];
                } else {
                    this.weights[i] = 1.0;
                }
            }
        }

        @Override
        public double calculateScore() {
            double sumWeighted = 0.0;
            double sumWeights = 0.0;
            for (int i = 0; i < grades.length; i++) {
                sumWeighted += grades[i] * weights[i];
                sumWeights += weights[i];
            }
            if (sumWeights == 0) {
                return 0.0;
            }
            return sumWeighted / sumWeights;
        }

        @Override
        public String toString() {
            return "WeightedGradeSheet{студент='" + getStudentName() + "', оцінки=" + Arrays.toString(grades)
                    + ", ваги=" + Arrays.toString(weights)
                    + ", звичайний бал=" + r2(super.calculateScore())
                    + ", зважений бал=" + r2(calculateScore()) + "}";
        }
    }

    public static class LinearFunction {
        protected double k;
        protected double b;

        public LinearFunction(double k, double b) {
            this.k = k;
            this.b = b;
        }

        public double evaluate(double x) {
            return k * x + b;
        }

        @Override
        public String toString() {
            return "f(x) = " + k + "x + " + b;
        }
    }

    public static class QuadraticFunction extends LinearFunction {
        private double a;

        public QuadraticFunction(double a, double k, double b) {
            super(k, b);
            this.a = a;
        }

        @Override
        public double evaluate(double x) {
            return a * x * x + super.evaluate(x);
        }

        // Вершина параболи x0 = -k / (2a); якщо a == 0, то це не парабола
        public double getVertexX() {
            if (a == 0) {
                return Double.NaN;
            }
            return -k / (2 * a);
        }

        @Override
        public String toString() {
            return "f(x) = " + a + "x^2 + " + k + "x + " + b;
        }
    }

    public static class WarehouseItem {
        private String name;
        private int quantity;
        private double[] priceHistory;

        public WarehouseItem(String name, int quantity, double[] priceHistory) {
            this.name = name;
            if (quantity >= 0) {
                this.quantity = quantity;
            } else {
                this.quantity = 0;
            }
            if (priceHistory == null) {
                this.priceHistory = new double[0];
            } else {
                this.priceHistory = new double[priceHistory.length];
                for (int i = 0; i < priceHistory.length; i++) {
                    this.priceHistory[i] = priceHistory[i];
                }
            }
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getAveragePurchasePrice() {
            if (priceHistory.length == 0) {
                return 0.0;
            }
            double sum = 0.0;
            for (double price : priceHistory) {
                sum += price;
            }
            return sum / priceHistory.length;
        }

        @Override
        public String toString() {
            return "WarehouseItem{назва='" + name + "', кількість=" + quantity + ", історія цін=" + Arrays.toString(priceHistory)
                    + ", середня закупівельна ціна=" + r2(getAveragePurchasePrice()) + " грн}";
        }
    }

    public static class DiscountedWarehouseItem extends WarehouseItem {
        private String markdownReason;
        private double discountPercent;

        public DiscountedWarehouseItem(String name, int quantity, double[] priceHistory, String markdownReason, double discountPercent) {
            super(name, quantity, priceHistory);
            this.markdownReason = markdownReason;
            if (discountPercent < 0) {
                this.discountPercent = 0;
            } else if (discountPercent > 100) {
                this.discountPercent = 100;
            } else {
                this.discountPercent = discountPercent;
            }
        }

        public double getSalePrice() {
            return getAveragePurchasePrice() * (1 - discountPercent / 100.0);
        }

        public double getSaleTotalValue() {
            return getSalePrice() * getQuantity();
        }

        @Override
        public String toString() {
            return super.toString() + " -> Уцінка{причина='" + markdownReason + "', знижка=" + discountPercent
                    + "%, ціна розпродажу=" + r2(getSalePrice()) + " грн, вартість розпродажу=" + r2(getSaleTotalValue()) + " грн}";
        }
    }

    public static class CinemaHall {
        private String hallName;
        protected boolean[][] seats; // true — зайнято, false — вільно
        protected double baseTicketPrice;

        public CinemaHall(String hallName, int rows, int cols, double baseTicketPrice) {
            this.hallName = hallName;
            if (rows < 1) {
                rows = 1;
            }
            if (cols < 1) {
                cols = 1;
            }
            this.seats = new boolean[rows][cols];
            if (baseTicketPrice >= 0) {
                this.baseTicketPrice = baseTicketPrice;
            } else {
                this.baseTicketPrice = 0;
            }
        }

        // Нумерація рядів та місць у методі починається з 0
        public boolean bookSeat(int row, int col) {
            if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
                return false;
            }
            if (seats[row][col]) {
                return false;
            }
            seats[row][col] = true;
            return true;
        }

        public int getOccupiedCount() {
            int count = 0;
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    if (seats[i][j]) {
                        count++;
                    }
                }
            }
            return count;
        }

        public double calculateRevenue() {
            return getOccupiedCount() * baseTicketPrice;
        }

        @Override
        public String toString() {
            String result = "Зал '" + hallName + "' ([X] — зайнято, [O] — вільно)\n";
            for (int i = 0; i < seats.length; i++) {
                result += "Ряд " + (i + 1) + ": ";
                for (int j = 0; j < seats[i].length; j++) {
                    if (seats[i][j]) {
                        result += "[X]";
                    } else {
                        result += "[O]";
                    }
                }
                result += "\n";
            }
            result += "Зайнято місць: " + getOccupiedCount() + "\n";
            result += "Виручка: " + r2(calculateRevenue()) + " грн";
            return result;
        }
    }

    public static class VipCinemaHall extends CinemaHall {
        private double complimentaryBarCost;

        public VipCinemaHall(String hallName, int rows, int cols, double baseTicketPrice, double complimentaryBarCost) {
            super(hallName, rows, cols, baseTicketPrice);
            if (complimentaryBarCost >= 0) {
                this.complimentaryBarCost = complimentaryBarCost;
            } else {
                this.complimentaryBarCost = 0;
            }
        }

        private int getOccupiedInLastRow() {
            int count = 0;
            boolean[] lastRow = seats[seats.length - 1];
            for (int j = 0; j < lastRow.length; j++) {
                if (lastRow[j]) {
                    count++;
                }
            }
            return count;
        }

        // Націнка для квитків останнього ряду: у квиток входить бар
        @Override
        public double calculateRevenue() {
            return super.calculateRevenue() + getOccupiedInLastRow() * complimentaryBarCost;
        }

        @Override
        public String toString() {
            return "[VIP] " + super.toString() + "\nУ квиток останнього ряду входить бар на " + complimentaryBarCost
                    + " грн (місць у останньому ряду зайнято: " + getOccupiedInLastRow() + ")";
        }
    }

    // ---------- Завдання 38: Employee -> Developer -> TeamLead ----------
    public static class TeamLead extends Developer {
        private Developer[] teamMembers;
        private int memberCount;

        public TeamLead(String name, double salary, String programmingLanguage, int teamCapacity) {
            super(name, salary, programmingLanguage);
            if (teamCapacity < 1) {
                teamCapacity = 1;
            }
            this.teamMembers = new Developer[teamCapacity];
            this.memberCount = 0;
        }

        public void addTeamMember(Developer dev) {
            if (dev == null) {
                return;
            }
            if (memberCount < teamMembers.length) {
                teamMembers[memberCount] = dev;
                memberCount++;
            } else {
                System.out.println("Команда заповнена, не можна додати: " + dev.getName());
            }
        }

        public double getTotalTeamBudget() {
            double total = salary;
            for (int i = 0; i < memberCount; i++) {
                total += teamMembers[i].getSalary();
            }
            return total;
        }

        @Override
        public String toString() {
            String result = "TeamLead -> " + super.toString() + "\n";
            result += "Загальний бюджет команди: " + r2(getTotalTeamBudget()) + " грн\n";
            result += "Учасники команди (" + memberCount + "):";
            for (int i = 0; i < memberCount; i++) {
                result += "\n  - " + teamMembers[i].getName() + " (" + teamMembers[i].getProgrammingLanguage()
                        + "), " + teamMembers[i].getSalary() + " грн";
            }
            return result;
        }
    }

    public static class CharacterUnit {
        private String name;
        protected int hp;
        protected int maxHp;
        protected int armor;

        public CharacterUnit(String name, int maxHp, int armor) {
            this.name = name;
            if (maxHp > 0) {
                this.maxHp = maxHp;
            } else {
                this.maxHp = 1;
            }
            this.hp = this.maxHp;
            if (armor >= 0) {
                this.armor = armor;
            } else {
                this.armor = 0;
            }
        }

        public String getName() {
            return name;
        }

        public void takeDamage(int rawDamage) {
            hp -= Math.max(1, rawDamage - armor);
            if (hp < 0) {
                hp = 0;
            }
        }

        protected String getHealthBar() {
            int filled = (int) Math.round(10.0 * hp / maxHp);
            String bar = "[";
            for (int i = 0; i < 10; i++) {
                if (i < filled) {
                    bar += "|";
                } else {
                    bar += " ";
                }
            }
            return bar + "]";
        }

        @Override
        public String toString() {
            return name + " " + getHealthBar() + " HP: " + hp + "/" + maxHp + " | броня: " + armor;
        }
    }

    public static class ShieldedPaladin extends CharacterUnit {
        private int shieldPoints;

        public ShieldedPaladin(String name, int maxHp, int armor, int shieldPoints) {
            super(name, maxHp, armor);
            if (shieldPoints >= 0) {
                this.shieldPoints = shieldPoints;
            } else {
                this.shieldPoints = 0;
            }
        }

        @Override
        public void takeDamage(int rawDamage) {
            if (shieldPoints >= rawDamage) {
                // щит повністю поглинає шкоду
                shieldPoints -= rawDamage;
            } else {
                // щит пробито: залишок шкоди йде у HP
                int remainingDamage = rawDamage - shieldPoints;
                shieldPoints = 0;
                super.takeDamage(remainingDamage);
            }
        }

        @Override
        public String toString() {
            return super.toString() + " | щит: " + shieldPoints;
        }
    }
}
