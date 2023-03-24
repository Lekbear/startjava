public class GuessNumber {
    public static void main(String[] args) {
        int left = 0;
        int right = 100;
        int hiddenNumber = 76;

        while (left <= right) {
            int playerNumber = (left + right) / 2;

            if (playerNumber == hiddenNumber) {
                break;
            } 

            if (playerNumber > hiddenNumber) {
                System.out.println("Число " + playerNumber + " больше загаданного");
                right = playerNumber;
            } else {
                System.out.println("Число " + playerNumber + " меньше загаданного");
                left = playerNumber;
            }
        }
        System.out.println("Вы победили!");
        System.out.println("Загаданно число: " + hiddenNumber);
    }
}