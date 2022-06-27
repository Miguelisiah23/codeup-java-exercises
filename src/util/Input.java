package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        System.out.println("Enter an input");
        String input = scanner.nextLine();
        return String.format(input);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        return String.format(input);
    }

    public boolean yesNo() {
        System.out.println("Yay or nay ?");
        String str = scanner.next();
        return str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("yea") || str.equalsIgnoreCase("yay");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String str = scanner.next();
        return str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("yea") || str.equalsIgnoreCase("yay");

    }

    public int getInt(int min, int max) {
        System.out.printf("Enter number between %d and %d%n", min, max);
        int input = scanner.nextInt();
        if (input < min || input > max) {
           return getInt(min, max);
        }
        return input;
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int input = scanner.nextInt();
        if (input < min || input > max) {
           return getInt(min, max);
        }
        return input;
    }

    public int getInt() {
        System.out.println("Enter a number");
        String input = getString();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return getInt();
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int input = scanner.nextInt();
        return input;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double input = scanner.nextDouble();
        if (input < min || input > max) {
          return  getDouble(min, max);
        }
        return input;
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double input = scanner.nextDouble();
        if (input < min || input > max) {
           return getDouble(prompt, min, max);
        }
        return input;
    }

    public double getDouble() {
        try {
            System.out.println("Enter a number");
            String input = getString();
            return Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return getDouble();
        }


    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double input = scanner.nextDouble();
        return input;

    }
}

