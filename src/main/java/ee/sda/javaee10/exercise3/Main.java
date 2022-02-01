package ee.sda.javaee10.exercise3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Number> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Ten", 10);
        mapPrinter(map);


    }



    public static void mapPrinter(Map<String, Number> map) {
        int counter = 0;
        for (String key : map.keySet()) {
            if (counter++ == map.size()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key) + ".");
                break;
            }
            System.out.println("Key: " + key + ", Value: " + map.get(key) + ",");
        }

        /*
        *
        * Key: One, Value: 1,
          Key: Ten, Value: 10,
          Key: Two, Value: 2,
          Key: VVV, Value: 2,
          Key: TTT, Value: 2,
        *
        *
        * */
    }

}
