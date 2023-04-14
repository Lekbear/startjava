package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseIntArray();
        multiplyElementsArray();
        removeElementsArray();
        reverseAlphabet();
        genUniqueNums();
        copyNonBlankStrings();
    }

    private static void reverseIntArray() {
        System.out.println("1. Реверс значений массива");
        int[] nums = {7, 1, 6, 2, 5, 3, 4};
        System.out.print("Исходный массив: ");
        printIntArray(nums);
        int length = nums.length - 1;

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[length];
            nums[length--] = temp;
        }

        System.out.print("Итоговый массив: ");
        printIntArray(nums);
    }

    private static void printIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void multiplyElementsArray() {
        System.out.println("\n2. Вывод произведения элементов массива");
        int length = 10;
        int[] multipliers = new int[length];
        int product = 1;

        multipliers[length - 1] = length - 1;

        for (int i = 1; i < length - 1; i++) {
            multipliers[i] = i;
            product *= multipliers[i];
            System.out.print(multipliers[i]);
            System.out.print(i == length - 2 ? " = " + product : " * ");
        }

        System.out.println("\nnum[0] = " + multipliers[0] + "\nnum[9] : " + multipliers[length - 1] + "\n");
    }

    private static void removeElementsArray() {
        System.out.println("3. Удаление элементов массива");
        int length = 15;
        double[] nums = new double[length];

        for (int i = 0; i < length; i++) {
            nums[i] = Math.random();
        }

        System.out.println("Исходный массив:");
        printDoubleArray(nums);
        int countZero = 0;
        double middle = nums[(length + 1) / 2 - 1];

        for (int i = 0; i < length; i++) {
            if (nums[i] > middle) {
                nums[i] = 0.0d;
                countZero++;
            }
        }

        System.out.println("Изменённый массив:");
        printDoubleArray(nums);
        System.out.println("Количество обнуленных ячеек: " + countZero);
    }

    private static void printDoubleArray(double[] array) {
        int middle = (array.length + 1) / 2 - 1;
        for (int i = 0; i < array.length; i++) {
            if (i == middle) {
                System.out.printf("%5.3f%n", array[i]);
            } else {
                System.out.printf("%5.3f ", array[i]);
            }
        }
        System.out.println();
    }

    private static void reverseAlphabet() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char['Z' - 'A' + 1];

        for (char symbol = 'A'; symbol <= 'Z'; symbol++) {
            alphabet[symbol - 'A'] = symbol;
        }

        for (int i = 1; i <= alphabet.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[alphabet.length - j - 1]);
            }
            System.out.println();
        }
    }

    private static void genUniqueNums() {
        System.out.println("\n5. Генерация уникальных чисел");
        int left = 60;
        int right = 100;
        int length = 30;
        int[] uniqueNums = new int[length];
        int index = 0;

        while (index < length) {
            int num = (int) (Math.random() * (right - left) + left);
            boolean unique = true;

            for (int i = 0; i < index; i++) {
                if (uniqueNums[i] == num) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                uniqueNums[index++] = num;
            }
        }

        Arrays.sort(uniqueNums);

        for (int i = 0; i < uniqueNums.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.printf("%3d%n", uniqueNums[i]);
            } else {
                System.out.printf("%3d ", uniqueNums[i]);
            }
        }
    }

    private static void copyNonBlankStrings() {
        System.out.println("\n6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int length = 0;

        for (String str : srcStrings) {
            if (!str.isBlank()) {
                length++;
            }
        }

        String[] destSrings = new String[length];
        int srcPos = -1;
        int destPos = 0;

        for (int i = 0; i < srcStrings.length; i++) {
            boolean empty = srcStrings[i].isBlank();

            if (!empty && srcPos == -1) {
                srcPos = i;
            }

            if ((empty || i == srcStrings.length - 1) && srcPos != -1) {
                if (!empty) {
                    length = srcStrings.length - srcPos;
                } else {
                    length = i - srcPos;
                }
                System.arraycopy(srcStrings, srcPos, destSrings, destPos, length);
                destPos += length;
                srcPos = -1;
            }
        }

        System.out.println("Исходный массив: ");
        printStrArray(srcStrings);
        System.out.println("Массив без пустых строк и без строк из пробелов: ");
        printStrArray(destSrings);
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
