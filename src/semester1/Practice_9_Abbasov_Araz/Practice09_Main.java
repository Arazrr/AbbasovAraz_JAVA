package semester1.Practice_9_Abbasov_Araz;

import java.util.Arrays;

public class Practice09_Main {
    public static void main (String[] args) {
        System.out.println("----------------------1 завдання-------------------------");
        ImmutableGeoPoint p1 = new ImmutableGeoPoint(100.0, -200.0);
        System.out.println("Початкова точка 1 (з обмеженням): " + p1);
        ImmutableGeoPoint p2 = new ImmutableGeoPoint(50.45, 30.52);
        System.out.println("Початкова точка 2 (Київ): " + p2);

        ImmutableGeoPoint p3 = p2.shift(5.0, -10.5);
        System.out.println("Точка 2 після зміщення (shift): " + p3);
        System.out.println("Початкова точка 2 залишилась незмінною: " + p2);
        ImmutableGeoPoint p4 = p1.shift(10.0, 50.0);
        System.out.println("Точка 4 (зміщення з обмеженням): " + p4);
        System.out.println("----------------------2 завдання-------------------------");
        double[] externalSamples = {1.5, 2.3, 3.1};
        LabMeasurement measurement = new LabMeasurement("Chemistry-1", externalSamples);
        externalSamples[0] = 99.9;
        System.out.println("Зовнішній масив змінено. Внутрішній елемент [0]: " + measurement.getSamples()[0]);
        double[] retrieved = measurement.getSamples();
        retrieved[0] = 500.0;
        System.out.println("Спроба змінити через геттер. Внутрішній елемент [0]: " + measurement.getSamples()[0]);
        System.out.println("----------------------3 завдання-------------------------");
        CryptoVault vault = new CryptoVault("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", "correct horse battery staple", 1.5);
        System.out.println(vault);
        boolean sent1 = vault.sendBtc(0.5, "1ReceiverAddress");
        System.out.println("Відправка в заблокованому стані: " + sent1);
        System.out.println("Розблокування невірною фразою: " + vault.unlock("wrong phrase"));
        System.out.println("Розблокування вірною фразою: " + vault.unlock("correct horse battery staple"));

        boolean sent2 = vault.sendBtc(0.5, "1ReceiverAddress");
        System.out.println("Відправка 0.5 BTC: " + sent2);
        System.out.println(vault);
        System.out.println("----------------------4 завдання-------------------------");
        ClosedInterval interval1 = new ClosedInterval(10.0, 2.0);
        System.out.println("Інтервал 1 (авто-виправлення): " + interval1);
        ClosedInterval interval2 = new ClosedInterval(5.0, 15.0);
        System.out.println("Інтервал 2: " + interval2);
        System.out.println("Чи перетинаються інтервал 1 та інтервал 2? " + interval1.overlaps(interval2));
        interval1.resize(20.0, 12.0);
        System.out.println("Інтервал 1 після resize(20, 12): " + interval1);
        System.out.println("----------------------5 завдання-------------------------");
        RgbColor color1 = new RgbColor(300, 100, 50);
        RgbColor color2 = new RgbColor(0, 150, 255);
        System.out.println("Колір 1: " + color1);
        System.out.println("Колір 2: " + color2);
        RgbColor inverted = color1.invert();
        System.out.println("Інверсія кольору 1: " + inverted);
        RgbColor mixed = color1.mixWith(color2);
        System.out.println("Змішування кольорів: " + mixed);
        System.out.println("----------------------6 завдання-------------------------");
        HighSecuritySafe safe = new HighSecuritySafe(1234, 1000.0);
        System.out.println("Спроба 1 (невірний пін): " + safe.takeCash(1111, 100));
        System.out.println("Спроба 2 (невірний пін): " + safe.takeCash(2222, 100));
        System.out.println("Спроба 3 (невірний пін): " + safe.takeCash(3333, 100));
        System.out.println("Чи заблокований сейф назавжди? " + safe.isPermanentlyBlocked());
        System.out.println("Спроба з вірним піном після блокування: " + safe.putCash(1234, 500));
        System.out.println("----------------------7 завдання-------------------------");
        double[] coefficients = {3.0, 2.0, -5.0};
        EncapsulatedPolynomial poly = new EncapsulatedPolynomial(coefficients);
        System.out.println("Многочлен: " + poly);
        System.out.println("Степінь многочлена: " + poly.getDegree());
        System.out.println("Коефіцієнт при x^1: " + poly.getCoefficient(1));
        System.out.println("Значення у точці x = 2.0: " + poly.evaluate(2.0));
        System.out.println("----------------------8 завдання-------------------------");
        String[] initialAllergies = {"Penicillin", "Dust"};
        MedicalRecord record = new MedicalRecord("P-99214", "Іван Петренко", 2, true, initialAllergies);
        System.out.println(record);
        System.out.println("Чи є алергія на 'penicillin'? " + record.hasAllergyTo("penicillin"));
        System.out.println("Чи є алергія на 'Pollen'? " + record.hasAllergyTo("Pollen"));
        String[] fetchedAllergies = record.getAllergies();
        fetchedAllergies[0] = "Modified";
        System.out.println("Після спроби модифікації через геттер: " + Arrays.toString(record.getAllergies()));
        System.out.println("----------------------9 завдання-------------------------");
        CompositeCircle circle = new CompositeCircle(0.0, 0.0, 5.0);
        System.out.println(circle);
        Point2D insidePoint = new Point2D(3.0, 4.0);
        Point2D outsidePoint = new Point2D(6.0, 6.0);
        System.out.println("Чи містить коло точку " + insidePoint + "? " + circle.containsPoint(insidePoint));
        System.out.println("Чи містить коло точку " + outsidePoint + "? " + circle.containsPoint(outsidePoint));
        System.out.println("----------------------10 завдання-------------------------");
        Engine engine = new Engine("Бензин", 2000);
        Automobile car = new Automobile("Toyota Camry", engine);
        car.accelerate(30.0);
        System.out.println("Розгін із незаведеним двигуном: " + car);
        engine.start();
        car.accelerate(30.0);
        car.accelerate(40.0);
        System.out.println("Розгін із заведеним двигуном: " + car);
        engine.stop();
        car.accelerate(20.0);
        System.out.println("Розгін після зупинки двигуна: " + car);
        System.out.println("----------------------11 завдання-------------------------");
        SmartDevice phone = new SmartDevice(5000, 20, 6.5, 80);
        System.out.println(phone);
        phone.watchVideo(60);
        System.out.println("Після 60 хв відео (яскравість 80%): " + phone);
        phone.watchVideo(60);
        System.out.println("Після ще 60 хв відео: " + phone);
        phone.watchVideo(10);
        System.out.println("Спроба дивитись відео на вимкненому пристрої: " + phone);
        SmartDevice tablet = new SmartDevice(8000, 50, 10.2, 50);
        tablet.watchVideo(100);
        System.out.println("Планшет після 100 хв відео (яскравість 50%): " + tablet);
        System.out.println("----------------------12 завдання-------------------------");
        Point2D segStart = new Point2D(0.0, 0.0);
        Point2D segEnd = new Point2D(3.0, 4.0);
        LineSegment segment = new LineSegment(segStart, segEnd);
        System.out.println("Відрізок: " + segment);
        segStart.setX(100.0);
        segEnd.setY(100.0);
        System.out.println("Зовнішні точки змінено. Відрізок: " + segment);
        System.out.println("Довжина відрізка: " + segment.getLength());
        System.out.println("Середина відрізка: " + segment.getMidpoint());
        System.out.println("----------------------13 завдання-------------------------");
        BankAccount familyAccount = new BankAccount("UA213223130000026007233566001", 5000.0);
        PlasticCard card1 = new PlasticCard("4149 4990 1234 5678", "12/28", familyAccount);
        PlasticCard card2 = new PlasticCard("5375 4141 8765 4321", "05/27", familyAccount);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println("Оплата карткою 1 (1200 грн): " + card1.payAtTerminal(1200.0));
        System.out.println("Оплата карткою 2 (2000 грн): " + card2.payAtTerminal(2000.0));
        System.out.println("Залишок на спільному рахунку: " + familyAccount.getBalance());
        System.out.println("Оплата карткою 2 (3000 грн): " + card2.payAtTerminal(3000.0));
        card1.block();
        System.out.println("Оплата заблокованою карткою 1 (100 грн): " + card1.payAtTerminal(100.0));
        System.out.println("Залишок на спільному рахунку: " + familyAccount.getBalance());
        System.out.println("----------------------14 завдання-------------------------");
        WeaponItem sword = new WeaponItem("Меч світла", 15, 30);
        HeroCharacter hero = new HeroCharacter("Dragonslayer", 10);
        System.out.println("Атака без зброї: " + hero.attack());
        hero.equip(sword);
        System.out.println(hero);
        for (int i = 1; i <= 4; i++) {
            System.out.println("Удар " + i + ": " + hero.attack() + " | " + sword);
        }
        hero.unequip();
        System.out.println("Атака після unequip(): " + hero.attack());
        System.out.println("----------------------15 завдання-------------------------");
        DeliveryAddress addressOld = new DeliveryAddress("Київ", "вул. Хрещатик", 12);
        DeliveryAddress addressNew = new DeliveryAddress("Львів", "вул. Городоцька", 5);
        ParcelOrder parcel = new ParcelOrder("ORD-1001", 2.5, addressOld);
        System.out.println(parcel);
        System.out.println("Зміна адреси до відправки: " + parcel.changeDestination(addressNew));
        System.out.println(parcel);
        parcel.markAsShipped();
        System.out.println("Зміна адреси після відправки: " + parcel.changeDestination(addressOld));
        System.out.println(parcel);
        System.out.println("----------------------16 завдання-------------------------");
        TemperatureSensor sensor = new TemperatureSensor(18.0);
        HeatingUnit heater = new HeatingUnit(2.5);
        ClimateController controller = new ClimateController(sensor, heater, 22.0);
        controller.regulate();
        System.out.println(controller);
        sensor.setCurrentTemp(21.8);
        controller.regulate();
        System.out.println(controller);
        sensor.setCurrentTemp(22.5);
        controller.regulate();
        System.out.println(controller);
        System.out.println("----------------------17 завдання-------------------------");
        Polyline polyline = new Polyline(5);
        polyline.addVertex(0.0, 0.0);
        polyline.addVertex(4.0, 0.0);
        polyline.addVertex(4.0, 3.0);
        System.out.println(polyline);
        System.out.println("Довжина ламаної: " + polyline.getTotalLength());
        System.out.println("Периметр із замиканням: " + polyline.getClosedPerimeter());
        System.out.println("----------------------18 завдання-------------------------");
        ShoppingOrder shoppingOrder = new ShoppingOrder();
        shoppingOrder.addItem("Хліб", 25.5, 2);
        shoppingOrder.addItem("Молоко", 42.0, 1);
        shoppingOrder.addItem("Хліб", 25.5, 1);
        shoppingOrder.addItem("Сир", 180.0, 2);
        System.out.println(shoppingOrder);
        System.out.println("----------------------19 завдання-------------------------");
        Bookshelf shelf = new Bookshelf("Фантастика", 3);
        BookItem bookA = new BookItem("Дюна", "Френк Герберт", 688);
        BookItem bookB = new BookItem("Соляріс", "Станіслав Лем", 224);
        BookItem bookC = new BookItem("Основа", "Айзек Азімов", 296);
        BookItem bookD = new BookItem("Нейромант", "Вільям Гібсон", 271);
        System.out.println("Додавання 1: " + shelf.putBook(bookA));
        System.out.println("Додавання 2: " + shelf.putBook(bookB));
        System.out.println("Додавання null: " + shelf.putBook(null));
        System.out.println("Додавання 3: " + shelf.putBook(bookC));
        System.out.println("Додавання 4 (полиця повна): " + shelf.putBook(bookD));
        System.out.println("Найдовша книга: " + shelf.findLongestBook());
        System.out.println("Сумарна кількість сторінок: " + shelf.getTotalPagesOnShelf());
        System.out.println("----------------------20 завдання-------------------------");
        Playlist playlist = new Playlist("Ранкова добірка", 5);
        playlist.addTrack(new AudioTrack("Intro", "Artist A", 185));
        playlist.addTrack(new AudioTrack("Sunrise", "Artist B", 242));
        playlist.addTrack(new AudioTrack("Coffee Time", "Artist C", 199));
        System.out.println(playlist);
        System.out.println("Загальна тривалість у секундах: " + playlist.getTotalDurationSeconds());
        System.out.println("----------------------21 завдання-------------------------");
        DataCenterCluster cluster = new DataCenterCluster("Frankfurt", 3);
        ServerNode node1 = new ServerNode("192.168.0.1", 64);
        ServerNode node2 = new ServerNode("192.168.0.2", 128);
        ServerNode node3 = new ServerNode("192.168.0.3", 32);
        node2.setOnline(false);
        cluster.addNode(node1);
        cluster.addNode(node2);
        cluster.addNode(node3);
        System.out.println("Розгортання контейнера 50 ГБ: " + cluster.deployContainer(50));
        System.out.println("Розгортання контейнера 30 ГБ: " + cluster.deployContainer(30));
        System.out.println("Розгортання контейнера 500 ГБ: " + cluster.deployContainer(500));
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
        System.out.println("----------------------22 завдання-------------------------");
        UniversityCourse course = new UniversityCourse("Об'єктно-орієнтоване програмування", 4);
        course.addModule(new CourseModule("Класи та об'єкти", 16, 16, 30.0));
        course.addModule(new CourseModule("Наслідування", 12, 12, 30.0));
        course.addModule(new CourseModule("Абстракція та композиція", 16, 20, 40.0));
        System.out.println("Кількість кредитів ЄКТС: " + course.getTotalEctsCredits());
        System.out.println("Сума балів дорівнює 100? " + course.isMaxScoreSumExactly100());
        System.out.println("----------------------23 завдання-------------------------");
        PassengerTrain train = new PassengerTrain("Київ - Львів", 3);
        train.attachCarriage(new TrainCarriage(1, "Купе", 36));
        train.attachCarriage(new TrainCarriage(2, "Плацкарт", 54));
        train.attachCarriage(new TrainCarriage(3, "Інтерсіті", 60));
        System.out.println("Вільних місць у потязі: " + train.getTotalFreeSeats());
        System.out.println("Бронювання 10 місць у вагоні 2: " + train.bookTicketsInCarriage(2, 10));
        System.out.println("Бронювання 40 місць у вагоні 1: " + train.bookTicketsInCarriage(1, 40));
        System.out.println("Бронювання у неіснуючому вагоні 9: " + train.bookTicketsInCarriage(9, 1));
        System.out.println("Вільних місць у потязі: " + train.getTotalFreeSeats());
        System.out.println("----------------------24 завдання-------------------------");
        EquationSystem system = new EquationSystem(3);
        system.addEquation(new LinearEquation(1.0, 1.0, 5.0));
        system.addEquation(new LinearEquation(2.0, -1.0, 1.0));
        System.out.println("Чи є (2; 3) розв'язком системи? " + system.checkSolution(2.0, 3.0));
        System.out.println("Чи є (1; 4) розв'язком системи? " + system.checkSolution(1.0, 4.0));
        System.out.println("----------------------25 завдання-------------------------");
        CircleShape circleShape = new CircleShape("Червоний", 3.0);
        RectangleShape rectangleShape = new RectangleShape("Синій", 4.0, 5.0);
        System.out.println(circleShape);
        System.out.println(rectangleShape);
        System.out.println("----------------------26 завдання-------------------------");
        SolarPowerPlant solarPlant = new SolarPowerPlant("Solar-1", 50.0, 0.8);
        WindPowerPlant windPlant = new WindPowerPlant("Wind-1", 30.0, 10.0);
        WindPowerPlant windCalm = new WindPowerPlant("Wind-2", 30.0, 2.0);
        WindPowerPlant windStorm = new WindPowerPlant("Wind-3", 30.0, 30.0);
        System.out.println(solarPlant);
        System.out.println("Щоденний прибуток: " + solarPlant.calculateDailyProfit(1500.0));
        System.out.println(windPlant);
        System.out.println("Щоденний прибуток: " + windPlant.calculateDailyProfit(1500.0));
        System.out.println(windCalm);
        System.out.println(windStorm);
        System.out.println("----------------------27 завдання-------------------------");
        SalariedEmployee salaried = new SalariedEmployee(1, "Олена Коваль", 40000.0, 5000.0);
        HourlyContractor contractor = new HourlyContractor(2, "Андрій Бондар", 180, 200.0);
        System.out.println(salaried);
        System.out.println(contractor);
        System.out.println("----------------------28 завдання-------------------------");
        HarmonicSequence harmonic = new HarmonicSequence();
        SquareNumbersSequence squares = new SquareNumbersSequence();
        System.out.println(harmonic.getTitle() + ", сума перших 5 членів: " + harmonic.sumFirstN(5));
        System.out.println(squares.getTitle() + ", сума перших 5 членів: " + squares.sumFirstN(5));
        System.out.println("----------------------29 завдання-------------------------");
        DomesticTransfer domestic = new DomesticTransfer("TX-001", 100.0);
        DomesticTransfer domesticLarge = new DomesticTransfer("TX-002", 10000.0);
        CryptoTransfer crypto = new CryptoTransfer("TX-003", 2000.0, 35.5);
        System.out.println(domestic);
        System.out.println(domesticLarge);
        System.out.println(crypto);
        System.out.println("----------------------30 завдання-------------------------");
        Sphere3D steelSphere = new Sphere3D("Сталь", 7850.0, 0.5);
        Cylinder3D goldCylinder = new Cylinder3D("Золото", 19320.0, 0.1, 0.3);
        System.out.println(steelSphere);
        System.out.println(goldCylinder);
        System.out.println("----------------------31 завдання-------------------------");
        PressureSensor pressureSensor = new PressureSensor("Реактор А", 1.0, 5.0, 4.2, 1.5);
        RadiationSensor radiationSensor = new RadiationSensor("Лабораторія", 0.0, 0.3, 0.12);
        System.out.println(pressureSensor);
        System.out.println("Тривога датчика тиску: " + pressureSensor.isAlarmTriggered());
        System.out.println(radiationSensor);
        System.out.println("Тривога датчика радіації: " + radiationSensor.isAlarmTriggered());
        System.out.println("----------------------32 завдання-------------------------");
        ZipCompressor zip = new ZipCompressor();
        UltraLzmaCompressor lzma = new UltraLzmaCompressor();
        System.out.println("ZIP: розмір після стиснення 1000 байт = " + zip.estimateCompressedSize(1000)
                + ", відсоток стиснення = " + zip.getCompressionRatio(1000) + "%");
        System.out.println("LZMA: розмір після стиснення 1000 байт = " + lzma.estimateCompressedSize(1000)
                + ", відсоток стиснення = " + lzma.getCompressionRatio(1000) + "%");
        System.out.println("----------------------33 завдання-------------------------");
        DesktopPC pc = new DesktopPC(550, 5);
        pc.addPart(new ProcessorPart("Intel Core i7", 12000.0, 8, 125));
        pc.addPart(new VideoCardPart("NVIDIA RTX 4070", 28000.0, 12, 200));
        System.out.println(pc);
        System.out.println("Чи стабільна система? " + pc.isSystemStable());
        DesktopPC weakPc = new DesktopPC(350, 5);
        weakPc.addPart(new ProcessorPart("Intel Core i7", 12000.0, 8, 125));
        weakPc.addPart(new VideoCardPart("NVIDIA RTX 4070", 28000.0, 12, 200));
        System.out.println(weakPc);
        System.out.println("Чи стабільна система? " + weakPc.isSystemStable());
        System.out.println("----------------------34 завдання-------------------------");
        Spacecraft ship = new Spacecraft("Explorer-1", 20.0, 4);
        ship.addThruster(new ChemicalThruster("CH-1", 150.0, 12.5));
        ship.addThruster(new ChemicalThruster("CH-2", 150.0, 12.5));
        ship.addThruster(new IonThruster("ION-1", 0.5, 0.01));
        System.out.println(ship);
        System.out.println("Сумарна тяга (кН): " + ship.getTotalThrustKn());
        System.out.println("Початкове прискорення (м/с²): " + ship.getInitialAcceleration());
        System.out.println("----------------------35 завдання-------------------------");
        LandPlot plot = new LandPlot(1000.0, 5);
        System.out.println("Будинок 10x20: " + plot.addStructure(new RectangleShape("Сірий", 10.0, 20.0)));
        System.out.println("Клумба r=5: " + plot.addStructure(new CircleShape("Зелений", 5.0)));
        System.out.println("Гараж 20x30: " + plot.addStructure(new RectangleShape("Білий", 20.0, 30.0)));
        System.out.println(plot);
        System.out.println("Вільна площа газону: " + plot.getFreeGreenArea());
        System.out.println("----------------------36 завдання-------------------------");
        InvestmentPortfolio portfolio = new InvestmentPortfolio("Петро Іваненко", 5);
        portfolio.addAsset(new GovernmentBond("UA-BOND-2027", 100000.0));
        portfolio.addAsset(new DividendStock("AAPL", 50000.0, 0.08, 0.04, 0.195));
        System.out.println(portfolio);
        System.out.println("Сумарна вартість портфеля: " + portfolio.getTotalValue());
        System.out.println("Очікуваний річний прибуток: " + portfolio.getTotalAnnualReturn());
        System.out.println("----------------------37 завдання-------------------------");
        RaidParty party = new RaidParty("Dragons", 5);
        party.addMember(new TankWarrior("Грім", 3000, 200));
        party.addMember(new ArcaneMage("Мерлін", 1200, 300, 150));
        System.out.println(party);
        System.out.println("Готовність до рейду (складність 2500): " + party.isReadyForRaid(2500));
        System.out.println("Готовність до рейду (складність 3000): " + party.isReadyForRaid(3000));
        RaidParty weakParty = new RaidParty("Mages", 5);
        weakParty.addMember(new ArcaneMage("Гендальф", 1500, 400, 200));
        System.out.println("Готовність загону без танка (складність 100): " + weakParty.isReadyForRaid(100));
        System.out.println("----------------------38 завдання-------------------------");
        SmartLab lab = new SmartLab(3);
        lab.addSensor(new PressureSensor("Камера 1", 1.0, 5.0, 3.0, 1.0));
        lab.addSensor(new RadiationSensor("Склад", 0.0, 0.3, 0.55));
        lab.runDiagnostics();
        System.out.println("----------------------39 завдання-------------------------");
        SignalProcessor processor = new SignalProcessor(3);
        processor.addFilter(new AmplifierFilter("Підсилювач", 2.0));
        processor.addFilter(new ClippingFilter("Обмежувач", 5.0));
        double[] signal = {0.5, -2.0, 3.0, 10.0};
        double[] processed = processor.process(signal);
        System.out.println("Вхідний сигнал: " + Arrays.toString(signal));
        System.out.println("Оброблений сигнал: " + Arrays.toString(processed));
    }

