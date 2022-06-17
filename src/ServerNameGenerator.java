import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
public static String[] arr = {"nice","kind","sweet","smelly","aggressive","rude","mean","happy","sticky","putrid"};
public static String[] arr2 ={"submarine","fingernail","computer","park","work","slimjim","mercury","cofeecup","bellyfat"};
public static String randomEl(String[] arr){
     Random random = new Random();
     int elInt = arr.length;
      elInt = random.nextInt(elInt);
      String el= arr[elInt];
      return el;

}

    public static void main(String[] args) {
       String adj = randomEl(arr);
       String noun = randomEl(arr2);
        System.out.printf("Here is your servername%n %s-%s",adj,noun);
}

}
