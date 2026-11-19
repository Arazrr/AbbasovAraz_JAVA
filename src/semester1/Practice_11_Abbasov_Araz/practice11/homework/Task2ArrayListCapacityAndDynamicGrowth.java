package semester1.Practice_11_Abbasov_Araz.practice11.homework;

import java.util.ArrayList;

public class Task2ArrayListCapacityAndDynamicGrowth {

    public static void main(String[] args) {
        System.out.println("================ ЕМУЛЯТОР ВНУТРІШНЬОЇ БУДОВИ ARRAYLIST (ПІД КАПОТОМ) ================");

        var emulator = new CustomArrayCapacityEmulator<String>();
        System.out.println("[ІНІЦІАЛІЗАЦІЯ]: Створено CustomArrayCapacityEmulator<String> | size = "
                + emulator.size() + " | capacity = " + emulator.getCapacity());

        var raw = new ArrayList<>();
        raw.add(100);
        raw.add("Java");
        raw.add(true);
        System.out.println("[var + <>]: var raw = new ArrayList<>() втрачає тип, елементи зберігаються як Object: " + raw);

        System.out.println();
        System.out.println("--- Додавання 35 елементів у список ---");
        int growNumber = 0;
        for (int i = 1; i <= 35; i++) {
            int oldCapacity = emulator.getCapacity();
            emulator.add("Block-" + i);
            int newCapacity = emulator.getCapacity();
            if (newCapacity != oldCapacity) {
                growNumber++;
                System.out.println("  ⚡ [GROW #" + growNumber + "] Переповнення при додаванні " + i
                        + "-го елемента! Ємність: " + oldCapacity + " -> " + newCapacity
                        + " (System.arraycopy скопіював " + oldCapacity + " ел.)");
            }
        }
        System.out.println("Стан після додавання 35 елементів: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity()
                + " (Вільний резерв: " + (emulator.getCapacity() - emulator.size()) + " комірок null)");

        System.out.println();
        System.out.println("--- Тестування вставки add(0, 'HEADER') та видалення remove(5) ---");
        int movedRight = emulator.size();
        emulator.add(0, "HEADER");
        System.out.println("  -> Вставлено 'HEADER' на індекс 0 (зсунуто праворуч " + movedRight
                + " елементів через System.arraycopy)");

        int movedLeft = emulator.size() - 5 - 1;
        String removed = emulator.remove(5);
        System.out.println("  -> Видалено елемент '" + removed + "' з індексу 5 (зсунуто ліворуч " + movedLeft
                + " елементів, хвіст занулено для GC)");
        System.out.println("  Поточний стан: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity()
                + " | Перший: '" + emulator.get(0) + "'"
                + " | Останній: '" + emulator.get(emulator.size() - 1) + "'");

        System.out.println();
        System.out.println("--- Оптимізація пам'яті trimToSize() ---");
        int capacityBefore = emulator.getCapacity();
        emulator.trimToSize();
        System.out.println("  -> Викликано trimToSize(): буфер Object[" + capacityBefore
                + "] стиснуто рівно до Object[" + emulator.getCapacity() + "]!");
        System.out.println("  Фінальна телеметрія: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity()
                + " | Кількість розширень: " + emulator.getResizeCount()
                + " | Скопійовано елементів: " + emulator.getTotalElementsCopied());
        System.out.println("=====================================================================================");
    }
}

class CustomArrayCapacityEmulator<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;
    private int resizeCount = 0;
    private int totalElementsCopied = 0;

    public CustomArrayCapacityEmulator() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacityInternal() {
        if (size == elementData.length) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            Object[] newBuffer = new Object[newCapacity];
            System.arraycopy(elementData, 0, newBuffer, 0, size);
            elementData = newBuffer;
            resizeCount++;
            totalElementsCopied += size;
        }
    }

    public void add(E element) {
        ensureCapacityInternal();
        elementData[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Індекс: " + index + ", розмір: " + size);
        }
        ensureCapacityInternal();
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Індекс: " + index + ", розмір: " + size);
        }
        E oldElement = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldElement;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Індекс: " + index + ", розмір: " + size);
        }
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Індекс: " + index + ", розмір: " + size);
        }
        E oldElement = (E) elementData[index];
        elementData[index] = element;
        return oldElement;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return elementData.length;
    }

    public int getResizeCount() {
        return resizeCount;
    }

    public int getTotalElementsCopied() {
        return totalElementsCopied;
    }

    public void trimToSize() {
        if (size < elementData.length) {
            Object[] trimmed = new Object[size];
            System.arraycopy(elementData, 0, trimmed, 0, size);
            elementData = trimmed;
        }
    }
}