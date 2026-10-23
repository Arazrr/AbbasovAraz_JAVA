package semester1.Practice_6_Abbasov_Araz;

public class classes {
    // skip :)
}

class Student {
    String name;
    int age;
    double gpa;

}

class Car {
    String brand;
    String model;
    int year;
    int speed;
}

class Book {
    String title;
    String author;
    int pages;
    boolean isRead;
}

class Rectangle {
    double width;
    double height;
}

class Product {
    String name;
    double price;
    int quantity;
}

class Smartphone {
    String model;
    int batteryLevel;
    boolean isTurnedOn;
}

class Point2D {
    double x;
    double y;
}

class Greeter {

    public void sayHello() {
        System.out.println("Привіт усім!");
    }

    public void sayHelloTo(String name) {
        System.out.println("Привіт, " + name + "! Раді тебе бачити.");
    }
}

class Animal {
    public String species;
    public String name;

    public void makeSound() {
        System.out.println(name + " видає звук!");
    }

    public void printInfo() {
        System.out.println("Вид: " + species + ", Кличка: " + name);
    }

}

class Counter {
    int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }

    public void printCount() {
        System.out.println("Count: " + count);
    }
}

class TrafficLight {
    String currentColor;

    public void changeColor(String newColor) {
        currentColor = newColor;
    }

    public void showSignal() {
        if ("Червоний".equals(currentColor)) {
            System.out.println("Стій!");
        } else if ("Жовтий".equals(currentColor)) {
            System.out.println("Увага!");
        } else {
            System.out.println("Їдь!");
        }
    }
}

class Player {
    String nickname;
    int health = 100;

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
            System.out.println(nickname + " загинув!");
        }
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100) {
            health = 100;
        }
    }
}

class Lamp {
    boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public void status() {
        if (isOn) {
            System.out.println("Лампа світить");
        } else {
            System.out.println("Лампа вимкнена");
        }
    }
}

class Stopwatch {
    int seconds;

    public void tick() {
        seconds++;
    }

    public void addSeconds(int s) {
        seconds += s;
    }

    public void displayTime() {
        int minutes = seconds / 60;
        int remSeconds = seconds % 60;

        String minStr = minutes < 10 ? "0" + minutes : String.valueOf(minutes);
        String secStr = remSeconds < 10 ? "0" + remSeconds : String.valueOf(remSeconds);

        System.out.println(minStr + ":" + secStr);
    }
}

class Printer {
    String model;
    int paperCount;

    public void printDocument(String title, int pages) {
        if (paperCount >= pages) {
            paperCount -= pages;
            System.out.println("Документ \"" + title + "\" успішно надруковано. Залишок паперу: " + paperCount);
        } else {
            System.out.println("Помилка: Недостатньо паперу в принтері " + model);
        }
    }
}

class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("На нуль нельзя!");
            return 0.0;
        } else {
            return (double) a / b;
        }
    }
}


class Circle {
    double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}


class TemperatureConverter {
    public double celsiusToFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) / 1.8;
    }
}


