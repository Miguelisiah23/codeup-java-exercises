import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//         WHILE
        int i = 5;
        while (i <= 15) {
            System.out.printf("%d%n", i);
            i++;
        }
//        DO WHILE
        int x = 0;
        do {
            x++;
            if (x % 2 == 0) {
                System.out.printf("%d%n", x);
            }
        } while (x <= 100);

        int y = 100;
        do {
            System.out.printf("%d%n", y);
            y -= 5;
        } while (y >= -10);

        long squared = 2;
        do {
            System.out.printf("%d%n",squared);
            squared *= squared;
        } while(squared < 1000000);

//        FOR LOOP
        for(int num = 100; num >=-10; num-=5) {
            System.out.printf("%d%n",num);
        }
        for(long sq = 2; sq < 1000000; sq*=sq){
            System.out.printf("%d%n",sq);
        }
//        FizzBuzz
        for (int numbers = 1; numbers <= 100; numbers++) {
            if (numbers % 3 == 0 && numbers % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numbers % 3 == 0) {
                System.out.println("Fizz");
            } else if (numbers % 5 == 0) {
                System.out.println("Buzz");
            }
        }

//        TABLE OF POWERS
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("What number would you like to go up to?");
            int userInput = scanner.nextInt();
            System.out.println("Here is your table !");
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");

            for (long table = 1; table <= userInput; table++) {
                long square = table * table;
                long cube = (table * table) * table;
                System.out.printf("%d      | %d       | %d     %n", table, square, cube);
            }
            System.out.println("Would you like to try another number ?");
            answer = scanner.next();
        }
        String answer2 = "yes";
        while (answer2.equalsIgnoreCase("yes")) {
            System.out.println("Give me number from 0-100");
            int grades = scanner.nextInt();
            if (grades > 0 && grades <= 59) {
                System.out.println("That is a: F");
            } else if (grades > 59 && grades <= 66) {
                System.out.println("That is a: D");
            } else if (grades > 66 && grades <= 79) {
                System.out.println("That is a: C");
            } else if (grades > 79 && grades < 87) {
                System.out.println("That is a: B");

            } else {
                System.out.println("That is a: A");
            }
            System.out.println("Would you like to input another number ?");
            answer2 = scanner.next();
        }

    }
}