    static class LabMeasurement {
        private final String experimentName;
        private final double[] samples;

        public LabMeasurement(String experimentName, double[] samples) {
            this.experimentName = experimentName;
            this.samples = (samples != null) ? Arrays.copyOf(samples, samples.length) : new double[0];
        }

        public String getExperimentName() {
            return experimentName;
        }

        public double[] getSamples() {
            return Arrays.copyOf(samples, samples.length);
        }
    }

    static class ClosedInterval {
        private double start;
        private double end;

        public ClosedInterval(double start, double end) {
            resize(start, end);
        }

        public void resize(double newStart, double newEnd) {
            if (newStart > newEnd) {
                this.start = newEnd;
                this.end = newStart;
            } else {
                this.start = newStart;
                this.end = newEnd;
            }
        }

        public double getStart() {
            return start;
        }

        public double getEnd() {
            return end;
        }

        public double getLength() {
            return end - start;
        }

        public double getMidpoint() {
            return start + (end - start) / 2.0;
        }

        public boolean overlaps(ClosedInterval other) {
            if (other == null) return false;
            return Math.max(this.start, other.start) <= Math.min(this.end, other.end);
        }

        @Override
        public String toString() {
            return String.format("[%.2f; %.2f] (центр: %.2f, довжина: %.2f)", start, end, getMidpoint(), getLength());
        }
    }

