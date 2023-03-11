public class IfElseStatementTheme {
    public static void main(String[] args) {
        printInfoPerson();
        printMinMax();
        printInfoNumber();
        printInfoDigit();
        printInfoSymbol();
        printCalcAmount();
        printSubjectGrades();
        printCalcProfit();
        printCountBanknotes();
    }

    private static void printInfoPerson() {
        System.out.println("1. Перевод псевдокода на язык Java");
        
        int age = 24;
        
        if (age > 20) {
            System.out.println("Ваш возраст больше 20 лет");
        } else {
            System.out.println("Ваш возраст меньше или равен 20");
        }

        boolean gender = true;
        
        if (!gender) {
            System.out.println("Ваш пол не мужской");
        } else {
            System.out.println("Ваш пол мужской");
        }

        String name = "Alexey";
        char firstSymbOfName = name.charAt(0);

        if (firstSymbOfName == 'M') {
            System.out.println("Ваше имя начинается с буквы 'M'");
        } else if (firstSymbOfName == 'I') {
            System.out.println("Ваше имя начинается с буквы 'I'");
        } else {
            System.out.println("Ваше имя начинается не с букв: 'M', 'I'");
        }
        System.out.println();
    }

    private static void printMinMax() {
        int number1 = 123;
        int number2 = 321;

        System.out.println("2. Поиск max и min числа");
        System.out.println("Исходные числа: " + number1 + ", " + number2);

        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println(number1 + " < " + number2);
        }
        System.out.println();
    }

    private static void printInfoNumber() {
        System.out.println("3. Проверка числа");
        int number = 123;
        System.out.println("Проверка числа: " + number);

        if (number == 0) {
            System.out.println("Число является нулём");
        } else {
            if (number % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }

            if (number > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }
        System.out.println();
    }

    private static void printInfoDigit() {
        System.out.println("4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;
        int digit = 1;

        System.out.println("Исходные числа: " + num1 + ", " + num2);

        while (num1 > 0) {
            if (num1 % 10 == num2 % 10) {
                System.out.println("Одинаковое число: " + num1 % 10 + " в разряде: " + digit);
            }

            num1 /= 10;
            num2 /= 10;
            digit++;
        }
        System.out.println();
    }

    private static void printInfoSymbol() {
        System.out.println("5. Определение символа по его коду");

        char symbol = '\u0057';
        System.out.println("Исходный символ: " + symbol);

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - это маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - это большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - это число");
        } else {
            System.out.println(symbol + "- это не буква и не число");
        }

        System.out.println();
    }

    private static void printCalcAmount() {
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");

        int amount = 300000;
        int percent = 0;

        if (amount < 100000) {
            percent = 5;
        } else if (percent >= 100000 && percent <= 300000) {
            percent = 7;
        } else {
            percent = 10;
        }

        System.out.println("Сумма вклада: " + amount);
        System.out.println("Начисленный процент за год: " + amount * percent / 100);
        System.out.println("Итоговая сумма с процентами: " + (amount + amount * percent / 100) + '\n');

    }

    private static void printSubjectGrades() {
        int percentHistory = 59;
        int percentProgramming = 91;

        int gradeHistory = getGradeByPersent(percentHistory);
        int gradeProgramming = getGradeByPersent(percentProgramming);

        System.out.println("7. Определение оценки по предметам");
        System.out.println("Оценка по истории: " + gradeHistory);
        System.out.println("Оценка по программированию: " + gradeProgramming);
        System.out.println("Средний бал оценок по предметам: " + (gradeHistory + gradeProgramming) / 2 );
        System.out.println("Средний процент по предметам: " + (percentHistory + percentProgramming) / 2 + '\n');

    }

    private static int getGradeByPersent(int percent) {
        if (percent <= 60) {
            return 2;
        } else if (percent <= 73) {
            return 3;
        } else if (percent <= 91){
            return 4;
        } else {
            return 5;
        }
    }

    private static void printCalcProfit() {
        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int profit = (revenue - rent - costPrice) * 12;

        System.out.println("8. Расчет прибыли за год");
        
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println();
    }

    private static void printCountBanknotes() {
        int money = 567;
        int[] banknotes = {100, 10, 1};
        int[] countBanknotes = {10, 5, 50};
        int[] countRequireds = {0, 0, 0};

        System.out.println("9. Подсчет количества банкнот");
        System.out.println("Выдаваемая сумма: " + money);

        int i = 0;
        while (i < banknotes.length && money > 0) {
            int countRequired = 0;
            
            if (banknotes[i] != 0) {
                countRequired = money / banknotes[i];
            }
            
            int countAvailable = Math.min(countRequired, countBanknotes[i]);
            countRequireds[i] = countAvailable;
            countBanknotes[i] -= countAvailable;
            money -= banknotes[i] * countAvailable;
            i++;
        }

        if (money != 0) {
            System.out.println("Не хватает банкнот для выдачи всей суммы");
        } else {
            System.out.print("Номиналы банкнот: ");
        
            for (i = 0; i < banknotes.length; i++) {
                System.out.print(banknotes[i] + " ");
            }
        
            System.out.print("\nТребуемое их количество: ");
        
            for (i = 0; i < countRequireds.length; i++) {
                System.out.print(countRequireds[i] + " ");
            }
        }
    }
}