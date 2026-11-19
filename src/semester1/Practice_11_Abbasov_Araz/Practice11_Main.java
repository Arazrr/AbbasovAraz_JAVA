package semester1.Practice_11_Abbasov_Araz;

import java.util.*;

public class Practice11_Main {

    public static void main(String[] args) {
        System.out.println("========== Завдання 1 ==========");
        demonstrateWrapperTwins();

        System.out.println("\n========== Завдання 2 ==========");
        showCompilerUnderTheHood();

        System.out.println("\n========== Завдання 3 ==========");
        String[] inputs = {"120", "-45", "300", "abc", "1024", ""};
        List<Integer> parsedNumbers = parseNumbersFromStrings(inputs);
        System.out.println("Список розпізнаних чисел: " + parsedNumbers);

        System.out.println("\n========== Завдання 4 ==========");
        showLimits();
        findMinAndMax(new ArrayList<>(List.of(14, -7, 52, 3, -30, 99, 0)));
        demonstrateOverflow();

        System.out.println("\n========== Завдання 5 ==========");
        testIntegerPool();

        System.out.println("\n========== Завдання 6 ==========");
        demonstrateNullUnboxing();

        System.out.println("\n========== Завдання 7 ==========");
        List<Integer> digits = extractDigitsFromText("Server-04: CPU 85%, RAM 16GB");
        System.out.println("Знайдені цифри: " + digits);
        demonstrateDoubleMethods();

        System.out.println("\n========== Завдання 8 ==========");
        convertNumberSystems(42);
        System.out.println("\"101010\" у десятковій системі: " + Integer.parseInt("101010", 2));
        System.out.println("\"FF\" у десятковій системі: " + Integer.parseInt("FF", 16));

        System.out.println("\n========== Завдання 9 ==========");
        compareArrayAndArrayList();

        System.out.println("\n========== Завдання 10 ==========");
        List<Integer> capacities = traceArrayListCapacity(100);
        System.out.println("Послідовність ємностей: " + capacities);

        System.out.println("\n========== Завдання 11 ==========");
        Object[] oldData = new Object[10];
        for (int i = 0; i < oldData.length; i++) {
            oldData[i] = i + 1;
        }
        System.out.println("Старий масив: " + Arrays.toString(oldData));
        Object[] newData = growArrayManually(oldData);
        System.out.println("Новий масив: " + Arrays.toString(newData));
        insertWithArraycopy(newData, 11, 2, 99);

        System.out.println("\n========== Завдання 12 ==========");
        buildPipeline();

        System.out.println("\n========== Завдання 13 ==========");
        checkSpeeds();

        System.out.println("\n========== Завдання 14 ==========");
        SimpleArrayList simpleList = new SimpleArrayList();
        System.out.println("На початку: size = " + simpleList.size() + ", capacity = " + simpleList.getCapacity());
        for (int i = 1; i <= 12; i++) {
            simpleList.add(i * 10);
        }
        System.out.println("Після додавання 12 елементів: size = " + simpleList.size()
                + ", capacity = " + simpleList.getCapacity());
        System.out.println("Елемент з індексом 11: " + simpleList.get(11));

        System.out.println("\n========== Завдання 15 ==========");
        manageInitialCapacity();

        System.out.println("\n========== Завдання 16 ==========");
        ArrayList<Integer> scores = new ArrayList<>(List.of(45, 88, 92, 59, 74, 100, 38, 65));
        ArrayList<Integer> passedScores = extractPassedScores(scores, 60);
        System.out.println("Початковий розмір списку: " + scores.size());
        System.out.println("Відраховано студентів: " + (scores.size() - passedScores.size()));
        System.out.println("Список зарахованих: " + passedScores);

        System.out.println("\n========== Завдання 17 ==========");
        compareRemoveMethods();

        System.out.println("\n========== Завдання 18 ==========");
        searchInLanguages();

        System.out.println("\n========== Завдання 19 ==========");
        manageCart();

        System.out.println("\n========== Завдання 20 ==========");
        convertListToArray();

        System.out.println("\n========== Завдання 21 ==========");
        manageTaskList();

        System.out.println("\n========== Завдання 22 ==========");
        ArrayList<Integer> repeatedNumbers = new ArrayList<>(List.of(5, 12, 5, 8, 12, 20, 5));
        ArrayList<String> repeatedWords = new ArrayList<>(List.of("кіт", "пес", "кіт", "миша", "пес"));
        System.out.println("Числа без дублікатів: " + deduplicate(repeatedNumbers));
        System.out.println("Слова без дублікатів: " + deduplicate(repeatedWords));

        System.out.println("\n========== Завдання 23 ==========");
        ArrayList<String> listA = new ArrayList<>(List.of("Олена", "Іван", "Марія", "Петро", "Софія"));
        ArrayList<String> listB = new ArrayList<>(List.of("Іван", "Софія", "Андрій", "Марія"));
        System.out.println("Склали Java: " + listA);
        System.out.println("Склали Бази даних: " + listB);
        System.out.println("Склали обидва іспити: " + findStudentsPassedBoth(listA, listB));
        System.out.println("Склали лише Java: " + findStudentsPassedOnlyFirst(listA, listB));

        System.out.println("\n========== Завдання 24 ==========");
        ArrayList<String> colors = new ArrayList<>(List.of("червоний", "синій", "червоний", "зелений", "червоний"));
        System.out.println("До заміни: " + colors);
        int replacedCount = replaceAllValues(colors, "червоний", "жовтий");
        System.out.println("Після заміни: " + colors);
        System.out.println("Виконано замін: " + replacedCount);

        System.out.println("\n========== Завдання 25 ==========");
        demonstrateTypeInference();

        System.out.println("\n========== Завдання 26 ==========");
        demonstrateVarDiamondDanger();

        System.out.println("\n========== Завдання 27 ==========");
        exploreCollectionHierarchy();

        System.out.println("\n========== Завдання 28 ==========");
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Vector<String> vector = new Vector<>();
        Stack<String> stack = new Stack<>();
        String[] letters = {"А", "Б", "В", "Г"};
        for (String letter : letters) {
            arrayList.add(letter);
            linkedList.add(letter);
            vector.add(letter);
            stack.push(letter);
        }
        testHierarchyMethods("ArrayList", arrayList);
        testHierarchyMethods("LinkedList", linkedList);
        testHierarchyMethods("Vector", vector);
        testHierarchyMethods("Stack", stack);

        System.out.println("\n========== Завдання 29 ==========");
        demonstrateListBranch();

        System.out.println("\n========== Завдання 30 ==========");
        iterateModules();

        System.out.println("\n========== Завдання 31 ==========");
        demonstrateConcurrentModification();

        System.out.println("\n========== Завдання 32 ==========");
        filterLogs();

        System.out.println("\n========== Завдання 33 ==========");
        List<Integer> source = new ArrayList<>(List.of(7, 12, 3, 20, 15, 8, 41, 6));
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        splitEvenAndOdd(source, evens, odds);
        System.out.println("Парні: " + evens + ", розмір: " + evens.size() + ", максимум: " + findMax(evens));
        System.out.println("Непарні: " + odds + ", розмір: " + odds.size() + ", максимум: " + findMax(odds));

        System.out.println("\n========== Завдання 34 ==========");
        List<Integer> rangeList = new ArrayList<>(List.of(5, 18, 23, 7, 30, 12, 45, 16, 2, 28));
        System.out.println("До видалення: " + rangeList);
        int removedCount = removeInRange(rangeList, 10, 30);
        System.out.println("Після видалення діапазону [10; 30]: " + rangeList);
        System.out.println("Видалено елементів: " + removedCount);

        System.out.println("\n========== Завдання 35 ==========");
        ArrayList<String> reverseList = new ArrayList<>(List.of("один", "два", "три", "чотири", "п'ять"));
        System.out.println("До розвороту: " + reverseList);
        reverseInPlace(reverseList);
        System.out.println("Після розвороту: " + reverseList);

        System.out.println("\n========== Завдання 36 ==========");
        List<String> firstList = new ArrayList<>(List.of("яблуко", "груша", "слива"));
        List<String> secondList = new ArrayList<>(List.of("груша", "вишня", "яблуко", "абрикос"));
        String[] mergedArray = mergeUniqueToArray(firstList, secondList);
        System.out.println("Результат злиття: " + Arrays.toString(mergedArray));

        System.out.println("\n========== Завдання 37 ==========");
        ArrayList<Integer> rotateList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("До зсуву: " + rotateList);
        rotateRight(rotateList, 2);
        System.out.println("Після зсуву праворуч на 2: " + rotateList);

        System.out.println("\n========== Завдання 38 ==========");
        List<String> receiptLines = List.of("Хліб: 35", "Молоко: 48", "Помилка сканера: N/A", "Кава: 240", "Пакет: 5", "Сир: 185");
        analyzeReceipt(receiptLines);

        System.out.println("\n========== Завдання 39 ==========");
        compareListSpeed();

        System.out.println("\n========== Завдання 40 ==========");
        showFinalSteps();
    }

