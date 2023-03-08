public class VariablesTheme {

    public static void main(String[] args) {
        printTask1();
        printTask2();
        printTask3();
        printTask4();
        printTask5();
        printTask6();
        printTask7();
        printTask8();
        printTask9();
    }

    private static void printTask1() {
        final String DESCRIPTION_TASK1          = "1. Вывод значений переменных на консоль\n";
        final String DESCRIPTION_RAM            = "Количество гигабайт оперативной памяти: ";
        final String DESCRIPTION_SHADERS        = "Количество шейдерных процесов в видеоадаптаре: ";
        final String DESCRIPTION_BUS_WIDTH      = "Ширина шины между графическим процессором и видеопамятью: ";
        final String DESCRIPTION_GPU_CLOCK      = "Текущая выбранная частота графического процессора: ";
        final String DESCRIPTION_PIXEL_FILLRATE = "Количество пикселей, которые могут быть просчитаны видеоадаптером за одну секунду: ";
        final String DESCRIPTION_BAND_WIDTH     = "Эффективная пропускная способность шины между графическим процессором и видеопамятью: ";
        final String DESCRIPTION_ROP            = "Количество блоков растровых операций в видеоадаптаре: ";
        final String DESCRIPTION_OPENCL         = "Доступность технологии openCl в видеоадаптаре: ";

        byte ram            = 16;
        short shaders       = 24;
        int busWidth        = 128;
        long gpuСlock       = 350;
        float pixelFillrate = 8.4f;
        double bandWidth    = 42.7d;
        char rop            = '8';
        boolean openCl      = true;

        System.out.println(DESCRIPTION_TASK1 +
                DESCRIPTION_RAM            + ram           + '\n' +
                DESCRIPTION_SHADERS        + shaders       + '\n' +
                DESCRIPTION_BUS_WIDTH      + busWidth      + '\n' +
                DESCRIPTION_GPU_CLOCK      + gpuСlock      + '\n' +
                DESCRIPTION_PIXEL_FILLRATE + pixelFillrate + '\n' + 
                DESCRIPTION_BAND_WIDTH     + bandWidth     + '\n' +
                DESCRIPTION_ROP            + rop           + '\n' +
                DESCRIPTION_OPENCL         + openCl        + '\n');
    }

    private static void printTask2() {
        final String DESCRIPTION_TASK2        = "2. Расчет стоимости товара со скидкой\n";
        final String DESCRIPTION_PRICE_NO_DIS = "Общая стоимость товаров без скидки: ";
        final String DESCRIPTION_PRICE_DIS    = "Общая стоимость товаров со скидкой: ";
        final String DESCRIPTION_SUM_DIS      = "Сумма скидки: ";

        float penPrice             = 100f;
        float bookPrice            = 200f;
        float discount             = 11f;
        float totalPriceNoDiscount = penPrice + bookPrice;
        float sumDiscount          = totalPriceNoDiscount * discount / 100f;
        float totalPriceDiscount   = totalPriceNoDiscount - sumDiscount;

        System.out.println(DESCRIPTION_TASK2 +
                DESCRIPTION_PRICE_NO_DIS + totalPriceNoDiscount + '\n' + 
                DESCRIPTION_SUM_DIS      + sumDiscount          + '\n' +
                DESCRIPTION_PRICE_DIS    + totalPriceDiscount   + '\n');
    }

    private static void printTask3() {
        final String DESCRIPTION_TASK3 = "3. Вывод слова JAVA\n";

        System.out.println(DESCRIPTION_TASK3 + 
                "   J    a  v     v  a   \n" +
                "   J   a a  v   v  a a  \n" +
                "J  J  aaaaa  V V  aaaaa \n" +  
                " JJ  a     a  V  a     a\n");
    }

    private static void printTask4() {
        final String DESCRIPTION_TASK4    = "4. Вывод min и max значений целых числовых типов\n";
        final String STR_MAX_VALUE        = "Максимальное значение типа ";
        final String STR_PLUS_1           = " + 1";
        final String STR_MINUS_1          = " - 1";
        final String STR_SEP              = " = ";

        byte numberByte   = Byte.MAX_VALUE; 
        short numberShort = Short.MAX_VALUE;
        int numberInt     = Integer.MAX_VALUE;
        long numberLong   = Long.MAX_VALUE;

        System.out.println(DESCRIPTION_TASK4 +
                STR_MAX_VALUE + Byte.TYPE    + STR_SEP    + numberByte  + "\n" + 
                STR_MAX_VALUE + Short.TYPE   + STR_SEP    + numberShort + "\n" + 
                STR_MAX_VALUE + Integer.TYPE + STR_SEP    + numberInt   + "\n" + 
                STR_MAX_VALUE + Long.TYPE    + STR_SEP    + numberLong  + "\n\n" +
                STR_MAX_VALUE + Byte.TYPE    + STR_PLUS_1 + STR_SEP     + ++numberByte  + "\n" + 
                STR_MAX_VALUE + Short.TYPE   + STR_PLUS_1 + STR_SEP     + ++numberShort + "\n" + 
                STR_MAX_VALUE + Integer.TYPE + STR_PLUS_1 + STR_SEP     + ++numberInt   + "\n" + 
                STR_MAX_VALUE + Long.TYPE    + STR_PLUS_1 + STR_SEP     + ++numberLong  + "\n\n" +
                STR_MAX_VALUE + Byte.TYPE    + STR_PLUS_1 + STR_MINUS_1 + STR_SEP       + --numberByte  + "\n" + 
                STR_MAX_VALUE + Short.TYPE   + STR_PLUS_1 + STR_MINUS_1 + STR_SEP       + --numberShort + "\n" + 
                STR_MAX_VALUE + Integer.TYPE + STR_PLUS_1 + STR_MINUS_1 + STR_SEP       + --numberInt   + "\n" + 
                STR_MAX_VALUE + Long.TYPE    + STR_PLUS_1 + STR_MINUS_1 + STR_SEP       + --numberLong  + "\n");
    }

    private static void printTask5() {
        final String DESCRIPTION_TASK5   = "5. Перестановка значений переменных\n";
        final String STR_VARIABLE        = "5.1. C помощью третьей переменной:\n";
        final String STR_ARITHMETIC_OPER = "5.2. C помощью арифметических операций:\n";
        final String STR_BITWICE_OPER    = "5.3. C помощью побитовой операции\n";
        final String STR_INITIAL         = "Исходные значения переменных: ";
        final String STR_NEW             = "Новые значения переменных: ";
        final String STR_SEP             = " ";

        System.out.println(DESCRIPTION_TASK5);
        int number1 = 2;
        int number2 = 5;

        System.out.println(STR_VARIABLE + STR_INITIAL + number1 + STR_SEP + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println(STR_NEW + number1 + STR_SEP + number2 + '\n');

        System.out.println(STR_ARITHMETIC_OPER + STR_INITIAL + number1 + STR_SEP + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println(STR_NEW + number1 + STR_SEP + number2 + '\n');

        System.out.println(STR_BITWICE_OPER + STR_INITIAL + number1 + STR_SEP + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println(STR_NEW + number1 + STR_SEP + number2 + '\n');
    }

    private static void printTask6() {
        final String DESCRIPTION_TASK6 = "6. Вывод символов и их кодов\n";
        final String STR_SYMBOL        = ", Символ: ";
        final String STR_CODE_SYMBOL   = "Код символа: ";

        char symbol1 = '#';
        char symbol2 = '&';
        char symbol3 = '@';
        char symbol4 = '^';
        char symbol5 = '_';

        int code_Symbol1 = symbol1;
        int code_Symbol2 = symbol2;
        int code_Symbol3 = symbol3;
        int code_Symbol4 = symbol4;
        int code_Symbol5 = symbol5;

        System.out.println(DESCRIPTION_TASK6 +
                STR_CODE_SYMBOL + code_Symbol1 + STR_SYMBOL + symbol1 + '\n' +
                STR_CODE_SYMBOL + code_Symbol2 + STR_SYMBOL + symbol2 + '\n' +
                STR_CODE_SYMBOL + code_Symbol3 + STR_SYMBOL + symbol3 + '\n' +
                STR_CODE_SYMBOL + code_Symbol4 + STR_SYMBOL + symbol4 + '\n' +
                STR_CODE_SYMBOL + code_Symbol5 + STR_SYMBOL + symbol5 + '\n');
    }

    private static void printTask7() {
        final String DESCRIPTION_TASK7 = "7. Вывод в консоль ASCII-арт Дюка\n";
        final String STR_SPACE6 = "      ";
        final String STR_SPACE4 = "    ";
        final String STR_SPACE3 = "   ";
        final String STR_SPACE2 = "  ";
        final String STR_SPACE1 = " ";
        
        char slashRight   = '/';
        char slashLeft    = '\\';
        char underLine    = '_';
        char bracketLeft  = '(';
        char bracketRight = ')'; 

        System.out.println(DESCRIPTION_TASK7 +
                STR_SPACE4 + slashRight + slashLeft  + STR_SPACE4  + '\n' +
                STR_SPACE3 + slashRight + STR_SPACE2 + slashLeft   + STR_SPACE3 + '\n' +
                STR_SPACE2 + slashRight + underLine  + bracketLeft + STR_SPACE1 + bracketRight + slashLeft  + STR_SPACE2 + '\n' +
                STR_SPACE1 + slashRight + STR_SPACE6 + slashLeft   + STR_SPACE1 + '\n' +
                slashRight + underLine  + underLine  + underLine   + underLine  +
                slashRight + slashLeft  + underLine  + underLine   + slashLeft  + '\n');
    }

    private static void printTask8() {
        final String DESCRIPTION_TASK8 = "8. Вывод количества сотен, десятков и единиц числа\n";
        final String STR_NUMBER        = "Число ";
        final String STR_CONTAINS      = " содержит:";
        final String STR_TENS          = " десяток\n";
        final String STR_HUNDREDS      = " сотен\n";
        final String STR_ONES          = " единиц\n";
        final String STR_SUM           = "Сумма = ";
        final String STR_MUL           = "Произведение = ";

        int number = 123;
        System.out.println(DESCRIPTION_TASK8 + STR_NUMBER + number + STR_CONTAINS);
        
        int ones = number % 10;
        number /= 10;
        
        int tens = number % 10;
        number /= 10;

        int hundreds = number % 10;
        number /= 10;

        System.out.println(hundreds + STR_HUNDREDS +
                tens    + STR_TENS +
                ones    + STR_ONES + 
                STR_SUM + ( ones + tens + hundreds ) + '\n' + 
                STR_MUL + ones * tens * hundreds     + '\n');
    }

    private static void printTask9() {
        final String DESCRIPTION_TASK9 = "9. Вывод времени\n";
        final char STR_SEP             = ':';

        int seconds = 86399;
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        System.out.println(DESCRIPTION_TASK9 + hours + STR_SEP + minutes + STR_SEP + seconds);
    }
}