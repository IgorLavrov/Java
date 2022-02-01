package ee.sda.javaee10.exercise23;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {

    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    int getNumberOfAllAnimals() {
        return animals.size();
    }

    public Map<String, Integer> getAnimalsCount() {
        Map<String, Integer> resultMap = new HashMap<>(); //species as keys, and number of respective species as value

        for (int i = 0; i < animals.size(); i++) {

            Animal currentAnimal = animals.get(i);
            String currentAnimalSpecies = currentAnimal.getSpecies();

            if (resultMap.containsKey(currentAnimalSpecies)) {
                int number = resultMap.get(currentAnimalSpecies); //24
                resultMap.put(currentAnimalSpecies, number + 1);
            } else {
                resultMap.put(currentAnimalSpecies, 1);
            }
        }

        return resultMap;

    }

    public void addAnimals(String species, int number) {
        for (int i = 0; i < number; i++) {
            animals.add(new Animal(species));
        }
    }


    public Map <String, Integer> getAnimalsCountSorted() {

        Map<String, Integer> result = getAnimalsCount();

        //There is left 1 or 2 lines of code for you to implement! sort the map, in the descending order,
        //by values!

        return null;
    }

}