    public static void demonstrateWrapperTwins() {
        Byte byteObject = Byte.valueOf((byte) 10);
        Short shortObject = Short.valueOf((short) 500);
        Integer intObject = Integer.valueOf(42);
        Long longObject = Long.valueOf(100L);
        Float floatObject = Float.valueOf(3.14f);
        Double doubleObject = Double.valueOf(2.718);
        Character charObject = Character.valueOf('A');
        Boolean booleanObject = Boolean.valueOf(true);

        System.out.println(byteObject + " -> " + byteObject.getClass().getSimpleName());
        System.out.println(shortObject + " -> " + shortObject.getClass().getSimpleName());
        System.out.println(intObject + " -> " + intObject.getClass().getSimpleName());
        System.out.println(longObject + " -> " + longObject.getClass().getSimpleName());
        System.out.println(floatObject + " -> " + floatObject.getClass().getSimpleName());
        System.out.println(doubleObject + " -> " + doubleObject.getClass().getSimpleName());
        System.out.println(charObject + " -> " + charObject.getClass().getSimpleName());
        System.out.println(booleanObject + " -> " + booleanObject.getClass().getSimpleName());

        System.out.println("ArrayList<int> не компілюється, бо колекції зберігають лише посилальні типи");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList<Integer> успішно зберігає цілі числа як об'єкти: " + numbers);
    }

