package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Say something..");
        String input = scanner.nextLine();
        return String.format(input);
    }
    public String getString(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();
        return String.format(input);
    }

    public boolean yesNo() {
        System.out.println("Yay or nay ?");
        String str = scanner.next();
        return str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("yea") || str.equalsIgnoreCase("yay");
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String str = scanner.next();
        return str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("yea") || str.equalsIgnoreCase("yay");

    }

    public int getInt(int min, int max) {
        System.out.printf("Enter number between %d and %d%n",min,max);
        int input = scanner.nextInt();
        if (input < min || input > max) {
            getInt(min, max);
        }
        return input;
    }
    public int getInt(String prompt, int min, int max){
        System.out.println(prompt);
        int input = scanner.nextInt();
        if (input < min || input > max) {
            getInt(min, max);
        }
        return input;
    }

    public int getInt() {
        int input = scanner.nextInt();
        return input;
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }

    public Double getDouble(double min, double max) {
        double input = scanner.nextInt();
        if (input < min || input > max) {
            getDouble(min, max);
        }
        return input;
    }
    public Double getDouble(String prompt,double min, double max) {
        System.out.println(prompt);
        double input = scanner.nextInt();
        if (input < min || input > max) {
            getDouble(min, max);
        }
        return input;
    }

    public Double getDouble() {
        double input = scanner.nextDouble();
        return input;

    }
    public Double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();

    }
}

