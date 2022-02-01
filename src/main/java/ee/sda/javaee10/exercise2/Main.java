package ee.sda.javaee10.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("John", "Rebekka", "Anna", "Martin");

        List<String> reverselySorted = sortReversed(list);

        for (String s : reverselySorted) {
            System.out.println(s);
        }

        /*Create a method that takes a string list as a parameter,
        then returns that list sorted alphabetically from Z to A case-insensitive.*/


    }

    public static List<String> sortReversed(List<String> list) {

        Object[] array = list.toArray();
        Arrays.sort(array);


        List<String> reversedSorted = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            reversedSorted.add(i, String.valueOf(array[array.length-i-1]));

            //array   list
            //i=0 => 0,

        }

        return reversedSorted;
    }
}
