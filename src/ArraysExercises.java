import java.util.Arrays;

public class ArraysExercises {


    public static Person[] addPerson(Person[] arr, Person newEl){
        Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = newEl;
        return newArr;
    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person people[] = new Person[3];
        people[0] = new Person("rin");
        people[1] = new Person("shukaku");
        people[2] = new Person("obito");
        for(Person person : people){
            System.out.println(person.getName());
        }
        System.out.println(Arrays.toString(people));
    }
}
