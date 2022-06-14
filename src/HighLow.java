
import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int RandomNumber() {
        Random random = new Random();
        int oneToHundred = random.nextInt((101) - 1) + 1;
        return oneToHundred;
    }

    public static void OutPut(int num, int guesses) {
        Scanner scanner = new Scanner(System.in);
        if (guesses == 5) System.out.println("5 more tries before you lose !");
        int input = scanner.nextInt();
        guesses++;
        if (guesses == 10) {
            System.out.println("You Lose!");
        } else if (input == num) {
            System.out.println("YOU GUESSED IT!\nIt took you " + guesses + " tries !");
        } else if (input > num) {
            System.out.println("LOWER!");
            System.out.printf("Counter:%d%n", guesses);
            OutPut(num, guesses);
        } else {
            System.out.println("HIGHER!");
            System.out.printf("Counter:%d%n", guesses);
            OutPut(num, guesses);
        }

    }


    public static void GuessingGame() {
        System.out.println("Guess a number 1 to 100");
        int num = RandomNumber();
        int guesses = 0;
        OutPut(num, guesses);
    }

    public static void main(String[] args) {
        GuessingGame();
    }
}
