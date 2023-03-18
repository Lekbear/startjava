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

        boolean male = true;
        
        if (!male) {
            System.out.println("Ваш пол не мужской");
        } else {
            System.out.println("Ваш пол мужской");
        }

        char firstSymbOfName = "Alexey".charAt(0);

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
        System.out.println("2. Поиск max и min числа");

        int number1 = 123;
        int number2 = 321;

        System.out.println("Исходные числа: " + number1 + ", " + number2);

        if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else {
            System.out.println(number1 + " < " + number2);
        }

        System.out.println();
    }

    private static void printInfoNumber() {
        System.out.println("3. Проверка числа");

        int number = 123;

        System.out.println("Проверка числа: " + number);
        System.out.print("Число ");
        if (number == 0) {
            System.out.println(" = " + number);
        } else {
            if (number % 2 == 0) {
                System.out.print("четное ");
            } else {
                System.out.print("нечетное ");
            }

            if (number > 0) {
                System.out.println("и положительное");
            } else {
                System.out.println("и отрицательное");
            }
        }

        System.out.println();
    }

    private static void printInfoDigit() {
        System.out.println("4. Поиск одинаковых цифр в числах");

        int number1 = 123;
        int number2 = 223;

        int ones1 = number1 % 10;
        int tens1 = number1 / 10 % 10;
        int hundreds1 = number1 / 100 % 10;

        int ones2 = number2 % 10;
        int tens2 = number2 / 10 % 10;
        int hundreds2 = number2 / 100 % 10;

        System.out.println("Исходные числа: " + number1 + ", " + number2);
       
        if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println("В исходных числах равных цифр нет");
        } else {
            if (ones1 == ones2) {
                System.out.println("В исходных числах одинаковая цифра " + ones1 + " в 1 разряде");
            } 

            if (tens1 == tens2) {
                System.out.println("В исходных числах одинаковая цифра " + tens1 + " во 2 разряде");
            } 

            if (hundreds1 == hundreds2) {
                System.out.println("В исходных числах одинаковая цифра " + hundreds1 + " в 3 разряде");
            }
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

        float amount = 300000f;
        float percent = 7f;
        float amountPercent = 0f;

        if (amount < 100000f) {
            percent = 5;
        } else if (amount > 300000f) {
            percent = 10;
        }

        amountPercent = amount * percent / 100f;

        System.out.println("Сумма вклада: " + amount);
        System.out.println("Начисленный процент за год: " + amountPercent);
        System.out.println("Итоговая сумма с процентами: " + (amount + amountPercent) + '\n');
    }

    private static void printSubjectGrades() {
        System.out.println("7. Определение оценки по предметам");

        int percentHistory = 59;
        int percentProgramming = 91;
        int gradeHistory = receiveGradeByPersent(percentHistory);
        int gradeProgramming = receiveGradeByPersent(percentProgramming);

        System.out.println("Оценка по истории: " + gradeHistory);
        System.out.println("Оценка по программированию: " + gradeProgramming);
        System.out.println("Средний бал оценок по предметам: " + (gradeHistory + gradeProgramming) / 2 );
        System.out.println("Средний процент по предметам: " + (percentHistory + percentProgramming) / 2 + '\n');
    }

    private static int receiveGradeByPersent(int percent) {
        if (percent <= 60) {
            return 2;
        } else if (percent <= 73) {
            return 3;
        } else if (percent <= 91) {
            return 4;
        } else {
            return 5;
        }
    }

    private static void printCalcProfit() {
        System.out.println("8. Расчет прибыли за год");

        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int profit = (revenue - rent - costPrice) * 12;
        
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println();
    }

    private static void printCountBanknotes() {
        System.out.println("9. Подсчет количества банкнот\n");

        int money = 567;
        int usd1 = 50;
        int usd10 = 5;
        int usd100 = 10;

        System.out.println("Доступное количество банкнот: ");
        System.out.println(usd100 + " банкнот номиналом 100 USD");
        System.out.println(usd10 + " банкнот номиналом 10 USD"); 
        System.out.println(usd1 + " банкнот номиналом 1 USD\n"); 

        int issuance100 = usd100;
        int current = money / 100;

        if (issuance100 > current) {
            issuance100 = current;
        }

        int issuance10 = usd10;
        int actualMoney = issuance100 * 100;
        current = money - actualMoney;

        if (issuance10 > current) {
            issuance10 = current;
        }

        int issuance1 = usd1;
        actualMoney += issuance10 * 10;
        current = money - actualMoney;

        if (issuance1 > current) {
            issuance1 = current;
        }

        actualMoney += issuance1;

        if (money != actualMoney) {
            System.out.println("Не хватает банкнот для выдачи всей суммы");
        } else {
            System.out.println("Требуемое количество банкнот для выдачи:");
            System.out.println(issuance100 + " банкнот номиналом 100 USD");
            System.out.println(issuance10 + " банкнот номиналом 10 USD"); 
            System.out.println(issuance1 + " банкнот номиналом 1 USD\n"); 
            System.out.println("Выдаваемая сумма: " + actualMoney);
        }
    }
}