import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("miguel");
        s1.addGrade(98);
        System.out.println(s1.getGradeAverage());
        System.out.println(s1.getName());
        Student s2 = new Student("isiah");
        Student s3 = new Student("rob");
        Student s4 = new Student("corey");
        s2.addGrade(95);
        s2.addGrade(100);
        s2.addGrade(100);
        s3.addGrade(80);
        s4.addGrade(95);
        System.out.println(s2.getGradeAverage());


    }
}