    public static void showCompilerUnderTheHood() {
        System.out.println("--- Неявний запис (Autoboxing / Unboxing) ---");
        ArrayList<Integer> list = new ArrayList<>();
        int a = 42;
        Integer boxed = a;
        list.add(100);
        int unboxed = list.get(0);
        System.out.println("boxed = " + boxed + ", unboxed = " + unboxed);

        System.out.println("--- Явний код компілятора ---");
        ArrayList<Integer> explicitList = new ArrayList<>();
        int b = 42;
        Integer explicitBoxed = Integer.valueOf(b);
        explicitList.add(Integer.valueOf(100));
        int explicitUnboxed = explicitList.get(0).intValue();
        System.out.println("explicitBoxed = " + explicitBoxed + ", explicitUnboxed = " + explicitUnboxed);

        System.out.println("--- Double ---");
        Double doubleBoxed = Double.valueOf(3.14);
        double doubleUnboxed = doubleBoxed.doubleValue();
        System.out.println("Пакування: " + doubleBoxed + ", розпакування: " + doubleUnboxed);

        System.out.println("--- Boolean ---");
        Boolean booleanBoxed = Boolean.valueOf(true);
        boolean booleanUnboxed = booleanBoxed.booleanValue();
        System.out.println("Пакування: " + booleanBoxed + ", розпакування: " + booleanUnboxed);
    }

