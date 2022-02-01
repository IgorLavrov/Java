package ee.sda.javaee10.exercise26a;

import java.util.List;

public class Manufacturer {

    //NEVER! EVER! USE public fields for the class! use ENCAPSULATION! (getters/setters!)
    public String name;
    public int yearOfCreation;
    List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", number of models=" + models.size() +
                '}';
    }
}