    static class RgbColor {
        private final int red;
        private final int green;
        private final int blue;

        public RgbColor(int red, int green, int blue) {
            this.red = clamp(red);
            this.green = clamp(green);
            this.blue = clamp(blue);
        }

        private static int clamp(int val) {
            if (val < 0) return 0;
            if (val > 255) return 255;
            return val;
        }

        public int getRed() {
            return red;
        }

        public int getGreen() {
            return green;
        }

        public int getBlue() {
            return blue;
        }

        public String toHex() {
            return String.format("#%02X%02X%02X", red, green, blue);
        }

        public RgbColor invert() {
            return new RgbColor(255 - red, 255 - green, 255 - blue);
        }

        public RgbColor mixWith(RgbColor other) {
            if (other == null) return this;
            int mixedRed = (this.red + other.red) / 2;
            int mixedGreen = (this.green + other.green) / 2;
            int mixedBlue = (this.blue + other.blue) / 2;
            return new RgbColor(mixedRed, mixedGreen, mixedBlue);
        }

        @Override
        public String toString() {
            return String.format("RGB(%d, %d, %d) -> HEX: %s", red, green, blue, toHex());
        }
    }

    static class HighSecuritySafe {
        private final int pinCode;
        private double storedCash;
        private int failedAttempts;
        private boolean permanentlyBlocked;

        public HighSecuritySafe(int pinCode, double initialCash) {
            this.pinCode = pinCode;
            this.storedCash = initialCash;
            this.failedAttempts = 0;
            this.permanentlyBlocked = false;
        }

        private boolean checkAccess(int enteredPin) {
            if (permanentlyBlocked) {
                return false;
            }
            if (enteredPin != pinCode) {
                failedAttempts++;
                if (failedAttempts >= 3) {
                    permanentlyBlocked = true;
                }
                return false;
            }
            failedAttempts = 0;
            return true;
        }

        public boolean putCash(int pin, double amount) {
            if (!checkAccess(pin) || amount <= 0) {
                return false;
            }
            storedCash += amount;
            return true;
        }

        public boolean takeCash(int pin, double amount) {
            if (!checkAccess(pin) || amount <= 0 || storedCash < amount) {
                return false;
            }
            storedCash -= amount;
            return true;
        }

        public boolean isPermanentlyBlocked() {
            return permanentlyBlocked;
        }
    }

    static class EncapsulatedPolynomial {
        private final double[] coeffs;

        public EncapsulatedPolynomial(double[] coeffs) {
            this.coeffs = (coeffs != null) ? Arrays.copyOf(coeffs, coeffs.length) : new double[]{0.0};
        }

        public int getDegree() {
            for (int i = coeffs.length - 1; i >= 0; i--) {
                if (coeffs[i] != 0.0) {
                    return i;
                }
            }
            return 0;
        }

        public double getCoefficient(int power) {
            if (power < 0 || power >= coeffs.length) {
                throw new IndexOutOfBoundsException("Некоректний степінь: " + power);
            }
            return coeffs[power];
        }

        public double evaluate(double x) {
            double result = 0.0;
            for (int i = coeffs.length - 1; i >= 0; i--) {
                result = result * x + coeffs[i];
            }
            return result;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (int i = 0; i < coeffs.length; i++) {
                if (coeffs[i] == 0.0 && coeffs.length > 1) continue;

                if (!first) {
                    sb.append(coeffs[i] >= 0 ? " + " : " - ");
                    sb.append(String.format("%.2f", Math.abs(coeffs[i])));
                } else {
                    sb.append(String.format("%.2f", coeffs[i]));
                    first = false;
                }

                if (i == 1) {
                    sb.append("x");
                } else if (i > 1) {
                    sb.append("x^").append(i);
                }
            }
            return sb.length() > 0 ? sb.toString() : "0.00";
        }
    }

    static class MedicalRecord {
        private final String patientId;
        private String fullName;
        private int bloodGroup;
        private boolean rhPositive;
        private String[] allergies;

        public MedicalRecord(String patientId, String fullName, int bloodGroup, boolean rhPositive, String[] allergies) {
            this.patientId = patientId;
            this.fullName = fullName;
            setBloodGroup(bloodGroup);
            this.rhPositive = rhPositive;
            this.allergies = (allergies != null) ? Arrays.copyOf(allergies, allergies.length) : new String[0];
        }

        public void setBloodGroup(int bloodGroup) {
            if (bloodGroup < 1 || bloodGroup > 4) {
                throw new IllegalArgumentException("Група крові має бути в діапазоні від 1 до 4.");
            }
            this.bloodGroup = bloodGroup;
        }

        public String[] getAllergies() {
            return Arrays.copyOf(allergies, allergies.length);
        }

        public void setAllergies(String[] allergies) {
            this.allergies = (allergies != null) ? Arrays.copyOf(allergies, allergies.length) : new String[0];
        }

