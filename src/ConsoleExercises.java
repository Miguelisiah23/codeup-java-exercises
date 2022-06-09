import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n" , pi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int userInput = scanner.nextInt();
        System.out.printf("You entered the number: %d%n" , userInput);
        System.out.println("Enter 3 words");
        String wordInput = scanner.next();
        String wordInput2 = scanner.next();
        String wordInput3 = scanner.next();
        System.out.printf("Your first word is \"%s\"%n",wordInput);
        System.out.printf("Your second word is \"%s\"%n",wordInput2);
        System.out.printf("Your third word is \"%s\"%n",wordInput3);
        System.out.println("Enter a sentence");
        String sentence = scanner.next();
         sentence += scanner.nextLine();
        System.out.printf("You entered: \"%s\"",sentence);
        System.out.println("Enter a height and width: ");
        String height = scanner.nextLine();
        String width = scanner.nextLine();



    }
}
