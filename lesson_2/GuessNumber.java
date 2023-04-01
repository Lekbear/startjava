public class GuessNumber {
    private Player player1;
    private Player player2;
    private int left;
    private int right;
    private int hiddenNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        left = 1;
        right = 101;
        hiddenNumber = (int) (Math.random() * (right - left) + left);
        System.out.println("Компьютер загадал число");
    }

    public void start() {
        while (true) {
            System.out.print("Попытка игрока " + player1.getName() + " угадать число: ");
            player1.guessNumber(left, right);
            if (checkWin(player1.getNumber())) {
                System.out.println("Игрок " + player1.getName() + " угадал загаданное число");
                break;
            }

            System.out.print("Попытка игрока " + player2.getName() + " угадать число: " );
            player2.guessNumber(left, right);
            if (checkWin(player2.getNumber())) {
                System.out.println("Игрок " + player2.getName() + " угадал загаданное число");
                break;
            }
            
        }
    }

    private boolean checkWin(int playerNumber) {
        if (playerNumber > hiddenNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else if (playerNumber < hiddenNumber) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        } else {
            return true;
        }
        return false;
    }
}