        public boolean hasAllergyTo(String substance) {
            if (substance == null) return false;
            for (String allergy : allergies) {
                if (allergy != null && allergy.equalsIgnoreCase(substance)) {
                    return true;
                }
            }
            return false;
        }

        private String getBloodGroupRoman() {
            switch (bloodGroup) {
                case 1: return "I (O)";
                case 2: return "II (A)";
                case 3: return "III (B)";
                case 4: return "IV (AB)";
                default: return "Unknown";
            }
        }

        @Override
        public String toString() {
            String rhStr = rhPositive ? "Rh+" : "Rh-";
            return String.format("MedicalRecord{ID='%s', name='%s', bloodGroup='%s %s', allergies=%s}",
                    patientId, fullName, getBloodGroupRoman(), rhStr, Arrays.toString(allergies));
        }
    }

    static class CryptoVault {
        private final String walletAddress;
        private String secretRecoveryPhrase;
        private double btcBalance;
        private boolean locked;

        public CryptoVault(String walletAddress, String secretRecoveryPhrase, double initialBalance) {
            this.walletAddress = walletAddress;
            this.secretRecoveryPhrase = secretRecoveryPhrase;
            this.btcBalance = initialBalance;
            this.locked = true;
        }

        public String getWalletAddress() {
            return walletAddress;
        }

        public double getBtcBalance() {
            return btcBalance;
        }

        public boolean isLocked() {
            return locked;
        }

        public boolean unlock(String phrase) {
            if (this.secretRecoveryPhrase.equals(phrase)) {
                this.locked = false;
                return true;
            }
            return false;
        }

        public void lock() {
            this.locked = true;
        }

        public boolean sendBtc(double amount, String destination) {
            if (!locked && amount > 0 && btcBalance >= amount) {
                btcBalance -= amount;
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return String.format("CryptoVault [address=%s, locked=%b, btcBalance=%.4f]", walletAddress, locked, btcBalance);
        }
    }


    static class ImmutableGeoPoint {
        private final double latitude;
        private final double longitude;

        public ImmutableGeoPoint(double latitude, double longitude) {
            this.latitude = Math.max(-90.0, Math.min(90.0, latitude));
            this.longitude = Math.max(-180.0, Math.min(180.0, longitude));
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public ImmutableGeoPoint shift(double dLat, double dLon) {
            return new ImmutableGeoPoint(this.latitude + dLat, this.longitude + dLon);
        }

        @Override
        public String toString() {
            return "ImmutableGeoPoint{latitude=" + latitude + ", longitude=" + longitude + "}";
        }
    }

    static class Point2D {
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

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double distanceTo(Point2D other) {
            double dx = this.x - other.x;
            double dy = this.y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public String toString() {
            return String.format("(%.2f; %.2f)", x, y);
        }
    }

    static class CompositeCircle {
        private double radius;
        private final Point2D center;

        public CompositeCircle(double centerX, double centerY, double radius) {
            this.center = new Point2D(centerX, centerY);
            this.radius = Math.max(0.0, radius);
        }

        public boolean containsPoint(Point2D p) {
            if (p == null) return false;
            return center.distanceTo(p) <= radius;
        }

        @Override
        public String toString() {
            return "CompositeCircle{center=" + center + ", radius=" + radius + "}";
        }
    }

    static class Engine {
        private final String fuelType;
        private final int volumeCc;
        private int rpm;
        private boolean started;

        public Engine(String fuelType, int volumeCc) {
            this.fuelType = fuelType;
            this.volumeCc = volumeCc;
            this.rpm = 0;
            this.started = false;
        }

        public void start() {
            this.started = true;
        }

        public void stop() {
            this.started = false;
            this.rpm = 0;
        }

        public void setRpm(int rpm) {
            if (started && rpm >= 0) {
                this.rpm = rpm;
            }
        }

        public boolean isStarted() {
            return started;
        }

        public int getRpm() {
            return rpm;
        }

        @Override
        public String toString() {
            return "Engine{fuelType='" + fuelType + "', volumeCc=" + volumeCc + ", rpm=" + rpm + ", started=" + started + "}";
        }
    }

    static class Automobile {
        private final String model;
        private double speed;
        private final Engine engine;

        public Automobile(String model, Engine engine) {
            this.model = model;
            this.speed = 0.0;
            this.engine = engine;
        }

        public void accelerate(double deltaSpeed) {
            if (!engine.isStarted() || deltaSpeed <= 0) {
                return;
            }
            speed += deltaSpeed;
            engine.setRpm(1000 + (int) (speed * 30));
        }

        public double getSpeed() {
            return speed;
        }

        @Override
        public String toString() {
            return "Automobile{model='" + model + "', speed=" + speed + ", engine=" + engine + "}";
        }
    }

    static class Battery {
        private int capacityMah;
        private int chargePercent;

        public Battery(int capacityMah, int chargePercent) {
            this.capacityMah = capacityMah;
            this.chargePercent = Math.max(0, Math.min(100, chargePercent));
        }

        public void drain(int percent) {
            if (percent <= 0) return;
            chargePercent = Math.max(0, chargePercent - percent);
        }

        public void charge(int percent) {
            if (percent <= 0) return;
            chargePercent = Math.min(100, chargePercent + percent);
        }

        public int getCapacityMah() {
            return capacityMah;
        }

        public int getChargePercent() {
            return chargePercent;
        }

        @Override
        public String toString() {
            return "Battery{capacityMah=" + capacityMah + ", chargePercent=" + chargePercent + "%}";
        }
    }

    static class Display {
        private double diagonalInches;
        private int brightnessPercent;

        public Display(double diagonalInches, int brightnessPercent) {
            this.diagonalInches = diagonalInches;
            this.brightnessPercent = Math.max(10, Math.min(100, brightnessPercent));
        }

        public void setBrightnessPercent(int brightnessPercent) {
            this.brightnessPercent = Math.max(10, Math.min(100, brightnessPercent));
        }

        public double getDiagonalInches() {
            return diagonalInches;
        }

        public int getBrightnessPercent() {
            return brightnessPercent;
        }

        @Override
        public String toString() {
            return "Display{diagonalInches=" + diagonalInches + ", brightnessPercent=" + brightnessPercent + "%}";
        }
    }

    static class SmartDevice {
        private final Battery battery;
        private final Display display;
        private boolean poweredOn;

        public SmartDevice(int capacityMah, int chargePercent, double diagonalInches, int brightnessPercent) {
            this.battery = new Battery(capacityMah, chargePercent);
            this.display = new Display(diagonalInches, brightnessPercent);
            this.poweredOn = battery.getChargePercent() > 0;
        }

        public void watchVideo(int minutes) {
            if (!poweredOn || minutes <= 0) return;
            int drainPerTenMinutes = display.getBrightnessPercent() > 70 ? 2 : 1;
            battery.drain((minutes / 10) * drainPerTenMinutes);
            if (battery.getChargePercent() == 0) {
                poweredOn = false;
            }
        }

        public boolean isPoweredOn() {
            return poweredOn;
        }

        @Override
        public String toString() {
            return "SmartDevice{" + battery + ", " + display + ", poweredOn=" + poweredOn + "}";
        }
    }

    static class LineSegment {
        private final Point2D start;
        private final Point2D end;

        public LineSegment(Point2D start, Point2D end) {
            this.start = new Point2D(start.getX(), start.getY());
            this.end = new Point2D(end.getX(), end.getY());
        }

        public double getLength() {
            return start.distanceTo(end);
        }

        public Point2D getMidpoint() {
            return new Point2D((start.getX() + end.getX()) / 2.0, (start.getY() + end.getY()) / 2.0);
        }

        @Override
        public String toString() {
            return "LineSegment{start=" + start + ", end=" + end + "}";
        }
    }

    static class BankAccount {
        private final String iban;
        private double balance;

        public BankAccount(String iban, double balance) {
            this.iban = iban;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount <= 0 || balance < amount) {
                return false;
            }
            balance -= amount;
            return true;
        }

        public String getIban() {
            return iban;
        }

        public double getBalance() {
            return balance;
        }

        @Override
        public String toString() {
            return String.format("BankAccount{iban='%s', balance=%.2f}", iban, balance);
        }
    }

    static class PlasticCard {
        private final String cardNumber;
        private final String expiryDate;
        private boolean blocked;
        private final BankAccount linkedAccount;

        public PlasticCard(String cardNumber, String expiryDate, BankAccount linkedAccount) {
            this.cardNumber = cardNumber;
            this.expiryDate = expiryDate;
            this.blocked = false;
            this.linkedAccount = linkedAccount;
        }

        public void block() {
            this.blocked = true;
        }

        public void unblock() {
            this.blocked = false;
        }

        public boolean isBlocked() {
            return blocked;
        }

        public boolean payAtTerminal(double amount) {
            if (blocked) {
                return false;
            }
            return linkedAccount.withdraw(amount);
        }

        @Override
        public String toString() {
            return "PlasticCard{cardNumber='" + cardNumber + "', expiryDate='" + expiryDate + "', blocked=" + blocked
                    + ", account=" + linkedAccount.getIban() + "}";
        }
    }

    static class WeaponItem {
        private final String name;
        private final int bonusDamage;
        private int durability;

        public WeaponItem(String name, int bonusDamage, int durability) {
            this.name = name;
            this.bonusDamage = bonusDamage;
            this.durability = Math.max(0, Math.min(100, durability));
        }

        public void useWeapon() {
            durability = Math.max(0, durability - 10);
        }

        public int getBonusDamage() {
            return durability == 0 ? 0 : bonusDamage;
        }

        public int getDurability() {
            return durability;
        }

        @Override
        public String toString() {
            return "WeaponItem{name='" + name + "', bonusDamage=" + bonusDamage + ", durability=" + durability + "}";
        }
    }

