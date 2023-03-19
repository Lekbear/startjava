public class GuessNumber {
    public static void main(String[] args) {
        int left = 0;
        int right = 100;
        int hiddenNumber = 76;

        while (left + 1 < right) {
            int middle = (left + right) / 2;

            if (hiddenNumber < middle) {
                System.out.println("Загаданное число меньше " + middle);
                right = middle;
            } else {
                System.out.println("Загаданное число больше " + middle);
                left = middle;
            }
        }
        System.out.println("Вы победили!");
        System.out.println("Загаданно число: " + left);
    }
}