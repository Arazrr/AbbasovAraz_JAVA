package semester1.Practice_11_Abbasov_Araz.practice11.homework;

import java.util.ArrayList;
import java.util.List;

public class Task1WrapperAndAutoboxingMemory {
    public static void main(String[] args) {
        System.out.println("================ ДОСЛІДЖЕННЯ WRAPPER CLASSES ТА INTEGER CACHE ================");

        int[] testValues = {-128, -50, 0, 127, 128, 500, 2026};
        inspectIntegerCache(testValues);
        System.out.println();

        demonstrateAutoboxingUnderTheHood();
        System.out.println();

        String[] rawPackets = {"  145 ", "-30", "ERR_404", "980", "", null, "2147483647", "-85"};
        List<Integer> validData = parseTelemetryStream(rawPackets);
        printExtremesAndStats(validData);

        System.out.println("===============================================================================");
    }

    public static void inspectIntegerCache(int[] testValues) {
        System.out.println("[1. ЕКСПЕРИМЕНТ: INTEGER CACHE [-128..127] (== проти .equals())]:");
        for (int val : testValues) {
            Integer first = Integer.valueOf(val);
            Integer second = Integer.valueOf(val);

            boolean isCached = (val >= -128 && val <= 127);
            String source = isCached ? "IntegerCache" : "Новий об'єкт у Heap!";

            System.out.printf("  Значення: %6d | (a == b): %-5b | a.equals(b): %-5b | Джерело: %s\n",
                    val, (first == second), first.equals(second), source);
        }
    }

    public static void demonstrateAutoboxingUnderTheHood() {
        System.out.println("[2. AUTOBOXING / UNBOXING ПІД КАПОТОМ ТА ЗАХИСТ ВІД NULL]:");

        Integer boxedInt = Integer.valueOf(42);
        int unboxedInt = boxedInt.intValue();
        System.out.println("  Явне пакування: Integer.valueOf(42) -> " + boxedInt + " | Розпакування: .intValue() -> " + unboxedInt);

        List<Integer> sensorList = new ArrayList<>();
        sensorList.add(45);
        sensorList.add(null);
        sensorList.add(-12);
        sensorList.add(88);
        sensorList.add(null);
        sensorList.add(102);

        System.out.println("  Вхідний список із датчиків (з null): " + sensorList);

        int sum = 0;
        for (int i = 0; i < sensorList.size(); i++) {
            Integer val = sensorList.get(i);
            if (val == null) {
                System.out.println(" Пропущено null-елемент на індексі " + i + " (запобігання NullPointerException при intValue()!)");
            } else {
                sum += val;
            }
        }
        System.out.println("  Сума валідних розпакованих елементів: " + sum);
    }

    public static List<Integer> parseTelemetryStream(String[] rawPackets) {
        System.out.println("[3. ПАРСИНГ РЯДКІВ (Integer.parseInt) ТА ЕКСТРЕМУМИ (MAX_VALUE / MIN_VALUE)]:");
        System.out.println("  Початкові межі пошуку: min = " + Integer.MAX_VALUE + " (MAX_VALUE), max = " + Integer.MIN_VALUE + " (MIN_VALUE)");

        List<Integer> validList = new ArrayList<>();

        for (String packet : rawPackets) {
            if (packet == null || packet.trim().isEmpty()) {
                System.out.println("  ❌ Порожній або null-пакет відхилено");
                continue;
            }
            try {
                String cleaned = packet.trim();
                int parsedValue = Integer.parseInt(cleaned);
                validList.add(parsedValue);
            } catch (NumberFormatException e) {
                System.out.println("  ❌ Пакет '" + packet.trim() + "' відхилено (NumberFormatException)");
            }
        }

        System.out.println("  Успішно розпізнаний список Integer: " + validList);
        return validList;
    }

    public static void printExtremesAndStats(List<Integer> validData) {
        if (validData.isEmpty()) {
            System.out.println("  Список даних порожній.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int val : validData) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }

        System.out.println("  Знайдений мінімум: " + min + " | Знайдений максимум: " + max);
        validData.remove(Integer.valueOf(-30));
        System.out.println("  Після remove(Integer.valueOf(-30)) (за значенням): " + validData);
    }
}