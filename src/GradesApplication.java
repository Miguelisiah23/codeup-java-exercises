import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void overallAverage(HashMap<String,Student> students){
        double x = 0;
        for(HashMap.Entry<String,Student> entry : students.entrySet()){
            x += entry.getValue().getGradeAverage();
        }
        x = x/ students.size();
        System.out.println("Overall grade average for all students: " + x);
    }

    public static void printInfo(String input, HashMap<String, Student> students) {
        if (students.containsKey(input.toLowerCase())) {
            System.out.printf(" Name: %s%n Github Username: %s %n Grade Average: %f %n", students.get(input).getName(), input, students.get(input).getGradeAverage());
            Input input1 = new Input();
            String again = input1.getString("Would you like to continue searching [Y/N]?");
            if (again.equalsIgnoreCase("y")) {
                pickUser(students);
            }
        } else if (input.equalsIgnoreCase("v")) {
            System.out.println("Name      |Grade Average\n-----------------------");
            for (HashMap.Entry<String, Student> entry : students.entrySet()) {
                System.out.printf("%-10s|%f%n", entry.getValue().getName(), entry.getValue().getGradeAverage());
            }
            Input input1 = new Input();
            String again = input1.getString("Would you like to continue searching [Y/N]?");
            if (again.equalsIgnoreCase("y")) {
                pickUser(students);
            }
        } else if (input.equalsIgnoreCase("a")) {
            overallAverage(students);
            Input input1 = new Input();
            String again = input1.getString("Would you like to continue searching [Y/N]?");
            if (again.equalsIgnoreCase("y")) {
                pickUser(students);
            }
        } else {
            System.out.printf("Sorry I dont see '%s' here..",input);
            pickUser(students);
        }
    }

    public static void pickUser(HashMap<String, Student> students) {
        for (HashMap.Entry<String, Student> entry : students.entrySet()) {
            System.out.printf("[%s] ", entry.getKey());

        }
        System.out.println();
        Input input = new Input();
        System.out.println("\n[V] to view all students and grade averages\n[A] to view overall grade average");
        String username = input.getString("Enter a username to get information on");
        printInfo(username, students);
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
        students.put("findingmiggy03", miggy);
        students.put("bigbricks25", isiah);
        students.put("smallbean01", rin);
        students.put("sensei2056", senju);
        pickUser(students);




    }
}