class NumberChecker {
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isPositive(int n) {
        return n > 0;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


class CurrencyExchange {
    double usdRate;

    public CurrencyExchange(double rate) {
        this.usdRate = rate;
    }

    public double toUSD(double uah) {
        return uah / usdRate;
    }

    public double toUAH(double usd) {
        return usd * usdRate;
    }
}


class Employee {
    String name;
    double baseSalary;
    double bonusPercentage;

    public double calculateTotalSalary() {
        return baseSalary * (1 + bonusPercentage / 100);
    }

    public double calculateTax() {
        return calculateTotalSalary() * 0.195;
    }
}


class TextFormatter {
    public String formatTitle(String text) {
        return "*** " + text.toUpperCase() + " ***";
    }

    public int countVowels(String text) {
        if (text == null) return 0;
        String vowels = "аоуеиіяюєіїaeiouAEIOU";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}


class Triangle {
    double a, b, c;

    public boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double getPerimeter() {
        if (!isValid()) return 0.0;
        return a + b + c;
    }

    public double getArea() {
        if (!isValid()) return 0.0;
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


class SecretVault {
    private String secretCode = "Pass123";

    public boolean verifyCode(String attempt) {
        return this.secretCode.equals(attempt);
    }
}


class UserAccount {
    private String username;
    private String password;

    public void setCredentials(String u, String p) {
        this.username = u;
        this.password = p;
    }

    public boolean login(String enteredUser, String enteredPass) {
        return this.username != null && this.username.equals(enteredUser)
                && this.password != null && this.password.equals(enteredPass);
    }

    public void changePassword(String oldPass, String newPass) {
        if (this.password != null && this.password.equals(oldPass)) {
            this.password = newPass;
            System.out.println("Пароль успішно змінено!");
        } else {
            System.out.println("Помилка: старий пароль не збігається!");
        }
    }
}


class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Поповнено на: " + amount + " грн. Баланс: " + balance + " грн.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            System.out.println("Відмовлено в транзакції (недостатньо котів або некоректна сума)!");
            return false;
        }
        balance -= amount;
        System.out.println("Успішно знято: " + amount + " грн. Залишок: " + balance + " грн.");
        return true;
    }

    public double getBalance() {
        return balance;
    }
}


class Thermometer {
    private double temperature;

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Помилка: Температура нижча за абсолютний нуль (-273.15°C)!");
        } else {
            this.temperature = t;
            System.out.println("Температуру оновлено: " + t + "°C");
        }
    }

    public double getTemperature() {
        return temperature;
    }
}


class CarSpeedometer {
    private int speed = 0;

    public void accelerate(int delta) {
        speed += delta;
        if (speed > 240) {
            speed = 240;
        }
    }

    public void brake(int delta) {
        speed -= delta;
        if (speed < 0) {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }
}


class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Помилка: Некоректний вік!");
        }
    }

    public void printSummary() {
        System.out.println("Ім'я: " + this.name + ", Вік: " + this.age);
    }
}

class DiscountCard {
    private String ownerName;
    private double totalSpent;
    private int discountPercent = 0;

    public void addPurchase(double cost) {
        if (cost > 0) {
            totalSpent += cost;

            if (totalSpent >= 10000) {
                discountPercent = 10;
            } else if (totalSpent >= 5000) {
                discountPercent = 5;
            } else {
                discountPercent = 0;
            }
        }
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public void printCardInfo() {
        System.out.println("Власник: " + ownerName + " | Загалом витрачено: " + totalSpent + " грн | Знижка: " + discountPercent + "%");
    }
}

class SmartDoorLock {
    private int pinCode = 1234;
    private boolean isLocked = true;
    private int failedAttempts = 0;

    public void enterPin(int enteredPin) {
        if (failedAttempts >= 3) {
            System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
            return;
        }

        if (enteredPin == pinCode) {
            isLocked = false;
            failedAttempts = 0;
            System.out.println(" PIN вірний! Замок відчинено.");
        } else {
            failedAttempts++;
            System.out.println(" Невірний PIN! Залишилося спроб: " + (3 - failedAttempts));
            if (failedAttempts >= 3) {
                System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
            }
        }
    }

    public boolean isLocked() {
        return isLocked;
    }
}


class GradeBook {
    private String studentName;
    private int[] grades;

    public void setData(String name, int[] g) {
        studentName = name;
        grades = g;
    }

