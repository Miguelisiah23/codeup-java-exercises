import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

//    public static int Addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int Subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int Multiply(int num1, int num2) {
//        int num3 = num1;
//        for (int i = 1; i < num2; i++) {
//            num3 += num1;
//
//        }
//        return num3;
//    }
//
//    public static double Divide(double num1, double num2) {
//        return num1 / num2;
//    }
//
//    public static int Modulus(int num1, int num2) {
//        return num1 % num2;
//    }
//
//    public static int GetInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me a number between 1 and 50");
//        int userInput = scanner.nextInt();
//        if (userInput >= min && userInput <= max) {
//            System.out.println("That number is within range !");
//        } else {
//            GetInteger(min, max);
//        }
//        return userInput;
//    }
//
//    public static long getFactorial() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 20");
//        int num = scanner.nextInt();
//        long factorial = 1;
//        if (num >=1 && num <= 20) {
//            System.out.println(num + "! = ");
//            for (int i = 1; i <= num; i++) {
//                factorial *= i;
//                if (i == num) {
//                    System.out.print(i + " = ");
//                    System.out.println(factorial);
//                } else {
//                    System.out.print(i + " x ");
//                }
//            }
//            System.out.println("Would you like to continue? [Y/N]");
//            String userInput = scanner.next().toLowerCase();
//            if (userInput.equals("y")) {
//                getFactorial();
//            }
//
//        } else {
//            getFactorial();
//        }
//        return factorial;
//    }
    public static void RollDice(){
        System.out.println("How many sides on dice?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Random random = new Random();
        int dice1 = random.nextInt((input + 1) - 1) + 1;
        int dice2 = random.nextInt((input + 1)- 1) + 1;
        System.out.println("Roll? [Y/N]");
        String roll = scanner.next().toLowerCase();
        if(roll.equals("y")){
            System.out.printf("You rolled a %d and a %d!%n",dice1,dice2);
        }
        System.out.println("Roll again ? [Y/N]");
        roll = scanner.next().toLowerCase();
        if(roll.equals("y")){
            RollDice();
        }

    }

    public static void main(String[] args) {
//        System.out.println(Addition(1, 2));
//        System.out.println(Subtraction(5, 2));
//        System.out.println(Multiply(4, 4));
//        System.out.println(Divide(9, 3));
//        System.out.println(Modulus(15, 3));
//        int userInput = GetInteger(1, 50);
//        System.out.println(userInput);
//        getFactorial();
RollDice();

    }


}
