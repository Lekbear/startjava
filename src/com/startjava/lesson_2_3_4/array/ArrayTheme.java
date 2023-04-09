package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseIntArray();
        mulArray();
        delArray();
        reverseCharArray();
        genUniqueNum();
        copyNonBlank();
    }

    private static void reverseIntArray() {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {7, 1, 6, 2, 5, 3, 4};
        System.out.print("Исходный массив: ");
        printIntArray(numbers);

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

        System.out.print("Итоговый массив: ");
        printIntArray(numbers);
    }

    private static void printIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void mulArray() {
        System.out.println("\n2. Вывод произведения элементов массива");
        int length = 10;
        int[] numbers = new int[length];
        int mul = length > 2 ? 1 : 0;

        for (int i = 0; i < length; i++) {
            numbers[i] = i;
            boolean marginal = i != 0 && i != length - 1;
            mul = marginal ? mul * numbers[i] : mul;
            System.out.print(i == length - 2 ? numbers[i] + " = " + mul : marginal ? numbers[i] + " * " : "");
        }

        System.out.println(length > 2 ? "\nnum[0] = " + numbers[0] + "\nnum[9] : " + numbers[length - 1] + "\n" : '\n');
    }

    private static void delArray() {
        System.out.println("3. Удаление элементов массива");
        int length = 15;
        double[] numbers = new double[length];
        int countZero = 0;

        for (int i = 0; i < length; i++) {
            numbers[i] = Math.random();
        }

        System.out.println("Исходный массив:");
        printDoubleArray(numbers);

        for (int i = 0; i < length; i++) {
            if (numbers[i] > numbers[(length + 1) / 2 - 1]) {
                numbers[i] = 0.0d;
                countZero++;
            }
        }

        System.out.println("Изменённый массив:");
        printDoubleArray(numbers);
        System.out.println("Количество обнуленных ячеек: " + countZero);
    }

    private static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length + 1) / 2 - 1) {
                System.out.printf("%5.3f%n", array[i]);
            } else {
                System.out.printf("%5.3f ", array[i]);
            }
        }
        System.out.println();
    }

    private static void reverseCharArray() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] symbols = new char['Z' - 'A' + 1];
        int index = 0;

        for (char symbol = 'A'; symbol <= 'Z'; symbol++) {
            symbols[index++] = symbol;
        }

        for (int i = 1; i <= symbols.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbols[symbols.length - j - 1]);
            }
            System.out.println();
        }
    }

    private static void genUniqueNum() {
        System.out.println("\n5. Генерация уникальных чисел");
        int left = 60;
        int right = 100;
        int length = 30;
        int[] uniqueNumbers = new int[length];
        int[] numbers = new int[right];
        int index = 0;

        while (index < length) {
            int number = (int) (Math.random() * (right - left) + left);
            if (numbers[number] == 0) {
                numbers[number]++;
                uniqueNumbers[index++] = number;
            }
        }

        Arrays.sort(uniqueNumbers);

        for (int i = 0; i < uniqueNumbers.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.printf("%3d%n", uniqueNumbers[i]);
            } else {
                System.out.printf("%3d ", uniqueNumbers[i]);
            }
        }
    }

    private static void copyNonBlank() {
        System.out.println("\n6. Копирование не пустых строк");
        String[] strs = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int length = 0;

        for (String str : strs) {
            if (!str.isBlank()){
                length++;
            }
        }

        String[] copyStrs = new String[length];
        int index1 = -1;
        int index2 = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isBlank() && index1 != -1) {
                System.arraycopy(strs, index1, copyStrs, index2, i - index1);
                index2 += i - index1;
                index1 = -1;
            }

            if (!strs[i].isBlank() && index1 == -1) {
                index1 = i;
            }
        }

        if (index1 != -1) {
            System.arraycopy(strs, index1, copyStrs, index2, strs.length - index1);
        }

        System.out.println("Исходный массив: ");
        printStrArray(strs);
        System.out.println("Массив без пустых строк и без строк из пробелов: ");
        printStrArray(copyStrs);
    }

    private static void printStrArray(String[] array) {
        System.out.print('{');
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\"%s\"", array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}\n");
    }
}