    public static List<Integer> parseNumbersFromStrings(String[] inputs) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        for (String text : inputs) {
            try {
                int primitiveNumber = Integer.parseInt(text);
                sum += primitiveNumber;
                Integer objectNumber = Integer.valueOf(text);
                result.add(objectNumber);
            } catch (NumberFormatException e) {
                System.out.println("Попередження: рядок \"" + text + "\" не є числом");
            }
        }
        System.out.println("Загальна сума коректних чисел: " + sum);
        return result;
    }

    public static void showLimits() {
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
    }

    public static void findMinAndMax(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Список: " + numbers);
        System.out.println("Найменше число: " + min);
        System.out.println("Найбільше число: " + max);
    }

    public static void demonstrateOverflow() {
        int biggest = Integer.MAX_VALUE;
        int overflowed = biggest + 1;
        System.out.println("Integer.MAX_VALUE + 1 = " + overflowed);
        System.out.println("Чи дорівнює Integer.MIN_VALUE: " + (overflowed == Integer.MIN_VALUE));
        int toAdd = 5;
        if (biggest > Integer.MAX_VALUE - toAdd) {
            System.out.println("Додавати " + toAdd + " небезпечно: станеться переповнення");
        } else {
            System.out.println("Результат додавання: " + (biggest + toAdd));
        }
    }

    public static void testIntegerPool() {
        Integer a = 100;
        Integer b = 100;
        System.out.println("a == b (100 і 100): " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));

        Integer x = 250;
        Integer y = 250;
        System.out.println("x == y (250 і 250): " + (x == y));
        System.out.println("x.equals(y): " + x.equals(y));

        System.out.println("Число 100 лежить у межах кешу [-128; 127], тому обидві змінні вказують на один об'єкт");
        System.out.println("Число 250 поза межами кешу, тому створюються два різні об'єкти, а == порівнює посилання");
        System.out.println("Метод equals() порівнює значення, тому повертає true");
    }

    public static void demonstrateNullUnboxing() {
        ArrayList<Integer> temperatures = new ArrayList<>();
        temperatures.add(18);
        temperatures.add(22);
        temperatures.add(null);
        temperatures.add(15);
        temperatures.add(null);
        temperatures.add(20);
        System.out.println("Температури: " + temperatures);

        try {
            int t = temperatures.get(2);
            System.out.println("Температура: " + t);
        } catch (NullPointerException e) {
            System.out.println("Помилка NullPointerException: компілятор викликає null.intValue()");
        }

        System.out.println("Сума без null: " + sumIgnoringNulls(temperatures));
    }

    public static int sumIgnoringNulls(List<Integer> list) {
        int sum = 0;
        for (Integer element : list) {
            if (element != null) {
                sum += element;
            }
        }
        return sum;
    }

    public static List<Integer> extractDigitsFromText(String text) {
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)) {
                digits.add(Character.getNumericValue(symbol));
            }
        }
        return digits;
    }

    public static void demonstrateDoubleMethods() {
        double temperature = Double.parseDouble("36.6");
        Double price = Double.valueOf("99.95");
        System.out.println("Double.parseDouble(\"36.6\") = " + temperature);
        System.out.println("Double.valueOf(\"99.95\") = " + price);

        double zero = 0.0;
        double notNumber = zero / zero;
        double infinity = 1.0 / zero;
        System.out.println("0.0 / 0.0 це NaN: " + Double.isNaN(notNumber));
        System.out.println("1.0 / 0.0 це нескінченність: " + Double.isInfinite(infinity));
        System.out.println("36.6 це NaN: " + Double.isNaN(temperature));
        System.out.println("36.6 це нескінченність: " + Double.isInfinite(temperature));
    }

    public static void convertNumberSystems(int number) {
        System.out.println("Число: " + number);
        System.out.println("Двійкова система: " + Integer.toBinaryString(number));
        System.out.println("Вісімкова система: " + Integer.toOctalString(number));
        System.out.println("Шістнадцяткова система: " + Integer.toHexString(number));
    }

    public static void compareArrayAndArrayList() {
        String[] fixedArray = new String[3];
        fixedArray[0] = "Київ";
        fixedArray[1] = "Львів";
        fixedArray[2] = "Одеса";
        try {
            fixedArray[3] = "Харків";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Масив не можна збільшити: ArrayIndexOutOfBoundsException");
        }

        ArrayList<String> dynamicList = new ArrayList<>();
        dynamicList.add("Київ");
        dynamicList.add("Львів");
        dynamicList.add("Одеса");
        dynamicList.add("Харків");
        dynamicList.add("Дніпро");
        dynamicList.add(1, "Полтава");
        dynamicList.remove(0);

        System.out.println("Звичайний масив: " + Arrays.toString(fixedArray));
        System.out.println("ArrayList: " + dynamicList);
    }

    public static List<Integer> traceArrayListCapacity(int elementsCount) {
        List<Integer> capacities = new ArrayList<>();
        int capacity = 0;
        for (int size = 1; size <= elementsCount; size++) {
            if (size == 1) {
                capacity = 10;
                capacities.add(capacity);
                System.out.println("Елемент №1: створено масив ємністю " + capacity);
            } else if (size > capacity) {
                int newCapacity = capacity + (capacity >> 1);
                System.out.println("Елемент №" + size + ": розширення " + capacity + " -> " + newCapacity);
                capacity = newCapacity;
                capacities.add(capacity);
            }
        }
        return capacities;
    }

    public static Object[] growArrayManually(Object[] oldData) {
        int newLength = oldData.length + oldData.length / 2;
        Object[] newData = new Object[newLength];
        System.arraycopy(oldData, 0, newData, 0, oldData.length);
        newData[oldData.length] = oldData.length + 1;
        System.out.println("Нова довжина масиву: " + newLength);
        return newData;
    }

    public static void insertWithArraycopy(Object[] data, int size, int index, Object value) {
        System.out.println("До вставки: " + Arrays.toString(data));
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = value;
        System.out.println("Після вставки на індекс " + index + ": " + Arrays.toString(data));
    }

    public static void buildPipeline() {
        ArrayList<String> pipeline = new ArrayList<>();
        pipeline.add("Compile");
        pipeline.add("Package");
        pipeline.add("Deploy");
        System.out.println(pipeline + ", size = " + pipeline.size());

        pipeline.add(0, "Checkout Git");
        System.out.println(pipeline + ", size = " + pipeline.size());

        pipeline.add(2, "Run Unit Tests");
        System.out.println(pipeline + ", size = " + pipeline.size());
    }

    public static void checkSpeeds() {
        ArrayList<Integer> speeds = new ArrayList<>(List.of(60, 85, 110, 95, 130));
        System.out.println("Перший елемент: " + speeds.get(0));
        System.out.println("Центральний елемент: " + speeds.get(speeds.size() / 2));
        System.out.println("Останній елемент: " + speeds.get(speeds.size() - 1));

        for (int i = 0; i < speeds.size(); i++) {
            if (speeds.get(i) > 100) {
                Integer oldSpeed = speeds.set(i, 100);
                System.out.println("Швидкість " + oldSpeed + " обмежено до 100");
            }
        }
        System.out.println("Список після обмеження: " + speeds);
    }

    public static class SimpleArrayList {
        private Object[] data = new Object[10];
        private int size = 0;

        public void add(Object element) {
            if (size == data.length) {
                int newCapacity = data.length + data.length / 2;
                Object[] newData = new Object[newCapacity];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            data[size] = element;
            size++;
        }

        public Object get(int index) {
            return data[index];
        }

        public int size() {
            return size;
        }

        public int getCapacity() {
            return data.length;
        }
    }

    public static void manageInitialCapacity() {
        ArrayList<String> logs = new ArrayList<>(500);
        System.out.println("Створено список з ємністю 500: розширення не знадобиться, доки елементів не більше 500");
        System.out.println("Через це не буде зайвих викликів System.arraycopy");
        logs.add("Початок роботи");
        logs.add("Завантаження даних");
        logs.ensureCapacity(1000);
        System.out.println("ensureCapacity(1000): місце під 1000 елементів гарантовано, size = " + logs.size());
        logs.trimToSize();
        System.out.println("trimToSize(): зайвий хвіст масиву обрізано до size = " + logs.size());
    }

    public static ArrayList<Integer> extractPassedScores(List<Integer> allScores, int minPassScore) {
        ArrayList<Integer> passed = new ArrayList<>();
        for (int i = 0; i < allScores.size(); i++) {
            if (allScores.get(i) >= minPassScore) {
                passed.add(allScores.get(i));
            }
        }
        return passed;
    }

    public static void compareRemoveMethods() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 1, 40, 2));
        System.out.println("Початковий список: " + numbers);

        numbers.remove(1);
        System.out.println("Після remove(1): " + numbers);
        System.out.println("Зникло число 20, бо воно стояло під індексом 1, а число 1 залишилось");

        numbers.remove(Integer.valueOf(1));
        numbers.remove(Integer.valueOf(2));
        System.out.println("Після remove(Integer.valueOf(1)) та remove(Integer.valueOf(2)): " + numbers);
    }

    public static void searchInLanguages() {
        ArrayList<String> langs = new ArrayList<>(List.of("Java", "Python", "C++", "Java", "Kotlin", "Java"));
        System.out.println("Список: " + langs);
        System.out.println("Є Kotlin: " + langs.contains("Kotlin"));
        System.out.println("Є Rust: " + langs.contains("Rust"));
        System.out.println("Перше входження Java: " + langs.indexOf("Java"));
        System.out.println("Останнє входження Java: " + langs.lastIndexOf("Java"));
        System.out.println("Кількість Java у списку: " + countOccurrences(langs, "Java"));
    }

    public static int countOccurrences(List<String> list, String target) {
        int count = 0;
        for (String element : list) {
            if (element.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static void manageCart() {
        ArrayList<String> cart = new ArrayList<>();
        System.out.println("Кошик порожній: " + cart.isEmpty() + ", size = " + cart.size());

        cart.add("Ноутбук");
        cart.add("Миша");
        cart.add("Клавіатура");
        cart.add("Навушники");
        System.out.println("Кошик порожній: " + cart.isEmpty() + ", size = " + cart.size());

        cart.clear();
        System.out.println("Після clear() кошик порожній: " + cart.isEmpty() + ", size = " + cart.size());
        System.out.println("Всередині ArrayList усі комірки масиву Object[] стали null, а лічильник size дорівнює 0");
    }

    public static void convertListToArray() {
        ArrayList<String> cities = new ArrayList<>(List.of("Київ", "Львів", "Одеса", "Харків", "Дніпро"));

        Object[] objArray = cities.toArray();
        System.out.println("Масив об'єктів: " + Arrays.toString(objArray));

        String[] strArray = cities.toArray(new String[0]);
        System.out.println("Масив рядків: " + Arrays.toString(strArray));

        ArrayList<String> backToList = new ArrayList<>(Arrays.asList(strArray));
        System.out.println("Зворотне перетворення в ArrayList: " + backToList);
    }

    public static void manageTaskList() {
        ArrayList<String> tasks = new ArrayList<>();
        System.out.println("Список задач порожній: " + tasks.isEmpty());

        tasks.add("Написати звіт");
        tasks.add("Перевірити пошту");
        tasks.add("Підготувати презентацію");
        tasks.add("Оновити сайт");
        tasks.add("Зробити резервну копію");
        tasks.add(0, "Терміново: зателефонувати клієнту");
        System.out.println("Список задач: " + tasks);

        System.out.println("Задача з індексом 1: " + tasks.get(1));
        tasks.set(1, "Написати фінальний звіт");
        System.out.println("Після оновлення: " + tasks);

        System.out.println("Є задача \"Оновити сайт\": " + tasks.contains("Оновити сайт"));

        tasks.remove("Перевірити пошту");
        String doneTask = tasks.remove(0);
        System.out.println("Виконано за номером: " + doneTask);
        System.out.println("Список після видалення: " + tasks);

        System.out.println("Кількість задач: " + tasks.size());
        Object[] tasksArray = tasks.toArray();
        System.out.println("Експорт у масив: " + Arrays.toString(tasksArray));

        tasks.clear();
        System.out.println("Після clear() список порожній: " + tasks.isEmpty());
    }

    public static <T> ArrayList<T> deduplicate(List<T> source) {
        ArrayList<T> unique = new ArrayList<>();
        for (T item : source) {
            if (!unique.contains(item)) {
                unique.add(item);
            }
        }
        return unique;
    }

    public static ArrayList<String> findStudentsPassedBoth(List<String> first, List<String> second) {
        ArrayList<String> both = new ArrayList<>();
        for (String student : first) {
            if (second.contains(student)) {
                both.add(student);
            }
        }
        return both;
    }

    public static ArrayList<String> findStudentsPassedOnlyFirst(List<String> first, List<String> second) {
        ArrayList<String> onlyFirst = new ArrayList<>(first);
        onlyFirst.removeAll(second);
        return onlyFirst;
    }

    public static int replaceAllValues(List<String> list, String oldValue, String newValue) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), oldValue)) {
                list.set(i, newValue);
                count++;
            }
        }
        return count;
    }

    public static void demonstrateTypeInference() {
        List<Integer> list1 = new ArrayList<>();
        var list2 = new ArrayList<Integer>();
        var names = new ArrayList<String>(List.of("Анна", "Богдан"));

        list1.add(1);
        list1.add(2);
        list2.add(10);
        list2.add(20);
        names.add("Вікторія");

        System.out.println("list1 (ромбовидний оператор): " + list1);
        System.out.println("list2 (var): " + list2);
        System.out.println("names (var): " + names);
        System.out.println("Компілятор дозволяє додавати в list1 і list2 лише Integer, а в names лише String");
    }

    public static void demonstrateVarDiamondDanger() {
        var unsafeList = new ArrayList<>();
        unsafeList.add(42);
        unsafeList.add("Java");
        unsafeList.add(true);
        System.out.println("Небезпечний список: " + unsafeList);

        try {
            for (Object element : unsafeList) {
                Integer number = (Integer) element;
                System.out.println("Прочитано число: " + number);
            }
        } catch (ClassCastException e) {
            System.out.println("Помилка ClassCastException: у списку лежать різні типи, а не лише Integer");
        }

        var safeList = new ArrayList<Integer>();
        safeList.add(42);
        safeList.add(100);
        System.out.println("Безпечний список: " + safeList);
    }

    public static void exploreCollectionHierarchy() {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Vector<String> vector = new Vector<>();
        Stack<String> stack = new Stack<>();
        HashSet<String> hashSet = new HashSet<>();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        checkHierarchy("ArrayList", arrayList);
        checkHierarchy("LinkedList", linkedList);
        checkHierarchy("Vector", vector);
        checkHierarchy("Stack", stack);
        checkHierarchy("HashSet", hashSet);
        checkHierarchy("ArrayDeque", arrayDeque);
    }

    public static void checkHierarchy(String name, Object object) {
        System.out.println(name + ":");
        System.out.println("  List: " + (object instanceof List));
        System.out.println("  Set: " + (object instanceof Set));
        System.out.println("  Queue: " + (object instanceof Queue));
        System.out.println("  Collection: " + (object instanceof Collection));
        System.out.println("  Iterable: " + (object instanceof Iterable));
    }

    public static <E> void printElements(Iterable<E> iterable) {
        Iterator<E> iterator = iterable.iterator();
        System.out.print("Елементи:");
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        System.out.println();
    }

    public static <E> void printSummary(Collection<E> collection) {
        System.out.println("Розмір: " + collection.size() + ", порожня: " + collection.isEmpty());
    }

    public static <E> E getFirstAndLast(List<E> list) {
        E first = list.get(0);
        E last = list.get(list.size() - 1);
        System.out.println("Перший: " + first + ", останній: " + last);
        return first;
    }

    public static void testHierarchyMethods(String name, List<String> list) {
        System.out.println("--- " + name + " ---");
        printElements(list);
        printSummary(list);
        getFirstAndLast(list);
    }

    public static void demonstrateListBranch() {
        ArrayList<String> arrayList = new ArrayList<>(List.of("Перший", "Другий", "Третій"));
        System.out.println("ArrayList, елемент з індексом 1: " + arrayList.get(1));

        LinkedList<String> linkedList = new LinkedList<>(List.of("Середина"));
        linkedList.addFirst("Початок");
        linkedList.addLast("Кінець");
        System.out.println("LinkedList: " + linkedList);

        Vector<String> vector = new Vector<>();
        vector.addElement("Один");
        vector.addElement("Два");
        System.out.println("Vector, елемент з індексом 1: " + vector.elementAt(1));

        Stack<String> stack = new Stack<>();
        stack.push("Книга 1");
        stack.push("Книга 2");
        stack.push("Книга 3");
        System.out.println("Верхня книга на стеку: " + stack.peek());
        System.out.println("Дістаємо у зворотному порядку:");
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
        }
    }

    public static void iterateModules() {
        ArrayList<String> modules = new ArrayList<>(List.of("Core Java", "OOP", "Collections", "Streams", "Multithreading"));
        Iterator<String> it = modules.iterator();
        int totalLength = 0;
        while (it.hasNext()) {
            String module = it.next();
            System.out.println(module);
            totalLength += module.length();
        }
        System.out.println("Сумарна кількість символів: " + totalLength);
    }

    public static void demonstrateConcurrentModification() {
        ArrayList<Integer> data = new ArrayList<>(List.of(15, -3, 42, -10, 8, -1, 25));
        System.out.println("Початковий список: " + data);

        try {
            for (Integer x : data) {
                if (x < 0) {
                    data.remove(x);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Помилка ConcurrentModificationException: список змінено напряму, а ітератор циклу про це не знає");
        }

        ArrayList<Integer> cleanData = new ArrayList<>(List.of(15, -3, 42, -10, 8, -1, 25));
        removeNegativesWithIterator(cleanData);
        System.out.println("Список після безпечного видалення: " + cleanData);
    }

    public static void removeNegativesWithIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current < 0) {
                it.remove();
            }
        }
    }

    public static void filterLogs() {
        ArrayList<String> logs = new ArrayList<>(List.of("INFO: Start", "DEBUG: Init", "ERROR: Timeout", "DEBUG: Retry", "INFO: Done"));
        System.out.println("Початкові логи: " + logs);

        Iterator<String> it = logs.iterator();
        while (it.hasNext()) {
            String message = it.next();
            if (message.startsWith("DEBUG:")) {
                it.remove();
            }
        }
        System.out.println("Після видалення DEBUG: " + logs);

        ListIterator<String> listIt = logs.listIterator();
        while (listIt.hasNext()) {
            String message = listIt.next();
            if (message.startsWith("ERROR")) {
                listIt.set("CRITICAL ERROR: Timeout");
            }
        }
        System.out.println("Прохід назад:");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
        System.out.println("Список після заміни: " + logs);
    }

    public static void splitEvenAndOdd(List<Integer> source, List<Integer> evens, List<Integer> odds) {
        Iterator<Integer> it = source.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }
    }

    public static int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int removeInRange(List<Integer> list, int min, int max) {
        int removed = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            if (number >= min && number <= max) {
                it.remove();
                removed++;
            }
        }
        return removed;
    }

    public static <T> void reverseInPlace(List<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int otherIndex = list.size() - 1 - i;
            T temp = list.get(i);
            list.set(i, list.get(otherIndex));
            list.set(otherIndex, temp);
        }
    }

    public static String[] mergeUniqueToArray(List<String> first, List<String> second) {
        var merged = new ArrayList<String>();
        for (String item : first) {
            if (!merged.contains(item)) {
                merged.add(item);
            }
        }
        for (String item : second) {
            if (!merged.contains(item)) {
                merged.add(item);
            }
        }
        return merged.toArray(new String[0]);
    }

    public static <T> void rotateRight(List<T> list, int k) {
        for (int i = 0; i < k; i++) {
            if (!list.isEmpty()) {
                T last = list.remove(list.size() - 1);
                list.add(0, last);
            }
        }
    }

    public static void analyzeReceipt(List<String> receiptLines) {
        var prices = new ArrayList<Integer>();
        for (String line : receiptLines) {
            int colonIndex = line.indexOf(":");
            String priceText = line.substring(colonIndex + 1).trim();
            try {
                prices.add(Integer.parseInt(priceText));
            } catch (NumberFormatException e) {
                System.out.println("Пропущено рядок без коректної ціни: " + line);
            }
        }
        System.out.println("Усі ціни: " + prices);

        Iterator<Integer> it = prices.iterator();
        while (it.hasNext()) {
            Integer price = it.next();
            if (price < 40) {
                it.remove();
            }
        }
        System.out.println("Ціни після видалення покупок дешевших за 40 грн: " + prices);

        int total = 0;
        for (Integer price : prices) {
            total += price;
        }
        System.out.println("Підсумкова сума до сплати: " + total + " грн");
    }

    public static void compareListSpeed() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int count = 20_000;

        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.add(0, i);
        }
        long arrayInsertTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.add(0, i);
        }
        long linkedInsertTime = System.nanoTime() - start;

        System.out.println("Вставка на початок, ArrayList: " + arrayInsertTime / 1_000_000 + " мс");
        System.out.println("Вставка на початок, LinkedList: " + linkedInsertTime / 1_000_000 + " мс");
        System.out.println("ArrayList витрачає більше часу, бо при кожній вставці System.arraycopy зсуває всі елементи");

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.get(arrayList.size() / 2);
        }
        long arrayGetTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.get(linkedList.size() / 2);
        }
        long linkedGetTime = System.nanoTime() - start;

        System.out.println("Читання з середини, ArrayList: " + arrayGetTime / 1_000_000 + " мс");
        System.out.println("Читання з середини, LinkedList: " + linkedGetTime / 1_000_000 + " мс");
        System.out.println("ArrayList читає миттєво завдяки внутрішньому масиву Object[], а LinkedList доводиться йти по вузлах");
    }

    public static void showFinalSteps() {
        System.out.println("Відправки на GitHub...");
        System.out.println("Відправка пройшла успішно! \n\nЗробив: Аббасов Араз");
    }
}
