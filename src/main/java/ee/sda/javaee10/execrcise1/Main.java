package ee.sda.javaee10.execrcise1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("John", "Rebekka", "Anna", "Martin");

        List<String> sortedList = sort(names);

        for (int i = 0; i < sortedList.size() ; i++) {
            System.out.println(sortedList.get(i));
        }

    }

    public static List<String> sort(List<String> list) {

        //1. arrays and lists are DIFFERENT OBJECTS!
        //2. converting list into array;
        //3. sorting that new array (that has been obtained from the list);

        //String -> Object doesn't mean that String[] -> Object[]

        Object[] array = list.toArray();

        Arrays.sort(array);

        List<String> sortedStrings = new ArrayList<>();

        //array is already sorted here!
        for (int i = 0; i < list.size(); i++) {
            sortedStrings.add(i, String.valueOf(array[i]));
        }

        //2nd approach
        /*
        *
        List<String> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        return sorted;
        * */

        return sortedStrings;
    }

}
