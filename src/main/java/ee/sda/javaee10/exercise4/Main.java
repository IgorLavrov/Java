package ee.sda.javaee10.exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tallinn", "Estonia");
        map.put("Tbilisi", "Georgia");
        map.put("Washington", "USA");
        map.put("Berlin", "Germany");
        map.put("Munich", "Germany");
        map.put("Frankfurt", "Germany");
        map.put("Tartu", "Estonia");
        map.put("Gori", "Georgia");
        map.put("Kardla", "Estonia");


        SimpleStorage storage = new SimpleStorage(map);

        //storage.findValues("Germany");


        Map<String, ArrayList<String>> advancedStorage = new HashMap<>();

        ArrayList<String> randosFaves = new ArrayList<>();
        randosFaves.add("Coding");
        randosFaves.add("Working");
        randosFaves.add("Sleeping");
        randosFaves.add("Travelling");
        advancedStorage.put("Rando", randosFaves);

        ArrayList<String> rebekasFaves = new ArrayList<>();
        rebekasFaves.add("Sports");
        rebekasFaves.add("Travelling");
        rebekasFaves.add("Art");
        rebekasFaves.add("Music");
        advancedStorage.put("Rebeka", rebekasFaves);

        ArrayList<String> basemFaves = new ArrayList<>();
        basemFaves.add("Sports");
        basemFaves.add("Java");
        basemFaves.add("Reading");
        basemFaves.add("Sports");
        basemFaves.add("Travelling");
        advancedStorage.put("Basem", basemFaves);

        AdvancedStorage as = new AdvancedStorage(advancedStorage);
        as.findValues("sports");

    }
}

class SimpleStorage {

    private Map<String, String> storage;

    public SimpleStorage(Map<String, String> map) {
        this.storage = map;
    }

    public void addToStorage(String key, String value) {
        storage.put(key, value);
    }

    public void printValues(String key) {
        for (String k : storage.keySet()) {
            if (k.equals(key))
                System.out.println(storage.get(key));
        }
    }

    public void findValues(String value) {
        for (String k : storage.keySet()) {
            if (storage.get(k).equals(value))
                System.out.println(k);
        }
    }
}


//adds complexity as the type of the key (of the map), is going to be the ArrayList!
class AdvancedStorage {

    private Map<String, ArrayList<String>> storage;

    public AdvancedStorage(Map<String, ArrayList<String>> map) {
        this.storage = map;
    }


    public void addToStorage(String key, String value) {
        if(storage.get(key) == null) {
            storage.put(key, new ArrayList<>());
        }
        storage.get(key).add(value);
    }

    public void printValues(String key) {
        for (String k : storage.keySet()) {
            if (k.equals(key))
                storage.get(key).forEach(elem -> System.out.println(elem + ", "));
        }
    }

    public void findValues(String value) {
        for (String k : storage.keySet()) {

            ArrayList<String> tmpList = storage.get(k);

            for (int i = 0; i < tmpList.size(); i++) {
                if (tmpList.get(i).equalsIgnoreCase(value)) {
                    System.out.println(k);
                }
            }
        }
    }
}

