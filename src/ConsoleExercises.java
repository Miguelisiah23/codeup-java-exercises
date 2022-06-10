import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter a number - ");
        int userInput = scanner.nextInt();
        System.out.printf("You entered the number: %d%n", userInput);
        System.out.println("Enter 3 words");
        String wordInput = scanner.next();
        String wordInput2 = scanner.next();
        String wordInput3 = scanner.next();
        System.out.printf("Your first word is \"%s\"%n", wordInput);
        System.out.printf("Your second word is \"%s\"%n", wordInput2);
        System.out.printf("Your third word is \"%s\"%n", wordInput3);
        System.out.println("Enter a sentence");
        String sentence = scanner.next();
        sentence += scanner.nextLine();
        System.out.printf("You entered: \"%s\"%n", sentence);
        System.out.println("Enter a height, a width and a length: ");

        double h = Double.parseDouble(scanner.next());
        double w = Double.parseDouble(scanner.next());
        double l = Double.parseDouble(scanner.next());
        double area = h * w;
        double perimeter = (h * 2) + (w * 2);
        double volume = l * w * h;

        System.out.printf("The area of the classroom is %.2fft squared.%nThe perimeter of the classroom is %.2fft%nThe volume is %.2fft cubed.%n", area, perimeter, volume);

    }
}
