import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void printInfo(String input,HashMap<String,Student> students){
        for (HashMap.Entry<String, Student> entry : students.entrySet()) {
            if(input.equalsIgnoreCase(entry.getKey())) {
                System.out.println(input);
                System.out.println(entry.getKey());
                System.out.printf("Name: %s - Github Username: %s - Grade Average: %f %n", entry.getValue().getName(),entry.getKey(),entry.getValue().getGradeAverage());
                Input input1 = new Input();
                String again = input1.getString("Would you like to continue searching [Y/N]?");
                if(again.equalsIgnoreCase("y")){
                    pickUser(students);
                }
            }
            else {
                System.out.println(input);
                System.out.println(entry.getKey());
                System.out.println("Cant do that");
                pickUser(students);
            }
        }


    }

    public static void pickUser(HashMap<String,Student> students){

        for (HashMap.Entry<String, Student> entry : students.entrySet()) {
            System.out.printf("[%s] ", entry.getKey());

        }
        System.out.println();
        Input input = new Input();
        String username = input.getString("Enter a username to get information on");
        printInfo(username,students);
    }
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student miggy = new Student("Miggy");
        Student isiah = new Student("Isiah");
        Student rin = new Student("Rin");
        Student senju = new Student("Senju");
        miggy.addGrade(100);
        miggy.addGrade(99);
        miggy.addGrade(100);
        isiah.addGrade(100);
        isiah.addGrade(95);
        isiah.addGrade(95);
        rin.addGrade(95);
        rin.addGrade(87);
        rin.addGrade(80);
        senju.addGrade(89);
        senju.addGrade(75);
        senju.addGrade(93);
        students.put("FindingMiggy03", miggy);
        students.put("Bigbricks25", isiah);
        students.put("SmallBean01", rin);
        students.put("Sensei2056", senju);
        pickUser(students);



        }
    }
