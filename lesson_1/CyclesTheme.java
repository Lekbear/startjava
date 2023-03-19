public class CyclesTheme {
    public static void main(String[] args) {
        printSumInterval();
        printNumbersIntreval();
        printReversibleNumber();
        printNumbersMultipleLines();
        printCheckNumberTwosEvenOdd();
        printFigures();
        printAsciiChar();
        printCheckPalindrome();
        printCheckNumberLucky();
        printPythagoreanTable();
    }

    public static void printSumInterval() {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumOdd = 0;
        int sumEven = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter < 22);

        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а " + 
                "нечетных = " + sumOdd + "\n");
    }

    public static void printNumbersIntreval() {
        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");

        int number1 = 10;
        int number2 = 5;
        int number3 = -1;

        int minNumber = number1;
        int maxNumber = number1;

        if (number2 > maxNumber) {
            maxNumber = number2;
        }

        if (number3 > maxNumber) {
            maxNumber = number3;
        }

        if (number2 < minNumber) {
            minNumber = number2;
        }

        if (number3 < minNumber) {
            minNumber = number3;
        }

        for (int i = maxNumber - 1; i > minNumber; i--) {
            System.out.print(i + " ");
        }
    }

    public static void printReversibleNumber() {
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int number = 1234;
        int sum = 0;

        System.out.print("Исходное число в обратном порядке: ");

        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sum += digit;
            number /= 10;
        }

        System.out.println("\nСумма цифр: " + sum + "\n");
    }

    public static void printNumbersMultipleLines() {
        System.out.println("4. Вывод чисел на консоль в несколько строк");

        int left = 1;
        int right = 24;
        int countNumber = 0;

        for (int i = left; i < right; i += 2) {
            System.out.printf("%4d ", i);
            countNumber++;

            if (countNumber == 5) {
                countNumber = 0;
                System.out.println();
            } 
        };

        for (int i = countNumber;i < 5 && i != 0; i++){
            System.out.printf("%4d ", 0);
        }

    }

    public static void printCheckNumberTwosEvenOdd() {
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");

        int number = 3242592;

        System.out.print("Число " + number + " содержит ");

        int countTwo = 0;

        while (number > 0) {
            if (number % 10 == 2) {
                countTwo++;
            }
            number /= 10;
        }

        System.out.print(countTwo + " двойки - это ");

        if (countTwo % 2 == 0) {
            System.out.print("четное ");
        } else {
            System.out.print("нечетное ");
        }

        System.out.println("количество двоек\n");
    }

    public static void printFigures() {
        System.out.println("6. Отображение фигур в консоли");

        int rectangleHeight = 5;
        int rectangleWidth = 10;

        for (int i = 0; i < rectangleHeight; i++) {
            for (int j = 0; j < rectangleWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int triangleRightHeight = 5;
        int triangleRightWidth = 5;

        while (triangleRightHeight > 0) {
            while (triangleRightWidth > 0) {
                System.out.print("#");
                triangleRightWidth--;
            }

            triangleRightHeight--;
            triangleRightWidth = triangleRightHeight;

            System.out.println();
        }

        System.out.println();

        int triangleEquilHeight = 5;
        int triangleEquilWidth = 1;
        int counter = 1;

        do {
            do {
                System.out.print("$");
                triangleEquilWidth--;
            } while (triangleEquilWidth > 0);

            counter++;
            triangleEquilHeight--;

            if (counter >= triangleEquilHeight) {
                triangleEquilWidth = triangleEquilHeight;
            } else {
                triangleEquilWidth = counter;
            }
            System.out.println();
        } while (triangleEquilHeight > 0);
    }

    public static void printAsciiChar() {
        System.out.printf("\n7. Отображение ASCII-символов%n%5s%5s%n", "Dec", "Char");

        for (int i = 0; i < 48 ; i++) {
            if ((int) i % 2 == 1) {
                System.out.printf("%5s%5s%n", i, (char) i);
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            if ((int) i % 2 == 0) {
                System.out.printf("%5d%5s%n", (int) i, i);
            }
        }
    }

    public static void printCheckPalindrome() {
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number = 1234321;
        int saveNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10; 
        }

        System.out.print("Число " + saveNumber);

        if (saveNumber != reverseNumber) {
            System.out.print(" не");
        }

        System.out.println(" является палиндромом\n");
    }

    public static void printCheckNumberLucky() {
        System.out.println("9. Определение, является ли число счастливым");

        int number = 123321;
        int reverseNumber = 0;
        int middle = 3;
        int sum1 = 0;
        int sum2 = 0;

        System.out.println("Исходное число: " + number);
        System.out.print("Сумма цифр ");        
        
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }

        for (int i = 0; i < middle; i++) {
            System.out.print(reverseNumber % 10);
            sum2 += reverseNumber % 10;
            reverseNumber /= 10;
        }
        
        System.out.print(" = " + sum2 + "\nСумма цифр ");
        
        for (int i = 0; i < middle; i++) {
            System.out.print(reverseNumber % 10);
            sum1 += reverseNumber% 10;
            reverseNumber /= 10;
        }

        System.out.println(" = " + sum1);
        System.out.print("Число ");

        if (sum1 != sum2) {
            System.out.print("не ");
        } 

        System.out.println("является счастливым\n");
    }

    public static void printPythagoreanTable() {
        System.out.println("10. Вывод таблицы умножения Пифагора");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    System.out.printf("%3s", "");
                } else if (i == 0 && j == 1) {
                    System.out.printf("%s", "|");
                } else if (i == 1 && j == 0) {
                    System.out.printf("%3s", "---");
                } else if (i == 1 && j == 1) {
                    System.out.printf("%s", "|");
                } else if (i == 0) {
                    System.out.printf("%3d", j);
                } else if (j == 0) {
                    System.out.printf("%3d", i);
                } else if (i == 1) {
                    System.out.printf("%3s", "---");
                } else if (j == 1) {
                    System.out.printf("%s", "|");
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}