import java.util.Scanner;

public class MethodsExercises {

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiply(int num1, int num2) {
        int num3 = num1;
        for (int i = 1; i < num2; i++) {
            num3 += num1;

        }
        return num3;
    }

    public static double Divide(double num1, double num2) {
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int GetInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        Boolean decision = true;
        System.out.println("Give me a number between 1 and 50");
        int userInput = scanner.nextInt();

        while (decision) {

            if (userInput >= min && userInput <= max) {
                decision = false;
                System.out.println("That number is within range !");

            } else {
                userInput = scanner.nextInt();
            }
        }

        return userInput;
    }

    public static void main(String[] args) {
        System.out.println(Addition(1, 2));
        System.out.println(Subtraction(5, 2));
        System.out.println(Multiply(4, 4));
        System.out.println(Divide(9, 3));
        System.out.println(Modulus(15, 3));
        int userInput = GetInteger(1,50);
        System.out.println(userInput);

    }


}