    static class HeroCharacter {
        private final String nickname;
        private int baseStrength;
        private WeaponItem equippedWeapon;

        public HeroCharacter(String nickname, int baseStrength) {
            this.nickname = nickname;
            this.baseStrength = baseStrength;
            this.equippedWeapon = null;
        }

        public void equip(WeaponItem newWeapon) {
            this.equippedWeapon = newWeapon;
        }

        public void unequip() {
            this.equippedWeapon = null;
        }

        public int attack() {
            int damage = baseStrength;
            if (equippedWeapon != null) {
                damage += equippedWeapon.getBonusDamage();
                equippedWeapon.useWeapon();
            }
            return damage;
        }

        @Override
        public String toString() {
            return "HeroCharacter{nickname='" + nickname + "', baseStrength=" + baseStrength
                    + ", equippedWeapon=" + (equippedWeapon != null ? equippedWeapon : "немає") + "}";
        }
    }

    static class DeliveryAddress {
        private String city;
        private String street;
        private int postOfficeNumber;

        public DeliveryAddress(String city, String street, int postOfficeNumber) {
            this.city = city;
            this.street = street;
            this.postOfficeNumber = postOfficeNumber;
        }

        public boolean isValid() {
            return city != null && !city.trim().isEmpty()
                    && street != null && !street.trim().isEmpty()
                    && postOfficeNumber > 0;
        }

        @Override
        public String toString() {
            return city + ", " + street + ", відділення №" + postOfficeNumber;
        }
    }

    static class ParcelOrder {
        private final String orderId;
        private double weightKg;
        private DeliveryAddress destination;
        private boolean shipped;

        public ParcelOrder(String orderId, double weightKg, DeliveryAddress destination) {
            this.orderId = orderId;
            this.weightKg = weightKg;
            this.destination = destination;
            this.shipped = false;
        }

        public boolean changeDestination(DeliveryAddress newAddress) {
            if (shipped || newAddress == null || !newAddress.isValid()) {
                return false;
            }
            this.destination = newAddress;
            return true;
        }

        public void markAsShipped() {
            this.shipped = true;
        }

        public boolean isShipped() {
            return shipped;
        }

        @Override
        public String toString() {
            return "ParcelOrder{orderId='" + orderId + "', weightKg=" + weightKg + ", destination=" + destination
                    + ", shipped=" + shipped + "}";
        }
    }

    static class TemperatureSensor {
        private double currentTemp;

        public TemperatureSensor(double currentTemp) {
            this.currentTemp = currentTemp;
        }

        public double getCurrentTemp() {
            return currentTemp;
        }

        public void setCurrentTemp(double currentTemp) {
            this.currentTemp = currentTemp;
        }

        @Override
        public String toString() {
            return String.format("TemperatureSensor{currentTemp=%.1f}", currentTemp);
        }
    }

    static class HeatingUnit {
        private boolean heatingOn;
        private double powerKw;

        public HeatingUnit(double powerKw) {
            this.powerKw = powerKw;
            this.heatingOn = false;
        }

        public void turnOn() {
            this.heatingOn = true;
        }

        public void turnOff() {
            this.heatingOn = false;
        }

        public boolean isHeatingOn() {
            return heatingOn;
        }

        @Override
        public String toString() {
            return "HeatingUnit{heatingOn=" + heatingOn + ", powerKw=" + powerKw + "}";
        }
    }

    static class ClimateController {
        private final TemperatureSensor sensor;
        private final HeatingUnit heatingUnit;
        private double targetTemp;

        public ClimateController(TemperatureSensor sensor, HeatingUnit heatingUnit, double targetTemp) {
            this.sensor = sensor;
            this.heatingUnit = heatingUnit;
            this.targetTemp = targetTemp;
        }

        public void regulate() {
            double currentTemp = sensor.getCurrentTemp();
            if (currentTemp < targetTemp - 0.5) {
                heatingUnit.turnOn();
            } else if (currentTemp >= targetTemp) {
                heatingUnit.turnOff();
            }
        }

        @Override
        public String toString() {
            return "ClimateController{targetTemp=" + targetTemp + ", " + sensor + ", " + heatingUnit + "}";
        }
    }

    static class Polyline {
        private final Point2D[] vertices;
        private int count;

        public Polyline(int capacity) {
            this.vertices = new Point2D[Math.max(capacity, 0)];
            this.count = 0;
        }

        public void addVertex(double x, double y) {
            if (count < vertices.length) {
                vertices[count] = new Point2D(x, y);
                count++;
            }
        }

        public double getTotalLength() {
            double total = 0.0;
            for (int i = 0; i < count - 1; i++) {
                total += vertices[i].distanceTo(vertices[i + 1]);
            }
            return total;
        }

