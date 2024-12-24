package ArrayDouble;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayDouble {

    public static void main(String[] args) {

/*
        //ЗАДАЧА_1
        // Таблица умножения
        int[][] MULTIPLICATION_TABLE;
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
            int a = MULTIPLICATION_TABLE[0].length;
        }
*/

/*
        // ЗАДАЧА_2
        //  Создать массив типа String размером 3х6.
        //  И записать в него значения:
        //   a1  a2  a3  a4  a5  a6
        //   b1  b2  b3  b4  b5  b6
        //   c1  c2   c3  c4  c5  c6
        //   Распечатать массив.

        String[][] array2 = new String[3][6];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (i == 0) {
                    array2[i][j] = "a" + (j + 1);
                } else if (i == 1) {
                    array2[i][j] = "b" + (j + 1);
                } else {
                    array2[i][j] = "c" + (j + 1);
                }
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
      */


/*
        //ЗАДАЧА_3_1
        //Двумерный массив типа char.
        //Создать двумерный массив типа char размером 4х2.
        //Записать в него значения с помощью блока для инициализации.
        //Распечатать значения массива.
         char[][] arrayChar = new char[4][2];
        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < arrayChar[i].length; j++) {
               arrayChar[i][j] = 'a';
                System.out.print( arrayChar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        char[][] arrayChar2 = new char[][] {{'a','b'},{'c','d'},{'e','f'},{'g','h'}};
        for (int i = 0; i < arrayChar2.length; i++) {
            for (int j = 0; j < arrayChar2[i].length; j++) {
                arrayChar[i][j] = 'a';
                System.out.print( arrayChar2[i][j] + " ");
            }
            System.out.println();
        }
 */

/*
        //ЗАДАЧА_4
       // Поиск максимального и минимального значения в каждой строке массива.
      // Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
      // Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
      // Распечатать массив, содержащий максимальное и минимальное значение.

        int[][] array = new int[5][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(-10, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[][] minMaxArray = new int[array.length][2];

        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

            // Заполняем новый массив
            minMaxArray[i][0] = min; // Минимальное значение
            minMaxArray[i][1] = max; // Максимальное значение
        }

        // Вывод значений нового массива
        System.out.println("Новый двумерный массив (мин, макс):");
        for (int i = 0; i < minMaxArray.length; i++) {
            System.out.println(minMaxArray[i][0] + "," + minMaxArray[i][1]);
        }
*/

/*
        // ЗАДАЧА_5
        // максимальный  элемент двумерного массива
        // минимальный  элемент двумерного массива

        System.out.println("Введите количество строк в массиве");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int arraySizeV = scanner.nextInt();
        System.out.println("Введите количество элементов в строке");
        int arraySizeH = scanner.nextInt();
        scanner.close();

        int[][] array5 = new int[arraySizeV][arraySizeH];

        //заполняем массив
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = ThreadLocalRandom.current().nextInt(0, 15);
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }
        int maxValue = array5[0][0];
        int minValue = array5[0][0];

        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                if (array5[i][j] > maxValue) {
                    maxValue = array5[i][j];
                }
                if (array5[i][j] < minValue) {
                    minValue = array5[i][j];
                }
            }
        }

        System.out.println("\n" + "Максимальное значение: " + maxValue + "\n");
        System.out.println("Минимальное значение: " + minValue);
 */

        // ЗАДАЧА_6
        // Вычислить сумму всех элементов двумерного массива.

        int totalSum = 0;

        // Задаем размерномть массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужно задать размер массива.");
        System.out.print("Задайте количество 'элементов' в каждой строке массива: ");
        int array6SizeByH = scanner.nextInt();
        System.out.print("Задайте количество 'строк' в массиве: ");
        int array6SizeByV = scanner.nextInt();
        System.out.println("Будет создан массив размерностью: " + array6SizeByH + " x " + array6SizeByV);


        int[][] array6 = new int[array6SizeByH][array6SizeByV];

        // Заполняем массив случайными значениями
        System.out.println("\nЗадайте минимальную и максимальную границу диапазона чисел для заполения массива \n");
        System.out.print("Минимум: ");
        int minRange = scanner.nextInt();

        System.out.print("Максимум: ");
        int maxRange;

        //проверяем, границы диапазона
        do {
            maxRange = scanner.nextInt();
            if (maxRange <= minRange) {
                System.out.print("Минимум должен быть больше и НЕ равен максимуму.\n Повторите ввод: ");
            }
        }
        while (maxRange <= minRange);

        scanner.close();

        System.out.println("Заполненный массив и сумму элементов массива");
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                array6[i][j] = ThreadLocalRandom.current().nextInt(minRange, maxRange);
                totalSum = totalSum + array6[i][j];
                // выводим
                System.out.print(" " + array6[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Общая сумма элментов массива: " + totalSum);

    }
}