    public double getAverage() {
        if (grades == null || grades.length == 0) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int getHighestGrade() {
        if (grades == null || grades.length == 0) return 0;
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public int getLowestGrade() {
        if (grades == null || grades.length == 0) return 0;
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public void printInfo() {
        System.out.println("Студент: " + studentName);
        System.out.println("Середній бал: " + getAverage());
        System.out.println("Найвища оцінка: " + getHighestGrade());
        System.out.println("Найнижча оцінка: " + getLowestGrade());
    }
}


class ArrayStats {
    private int[] numbers;

    public void setNumbers(int[] nums) {
        numbers = nums;
    }

    public int countEvens() {
        if (numbers == null) return 0;
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOdds() {
        if (numbers == null) return 0;
        int count = 0;
        for (int n : numbers) {
            if (n % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int calculateSum() {
        if (numbers == null) return 0;
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}


class ShoppingCart {
    private double[] itemPrices = new double[10];
    private int count = 0;

    public void addItem(double price) {
        if (count < itemPrices.length && price > 0) {
            itemPrices[count] = price;
            count++;
            System.out.println("Товар ціною " + price + " грн додано до кошика.");
        } else {
            System.out.println("Помилка: Кошик повний або ціна некоректна!");
        }
    }

    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += itemPrices[i];
        }
        return total;
    }

    public void applyDiscount(double percent) {
        for (int i = 0; i < count; i++) {
            itemPrices[i] -= itemPrices[i] * (percent / 100.0);
        }
    }

    public void printReceipt() {
        System.out.println("--- Чек покупок ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Товар " + (i + 1) + ": " + itemPrices[i] + " грн");
        }
        System.out.println("Загальна сума: " + getTotalCost() + " грн");
        System.out.println("-------------------");
    }
}


class TemperatureTracker {
    private double[] dailyTemps = new double[7];

    public void setTemps(double[] temps) {
        if (temps != null && temps.length == 7) {
            dailyTemps = temps;
        }
    }

    public int countDaysAbove(double threshold) {
        int count = 0;
        for (double t : dailyTemps) {
            if (t > threshold) {
                count++;
            }
        }
        return count;
    }

    public void printWeeklyReport() {
        System.out.println("--- Щоденник температур за тиждень ---");
        double maxTemp = dailyTemps[0];
        int maxDay = 1;

        for (int i = 0; i < dailyTemps.length; i++) {
            System.out.println("День " + (i + 1) + ": " + dailyTemps[i] + "°C");
            if (dailyTemps[i] > maxTemp) {
                maxTemp = dailyTemps[i];
                maxDay = i + 1;
            }
        }
        System.out.println("Найтепліший день тижня: День " + maxDay + " (" + maxTemp + "°C)");
        System.out.println("--------------------------------------");
    }
}


class ArraySearcher {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public boolean contains(int target) {
        if (data == null) return false;
        for (int n : data) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }

    public int findIndex(int target) {
        if (data == null) return -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}


class Vector3D {
    private double[] coords = new double[3];

    public void setCoords(double x, double y, double z) {
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
    }

    public double getMagnitude() {
        return Math.sqrt(coords[0] * coords[0] + coords[1] * coords[1] + coords[2] * coords[2]);
    }

    public void multiplyByScalar(double scalar) {
        coords[0] *= scalar;
        coords[1] *= scalar;
        coords[2] *= scalar;
    }

    public void printVector() {
        System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
    }
}


class Matrix2D {
    private int[][] grid;

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void printMatrix() {
        if (grid == null) return;
        System.out.println("--- Матриця ---");
        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public int getTotalSum() {
        if (grid == null) return 0;
        int sum = 0;
        for (int[] row : grid) {
            for (int val : row) {
                sum += val;
            }
        }
        return sum;
    }

    public int getRowSum(int rowIndex) {
        if (grid == null || rowIndex < 0 || rowIndex >= grid.length) return 0;
        int sum = 0;
        for (int val : grid[rowIndex]) {
            sum += val;
        }
        return sum;
    }
}


class MatrixDiagonals {
    private int[][] matrix;

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getMainDiagonalSum() {
        if (matrix == null) return 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public int getAntiDiagonalSum() {
        if (matrix == null) return 0;
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }
        return sum;
    }

    public boolean isDiagonalSymmetric() {
        return getMainDiagonalSum() == getAntiDiagonalSum();
    }
}
