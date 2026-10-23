package semester1.Practice_5_Abbasov_Araz;
import java.util.Arrays;
import java.util.Scanner;

// КНД-12 Аббасов Араз

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------1 завдання-------------------------");
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[2] = 30;
        numbers[4] = 50;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------2 завдання-------------------------");
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
        System.out.println();
        System.out.println(days[0] + ", " + days[days.length - 1]);
        System.out.println();

        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
        System.out.println("----------------------3 завдання-------------------------");
        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        System.out.println();
        prices[2] = prices[2] * 0.8;

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        System.out.println("----------------------4 завдання-------------------------");
        System.out.print("Введіть число N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Число N має бути більше 0.");
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Отриманий масив: " + Arrays.toString(arr));
        System.out.println("----------------------5 завдання-------------------------");
        int[] a = {4, 8, 15, 16, 23, 42};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("----------------------6 завдання-------------------------");
        int[] nnumbers = new int[10];
        nnumbers[0] = 1;
        for (int i = 1; i < nnumbers.length; i++) {
            nnumbers[i] = nnumbers[i - 1] * 2;
        }

        for (int i = 0; i < nnumbers.length; i++) {
            System.out.println("2^" + i + " = " + nnumbers[i]);
        }
        System.out.println("----------------------7 завдання-------------------------");
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = Arrays.copyOf(original, original.length);

        copy[0] = 999;

        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }
        System.out.println();
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
        System.out.println("----------------------8 завдання-------------------------");
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        System.out.println("Сума всіх оцінок: " + sum);

        double fgfggd = (double) sum / grades.length;

        System.out.println("Середній бал: " + fgfggd);
        System.out.println("----------------------9 завдання-------------------------");
        int[] temps = {18, 21, 15, 24, 13, 27, 20};

        int min = temps[0];
        int max = temps[0];

        int minindex = 0;
        int maxindex = 0;

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
                minindex = i;
            }
            if (temps[i] > max) {
                max = temps[i];
                maxindex = i;
            }
        }

        System.out.println("Мінімальна температура: " + min + "°C (індекс: " + minindex + ")");
        System.out.println("Максимальна температура: " + max + "°C (індекс: " + maxindex + ")");
        System.out.println("----------------------10 завдання-------------------------");
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};

        int napositive = 0;
        int nanegative = 0;
        int zero = 0;

        for (int number : data) {
            if (number > 0) {
                napositive++;
            } else if (number < 0) {
                nanegative++;
            } else {
                zero++;
            }
        }

        System.out.println("Кількість додатних чисел: " + napositive);
        System.out.println("Кількість від'ємних чисел: " + nanegative);
        System.out.println("Кількість нулів: " + zero);
        System.out.println("----------------------11 завдання-------------------------");
        int[] mass = new int[10];
        int sump = 0;
        int sumpp = 0;

        for (int i = 0; i < mass.length; i++) {
            System.out.print("Введіть число " + (i + 1) + ": ");
            mass[i] = scanner.nextInt();
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                sump += mass[i];
            }
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 1) {
                sumpp += mass[i];
            }
        }
        System.out.println("Сума парних чисел: " + sump);
        System.out.println("Сума непарних чисел: " + sumpp);
        System.out.println("----------------------12 завдання-------------------------");
        int[] students = {1042, 2031, 3055, 4018, 5099};

        System.out.print("Введіть шуканий номер залікової книжки: ");
        int searchTarget = scanner.nextInt();

        int dd = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == searchTarget) {
                dd = i;
                break;
            }
        }

        if (dd != -1) {
            System.out.println("Елемент знайдено за індексом: " + dd);
        } else {
            System.out.println("Студента з таким номером не знайдено");
        }
        System.out.println("----------------------13 завдання-------------------------");
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};

        System.out.print("Введіть число від 1 до 6: ");
        int target = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == target) {
                count++;
            }
        }

        System.out.println("Число " + target + " випало разів: " + count);
        System.out.println("----------------------14 завдання-------------------------");
        int[] salary = {18000, 25000, 32000, 15000, 41000, 29000};
        int summm = 0;

        for (int i = 0; i < salary.length; i++) {
            summm += salary[i];
        }

        double average = (double) summm / salary.length;

        System.out.println("Середня зп: " + average);

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > average) {
                System.out.println(salary[i] + " зп більша, ніж інші");
            }
        }
        System.out.println("----------------------15 завдання-------------------------");
        double[] pricess = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};

        double minn = pricess[0];
        double maxx = pricess[0];

        for (double pricee : pricess) {
            if (pricee < minn) {
                minn = pricee;
            }
            if (pricee > maxx) {
                maxx = pricee;
            }
        }

        double range = maxx - minn;

        System.out.println("Розмах коливань цін: " + range);
        System.out.println("----------------------16 завдання-------------------------");
        String[] city = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};

        for (String b : city) {
            System.out.println("Ласкаво просимо до міста " + b + "!");
        }
        System.out.println("----------------------17 завдання-------------------------");
        double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] *= 1.10;
        }

        System.out.println(Arrays.toString(salaries));
        System.out.println("----------------------18 завдання-------------------------");
        int[] arrr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arrr.length / 2; i++) {
            int temp = arrr[i];
            arrr[i] = arrr[arrr.length - 1 - i];
            arrr[arrr.length - 1 - i] = temp;
        }

        System.out.println("Реверсований масив: " + Arrays.toString(arrr));
        System.out.println("----------------------19 завдання-------------------------");
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[base.length];

        for (int i = 0; i < base.length; i++) {
            squares[i] = base[i] * base[i];
        }

        System.out.println("Початковий масив base:    " + Arrays.toString(base));
        System.out.println("Масив квадратів squares: " + Arrays.toString(squares));
        System.out.println("----------------------20 завдання-------------------------");
        int[] checkArr = {1, 3, 5, 8, 12};
        boolean Sort = true;

        for (int i = 0; i < checkArr.length - 1; i++) {
            if (checkArr[i] > checkArr[i + 1]) {
                Sort = false;
                break;
            }
        }

        if (Sort) {
            System.out.println("Масив " + Arrays.toString(checkArr) + " відсортований за зростанням.");
        } else {
            System.out.println("Масив " + Arrays.toString(checkArr) + " НЕ відсортований за зростанням.");
        }
        System.out.println("----------------------21 завдання-------------------------");
        int[] aaa = {1, 2, 3};
        int[] bbb = {4, 5, 6, 7};
        int[] cc = new int [aaa.length + bbb.length];

        for (int i = 0; i < aaa.length; i++) {
            cc[i] = aaa[i];
        }

        for (int i = 0; i < bbb.length; i++) {
            cc[aaa.length + i] = bbb[i];
        }

        System.out.print("Результуючий масив c: ");
        for (int value : cc) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("----------------------22 завдання-------------------------");
        int[] test = {45, 12, 89, 3, 27};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println("Відсортовано: " + Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println("За допомогою fill: " + Arrays.toString(test));
        System.out.println("----------------------23 завдання-------------------------");
        int[][] table = new int[3][3];

        table[0][0] = 1;  table[0][1] = 2;  table[0][2] = 3;
        table[1][0] = 4;  table[1][1] = 5;  table[1][2] = 6;
        table[2][0] = 7;  table[2][1] = 8;  table[2][2] = 9;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------24 завдання-------------------------");
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };

        System.out.println("Кількість рядків: " + matrix.length);
        System.out.println("Кількість стовпчиків у першому рядку: " + matrix[0].length);

        System.out.println("Лівий верхній: " + matrix[0][0]);
        System.out.println("Правий верхній: " + matrix[0][matrix[0].length - 1]);
        System.out.println("Лівий нижній: " + matrix[matrix.length - 1][0]);
        System.out.println("Правий нижній: " + matrix[matrix.length - 1][matrix[0].length - 1]);

        System.out.println("----------------------25 завдання-------------------------");
        int[][] grid = new int[3][4];
        int counter = 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = counter++;
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("----------------------26 завдання-------------------------");
        int[][] randomGrid = new int[4][3];

        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                randomGrid[i][j] = (int) (Math.random() * 90) + 10;
            }
        }

        System.out.println("Вивід за допомогою Arrays.deepToString:");
        System.out.println(Arrays.deepToString(randomGrid));

        System.out.println("Вивід у вигляді таблиці:");
        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                System.out.print(randomGrid[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("----------------------27 завдання-------------------------");
        int[][] multTable = new int[9][9];

        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                System.out.print(multTable[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("----------------------28 завдання-------------------------");
        int[][] identityMatrix = new int[5][5];

        for (int row = 0; row < identityMatrix.length; row++) {
            for (int col = 0; col < identityMatrix[row].length; col++) {
                if (row == col) {
                    identityMatrix[row][col] = 1;
                } else {
                    identityMatrix[row][col] = 0;
                }
            }
        }

        for (int i = 0; i < identityMatrix.length; i++) {
            for (int j = 0; j < identityMatrix[i].length; j++) {
                System.out.print(identityMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("----------------------29 завдання-------------------------");
        int[][] modMatrix = new int[4][4];

        for (int i = 0; i < modMatrix.length; i++) {
            for (int j = 0; j < modMatrix[i].length; j++) {
                modMatrix[i][j] = 1;
            }
        }

        for (int j = 0; j < modMatrix[1].length; j++) {
            modMatrix[1][j] = 0;
        }

        for (int i = 0; i < modMatrix.length; i++) {
            modMatrix[i][2] = 7;
        }

        for (int i = 0; i < modMatrix.length; i++) {
            for (int j = 0; j < modMatrix[i].length; j++) {
                System.out.print(modMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------30 завдання-------------------------");
        int[][] matrix30 = {
                {5, 12, 8},
                {3, 20, 14},
                {9, 1, 6}
        };

        int totalSum = 0;
        int totalElements = 0;

        for (int i = 0; i < matrix30.length; i++) {
            for (int j = 0; j < matrix30[i].length; j++) {
                totalSum += matrix30[i][j];
                totalElements++;
            }
        }

        double averages = (double) totalSum / totalElements;

        System.out.println("Загальна сума: " + totalSum);
        System.out.println("Загальна кількість елементів: " + totalElements);
        System.out.println("Середнє арифметичне: " + averages);

        System.out.println("----------------------31 завдання-------------------------");
        int[][] matrix31 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[] rowSums = new int[matrix31.length];

        for (int i = 0; i < matrix31.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < matrix31[i].length; j++) {
                currentSum += matrix31[i][j];
            }
            rowSums[i] = currentSum;
        }

        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Рядок " + i + ": сума = " + rowSums[i]);
        }

        System.out.println("----------------------32 завдання-------------------------");
        int[][] matrix32 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix32.length; i++) {
            for (int j = 0; j < matrix32[i].length; j++) {
                System.out.print(matrix32[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("----------------");

        for (int col = 0; col < matrix32[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < matrix32.length; row++) {
                colSum += matrix32[row][col];
            }
            System.out.print(colSum + "\t");
        }
        System.out.println();

        System.out.println("----------------------33 завдання-------------------------");
        int[][] matrix33 = {
                {15, -3, 42, 8},
                {-10, 99, 4, 23},
                {7, 0, -5, 61}
        };

        int maxVal = matrix33[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix33.length; i++) {
            for (int j = 0; j < matrix33[i].length; j++) {
                if (matrix33[i][j] > maxVal) {
                    maxVal = matrix33[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Максимум: " + maxVal + " у комірці [" + maxRow + ", " + maxCol + "]");

        System.out.println("----------------------34 завдання-------------------------");
        int[][] matrix34 = {
                {3, 5, 1, 7},
                {2, 8, 6, 4},
                {9, 0, 4, 2},
                {1, 3, 5, 9}
        };

        int mainDiagSum = 0;
        int secondaryDiagSum = 0;

        for (int row = 0; row < matrix34.length; row++) {
            for (int col = 0; col < matrix34[row].length; col++) {
                if (row == col) {
                    mainDiagSum += matrix34[row][col];
                }
                if (row + col == matrix34.length - 1) {
                    secondaryDiagSum += matrix34[row][col];
                }
            }
        }

        System.out.println("Сума головної діагоналі: " + mainDiagSum);
        System.out.println("Сума побічної діагоналі: " + secondaryDiagSum);

        if (mainDiagSum > secondaryDiagSum) {
            System.out.println("Сума головної діагоналі більша.");
        } else if (secondaryDiagSum > mainDiagSum) {
            System.out.println("Сума побічної діагоналі більша.");
        } else {
            System.out.println("Суми діагоналей рівні.");
        }

        System.out.println("----------------------35 завдання-------------------------");
        int[][] origMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposed = new int[3][3];

        for (int i = 0; i < origMatrix.length; i++) {
            for (int j = 0; j < origMatrix[i].length; j++) {
                transposed[j][i] = origMatrix[i][j];
            }
        }

        System.out.println("Початкова матриця:\tТранспонована матриця:");
        for (int i = 0; i < origMatrix.length; i++) {
            for (int j = 0; j < origMatrix[i].length; j++) {
                System.out.print(origMatrix[i][j] + " ");
            }
            System.out.print("\t\t");

            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------36 завдання-------------------------");
        int[][] ladder = new int[4][];
        ladder[0] = new int[1];
        ladder[1] = new int[2];
        ladder[2] = new int[3];
        ladder[3] = new int[4];

        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = i;
            }
        }

        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print(ladder[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------37 завдання-------------------------");
        String[][] weekSchedule = new String[5][];
        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
        weekSchedule[3] = new String[]{"Дискретна математика"};
        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};

        String[] dayss = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};

        for (int i = 0; i < weekSchedule.length; i++) {
            System.out.println(dayss[i] + " (кількість пар: " + weekSchedule[i].length + "):");
            for (int j = 0; j < weekSchedule[i].length; j++) {
                System.out.println("  " + (j + 1) + ". " + weekSchedule[i][j]);
            }
        }

        System.out.println("----------------------38 завдання-------------------------");
        int[][] pascal = new int[5][];

        for (int i = 0; i < 5; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------39 завдання-------------------------");
        int[][][] cube = new int[3][3][3];

        for (int x = 0; x < cube.length; x++) {
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    cube[x][y][z] = x + y + z;
                }
            }
        }

        for (int x = 0; x < cube.length; x++) {
            System.out.println("--- Шар " + x + " ---");
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    System.out.print(cube[x][y][z] + "\t");
                }
                System.out.println();
            }
        }

        System.out.println("----------------------40 завдання-------------------------");
        double[][][] weather = {
                {
                        {18.5, 10.2}, {19.0, 11.0}, {17.5, 9.8}, {16.0, 8.5},
                        {20.1, 12.3}, {21.0, 13.0}, {19.8, 11.5}
                },
                {
                        {16.0, 8.0}, {15.5, 7.2}, {14.8, 6.5}, {16.2, 7.8},
                        {18.0, 9.1}, {17.5, 8.8}, {16.9, 7.5}
                },
                {
                        {22.0, 15.0}, {23.1, 16.2}, {21.8, 14.9}, {22.5, 15.5},
                        {24.0, 17.0}, {23.5, 16.8}, {22.9, 15.1}
                }
        };

        String[] cities = {"Київ", "Львів", "Одеса"};

        for (int c = 0; c < weather.length; c++) {
            double daySum = 0;
            for (int d = 0; d < weather[c].length; d++) {
                daySum += weather[c][d][0];
            }
            double avgDay = daySum / weather[c].length;
            System.out.println("Середня денна температура (" + cities[c] + "): " + Math.round(avgDay * 10.0) / 10.0 + "°C");
        }

        double minNight = weather[0][0][1];
        String coldestCity = cities[0];
        int coldestDay = 1;

        for (int c = 0; c < weather.length; c++) {
            for (int d = 0; d < weather[c].length; d++) {
                if (weather[c][d][1] < minNight) {
                    minNight = weather[c][d][1];
                    coldestCity = cities[c];
                    coldestDay = d + 1;
                }
            }
        }

        System.out.println("Найхолодніша ніч: " + minNight + "°C (" + coldestCity + ", день " + coldestDay + ")");
    }
}