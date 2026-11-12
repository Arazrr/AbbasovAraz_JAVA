package semester1.Practice_10_Abbasov_Araz;

import java.util.Arrays;

public class Practice10_Main {

    public static void main(String[] args) {
        System.out.println("----------------------1 завдання-------------------------");
        PaymentInstrument[] payments = new PaymentInstrument[3];
        payments[0] = new PaymentInstrument.BankCardInstrument("Dima");
        payments[1] = new PaymentInstrument.CryptoTokenInstrument("Vasya", 15.0);
        payments[2] = new PaymentInstrument.IbanDirectInstrument("Araz");
        double amount = 10000;
        for (PaymentInstrument p : payments) {
            System.out.println(p.getClass().getSimpleName() + " -> комісія: " + p.calculateFee(amount) + " грн, до сплати: " + p.processPayment(amount) + " грн");
        }

        System.out.println("----------------------2 завдання-------------------------");
        Shape2D[] shapes = new Shape2D[3];
        shapes[0] = new Shape2D.CircleShape(3.5);
        shapes[1] = new Shape2D.RectangleShape(4.0, 5.0);
        shapes[2] = new Shape2D.EquilateralTriangleShape(6.0);
        for (Shape2D s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " -> площа: " + s.getArea() + ", периметр: " + s.getPerimeter());
        }
        Shape2D maxShape = findMaxAreaShape(shapes);
        System.out.println("Фігура з найбільшою площею має площу: " + (maxShape != null ? maxShape.getArea() : "немає"));

        System.out.println("----------------------3 завдання-------------------------");
        System.out.println("norm(-5.0) = " + VectorMathOverload.norm(-5.0));
        System.out.println("norm(3.0, 4.0) = " + VectorMathOverload.norm(3.0, 4.0));
        System.out.println("norm({3.0, 4.0}) = " + VectorMathOverload.norm(new double[]{3.0, 4.0}));
        BinaryOperation[] operations = new BinaryOperation[3];
        operations[0] = new BinaryOperation.AddOp();
        operations[1] = new BinaryOperation.MultiplyOp();
        operations[2] = new BinaryOperation.HypotenuseOp();
        for (BinaryOperation op : operations) {
            System.out.println(op.getClass().getSimpleName() + ".apply(3.0, 4.0) = " + op.apply(3.0, 4.0));
        }

        System.out.println("----------------------4 завдання-------------------------");
        NotificationSender[] senders = new NotificationSender[3];
        senders[0] = new NotificationSender.EmailSender("user@example.com", "Екстрене сповіщення");
        senders[1] = new NotificationSender.SmsSender("+380501234567");
        senders[2] = new NotificationSender.TelegramBotSender("@user_channel");
        String alertText = "Увага! Оголошено повітряну тривогу в регіоні. Будь ласка, негайно пройдіть до найближчого укриття!";
        broadcastAlert(senders, alertText);

        System.out.println("----------------------5 завдання-------------------------");
        ShippingTariff[] tariffs = new ShippingTariff[3];
        tariffs[0] = new RoadTruckTariff();
        tariffs[1] = new AirCargoTariff();
        tariffs[2] = new RailFreightTariff();
        double weightKg = 250;
        double distanceKm = 600;
        ShippingTariff cheapest = tariffs[0];
        double cheapestCost = tariffs[0].calculateCost(weightKg, distanceKm);
        for (ShippingTariff t : tariffs) {
            double cost = t.calculateCost(weightKg, distanceKm);
            System.out.println(t.getClass().getSimpleName() + ": " + cost + " грн");
            if (cost < cheapestCost) { cheapestCost = cost; cheapest = t; }
        }
        System.out.println("Найвигідніший тариф: " + cheapest.getClass().getSimpleName() + " -> " + cheapestCost + " грн");

        System.out.println("----------------------6 завдання-------------------------");
        DifferentiableFunction[] functions = new DifferentiableFunction[3];
        functions[0] = new QuadraticParabola(1, -3, 2);
        functions[1] = new NaturalLogFunction(2.0);
        functions[2] = new ExponentialGrowth(1.5, 0.5);
        for (DifferentiableFunction f : functions) {
            System.out.println(f.getClass().getSimpleName() + ": f(2.0)=" + f.f(2.0) + ", f'(2.0)=" + f.derivativeAt(2.0));
        }

        System.out.println("----------------------7 завдання-------------------------");
        UiWidget[] pageElements = new UiWidget[3];
        pageElements[0] = new ButtonWidget("btn1", 120, 40, "OK");
        pageElements[1] = new TextInputWidget("inp1", 300, 30, "Введіть ім'я");
        pageElements[2] = new ProgressBarWidget("pb1", 400, 20, 75);
        System.out.println(renderPage(pageElements));

        System.out.println("----------------------8 завдання-------------------------");
        IndustrialAsset[] assets = new IndustrialAsset[3];
        assets[0] = new LinearDepreciationAsset("Верстат", 200000, 10);
        assets[1] = new DecliningBalanceAsset("Сервер", 300000, 10, 0.25);
        assets[2] = new LinearDepreciationAsset("Прес", 100000, 5);
        double totalBookValue = 0;
        for (IndustrialAsset a : assets) {
            double v = a.getBookValueAfterYears(3);
            System.out.println(a.getName() + ": " + v);
            totalBookValue += v;
        }
        System.out.println("Сумарна залишкова вартість цеху: " + totalBookValue);

        System.out.println("----------------------9 завдання-------------------------");
        Measurable[] items = new Measurable[3];
        items[0] = new BankVault(1250.0);
        items[1] = new HighwayRoute(315.5);
        items[2] = new CpuCore(3.7);
        System.out.println("Середнє значення: " + computeAverage(items));

