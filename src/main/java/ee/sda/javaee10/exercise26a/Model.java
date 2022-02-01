package ee.sda.javaee10.exercise26a;

import java.util.List;

public class Model {

    //NEVER! EVER! USE public fields for the class! use ENCAPSULATION! (getters/setters!)
    public String name;
    public int productionStartYear;
    List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", productionStartYear=" + productionStartYear +
                ", number of cars=" + cars.size() +
                '}';
    }
}