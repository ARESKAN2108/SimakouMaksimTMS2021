import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        amoeba();
        System.out.println("Результат вычисления умножения = " + summ(5, 6));
        numbers();
        arrayReverse();
        workWithArray();
        creatArray();
        System.out.print(Arrays.toString(arrayAndNullElement(new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2})));
        creatMatrix();
    }

    // 1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    // сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    private static void amoeba() {

        int countAmoeba = 1;

        for (int i = 3; i < 25; i += 3) {
            countAmoeba *= 2;
            int stringHours = i % 10;
            if (stringHours == 1) {
                System.out.println("Через " + i + " час амеб будет " + countAmoeba);
            } else if (stringHours > 2 && stringHours <= 4) {
                System.out.println("Через " + i + " часа амеб будет " + countAmoeba);
            } else {
                System.out.println("Через " + i + " часов амеб будет " + countAmoeba);
            }
        }
        System.out.println("За сутки будет 256 амеб");
    }

    //2) Напишите реализацию метода summ(int a, int b), вычисляющий a * b, не пользуясь операцией
    //умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    public static int summ(int a, int b) {

        int result = 0;

        for (int i = 0; i < a; i++) {
            result += b;
        }
        return result;
    }

    // 4)В переменную записываем число.
    // Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    // Например, Введите число: 5
    // "5 - это положительное число, количество цифр = 1"

    private static void numbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("\" " + num + " - это положительное число, " + "количество цифр = " + String.valueOf(num).length() + " \"");
        } else if (num < 0) {
            System.out.println("\" " + num + " - это отрицательное число, " + "количество цифр = " + String.valueOf(num).length() + " \"");
        } else {
            System.out.println("Вы ввели ноль, попробуйте заново");
        }
    }

    // 5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
    // а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    private static void arrayReverse() {

        int sizeArray = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                sizeArray++;
            }
        }
        int[] array = new int[sizeArray];
        for (int i = 1, b = 0; b < array.length; i++) {
            if (i % 2 != 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    //  6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
    //  Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
    //  Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    private static void workWithArray() {

        Random random = new Random();
        int[] mass = new int[12];
        int maxElement = 0;
        int maxIndex = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
            System.out.print(mass[i] + " ");
            if (maxElement <= mass[i]) {
                maxElement = mass[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент " + maxElement + ", " + "индекс его последнего вхождения в массив " + maxIndex);
    }

    // 7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
    // Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
    // Снова выведете массив на экран на отдельной строке.

    private static void creatArray() {
        int[] mass = new int[20];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(20);
            System.out.print(mass[i] + "\t");
        }
        System.out.println();

        int temp = 0;
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0) {
                mass[i] = temp;
            }
            System.out.print(mass[i] + "\t");
        }
        System.out.println();
    }

    // 8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    public static int[] arrayAndNullElement(int[] mass) {
        if (mass.length == 0) {
            System.out.println("Array is empty");
        } else {
            int first = mass[0];
            int temp = 0;
            int max = 0;
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > max) {
                    max = mass[i];
                    temp = i;
                }
            }
            for (int i = 0; i < mass.length; i++) {
                mass[0] = max;
                mass[temp] = first;
            }
            System.out.println(max);
        }
        return mass;
    }

    // 10) Создаём квадратную матрицу, размер вводим с клавиатуры.
    // Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
    // Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
    // Пример:
    // 1 2 3 4      1 6 3 1
    // 6 7 8 9      2 7 3 5
    // 3 3 4 5      3 8 4 6
    // 1 5 6 7      4 9 5 7

    private static void creatMatrix() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] mass = new int[size][size];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(50);
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}