        public double getClosedPerimeter() {
            if (count < 2) {
                return 0.0;
            }
            return getTotalLength() + vertices[count - 1].distanceTo(vertices[0]);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Polyline{vertices=[");
            for (int i = 0; i < count; i++) {
                if (i > 0) sb.append(", ");
                sb.append(vertices[i]);
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    static class OrderItem {
        private final String productName;
        private final double unitPrice;
        private int quantity;

        public OrderItem(String productName, double unitPrice, int quantity) {
            this.productName = productName;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        public void addQuantity(int extra) {
            if (extra > 0) {
                quantity += extra;
            }
        }

        public String getProductName() {
            return productName;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getItemTotal() {
            return unitPrice * quantity;
        }
    }

    static class ShoppingOrder {
        private final OrderItem[] items = new OrderItem[10];
        private int itemCount;

        public void addItem(String name, double price, int qty) {
            if (name == null || qty <= 0) {
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                if (items[i].getProductName().equals(name)) {
                    items[i].addQuantity(qty);
                    return;
                }
            }
            if (itemCount < items.length) {
                items[itemCount] = new OrderItem(name, price, qty);
                itemCount++;
            }
        }

        public double calculateGrandTotal() {
            double total = 0.0;
            for (int i = 0; i < itemCount; i++) {
                total += items[i].getItemTotal();
            }
            return total;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("=============== ЧЕК ===============\n");
            for (int i = 0; i < itemCount; i++) {
                sb.append(String.format("%-10s %8.2f x %2d = %9.2f\n",
                        items[i].getProductName(), items[i].getUnitPrice(), items[i].getQuantity(), items[i].getItemTotal()));
            }
            sb.append("-----------------------------------\n");
            sb.append(String.format("РАЗОМ: %.2f грн", calculateGrandTotal()));
            return sb.toString();
        }
    }

    static class BookItem {
        private final String title;
        private final String author;
        private final int pages;

        public BookItem(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPages() {
            return pages;
        }

        @Override
        public String toString() {
            return "BookItem{title='" + title + "', author='" + author + "', pages=" + pages + "}";
        }
    }

    static class Bookshelf {
        private final String genre;
        private final BookItem[] books;
        private int bookCount;

        public Bookshelf(String genre, int capacity) {
            this.genre = genre;
            this.books = new BookItem[Math.max(capacity, 0)];
            this.bookCount = 0;
        }

        public boolean putBook(BookItem book) {
            if (book == null || bookCount >= books.length) {
                return false;
            }
            books[bookCount] = book;
            bookCount++;
            return true;
        }

        public BookItem findLongestBook() {
            if (bookCount == 0) {
                return null;
            }
            BookItem longest = books[0];
            for (int i = 1; i < bookCount; i++) {
                if (books[i].getPages() > longest.getPages()) {
                    longest = books[i];
                }
            }
            return longest;
        }

        public int getTotalPagesOnShelf() {
            int total = 0;
            for (int i = 0; i < bookCount; i++) {
                total += books[i].getPages();
            }
            return total;
        }
    }

    static class AudioTrack {
        private final String title;
        private final String artist;
        private final int durationSeconds;

        public AudioTrack(String title, String artist, int durationSeconds) {
            this.title = title;
            this.artist = artist;
            this.durationSeconds = Math.max(0, durationSeconds);
        }

        public int getDurationSeconds() {
            return durationSeconds;
        }

        public String getFormattedDuration() {
            return String.format("%02d:%02d", durationSeconds / 60, durationSeconds % 60);
        }

        @Override
        public String toString() {
            return artist + " - " + title + " [" + getFormattedDuration() + "]";
        }
    }

    static class Playlist {
        private String name;
        private final AudioTrack[] tracks;
        private int trackCount;

        public Playlist(String name, int capacity) {
            this.name = name;
            this.tracks = new AudioTrack[Math.max(capacity, 0)];
            this.trackCount = 0;
        }

        public boolean addTrack(AudioTrack track) {
            if (track == null || trackCount >= tracks.length) {
                return false;
            }
            tracks[trackCount] = track;
            trackCount++;
            return true;
        }

        public int getTotalDurationSeconds() {
            int total = 0;
            for (int i = 0; i < trackCount; i++) {
                total += tracks[i].getDurationSeconds();
            }
            return total;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Плейлист \"" + name + "\":\n");
            for (int i = 0; i < trackCount; i++) {
                sb.append(i + 1).append(". ").append(tracks[i]).append("\n");
            }
            int total = getTotalDurationSeconds();
            sb.append("Загальна тривалість: ").append(total / 60).append(" хв ").append(total % 60).append(" сек");
            return sb.toString();
        }
    }

    static class ServerNode {
        private final String ipAddress;
        private final int totalRamGb;
        private int usedRamGb;
        private boolean online;

        public ServerNode(String ipAddress, int totalRamGb) {
            this.ipAddress = ipAddress;
            this.totalRamGb = totalRamGb;
            this.usedRamGb = 0;
            this.online = true;
        }

        public int getFreeRamGb() {
            return totalRamGb - usedRamGb;
        }

        public boolean isOnline() {
            return online;
        }

        public void setOnline(boolean online) {
            this.online = online;
        }

        public boolean allocateRam(int ramGb) {
            if (ramGb <= 0 || ramGb > getFreeRamGb()) {
                return false;
            }
            usedRamGb += ramGb;
            return true;
        }

        @Override
        public String toString() {
            return "ServerNode{ip='" + ipAddress + "', totalRamGb=" + totalRamGb + ", usedRamGb=" + usedRamGb
                    + ", online=" + online + "}";
        }
    }

    static class DataCenterCluster {
        private final String clusterLocation;
        private final ServerNode[] nodes;
        private int nodeCount;

        public DataCenterCluster(String clusterLocation, int capacity) {
            this.clusterLocation = clusterLocation;
            this.nodes = new ServerNode[Math.max(capacity, 0)];
            this.nodeCount = 0;
        }

        public boolean addNode(ServerNode node) {
            if (node == null || nodeCount >= nodes.length) {
                return false;
            }
            nodes[nodeCount] = node;
            nodeCount++;
            return true;
        }

        public boolean deployContainer(int requiredRamGb) {
            if (requiredRamGb <= 0) {
                return false;
            }
            for (int i = 0; i < nodeCount; i++) {
                if (nodes[i].isOnline() && nodes[i].getFreeRamGb() >= requiredRamGb) {
                    return nodes[i].allocateRam(requiredRamGb);
                }
            }
            return false;
        }
    }

    static class CourseModule {
        private final String topic;
        private final int lectureHours;
        private final int practiceHours;
        private double maxScore;

        public CourseModule(String topic, int lectureHours, int practiceHours, double maxScore) {
            this.topic = topic;
            this.lectureHours = lectureHours;
            this.practiceHours = practiceHours;
            this.maxScore = maxScore;
        }

        public int getTotalHours() {
            return lectureHours + practiceHours;
        }

        public double getMaxScore() {
            return maxScore;
        }
    }

    static class UniversityCourse {
        private final String courseTitle;
        private final CourseModule[] modules;
        private int moduleCount;

        public UniversityCourse(String courseTitle, int capacity) {
            this.courseTitle = courseTitle;
            this.modules = new CourseModule[Math.max(capacity, 0)];
            this.moduleCount = 0;
        }

        public boolean addModule(CourseModule module) {
            if (module == null || moduleCount >= modules.length) {
                return false;
            }
            modules[moduleCount] = module;
            moduleCount++;
            return true;
        }

        public double getTotalEctsCredits() {
            int totalHours = 0;
            for (int i = 0; i < moduleCount; i++) {
                totalHours += modules[i].getTotalHours();
            }
            return totalHours / 30.0;
        }

        public boolean isMaxScoreSumExactly100() {
            double sum = 0.0;
            for (int i = 0; i < moduleCount; i++) {
                sum += modules[i].getMaxScore();
            }
            return Math.abs(sum - 100.0) < 1e-9;
        }
    }

    static class TrainCarriage {
        private final int carriageNumber;
        private final String type;
        private final int totalSeats;
        private int occupiedSeats;

        public TrainCarriage(int carriageNumber, String type, int totalSeats) {
            this.carriageNumber = carriageNumber;
            this.type = type;
            this.totalSeats = totalSeats;
            this.occupiedSeats = 0;
        }

        public int getCarriageNumber() {
            return carriageNumber;
        }

        public int getFreeSeats() {
            return totalSeats - occupiedSeats;
        }

        public boolean bookSeats(int seats) {
            if (seats <= 0 || seats > getFreeSeats()) {
                return false;
            }
            occupiedSeats += seats;
            return true;
        }
    }

    static class PassengerTrain {
        private final String route;
        private final TrainCarriage[] carriages;
        private int carriageCount;

        public PassengerTrain(String route, int capacity) {
            this.route = route;
            this.carriages = new TrainCarriage[Math.max(capacity, 0)];
            this.carriageCount = 0;
        }

        public boolean attachCarriage(TrainCarriage c) {
            if (c == null || carriageCount >= carriages.length) {
                return false;
            }
            carriages[carriageCount] = c;
            carriageCount++;
            return true;
        }

        public int getTotalFreeSeats() {
            int total = 0;
            for (int i = 0; i < carriageCount; i++) {
                total += carriages[i].getFreeSeats();
            }
            return total;
        }

        public boolean bookTicketsInCarriage(int carriageNumber, int seatsToBook) {
            for (int i = 0; i < carriageCount; i++) {
                if (carriages[i].getCarriageNumber() == carriageNumber) {
                    return carriages[i].bookSeats(seatsToBook);
                }
            }
            return false;
        }
    }

    static class LinearEquation {
        private final double a;
        private final double b;
        private final double c;

        public LinearEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean isSatisfiedBy(double x, double y) {
            return Math.abs(a * x + b * y - c) < 1e-6;
        }
    }

    static class EquationSystem {
        private final LinearEquation[] equations;
        private int count;

        public EquationSystem(int capacity) {
            this.equations = new LinearEquation[Math.max(capacity, 0)];
            this.count = 0;
        }

        public boolean addEquation(LinearEquation equation) {
            if (equation == null || count >= equations.length) {
                return false;
            }
            equations[count] = equation;
            count++;
            return true;
        }

        public boolean checkSolution(double x, double y) {
            if (count == 0) {
                return false;
            }
            for (int i = 0; i < count; i++) {
                if (!equations[i].isSatisfiedBy(x, y)) {
                    return false;
                }
            }
            return true;
        }
    }

    static abstract class AbstractShape {
        private String color;

        public AbstractShape(String color) {
            this.color = color;
        }

        public abstract double getArea();

        public abstract double getPerimeter();

        @Override
        public String toString() {
            return String.format("%s{color='%s', area=%.2f, perimeter=%.2f}",
                    getClass().getSimpleName(), color, getArea(), getPerimeter());
        }
    }

    static class CircleShape extends AbstractShape {
        private final double radius;

        public CircleShape(String color, double radius) {
            super(color);
            this.radius = Math.max(0.0, radius);
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class RectangleShape extends AbstractShape {
        private final double width;
        private final double height;

        public RectangleShape(String color, double width, double height) {
            super(color);
            this.width = Math.max(0.0, width);
            this.height = Math.max(0.0, height);
        }

        @Override
        public double getArea() {
            return width * height;
        }

        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }
    }

    static abstract class AbstractPowerPlant {
        private final String stationName;
        protected double baseCapacityMw;

        public AbstractPowerPlant(String stationName, double baseCapacityMw) {
            this.stationName = stationName;
            this.baseCapacityMw = baseCapacityMw;
        }

        public abstract double generateMegawatts();

        public double calculateDailyProfit(double tariffPerMwh) {
            return generateMegawatts() * 24 * tariffPerMwh;
        }

        @Override
        public String toString() {
            return String.format("%s{station='%s', generation=%.2f MW}",
                    getClass().getSimpleName(), stationName, generateMegawatts());
        }
    }

    static class SolarPowerPlant extends AbstractPowerPlant {
        private double sunIntensityFactor;

        public SolarPowerPlant(String stationName, double baseCapacityMw, double sunIntensityFactor) {
            super(stationName, baseCapacityMw);
            this.sunIntensityFactor = Math.max(0.0, Math.min(1.0, sunIntensityFactor));
        }

        @Override
        public double generateMegawatts() {
            return baseCapacityMw * sunIntensityFactor;
        }
    }

    static class WindPowerPlant extends AbstractPowerPlant {
        private double windSpeedMs;

        public WindPowerPlant(String stationName, double baseCapacityMw, double windSpeedMs) {
            super(stationName, baseCapacityMw);
            this.windSpeedMs = windSpeedMs;
        }

        @Override
        public double generateMegawatts() {
            if (windSpeedMs < 3.0 || windSpeedMs > 25.0) {
                return 0.0;
            }
            return baseCapacityMw;
        }
    }

    static abstract class AbstractEmployee {
        private final int id;
        private final String name;
        protected double taxRate;

        public AbstractEmployee(int id, String name) {
            this.id = id;
            this.name = name;
            this.taxRate = 0.195;
        }

        public abstract double calculateGrossSalary();

        public final double calculateNetSalary() {
            return calculateGrossSalary() * (1.0 - taxRate);
        }

        @Override
        public String toString() {
            return String.format("%s{id=%d, name='%s', gross=%.2f, net=%.2f}",
                    getClass().getSimpleName(), id, name, calculateGrossSalary(), calculateNetSalary());
        }
    }

    static class SalariedEmployee extends AbstractEmployee {
        private double monthlySalary;
        private double bonus;

        public SalariedEmployee(int id, String name, double monthlySalary, double bonus) {
            super(id, name);
            this.monthlySalary = monthlySalary;
            this.bonus = bonus;
        }

        @Override
        public double calculateGrossSalary() {
            return monthlySalary + bonus;
        }
    }

    static class HourlyContractor extends AbstractEmployee {
        private int hoursWorked;
        private double hourlyRate;

        public HourlyContractor(int id, String name, int hoursWorked, double hourlyRate) {
            super(id, name);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateGrossSalary() {
            if (hoursWorked <= 160) {
                return hoursWorked * hourlyRate;
            }
            return 160 * hourlyRate + (hoursWorked - 160) * hourlyRate * 1.5;
        }
    }

    static abstract class AbstractSequence {
        private final String title;

        public AbstractSequence(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public abstract double getTerm(int index);

        public double sumFirstN(int n) {
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                sum += getTerm(i);
            }
            return sum;
        }
    }

    static class HarmonicSequence extends AbstractSequence {
        public HarmonicSequence() {
            super("Гармонічна послідовність");
        }

        @Override
        public double getTerm(int index) {
            return 1.0 / index;
        }
    }

    static class SquareNumbersSequence extends AbstractSequence {
        public SquareNumbersSequence() {
            super("Послідовність квадратів");
        }

        @Override
        public double getTerm(int index) {
            return (double) index * index;
        }
    }

    static abstract class AbstractTransaction {
        private final String txId;
        protected final double amount;

        public AbstractTransaction(String txId, double amount) {
            this.txId = txId;
            this.amount = amount;
        }

        public abstract double calculateCommission();

        public final double getTotalDebit() {
            return amount + calculateCommission();
        }

        @Override
        public String toString() {
            return String.format("%s{txId='%s', amount=%.2f, commission=%.2f, totalDebit=%.2f}",
                    getClass().getSimpleName(), txId, amount, calculateCommission(), getTotalDebit());
        }
    }

    static class DomesticTransfer extends AbstractTransaction {
        public DomesticTransfer(String txId, double amount) {
            super(txId, amount);
        }

        @Override
        public double calculateCommission() {
            return Math.max(amount * 0.005, 5.0);
        }
    }

    static class CryptoTransfer extends AbstractTransaction {
        private final double networkGasFee;

        public CryptoTransfer(String txId, double amount, double networkGasFee) {
            super(txId, amount);
            this.networkGasFee = networkGasFee;
        }

        @Override
        public double calculateCommission() {
            return networkGasFee;
        }
    }

    static abstract class Solid3D {
        private final String materialName;
        private final double densityKgPerM3;

        public Solid3D(String materialName, double densityKgPerM3) {
            this.materialName = materialName;
            this.densityKgPerM3 = densityKgPerM3;
        }

        public abstract double getVolume();

        public abstract double getSurfaceArea();

        public final double getMassKg() {
            return densityKgPerM3 * getVolume();
        }

        @Override
        public String toString() {
            return String.format("%s{material='%s', volume=%.4f м³, surfaceArea=%.4f м², mass=%.2f кг}",
                    getClass().getSimpleName(), materialName, getVolume(), getSurfaceArea(), getMassKg());
        }
    }

    static class Sphere3D extends Solid3D {
        private final double radius;

        public Sphere3D(String materialName, double densityKgPerM3, double radius) {
            super(materialName, densityKgPerM3);
            this.radius = radius;
        }

        @Override
        public double getVolume() {
            return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
        }

        @Override
        public double getSurfaceArea() {
            return 4.0 * Math.PI * radius * radius;
        }
    }

    static class Cylinder3D extends Solid3D {
        private final double radius;
        private final double height;

        public Cylinder3D(String materialName, double densityKgPerM3, double radius, double height) {
            super(materialName, densityKgPerM3);
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double getVolume() {
            return Math.PI * radius * radius * height;
        }

        @Override
        public double getSurfaceArea() {
            return 2.0 * Math.PI * radius * (radius + height);
        }
    }

    static abstract class AbstractSensor {
        private final String location;
        private final double minSafe;
        private final double maxSafe;

        public AbstractSensor(String location, double minSafe, double maxSafe) {
            this.location = location;
            this.minSafe = minSafe;
            this.maxSafe = maxSafe;
        }

        public abstract double readValue();

        public abstract String getUnit();

        public final boolean isAlarmTriggered() {
            double value = readValue();
            return value < minSafe || value > maxSafe;
        }

        @Override
        public String toString() {
            return String.format("%s{location='%s', value=%.2f %s, safeRange=[%.2f; %.2f]}",
                    getClass().getSimpleName(), location, readValue(), getUnit(), minSafe, maxSafe);
        }
    }

    static class PressureSensor extends AbstractSensor {
        private final double rawValue;
        private final double calibrationFactor;

        public PressureSensor(String location, double minSafe, double maxSafe, double rawValue, double calibrationFactor) {
            super(location, minSafe, maxSafe);
            this.rawValue = rawValue;
            this.calibrationFactor = calibrationFactor;
        }

        @Override
        public double readValue() {
            return rawValue * calibrationFactor;
        }

        @Override
        public String getUnit() {
            return "бар";
        }
    }

    static class RadiationSensor extends AbstractSensor {
        private final double backgroundValue;

        public RadiationSensor(String location, double minSafe, double maxSafe, double backgroundValue) {
            super(location, minSafe, maxSafe);
            this.backgroundValue = backgroundValue;
        }

        @Override
        public double readValue() {
            return backgroundValue;
        }

        @Override
        public String getUnit() {
            return "мкЗв/год";
        }
    }

    static abstract class AbstractCompressor {
        private final String algorithmName;

        public AbstractCompressor(String algorithmName) {
            this.algorithmName = algorithmName;
        }

        public abstract int estimateCompressedSize(int originalSizeBytes);

        public double getCompressionRatio(int originalSizeBytes) {
            if (originalSizeBytes <= 0) {
                return 0.0;
            }
            int compressed = estimateCompressedSize(originalSizeBytes);
            return (originalSizeBytes - compressed) * 100.0 / originalSizeBytes;
        }

        public String getAlgorithmName() {
            return algorithmName;
        }
    }

    static class ZipCompressor extends AbstractCompressor {
        public ZipCompressor() {
            super("ZIP");
        }

        @Override
        public int estimateCompressedSize(int originalSizeBytes) {
            return (int) Math.round(originalSizeBytes * 0.55);
        }
    }

    static class UltraLzmaCompressor extends AbstractCompressor {
        public UltraLzmaCompressor() {
            super("UltraLZMA");
        }

        @Override
        public int estimateCompressedSize(int originalSizeBytes) {
            return (int) Math.round(originalSizeBytes * 0.30) + 128;
        }
    }

    static abstract class AbstractPcPart {
        private final String model;
        private final double priceUah;

        public AbstractPcPart(String model, double priceUah) {
            this.model = model;
            this.priceUah = priceUah;
        }

        public abstract int getPowerConsumptionWatts();

        @Override
        public String toString() {
            return String.format("%s{model='%s', price=%.2f грн, power=%d Вт}",
                    getClass().getSimpleName(), model, priceUah, getPowerConsumptionWatts());
        }
    }

    static class ProcessorPart extends AbstractPcPart {
        private final int cores;
        private final int watts;

        public ProcessorPart(String model, double priceUah, int cores, int watts) {
            super(model, priceUah);
            this.cores = cores;
            this.watts = watts;
        }

        @Override
        public int getPowerConsumptionWatts() {
            return watts;
        }
    }

    static class VideoCardPart extends AbstractPcPart {
        private final int vramGb;
        private final int watts;

        public VideoCardPart(String model, double priceUah, int vramGb, int watts) {
            super(model, priceUah);
            this.vramGb = vramGb;
            this.watts = watts;
        }

        @Override
        public int getPowerConsumptionWatts() {
            return watts;
        }
    }

    static class DesktopPC {
        private final int psuMaxWatts;
        private final AbstractPcPart[] parts;
        private int partCount;

        public DesktopPC(int psuMaxWatts, int capacity) {
            this.psuMaxWatts = psuMaxWatts;
            this.parts = new AbstractPcPart[Math.max(capacity, 0)];
            this.partCount = 0;
        }

        public boolean addPart(AbstractPcPart part) {
            if (part == null || partCount >= parts.length) {
                return false;
            }
            parts[partCount] = part;
            partCount++;
            return true;
        }

        public int getTotalPowerWatts() {
            int total = 0;
            for (int i = 0; i < partCount; i++) {
                total += parts[i].getPowerConsumptionWatts();
            }
            return total;
        }

        public boolean isSystemStable() {
            return getTotalPowerWatts() * 1.2 <= psuMaxWatts;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("DesktopPC{psuMaxWatts=" + psuMaxWatts + ", totalPower=" + getTotalPowerWatts() + " Вт, parts=[");
            for (int i = 0; i < partCount; i++) {
                if (i > 0) sb.append(", ");
                sb.append(parts[i]);
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    static abstract class AbstractThruster {
        private final String thrusterId;

        public AbstractThruster(String thrusterId) {
            this.thrusterId = thrusterId;
        }

        public abstract double getThrustKn();

        public abstract double getFuelBurnRate();

        @Override
        public String toString() {
            return String.format("%s{id='%s', thrust=%.2f кН, fuelBurnRate=%.2f}",
                    getClass().getSimpleName(), thrusterId, getThrustKn(), getFuelBurnRate());
        }
    }

    static class ChemicalThruster extends AbstractThruster {
        private final double thrustKn;
        private final double fuelBurnRate;

        public ChemicalThruster(String thrusterId, double thrustKn, double fuelBurnRate) {
            super(thrusterId);
            this.thrustKn = thrustKn;
            this.fuelBurnRate = fuelBurnRate;
        }

        @Override
        public double getThrustKn() {
            return thrustKn;
        }

        @Override
        public double getFuelBurnRate() {
            return fuelBurnRate;
        }
    }

    static class IonThruster extends AbstractThruster {
        private final double thrustKn;
        private final double fuelBurnRate;

        public IonThruster(String thrusterId, double thrustKn, double fuelBurnRate) {
            super(thrusterId);
            this.thrustKn = thrustKn;
            this.fuelBurnRate = fuelBurnRate;
        }

        @Override
        public double getThrustKn() {
            return thrustKn;
        }

        @Override
        public double getFuelBurnRate() {
            return fuelBurnRate;
        }
    }

    static class Spacecraft {
        private final String shipName;
        private final double dryMassTons;
        private final AbstractThruster[] thrusters;
        private int count;

        public Spacecraft(String shipName, double dryMassTons, int capacity) {
            this.shipName = shipName;
            this.dryMassTons = dryMassTons;
            this.thrusters = new AbstractThruster[Math.max(capacity, 0)];
            this.count = 0;
        }

        public boolean addThruster(AbstractThruster thruster) {
            if (thruster == null || count >= thrusters.length) {
                return false;
            }
            thrusters[count] = thruster;
            count++;
            return true;
        }

        public double getTotalThrustKn() {
            double total = 0.0;
            for (int i = 0; i < count; i++) {
                total += thrusters[i].getThrustKn();
            }
            return total;
        }

        public double getInitialAcceleration() {
            if (dryMassTons <= 0) {
                return 0.0;
            }
            return getTotalThrustKn() / dryMassTons;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Spacecraft{shipName='" + shipName + "', dryMassTons=" + dryMassTons + ", thrusters=[");
            for (int i = 0; i < count; i++) {
                if (i > 0) sb.append(", ");
                sb.append(thrusters[i]);
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    static class LandPlot {
        private final double totalPlotAreaM2;
        private final AbstractShape[] structures;
        private int count;

        public LandPlot(double totalPlotAreaM2, int capacity) {
            this.totalPlotAreaM2 = totalPlotAreaM2;
            this.structures = new AbstractShape[Math.max(capacity, 0)];
            this.count = 0;
        }

        private double getBuiltArea() {
            double total = 0.0;
            for (int i = 0; i < count; i++) {
                total += structures[i].getArea();
            }
            return total;
        }

        public boolean addStructure(AbstractShape s) {
            if (s == null || count >= structures.length) {
                return false;
            }
            if (getBuiltArea() + s.getArea() > totalPlotAreaM2 * 0.6) {
                return false;
            }
            structures[count] = s;
            count++;
            return true;
        }

        public double getFreeGreenArea() {
            return totalPlotAreaM2 - getBuiltArea();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(String.format("LandPlot{totalPlotArea=%.2f м², builtArea=%.2f м², structures=[", totalPlotAreaM2, getBuiltArea()));
            for (int i = 0; i < count; i++) {
                if (i > 0) sb.append(", ");
                sb.append(structures[i]);
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    static abstract class AbstractAsset {
        private final String ticker;
        protected double investedAmount;

        public AbstractAsset(String ticker, double investedAmount) {
            this.ticker = ticker;
            this.investedAmount = investedAmount;
        }

        public abstract double calculateAnnualReturn();

        public double getInvestedAmount() {
            return investedAmount;
        }

        @Override
        public String toString() {
            return String.format("%s{ticker='%s', invested=%.2f, annualReturn=%.2f}",
                    getClass().getSimpleName(), ticker, investedAmount, calculateAnnualReturn());
        }
    }

    static class GovernmentBond extends AbstractAsset {
        private static final double COUPON_RATE = 0.155;

        public GovernmentBond(String ticker, double investedAmount) {
            super(ticker, investedAmount);
        }

        @Override
        public double calculateAnnualReturn() {
            return investedAmount * COUPON_RATE;
        }
    }

    static class DividendStock extends AbstractAsset {
        private final double expectedGrowthRate;
        private final double dividendYield;
        private final double dividendTaxRate;

        public DividendStock(String ticker, double investedAmount, double expectedGrowthRate, double dividendYield, double dividendTaxRate) {
            super(ticker, investedAmount);
            this.expectedGrowthRate = expectedGrowthRate;
            this.dividendYield = dividendYield;
            this.dividendTaxRate = dividendTaxRate;
        }

        @Override
        public double calculateAnnualReturn() {
            return investedAmount * (expectedGrowthRate + dividendYield * (1.0 - dividendTaxRate));
        }
    }

    static class InvestmentPortfolio {
        private final String investorName;
        private final AbstractAsset[] assets;
        private int assetCount;

        public InvestmentPortfolio(String investorName, int capacity) {
            this.investorName = investorName;
            this.assets = new AbstractAsset[Math.max(capacity, 0)];
            this.assetCount = 0;
        }

        public boolean addAsset(AbstractAsset asset) {
            if (asset == null || assetCount >= assets.length) {
                return false;
            }
            assets[assetCount] = asset;
            assetCount++;
            return true;
        }

        public double getTotalValue() {
            double total = 0.0;
            for (int i = 0; i < assetCount; i++) {
                total += assets[i].getInvestedAmount();
            }
            return total;
        }

        public double getTotalAnnualReturn() {
            double total = 0.0;
            for (int i = 0; i < assetCount; i++) {
                total += assets[i].calculateAnnualReturn();
            }
            return total;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("InvestmentPortfolio{investor='" + investorName + "', assets=[");
            for (int i = 0; i < assetCount; i++) {
                if (i > 0) sb.append(", ");
                sb.append(assets[i]);
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    static abstract class AbstractHeroUnit {
        private final String name;
        protected int hp;

        public AbstractHeroUnit(String name, int hp) {
            this.name = name;
            this.hp = hp;
        }

        public abstract int getCombatPower();

        public abstract String getRole();

        @Override
        public String toString() {
            return String.format("%s{name='%s', role='%s', hp=%d, combatPower=%d}",
                    getClass().getSimpleName(), name, getRole(), hp, getCombatPower());
        }
    }

    static class TankWarrior extends AbstractHeroUnit {
        private final int armor;

        public TankWarrior(String name, int hp, int armor) {
            super(name, hp);
            this.armor = armor;
        }

        @Override
        public int getCombatPower() {
            return hp / 2 + armor * 3;
        }

        @Override
        public String getRole() {
            return "Tank";
        }
    }

    static class ArcaneMage extends AbstractHeroUnit {
        private final int intelligence;
        private final int spellPower;

        public ArcaneMage(String name, int hp, int intelligence, int spellPower) {
            super(name, hp);
            this.intelligence = intelligence;
            this.spellPower = spellPower;
        }

        @Override
        public int getCombatPower() {
            return intelligence * 2 + spellPower;
        }

        @Override
        public String getRole() {
            return "Mage";
        }
    }

    static class RaidParty {
        private final String guildName;
        private final AbstractHeroUnit[] members;
        private int memberCount;

        public RaidParty(String guildName, int capacity) {
            this.guildName = guildName;
            this.members = new AbstractHeroUnit[Math.max(capacity, 0)];
            this.memberCount = 0;
        }

        public boolean addMember(AbstractHeroUnit member) {
            if (member == null || memberCount >= members.length) {
                return false;
            }
            members[memberCount] = member;
            memberCount++;
            return true;
        }

        public int getTotalCombatPower() {
            int total = 0;
            for (int i = 0; i < memberCount; i++) {
                total += members[i].getCombatPower();
            }
            return total;
        }

        public boolean isReadyForRaid(int dungeonDifficulty) {
            boolean hasTank = false;
            for (int i = 0; i < memberCount; i++) {
                if ("Tank".equals(members[i].getRole())) {
                    hasTank = true;
                    break;
                }
            }
            return hasTank && getTotalCombatPower() > dungeonDifficulty;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("RaidParty{guild='" + guildName + "', totalCombatPower=" + getTotalCombatPower() + ", members=[");
            for (int i = 0; i < memberCount; i++) {
                if (i > 0) sb.append(", ");
                sb.append(members[i]);
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    static class EmergencySiren {
        private boolean sounding;

        public EmergencySiren() {
            this.sounding = false;
        }

        public void activate() {
            this.sounding = true;
        }

        public boolean isSounding() {
            return sounding;
        }

        @Override
        public String toString() {
            return "EmergencySiren{sounding=" + sounding + "}";
        }
    }

    static class SmartLab {
        private final EmergencySiren siren;
        private final AbstractSensor[] sensors;
        private int sensorCount;

        public SmartLab(int capacity) {
            this.siren = new EmergencySiren();
            this.sensors = new AbstractSensor[Math.max(capacity, 0)];
            this.sensorCount = 0;
        }

        public boolean addSensor(AbstractSensor sensor) {
            if (sensor == null || sensorCount >= sensors.length) {
                return false;
            }
            sensors[sensorCount] = sensor;
            sensorCount++;
            return true;
        }

        public void runDiagnostics() {
            boolean alarm = false;
            System.out.println("Звіт діагностики лабораторії:");
            for (int i = 0; i < sensorCount; i++) {
                boolean triggered = sensors[i].isAlarmTriggered();
                System.out.println(" - " + sensors[i] + " -> тривога: " + triggered);
                if (triggered) {
                    alarm = true;
                }
            }
            if (alarm) {
                siren.activate();
            }
            System.out.println("Стан сирени: " + siren);
        }
    }

    static abstract class AbstractFilter {
        private final String filterName;

        public AbstractFilter(String filterName) {
            this.filterName = filterName;
        }

        public abstract double processSample(double x);

        public String getFilterName() {
            return filterName;
        }
    }

    static class AmplifierFilter extends AbstractFilter {
        private final double gain;

        public AmplifierFilter(String filterName, double gain) {
            super(filterName);
            this.gain = gain;
        }

        @Override
        public double processSample(double x) {
            return x * gain;
        }
    }

    static class ClippingFilter extends AbstractFilter {
        private final double threshold;

        public ClippingFilter(String filterName, double threshold) {
            super(filterName);
            this.threshold = Math.abs(threshold);
        }

        @Override
        public double processSample(double x) {
            return Math.max(-threshold, Math.min(threshold, x));
        }
    }

    static class SignalProcessor {
        private final AbstractFilter[] pipeline;
        private int filterCount;

        public SignalProcessor(int capacity) {
            this.pipeline = new AbstractFilter[Math.max(capacity, 0)];
            this.filterCount = 0;
        }

        public boolean addFilter(AbstractFilter filter) {
            if (filter == null || filterCount >= pipeline.length) {
                return false;
            }
            pipeline[filterCount] = filter;
            filterCount++;
            return true;
        }

        public double[] process(double[] signal) {
            if (signal == null) {
                return new double[0];
            }
            double[] result = Arrays.copyOf(signal, signal.length);
            for (int f = 0; f < filterCount; f++) {
                for (int i = 0; i < result.length; i++) {
                    result[i] = pipeline[f].processSample(result[i]);
                }
            }
            return result;
        }
    }
}