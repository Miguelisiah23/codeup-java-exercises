import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        Boolean decision = true;
        System.out.println("Start a conversation with Bob.");
        while (decision) {
            String userInput = scanner.next();
            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, Chill out!");
            } else if (userInput.length() == 0) {
                System.out.println("Bob: Fine. Be that way!");
            } else if (userInput.equalsIgnoreCase("leave chat")) {
                decision = false;
            } else {
                System.out.println("Bob: Whatever");
            }
        }
    }
}