        System.out.println("----------------------10 завдання------------------------");
        EnergyConvertible[] energyItems = new EnergyConvertible[2];
        energyItems[0] = new KineticBody(10.0, 20.0);
        energyItems[1] = new BatteryCell(50000.0);
        for (EnergyConvertible e : energyItems) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getEnergyJoules() + " Дж = " + e.getEnergyKwh() + " кВт·год");
        }

        System.out.println("----------------------11 завдання------------------------");
        AmphibiousRescueDrone drone = new AmphibiousRescueDrone();
        testFlight(drone);
        testDiving(drone);
        logPosition(drone);

        System.out.println("----------------------12 завдання------------------------");
        DataValidator emailValidator = new EmailValidator();
        DataValidator numberValidator = new PositiveNumberValidator();
        System.out.println(emailValidator.validateOrDefault("user@example.com", "НЕВАЛІД"));
        System.out.println(emailValidator.validateOrDefault("bad", "НЕВАЛІД"));
        System.out.println(numberValidator.validateOrDefault("42", "НЕВАЛІД"));
        System.out.println(numberValidator.validateOrDefault("-7", "НЕВАЛІД"));
        System.out.println("isNotNullOrBlank(null) = " + DataValidator.isNotNullOrBlank(null));
        System.out.println("isNotNullOrBlank(\"  \") = " + DataValidator.isNotNullOrBlank("  "));

        System.out.println("----------------------13 завдання------------------------");
        EmergencyBeacon beacon = new EmergencyBeacon();
        System.out.println(beacon.emitAlert());

        System.out.println("----------------------14 завдання------------------------");
        EscrowSmartContract contract = new EscrowSmartContract();
        System.out.println("verifySignature: " + contract.verifySignature("KEY-XYZ"));
        System.out.println("auditTrail: " + contract.getAuditTrail());
        System.out.println("executeContract: " + contract.executeContract(21000));

        System.out.println("----------------------15 завдання------------------------");
        Transformable2D[] scene = new Transformable2D[2];
        scene[0] = new BoundingBox(0, 0, 10, 5);
        scene[1] = new CircleRegion(5, 5, 3);
        applyGlobalTransform(scene, 2, 3, 2.0);
        for (Transformable2D t : scene) {
            System.out.println(t.toString());
        }

        System.out.println("----------------------16 завдання------------------------");
        DataExportable[] records = new DataExportable[2];
        records[0] = new StudentGradeRecord("Ivan", 101, 4.5);
        records[1] = new WeatherObservation("Kyiv", 18.5, 65);
        for (DataExportable r : records) System.out.println("JSON: " + r.toJson());
        System.out.println("CSV:");
        for (DataExportable r : records) System.out.println(r.toCsvRow());

        System.out.println("----------------------17 завдання------------------------");
        AbstractBird[] birds = new AbstractBird[2];
        birds[0] = new Falcon("Сокіл", 1.2);
        birds[1] = new EmperorPenguin("Пінгвін", 30.0);
        for (AbstractBird b : birds) System.out.println(b.getSpecies() + ": " + b.makeSound());
        FlyableUnit[] flyers = new FlyableUnit[2];
        flyers[0] = new Falcon("Сокіл", 1.2);
        flyers[1] = new CargoPlane();
        for (FlyableUnit f : flyers) System.out.println("Швидкість польоту: " + f.getFlightSpeedKmh() + " км/год");

        System.out.println("----------------------18 завдання------------------------");
        AbstractSmartAppliance[] appliances = new AbstractSmartAppliance[2];
        appliances[0] = new SmartLedChandelier("Вітальня", "LED-100", 30);
        appliances[1] = new SmartUnderfloorHeating("Кухня", "Heat-200", 500);
        double totalWatts = 0;
        for (AbstractSmartAppliance ap : appliances) {
            System.out.println(ap.getModel() + ": " + ap.getCurrentWatts() + " Вт");
            totalWatts += ap.getCurrentWatts();
        }
        System.out.println("Сумарне споживання: " + totalWatts + " Вт");

        System.out.println("----------------------19 завдання------------------------");
        AbstractFinancialInstrument[] portfolio = new AbstractFinancialInstrument[3];
        portfolio[0] = new TechGrowthStock("TECH", 100);
        portfolio[1] = new BlueChipStock("BLUE", 50, 5.5);
        portfolio[2] = new FixedTermDeposit("DEP", 100000, 10.0);
        for (AbstractFinancialInstrument inst : portfolio) {
            System.out.println(inst.getTicker() + ": " + inst.getMarketValueUah() + " грн");
            if (inst instanceof Tradable t) System.out.println("  buy(10): " + t.buy(10));
            if (inst instanceof DividendPaying d) System.out.println("  дивіденд: " + d.calculateAnnualDividend());
        }

        System.out.println("----------------------20 завдання------------------------");
        AbstractVectorOperator[] operators = new AbstractVectorOperator[2];
        operators[0] = new Rotation2DOperator(Math.PI / 2);
        operators[1] = new ProjectionXOperator();
        Vec2D vec = new Vec2D(3, 4);
        for (AbstractVectorOperator op : operators) {
            Vec2D transformed = op.transform(vec);
            System.out.println(op.getName() + ": " + vec + " -> " + transformed);
            if (op instanceof InvertibleOperator inv) System.out.println("  inverse: " + inv.inverseTransform(transformed));
        }

        System.out.println("----------------------21 завдання------------------------");
        AbstractVehicle[] fleet = new AbstractVehicle[3];
        fleet[0] = new ElectricCityBus("AA1234BB", 5000, 40, 200);
        fleet[1] = new DieselDumpTruck("CC5678DD", 120000, 20);
        fleet[2] = new CargoPassengerVan("EE9012FF", 80000, 3, 8);
        for (AbstractVehicle v : fleet) {
            System.out.println(v.getPlateNumber() + ":");
            if (v instanceof CargoCarrier c) System.out.println("  вантаж: " + c.getMaxPayloadTons() + " т");
            if (v instanceof PassengerCarrier p) System.out.println("  місць: " + p.getSeatCount());
            if (v instanceof ElectricPowered e) System.out.println("  батарея: " + e.getBatteryCapacityKwh() + " кВт·год");
        }

        System.out.println("----------------------22 завдання------------------------");
        AbstractMilitaryUnit[] army = new AbstractMilitaryUnit[3];
        army[0] = new HeavySniper("Снайпер", 100);
        army[1] = new CombatMedic("Медик", 80);
        army[2] = new PaladinCaptain("Паладін", 150);
        for (AbstractMilitaryUnit unit : army) {
            System.out.println(unit.getUnitName() + " швидкість: " + unit.getMoveSpeed());
            if (unit instanceof RangedAttacker r) System.out.println("  range: " + r.getAttackRange() + ", постріл: " + r.fireShot());
            if (unit instanceof FieldHealer h) System.out.println("  лікування: " + h.healAlly());
        }

        System.out.println("----------------------23 завдання------------------------");
        AbstractLabDevice[] labDevices = new AbstractLabDevice[2];
        labDevices[0] = new ElectronicScale("SC-001");
        labDevices[1] = new GlassThermometer("TH-002");
        for (AbstractLabDevice d : labDevices) {
            d.performMeasurement();
            if (d instanceof Calibratable c) c.calibrate(1.0);
            if (d instanceof SelfDiagnostic s) System.out.println("  self-check: " + s.runSelfCheck());
        }

        System.out.println("----------------------24 завдання------------------------");
        TextProcessor[] processors = new TextProcessor[2];
        processors[0] = new CaesarCipherProcessor(3);
        processors[1] = new WhitespaceTrimmerProcessor();
        String text = "  Hello   World  ";
        String current = text;
        for (TextProcessor p : processors) {
            current = p.process(current);
            System.out.println(p.getClass().getSimpleName() + ": " + current);
        }
        CaesarCipherProcessor cipher = new CaesarCipherProcessor(3);
        String enc = cipher.process("Hello");
        System.out.println("encrypt: " + enc);
        System.out.println("decrypt: " + cipher.reverseProcess(enc));

        System.out.println("----------------------25 завдання------------------------");
        Shape2D[] shapeArray = new Shape2D[3];
        shapeArray[0] = new Shape2D.CircleShape(3.5);
        shapeArray[1] = new Shape2D.RectangleShape(4.0, 4.0);
        shapeArray[2] = new Shape2D.RectangleShape(3.0, 5.0);
        for (Shape2D s : shapeArray) {
            if (s instanceof Shape2D.CircleShape c) {
                System.out.println("Коло, діаметр: " + c.getDiameter());
            } else if (s instanceof Shape2D.RectangleShape r) {
                System.out.println("Прямокутник, діагональ: " + r.getDiagonal() + ", квадрат: " + r.isSquare());
            }
        }
        Shape2D nullShape = null;
        System.out.println("null instanceof Shape2D: " + (nullShape instanceof Shape2D));

        System.out.println("----------------------26 завдання------------------------");
        Object[] warehouse = new Object[5];
        warehouse[0] = new Laptop();
        warehouse[1] = new ElectricScooter();
        warehouse[2] = new SmartWatch();
        warehouse[3] = new DesktopMonitor();
        warehouse[4] = new WiredPrinter();
        int chargedCount = chargeAllPossible(warehouse);
        System.out.println("Заряджено пристроїв: " + chargedCount);

        System.out.println("----------------------27 завдання------------------------");
        AbstractWorker[] staff = new AbstractWorker[3];
        staff[0] = new FullTimeDeveloper("Петро", 30000);
        staff[1] = new FopContractor("Анна", 25000);
        staff[2] = new InternStudent("Олег", 8000);
        double baseFund = 0, totalBonus = 0;
        int insuredCount = 0;
        for (AbstractWorker w : staff) {
            baseFund += w.getSalary();
            if (w instanceof BonusEligible b) totalBonus += b.calculateQuarterBonus();
            if (w instanceof MedicalInsured) insuredCount++;
        }
        System.out.println("Базовий фонд оплати праці: " + baseFund);
        System.out.println("Сума квартальних премій: " + totalBonus);
        System.out.println("Кількість застрахованих: " + insuredCount);

        System.out.println("----------------------28 завдання------------------------");
        ShipModule[] modules = new ShipModule[3];
        modules[0] = new ShieldGenerator("Щит", false);
        modules[1] = new WarpDrive("Варп-двигун", false);
        modules[2] = new LifeSupportModule("Життєзабезпечення", false, 95.5);
        runShipInspection(modules);

        System.out.println("----------------------29 завдання------------------------");
        MediaItem[] media = new MediaItem[4];
        media[0] = new VideoFile("Film1", 2000, 2160, 7200);
        media[1] = new AudioFile("Song1", 50, 1200);
        media[2] = new VideoFile("Film2", 1500, 1080, 5400);
        media[3] = new AudioFile("Song2", 30, 320);
        double totalSizeMb = 0;
        for (MediaItem m : media) {
            if (m instanceof VideoFile v && v.is4K()) {
                totalSizeMb += v.getSizeMb();
                System.out.println("4K відео: " + v.getTitle() + " (" + v.getSizeMb() + " МБ)");
            }
            if (m instanceof AudioFile a && a.isLossless()) {
                totalSizeMb += a.getSizeMb();
                System.out.println("Lossless аудіо: " + a.getTitle() + " (" + a.getSizeMb() + " МБ)");
            }
        }
        System.out.println("Сумарний обсяг: " + totalSizeMb + " МБ");

        System.out.println("----------------------30 завдання------------------------");
        AbstractCustomer[] customers = new AbstractCustomer[2];
        customers[0] = new VipCustomer();
        customers[1] = new StudentCustomer();
        double basePrice = 1000;
        for (AbstractCustomer c : customers) {
            double finalPrice = basePrice * (1.0 - c.getDiscountPercent() / 100.0);
            System.out.println(c.getClass().getSimpleName() + ": знижка " + c.getDiscountPercent() + "%, ціна: " + finalPrice);
        }

        System.out.println("----------------------31 завдання------------------------");
        Matrix2x2[] matrices = new Matrix2x2[2];
        matrices[0] = new RotationMatrix2x2(Math.PI / 4);
        matrices[1] = new SingularMatrix2x2(1, 2, 2, 4);
        for (Matrix2x2 m : matrices) {
            System.out.println(m.getClass().getSimpleName() + ", det = " + m.determinant());
            if (m instanceof InvertibleMatrix inv) {
                Matrix2x2 inverse = inv.inverse();
                System.out.println("  inverse det = " + inverse.determinant());
            }
            if (m instanceof OrthogonalMatrix o) {
                System.out.println("  orthogonal: " + o.checkOrthogonality());
            }
        }

        System.out.println("----------------------32 завдання------------------------");
        CargoContainer[] containers = new CargoContainer[3];
        containers[0] = new CargoContainer("ELEC-1", new Electronics());
        containers[1] = new CargoContainer("CHEM-1", new Chemical());
        containers[2] = new CargoContainer("FROZEN-1", new FrozenFood());
        for (CargoContainer c : containers) {
            System.out.println(c.getId() + ":");
            if (c.getCargo() instanceof HazardousCargo h) {
                System.out.println("  -> спецбокс (клас небезпеки " + h.getHazardClass() + ")");
            }
            if (c.getCargo() instanceof RefrigeratedCargo r) {
                System.out.println("  -> рефрижератор (" + r.getRequiredTempC() + "°C)");
            }
        }

        System.out.println("----------------------33 завдання------------------------");
        FinalCalibrationTable table = new FinalCalibrationTable("SN-12345", new double[]{1.0, 2.0, 3.0});
        System.out.println("GRAVITY_G: " + FinalCalibrationTable.GRAVITY_G);
        System.out.println("sensorSerial: " + table.getSensorSerial());
        double[] external = table.getCoefficients();
        external[0] = 999.0;
        System.out.println("Після зміни зовнішнього масиву: " + Arrays.toString(table.getCoefficients()));

        System.out.println("----------------------34 завдання------------------------");
        AbstractSecurityProtocol jwt = new JwtSecurityProtocol();
        AbstractSecurityProtocol api = new ApiKeySecurityProtocol();
        System.out.println(jwt.runSecureCommand("valid-jwt", "cmd1"));
        System.out.println(jwt.runSecureCommand("bad", "cmd1"));
        System.out.println(api.runSecureCommand("api-key-abc", "cmd2"));
        System.out.println(api.runSecureCommand("bad", "cmd2"));

        System.out.println("----------------------35 завдання------------------------");
        MetricSpaceElement[] space = new MetricSpaceElement[2];
        space[0] = new ImmutableVector3D(1, 2, 3);
        space[1] = new ImmutableVector3D(4, 5, 6);
        System.out.println("Норма v1: " + space[0].getNorm());
        System.out.println("Відстань v1-v2: " + space[0].distanceTo(space[1]));

        System.out.println("----------------------36 завдання------------------------");
        PrintableDocument[] docs = new PrintableDocument[2];
        docs[0] = new FiscalReceipt("FISC-001", 1200.0);
        docs[1] = new WarehouseReport("WR-002", "Товар А, Товар Б");
        for (PrintableDocument d : docs) System.out.println(d.formatForPrinter());

        System.out.println("----------------------37 завдання------------------------");
        PowerProducer[] grid = new PowerProducer[3];
        grid[0] = new NuclearStation("NPP-1", 1000);
        grid[1] = new SolarFarmStation("SOL-1", 200);
        grid[2] = new HydroDamStation("HYD-1", 500);
        for (PowerProducer p : grid) {
            if (p instanceof WeatherDependent wd) wd.updateWeatherCondition(0.75);
        }
        double totalGen = 0;
        for (PowerProducer p : grid) {
            if (p instanceof AbstractPowerStation ps) totalGen += ps.getNetOutputMw();
            else totalGen += p.produceMw();
        }
        System.out.println("Сумарна генерація мережі: " + totalGen + " МВт");

        System.out.println("----------------------38 завдання------------------------");
        CubicFunction cubic = new CubicFunction();
        System.out.println("Інтеграл на [0;3]: " + cubic.integrateTrapezoid(0, 3, 10000));
        System.out.println("Корінь на [2;3]: " + cubic.findRootBisection(2.0, 3.0, 1e-6));

        System.out.println("----------------------39 завдання------------------------");
        AbstractCombatUnit[] units = new AbstractCombatUnit[3];
        units[0] = new BerserkerAssasin("Берсерк", 120);
        units[1] = new TrollWarlord("Троль", 200);
        units[2] = new RoyalPaladin("Паладін", 250);
        for (int round = 1; round <= 2; round++) {
            System.out.println("Раунд " + round);
            for (AbstractCombatUnit u : units) {
                if (!u.isAlive()) continue;
                if (u instanceof SelfRegenerating reg) u.setHp(u.getHp() + reg.regenerateHp());
            }
            AbstractCombatUnit attacker = units[0];
            AbstractCombatUnit defender = units[1];
            int dmg = attacker.calculateDamage();
            if (attacker instanceof CriticalStriker crit) dmg = (int)(dmg * crit.getCritMultiplier());
            if (defender instanceof ShieldBearer shield) dmg = shield.absorbDamage(dmg);
            defender.setHp(defender.getHp() - dmg);
            System.out.println(attacker.getName() + " -> " + defender.getName() + ": " + dmg + " шкоди, HP=" + defender.getHp());
        }

        System.out.println("----------------------40 завдання------------------------");
        System.out.println("У процесі...");
    }

    static Shape2D findMaxAreaShape(Shape2D[] shapes) {
        if (shapes == null || shapes.length == 0) return null;
        Shape2D max = shapes[0];
        for (int i = 1; i < shapes.length; i++) if (shapes[i].getArea() > max.getArea()) max = shapes[i];
        return max;
    }
    static void broadcastAlert(NotificationSender[] senders, String alertText) {
        if (senders == null) return;
        for (NotificationSender s : senders) System.out.println(s.send(alertText));
    }
    static String renderPage(UiWidget[] pageElements) {
        StringBuilder sb = new StringBuilder("<html><body>\n");
        for (UiWidget w : pageElements) sb.append(w.renderHtml()).append("\n");
        sb.append("</body></html>");
        return sb.toString();
    }
    static double computeAverage(Measurable[] items) {
        if (items == null || items.length == 0) return 0;
        double sum = 0;
        for (Measurable m : items) sum += m.getMeasure();
        return sum / items.length;
    }
    static void testFlight(Flyable f) { f.takeOff(); System.out.println("Max altitude: " + f.getMaxAltitude() + " м"); }
    static void testDiving(Swimmable s) { s.dive(50); System.out.println("Max depth: " + s.getMaxDepth() + " м"); }
    static void logPosition(GpsTrackable g) { System.out.println("Coords: " + g.getCoordinates()); }
    static void applyGlobalTransform(Transformable2D[] objects, double dx, double dy, double scaleFactor) {
        for (Transformable2D o : objects) { o.translate(dx, dy); o.scale(scaleFactor); }
    }
    static int chargeAllPossible(Object[] items) {
        if (items == null) return 0;
        int count = 0;
        for (Object item : items) {
            if (item instanceof Rechargeable r) { r.chargeToFull(); count++; }
        }
        return count;
    }
    static void runShipInspection(ShipModule[] modules) {
        for (ShipModule m : modules) {
            System.out.println(m.getName() + ":");
            if (m instanceof ShieldGenerator sg) sg.rechargeShields(500);
            if (m instanceof WarpDrive wd) System.out.println("  antimatter: " + wd.checkAntimatterContainment());
            if (m instanceof LifeSupportModule ls) System.out.println("  oxygen: " + ls.getOxygenPercent() + "%");
        }
    }

    static abstract class PaymentInstrument {
        private final String payerName;
        PaymentInstrument(String payerName) { this.payerName = payerName; }
        public abstract double calculateFee(double amount);
        public double processPayment(double amount) { return amount + calculateFee(amount); }
        static class BankCardInstrument extends PaymentInstrument {
            BankCardInstrument(String n) { super(n); }
            @Override public double calculateFee(double amount) { return amount * 0.015 + 5; }
        }
        static class CryptoTokenInstrument extends PaymentInstrument {
            private final double gasFeeUah;
            CryptoTokenInstrument(String n, double g) { super(n); gasFeeUah = g; }
            @Override public double calculateFee(double amount) { return gasFeeUah; }
        }
        static class IbanDirectInstrument extends PaymentInstrument {
            IbanDirectInstrument(String n) { super(n); }
            @Override public double calculateFee(double amount) { return amount < 50000 ? 0 : amount * 0.005; }
        }
    }

    static abstract class Shape2D {
        public abstract double getArea();
        public abstract double getPerimeter();
        static class CircleShape extends Shape2D {
            private final double radius;
            CircleShape(double r) { radius = r; }
            @Override public double getArea() { return Math.PI * radius * radius; }
            @Override public double getPerimeter() { return 2 * Math.PI * radius; }
            public double getDiameter() { return 2 * radius; }
        }
        static class RectangleShape extends Shape2D {
            private final double a, b;
            RectangleShape(double a, double b) { this.a = a; this.b = b; }
            @Override public double getArea() { return a * b; }
            @Override public double getPerimeter() { return 2 * (a + b); }
            public double getDiagonal() { return Math.sqrt(a*a + b*b); }
            public boolean isSquare() { return Math.abs(a - b) < 1e-9; }
        }
        static class EquilateralTriangleShape extends Shape2D {
            private final double a;
            EquilateralTriangleShape(double a) { this.a = a; }
            @Override public double getArea() { return Math.sqrt(3) / 4 * a * a; }
            @Override public double getPerimeter() { return 3 * a; }
        }
    }

    static class VectorMathOverload {
        static double norm(double x) { return Math.abs(x); }
        static double norm(double x, double y) { return Math.sqrt(x*x + y*y); }
        static double norm(double[] v) {
            if (v == null || v.length == 0) return 0;
            double s = 0;
            for (double val : v) s += val * val;
            return Math.sqrt(s);
        }
    }

    static abstract class BinaryOperation {
        public abstract double apply(double a, double b);
        static class AddOp extends BinaryOperation { @Override public double apply(double a, double b) { return a + b; } }
        static class MultiplyOp extends BinaryOperation { @Override public double apply(double a, double b) { return a * b; } }
        static class HypotenuseOp extends BinaryOperation { @Override public double apply(double a, double b) { return Math.sqrt(a*a + b*b); } }
    }

    static class NotificationSender {
        private final String recipient;
        NotificationSender(String r) { recipient = r; }
        public String getRecipient() { return recipient; }
        public String send(String message) { return "Відправка на " + recipient + ": " + message; }
        static class EmailSender extends NotificationSender {
            private final String subject;
            EmailSender(String r, String s) { super(r); subject = s; }
            @Override public String send(String m) { return String.format("[EMAIL -> %s] Тема: \"%s\" | %s", getRecipient(), subject, m); }
        }
        static class SmsSender extends NotificationSender {
            SmsSender(String r) { super(r); }
            @Override public String send(String m) {
                if (m != null && m.length() > 70) m = m.substring(0, 67) + "...";
                return String.format("[SMS -> %s] %s", getRecipient(), m);
            }
        }
        static class TelegramBotSender extends NotificationSender {
            TelegramBotSender(String r) { super(r); }
            @Override public String send(String m) { return String.format("⚠️ [TELEGRAM -> %s] *ТРИВОГА* %s *ТРИВОГА!*", getRecipient(), m); }
        }
    }

    static abstract class ShippingTariff {
        public abstract double calculateCost(double weightKg, double distanceKm);
    }
    static class RoadTruckTariff extends ShippingTariff {
        @Override public double calculateCost(double w, double d) { return 15.0 * d + 2.5 * w; }
    }
    static class AirCargoTariff extends ShippingTariff {
        @Override public double calculateCost(double w, double d) { return 45.0 * d + 18.0 * w + 500.0; }
    }
    static class RailFreightTariff extends ShippingTariff {
        @Override public double calculateCost(double w, double d) { return 1200.0 + 4.0 * d + 0.8 * w; }
    }

    static abstract class DifferentiableFunction {
        public abstract double f(double x);
        public double derivativeAt(double x) {
            double h = 1e-5;
            return (f(x + h) - f(x - h)) / (2 * h);
        }
    }
    static class QuadraticParabola extends DifferentiableFunction {
        private final double a, b, c;
        QuadraticParabola(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }
        @Override public double f(double x) { return a*x*x + b*x + c; }
    }
    static class NaturalLogFunction extends DifferentiableFunction {
        private final double k;
        NaturalLogFunction(double k) { this.k = k; }
        @Override public double f(double x) { return k * Math.log(x); }
    }
    static class ExponentialGrowth extends DifferentiableFunction {
        private final double A, lambda;
        ExponentialGrowth(double A, double l) { this.A = A; lambda = l; }
        @Override public double f(double x) { return A * Math.exp(lambda * x); }
    }

    static abstract class UiWidget {
        protected final String id;
        protected final int width, height;
        UiWidget(String id, int w, int h) { this.id = id; width = w; height = h; }
        public abstract String renderHtml();
    }
    static class ButtonWidget extends UiWidget {
        private final String label;
        ButtonWidget(String id, int w, int h, String l) { super(id, w, h); label = l; }
        @Override public String renderHtml() { return String.format("<button id=\"%s\" style=\"width:%dpx;height:%dpx\">%s</button>", id, width, height, label); }
    }
    static class TextInputWidget extends UiWidget {
        private final String placeholder;
        TextInputWidget(String id, int w, int h, String p) { super(id, w, h); placeholder = p; }
        @Override public String renderHtml() { return String.format("<input id=\"%s\" style=\"width:%dpx;height:%dpx\" placeholder=\"%s\"/>", id, width, height, placeholder); }
    }
    static class ProgressBarWidget extends UiWidget {
        private final int progressPercent;
        ProgressBarWidget(String id, int w, int h, int p) { super(id, w, h); progressPercent = Math.max(0, Math.min(100, p)); }
        @Override public String renderHtml() { return String.format("<progress id=\"%s\" style=\"width:%dpx;height:%dpx\" value=\"%d\" max=\"100\"></progress>", id, width, height, progressPercent); }
    }

    static abstract class IndustrialAsset {
        private final String name;
        protected final double initialCost;
        protected final int usefulLifeYears;
        IndustrialAsset(String n, double c, int y) { name = n; initialCost = c; usefulLifeYears = y; }
        public String getName() { return name; }
        public abstract double getBookValueAfterYears(int years);
    }
    static class LinearDepreciationAsset extends IndustrialAsset {
        LinearDepreciationAsset(String n, double c, int y) { super(n, c, y); }
        @Override public double getBookValueAfterYears(int years) { return Math.max(0, initialCost * (1.0 - (double) years / usefulLifeYears)); }
    }
    static class DecliningBalanceAsset extends IndustrialAsset {
        private final double rate;
        DecliningBalanceAsset(String n, double c, int y, double r) { super(n, c, y); rate = r; }
        @Override public double getBookValueAfterYears(int years) { return initialCost * Math.pow(1 - rate, years); }
    }

    interface Measurable { double getMeasure(); }
    static class BankVault implements Measurable {
        private final double goldKg; BankVault(double g) { goldKg = g; }
        @Override public double getMeasure() { return goldKg; }
    }
    static class HighwayRoute implements Measurable {
        private final double km; HighwayRoute(double k) { km = k; }
        @Override public double getMeasure() { return km; }
    }
    static class CpuCore implements Measurable {
        private final double ghz; CpuCore(double g) { ghz = g; }
        @Override public double getMeasure() { return ghz; }
    }

    interface EnergyConvertible {
        double SPEED_OF_LIGHT = 299_792_458.0;
        double JOULES_PER_KWH = 3_600_000.0;
        double getEnergyJoules();
        default double getEnergyKwh() { return getEnergyJoules() / JOULES_PER_KWH; }
    }
    static class KineticBody implements EnergyConvertible {
        private final double m, v; KineticBody(double m, double v) { this.m = m; this.v = v; }
        @Override public double getEnergyJoules() { return 0.5 * m * v * v; }
    }
    static class BatteryCell implements EnergyConvertible {
        private final double capacityWh; BatteryCell(double wh) { capacityWh = wh; }
        @Override public double getEnergyJoules() { return capacityWh * 3600.0; }
    }

    interface Flyable { void takeOff(); double getMaxAltitude(); }
    interface Swimmable { void dive(double depthMeters); double getMaxDepth(); }
    interface GpsTrackable { String getCoordinates(); }
    static class AmphibiousRescueDrone implements Flyable, Swimmable, GpsTrackable {
        @Override public void takeOff() { System.out.println("Drone taking off..."); }
        @Override public double getMaxAltitude() { return 3000; }
        @Override public void dive(double d) { System.out.println("Drone diving to " + d + " m"); }
        @Override public double getMaxDepth() { return 60; }
        @Override public String getCoordinates() { return "50.4501, 30.5234"; }
    }

    interface DataValidator {
        boolean isValid(String input);
        default String validateOrDefault(String input, String fallback) { return isValid(input) ? input : fallback; }
        static boolean isNotNullOrBlank(String s) { return s != null && !s.isBlank(); }
    }
    static class EmailValidator implements DataValidator {
        @Override public boolean isValid(String s) { return s != null && s.contains("@") && s.contains("."); }
    }
    static class PositiveNumberValidator implements DataValidator {
        @Override public boolean isValid(String s) {
            try { return Double.parseDouble(s) > 0; } catch (Exception e) { return false; }
        }
    }

    interface AcousticSignal { default String emitAlert() { return "🔊 Звукова сирена 110 дБ"; } }
    interface OpticalSignal { default String emitAlert() { return "🚨 Стробоскопічний маячок"; } }
    static class EmergencyBeacon implements AcousticSignal, OpticalSignal {
        @Override public String emitAlert() {
            return AcousticSignal.super.emitAlert() + " + " + OpticalSignal.super.emitAlert();
        }
    }

    interface Authenticatable { boolean verifySignature(String key); }
    interface Auditable { String getAuditTrail(); }
    interface BlockchainSmartContract extends Authenticatable, Auditable { boolean executeContract(double gasLimit); }
    static class EscrowSmartContract implements BlockchainSmartContract {
        @Override public boolean verifySignature(String key) { return "KEY-XYZ".equals(key); }
        @Override public String getAuditTrail() { return "[block=1] init; [block=2] deposit;"; }
        @Override public boolean executeContract(double g) { return g > 0 && g < 100000; }
    }

    interface Transformable2D {
        void translate(double dx, double dy);
        void scale(double factor);
    }
    static class BoundingBox implements Transformable2D {
        private double x, y, w, h;
        BoundingBox(double x, double y, double w, double h) { this.x = x; this.y = y; this.w = w; this.h = h; }
        @Override public void translate(double dx, double dy) { x += dx; y += dy; }
        @Override public void scale(double f) { w *= f; h *= f; }
        @Override public String toString() { return "BoundingBox[x=" + x + ", y=" + y + ", w=" + w + ", h=" + h + "]"; }
    }
    static class CircleRegion implements Transformable2D {
        private double x, y, r;
        CircleRegion(double x, double y, double r) { this.x = x; this.y = y; this.r = r; }
        @Override public void translate(double dx, double dy) { x += dx; y += dy; }
        @Override public void scale(double f) { r *= f; }
        @Override public String toString() { return "CircleRegion[x=" + x + ", y=" + y + ", r=" + r + "]"; }
    }

    interface DataExportable { String toJson(); String toCsvRow(); }
    static class StudentGradeRecord implements DataExportable {
        private final String name; private final int group; private final double gpa;
        StudentGradeRecord(String n, int g, double gpa) { name = n; group = g; this.gpa = gpa; }
        @Override public String toJson() { return String.format("{\"name\":\"%s\",\"group\":%d,\"gpa\":%.2f}", name, group, gpa); }
        @Override public String toCsvRow() { return name + "," + group + "," + gpa; }
    }
    static class WeatherObservation implements DataExportable {
        private final String city; private final double tempC; private final int humidity;
        WeatherObservation(String c, double t, int h) { city = c; tempC = t; humidity = h; }
        @Override public String toJson() { return String.format("{\"city\":\"%s\",\"tempC\":%.1f,\"humidity\":%d}", city, tempC, humidity); }
        @Override public String toCsvRow() { return city + "," + tempC + "," + humidity; }
    }

    static abstract class AbstractBird {
        protected final String species;
        protected double weightKg;
        AbstractBird(String s, double w) { species = s; weightKg = w; }
        public String getSpecies() { return species; }
        public abstract String makeSound();
    }
    interface FlyableUnit { double getFlightSpeedKmh(); }
    interface SwimmingUnit { double getDiveDepthMeters(); }
    static class Falcon extends AbstractBird implements FlyableUnit {
        Falcon(String s, double w) { super(s, w); }
        @Override public String makeSound() { return "Крі-крі!"; }
        @Override public double getFlightSpeedKmh() { return 320; }
    }
    static class EmperorPenguin extends AbstractBird implements SwimmingUnit {
        EmperorPenguin(String s, double w) { super(s, w); }
        @Override public String makeSound() { return "Кря!"; }
        @Override public double getDiveDepthMeters() { return 500; }
    }
    static class CargoPlane implements FlyableUnit {
        @Override public double getFlightSpeedKmh() { return 850; }
    }

    static abstract class AbstractSmartAppliance {
        private final String room;
        private final String model;
        protected boolean poweredOn;
        AbstractSmartAppliance(String r, String m) { room = r; model = m; poweredOn = true; }
        public String getModel() { return model; }
        public abstract double getCurrentWatts();
    }
    interface Dimmable { void setBrightness(int percent); }
    interface HeatingCapable { void setTargetTemperature(double celsius); }
    static class SmartLedChandelier extends AbstractSmartAppliance implements Dimmable {
        private final int watts;
        private int brightness = 100;
        SmartLedChandelier(String r, String m, int w) { super(r, m); watts = w; }
        @Override public double getCurrentWatts() { return poweredOn ? watts * brightness / 100.0 : 0; }
        @Override public void setBrightness(int p) { brightness = Math.max(0, Math.min(100, p)); }
    }
    static class SmartUnderfloorHeating extends AbstractSmartAppliance implements HeatingCapable {
        private final int watts;
        private double target = 22.0;
        SmartUnderfloorHeating(String r, String m, int w) { super(r, m); watts = w; }
        @Override public double getCurrentWatts() { return poweredOn ? watts : 0; }
        @Override public void setTargetTemperature(double c) { target = c; }
    }

    static abstract class AbstractFinancialInstrument {
        private final String ticker;
        protected int quantity;
        AbstractFinancialInstrument(String t, int q) { ticker = t; quantity = q; }
        public String getTicker() { return ticker; }
        public abstract double getMarketValueUah();
    }
    interface Tradable { boolean buy(int qty); boolean sell(int qty); }
    interface DividendPaying { double calculateAnnualDividend(); }
    static class TechGrowthStock extends AbstractFinancialInstrument implements Tradable {
        TechGrowthStock(String t, int q) { super(t, q); }
        @Override public double getMarketValueUah() { return quantity * 150.0; }
        @Override public boolean buy(int qty) { if (qty <= 0) return false; quantity += qty; return true; }
        @Override public boolean sell(int qty) { if (qty <= 0 || qty > quantity) return false; quantity -= qty; return true; }
    }
    static class BlueChipStock extends AbstractFinancialInstrument implements Tradable, DividendPaying {
        private final double dividendPerShare;
        BlueChipStock(String t, int q, double d) { super(t, q); dividendPerShare = d; }
        @Override public double getMarketValueUah() { return quantity * 200.0; }
        @Override public boolean buy(int qty) { if (qty <= 0) return false; quantity += qty; return true; }
        @Override public boolean sell(int qty) { if (qty <= 0 || qty > quantity) return false; quantity -= qty; return true; }
        @Override public double calculateAnnualDividend() { return quantity * dividendPerShare; }
    }
    static class FixedTermDeposit extends AbstractFinancialInstrument implements DividendPaying {
        private final double ratePercent;
        FixedTermDeposit(String t, int q, double r) { super(t, q); ratePercent = r; }
        @Override public double getMarketValueUah() { return quantity * 1.0; }
        @Override public double calculateAnnualDividend() { return quantity * ratePercent / 100.0; }
    }

    static class Vec2D {
        final double x, y;
        Vec2D(double x, double y) { this.x = x; this.y = y; }
        @Override public String toString() { return "(" + x + "; " + y + ")"; }
    }
    static abstract class AbstractVectorOperator {
        private final String name;
        AbstractVectorOperator(String n) { name = n; }
        public String getName() { return name; }
        public abstract Vec2D transform(Vec2D v);
    }
    interface InvertibleOperator { Vec2D inverseTransform(Vec2D v); }
    static class Rotation2DOperator extends AbstractVectorOperator implements InvertibleOperator {
        private final double alpha;
        Rotation2DOperator(double a) { super("Rotation2D"); alpha = a; }
        @Override public Vec2D transform(Vec2D v) {
            return new Vec2D(v.x * Math.cos(alpha) - v.y * Math.sin(alpha), v.x * Math.sin(alpha) + v.y * Math.cos(alpha));
        }
        @Override public Vec2D inverseTransform(Vec2D v) {
            return new Vec2D(v.x * Math.cos(-alpha) - v.y * Math.sin(-alpha), v.x * Math.sin(-alpha) + v.y * Math.cos(-alpha));
        }
    }
    static class ProjectionXOperator extends AbstractVectorOperator {
        ProjectionXOperator() { super("ProjectionX"); }
        @Override public Vec2D transform(Vec2D v) { return new Vec2D(v.x, 0); }
    }

    static abstract class AbstractVehicle {
        private final String plateNumber;
        protected double mileageKm;
        AbstractVehicle(String p, double m) { plateNumber = p; mileageKm = m; }
        public String getPlateNumber() { return plateNumber; }
    }
    interface CargoCarrier { double getMaxPayloadTons(); }
    interface PassengerCarrier { int getSeatCount(); }
    interface ElectricPowered { double getBatteryCapacityKwh(); }
    static class ElectricCityBus extends AbstractVehicle implements PassengerCarrier, ElectricPowered {
        private final int seats; private final double battery;
        ElectricCityBus(String p, double m, int s, double b) { super(p, m); seats = s; battery = b; }
        @Override public int getSeatCount() { return seats; }
        @Override public double getBatteryCapacityKwh() { return battery; }
    }
    static class DieselDumpTruck extends AbstractVehicle implements CargoCarrier {
        private final double payload;
        DieselDumpTruck(String p, double m, double pl) { super(p, m); payload = pl; }
        @Override public double getMaxPayloadTons() { return payload; }
    }
    static class CargoPassengerVan extends AbstractVehicle implements CargoCarrier, PassengerCarrier {
        private final double payload; private final int seats;
        CargoPassengerVan(String p, double m, double pl, int s) { super(p, m); payload = pl; seats = s; }
        @Override public double getMaxPayloadTons() { return payload; }
        @Override public int getSeatCount() { return seats; }
    }

    static abstract class AbstractMilitaryUnit {
        private final String unitName;
        protected int hp;
        AbstractMilitaryUnit(String n, int h) { unitName = n; hp = h; }
        public String getUnitName() { return unitName; }
        public abstract int getMoveSpeed();
    }
    interface RangedAttacker { int getAttackRange(); int fireShot(); }
    interface FieldHealer { int healAlly(); }
    static class HeavySniper extends AbstractMilitaryUnit implements RangedAttacker {
        HeavySniper(String n, int h) { super(n, h); }
        @Override public int getMoveSpeed() { return 3; }
        @Override public int getAttackRange() { return 1500; }
        @Override public int fireShot() { return 80; }
    }
    static class CombatMedic extends AbstractMilitaryUnit implements FieldHealer {
        CombatMedic(String n, int h) { super(n, h); }
        @Override public int getMoveSpeed() { return 6; }
        @Override public int healAlly() { return 40; }
    }
    static class PaladinCaptain extends AbstractMilitaryUnit implements RangedAttacker, FieldHealer {
        PaladinCaptain(String n, int h) { super(n, h); }
        @Override public int getMoveSpeed() { return 5; }
        @Override public int getAttackRange() { return 300; }
        @Override public int fireShot() { return 50; }
        @Override public int healAlly() { return 25; }
    }

    static abstract class AbstractLabDevice {
        private final String inventoryCode;
        AbstractLabDevice(String c) { inventoryCode = c; }
        public abstract void performMeasurement();
    }
    interface Calibratable { void calibrate(double referenceValue); }
    interface SelfDiagnostic { boolean runSelfCheck(); }
    static class ElectronicScale extends AbstractLabDevice implements Calibratable, SelfDiagnostic {
        ElectronicScale(String c) { super(c); }
        @Override public void performMeasurement() { System.out.println("Scale measuring mass..."); }
        @Override public void calibrate(double v) { System.out.println("  calibrated to " + v); }
        @Override public boolean runSelfCheck() { return true; }
    }
    static class GlassThermometer extends AbstractLabDevice {
        GlassThermometer(String c) { super(c); }
        @Override public void performMeasurement() { System.out.println("Thermometer measuring temperature..."); }
    }

    interface TextProcessor { String process(String text); }
    interface ReversibleProcessor extends TextProcessor { String reverseProcess(String text); }
    static class CaesarCipherProcessor implements ReversibleProcessor {
        private final int k;
        CaesarCipherProcessor(int k) { this.k = k; }
        @Override public String process(String text) { return shift(text, k); }
        @Override public String reverseProcess(String text) { return shift(text, -k); }
        private String shift(String s, int k) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) sb.append((char)(c + k));
            return sb.toString();
        }
    }
    static class WhitespaceTrimmerProcessor implements TextProcessor {
        @Override public String process(String text) { return text == null ? null : text.trim().replaceAll("\\s+", " "); }
    }

    interface Rechargeable { void chargeToFull(); }
    static class Laptop implements Rechargeable { @Override public void chargeToFull() {} }
    static class ElectricScooter implements Rechargeable { @Override public void chargeToFull() {} }
    static class SmartWatch implements Rechargeable { @Override public void chargeToFull() {} }
    static class DesktopMonitor {}
    static class WiredPrinter {}

    static abstract class AbstractWorker {
        protected final String name;
        protected final double salary;
        AbstractWorker(String n, double s) { name = n; salary = s; }
        public double getSalary() { return salary; }
    }
    interface BonusEligible { double calculateQuarterBonus(); }
    interface MedicalInsured { double getInsuranceCoverage(); }
    static class FullTimeDeveloper extends AbstractWorker implements BonusEligible, MedicalInsured {
        FullTimeDeveloper(String n, double s) { super(n, s); }
        @Override public double calculateQuarterBonus() { return salary * 0.25; }
        @Override public double getInsuranceCoverage() { return 50000; }
    }
    static class FopContractor extends AbstractWorker implements BonusEligible {
        FopContractor(String n, double s) { super(n, s); }
        @Override public double calculateQuarterBonus() { return salary * 0.10; }
    }
    static class InternStudent extends AbstractWorker {
        InternStudent(String n, double s) { super(n, s); }
    }

    static abstract class ShipModule {
        private final String name;
        private final boolean damaged;
        ShipModule(String n, boolean d) { name = n; damaged = d; }
        public String getName() { return name; }
        public boolean isDamaged() { return damaged; }
    }
    static class ShieldGenerator extends ShipModule {
        private int shieldsMj = 0;
        ShieldGenerator(String n, boolean d) { super(n, d); }
        public void rechargeShields(int megajoules) { shieldsMj += megajoules; System.out.println("  shields -> " + shieldsMj + " MJ"); }
    }
    static class WarpDrive extends ShipModule {
        WarpDrive(String n, boolean d) { super(n, d); }
        public boolean checkAntimatterContainment() { return true; }
    }
    static class LifeSupportModule extends ShipModule {
        private final double oxygenPercent;
        LifeSupportModule(String n, boolean d, double o) { super(n, d); oxygenPercent = o; }
        public double getOxygenPercent() { return oxygenPercent; }
    }

    static abstract class MediaItem {
        protected final String title;
        protected final double sizeMb;
        MediaItem(String t, double s) { title = t; sizeMb = s; }
        public String getTitle() { return title; }
        public double getSizeMb() { return sizeMb; }
    }
    static class VideoFile extends MediaItem {
        private final int resolutionHeight;
        private final int durationSec;
        VideoFile(String t, double s, int h, int d) { super(t, s); resolutionHeight = h; durationSec = d; }
        public boolean is4K() { return resolutionHeight >= 2160; }
    }
    static class AudioFile extends MediaItem {
        private final int bitrateKbps;
        AudioFile(String t, double s, int b) { super(t, s); bitrateKbps = b; }
        public boolean isLossless() { return bitrateKbps >= 1000; }
    }
    static class EBookFile extends MediaItem {
        private final int pageCount;
        EBookFile(String t, double s, int p) { super(t, s); pageCount = p; }
    }

    static abstract class AbstractCustomer {
        public abstract double getDiscountPercent();
    }
    static class VipCustomer extends AbstractCustomer { @Override public double getDiscountPercent() { return 20; } }
    static class StudentCustomer extends AbstractCustomer { @Override public double getDiscountPercent() { return 10; } }

    static class Matrix2x2 {
        protected final double a11, a12, a21, a22;
        Matrix2x2(double a11, double a12, double a21, double a22) { this.a11 = a11; this.a12 = a12; this.a21 = a21; this.a22 = a22; }
        public double determinant() { return a11 * a22 - a12 * a21; }
    }
    interface InvertibleMatrix { Matrix2x2 inverse(); }
    interface OrthogonalMatrix { boolean checkOrthogonality(); }
    static class RotationMatrix2x2 extends Matrix2x2 implements InvertibleMatrix, OrthogonalMatrix {
        RotationMatrix2x2(double angle) { super(Math.cos(angle), -Math.sin(angle), Math.sin(angle), Math.cos(angle)); }
        @Override public Matrix2x2 inverse() { return new Matrix2x2(a22, -a12, -a21, a11); }
        @Override public boolean checkOrthogonality() { return true; }
    }
    static class SingularMatrix2x2 extends Matrix2x2 {
        SingularMatrix2x2(double a11, double a12, double a21, double a22) { super(a11, a12, a21, a22); }
    }

    interface HazardousCargo { int getHazardClass(); }
    interface RefrigeratedCargo { double getRequiredTempC(); }
    static class Electronics {}
    static class Chemical implements HazardousCargo {
        @Override public int getHazardClass() { return 3; }
    }
    static class FrozenFood implements RefrigeratedCargo {
        @Override public double getRequiredTempC() { return -18.0; }
    }
    static class CargoContainer {
        private final String id;
        private final Object cargo;
        CargoContainer(String id, Object c) { this.id = id; cargo = c; }
        public String getId() { return id; }
        public Object getCargo() { return cargo; }
    }

    static class FinalCalibrationTable {
        public static final double GRAVITY_G = 9.80665;
        private final String sensorSerial;
        private final double[] coefficients;
        FinalCalibrationTable(String s, double[] c) {
            sensorSerial = s;
            coefficients = Arrays.copyOf(c, c.length);
        }
        public String getSensorSerial() { return sensorSerial; }
        public double[] getCoefficients() { return Arrays.copyOf(coefficients, coefficients.length); }
    }

    static abstract class AbstractSecurityProtocol {
        protected abstract boolean authenticateUser(String token);
        protected abstract String executePayload(String command);
        public final String runSecureCommand(String token, String command) {
            if (token == null || !authenticateUser(token)) return "403 FORBIDDEN";
            return "[AUDITED] " + executePayload(command);
        }
    }
    static class JwtSecurityProtocol extends AbstractSecurityProtocol {
        @Override protected boolean authenticateUser(String t) { return "valid-jwt".equals(t); }
        @Override protected String executePayload(String c) { return "JWT-executed: " + c; }
    }
    static class ApiKeySecurityProtocol extends AbstractSecurityProtocol {
        @Override protected boolean authenticateUser(String t) { return t != null && t.startsWith("api-key-"); }
        @Override protected String executePayload(String c) { return "API-executed: " + c; }
    }

    interface MetricSpaceElement {
        double distanceTo(MetricSpaceElement other);
        double getNorm();
    }
    static final class ImmutableVector3D implements MetricSpaceElement {
        private final double x, y, z;
        ImmutableVector3D(double x, double y, double z) { this.x = x; this.y = y; this.z = z; }
        @Override public double getNorm() { return Math.sqrt(x*x + y*y + z*z); }
        @Override public double distanceTo(MetricSpaceElement other) {
            if (!(other instanceof ImmutableVector3D v)) return Double.NaN;
            return Math.sqrt(Math.pow(x - v.x, 2) + Math.pow(y - v.y, 2) + Math.pow(z - v.z, 2));
        }
    }

    interface PrintableDocument { String formatForPrinter(); }
    static final class FiscalReceipt implements PrintableDocument {
        private final String fiscalNumber;
        private final double totalAmount;
        private final double vatAmount;
        FiscalReceipt(String f, double total) {
            fiscalNumber = f;
            totalAmount = total;
            vatAmount = total * 0.20;
        }
        @Override public String formatForPrinter() {
            return String.format("FISCAL[%s] total=%.2f грн, VAT(20%%)=%.2f грн", fiscalNumber, totalAmount, vatAmount);
        }
    }
    static class WarehouseReport implements PrintableDocument {
        private final String reportId;
        private final String goods;
        WarehouseReport(String r, String g) { reportId = r; goods = g; }
        @Override public String formatForPrinter() { return "WAREHOUSE[" + reportId + "] " + goods; }
    }

    interface PowerProducer { double produceMw(); }
    interface WeatherDependent { void updateWeatherCondition(double factor); }
    static abstract class AbstractPowerStation implements PowerProducer {
        private final String stationId;
        private final double baseOutputMw;
        AbstractPowerStation(String id, double base) { stationId = id; baseOutputMw = base; }
        public String getStationId() { return stationId; }
        protected double getBaseOutputMw() { return baseOutputMw; }
        public final double getNetOutputMw() { return produceMw() * 0.95; }
    }
    static class NuclearStation extends AbstractPowerStation {
        NuclearStation(String id, double base) { super(id, base); }
        @Override public double produceMw() { return getBaseOutputMw(); }
    }
    static class SolarFarmStation extends AbstractPowerStation implements WeatherDependent {
        private double weatherFactor = 1.0;
        SolarFarmStation(String id, double base) { super(id, base); }
        @Override public void updateWeatherCondition(double f) { weatherFactor = f; }
        @Override public double produceMw() { return getBaseOutputMw() * weatherFactor; }
    }
    static class HydroDamStation extends AbstractPowerStation implements WeatherDependent {
        private double weatherFactor = 1.0;
        HydroDamStation(String id, double base) { super(id, base); }
        @Override public void updateWeatherCondition(double f) { weatherFactor = f; }
        @Override public double produceMw() { return getBaseOutputMw() * weatherFactor; }
    }

    interface Integrable1D {
        double evaluate(double x);
        default double integrateTrapezoid(double a, double b, int n) {
            double h = (b - a) / n;
            double sum = (evaluate(a) + evaluate(b)) / 2.0;
            for (int i = 1; i < n; i++) sum += evaluate(a + i * h);
            return sum * h;
        }
    }
    interface RootFindable { double findRootBisection(double left, double right, double eps); }
    static abstract class AbstractAnalyticFunction implements Integrable1D {}
    static class CubicFunction extends AbstractAnalyticFunction implements RootFindable {
        @Override public double evaluate(double x) { return x*x*x - 2*x - 5; }
        @Override public double findRootBisection(double left, double right, double eps) {
            double lo = left, hi = right;
            if (evaluate(lo) * evaluate(hi) > 0) return Double.NaN;
            while (hi - lo > eps) {
                double mid = (lo + hi) / 2.0;
                if (evaluate(lo) * evaluate(mid) <= 0) hi = mid;
                else lo = mid;
            }
            return (lo + hi) / 2.0;
        }
    }

    static abstract class AbstractCombatUnit {
        private final String name;
        protected int hp;
        AbstractCombatUnit(String n, int h) { name = n; hp = h; }
        public String getName() { return name; }
        public int getHp() { return hp; }
        public void setHp(int h) { hp = h; }
        public final boolean isAlive() { return hp > 0; }
        public abstract int calculateDamage();
    }
    interface CriticalStriker { double getCritMultiplier(); }
    interface SelfRegenerating { int regenerateHp(); }
    interface ShieldBearer { int absorbDamage(int incoming); }
    static class BerserkerAssasin extends AbstractCombatUnit implements CriticalStriker {
        BerserkerAssasin(String n, int h) { super(n, h); }
        @Override public int calculateDamage() { return 30; }
        @Override public double getCritMultiplier() { return 2.5; }
    }
    static class TrollWarlord extends AbstractCombatUnit implements CriticalStriker, SelfRegenerating {
        TrollWarlord(String n, int h) { super(n, h); }
        @Override public int calculateDamage() { return 25; }
        @Override public double getCritMultiplier() { return 1.8; }
        @Override public int regenerateHp() { return 15; }
    }
    static class RoyalPaladin extends AbstractCombatUnit implements ShieldBearer, SelfRegenerating {
        RoyalPaladin(String n, int h) { super(n, h); }
        @Override public int calculateDamage() { return 20; }
        @Override public int absorbDamage(int incoming) { return Math.max(0, incoming - 10); }
        @Override public int regenerateHp() { return 8; }
    }
}