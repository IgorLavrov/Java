package ee.sda.javaee10.exercise26a;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars1 = new ArrayList<>();
        Car car1 = new Car("Karl's car", "A very old car", CarType.SEDAN);
        Car car2 = new Car("Igor's car", "Super car", CarType.SEDAN);
        Car car3 = new Car("Basem's car", "black car", CarType.SEDAN);
        Car car4 = new Car("Henri's car", "blablabla", CarType.SEDAN);
        Car car5 = new Car("Rando's car", "blublublu", CarType.SEDAN);
        cars1.add(car1);
        cars1.add(car2);
        cars1.add(car3);
        cars1.add(car4);
        cars1.add(car5);

        List<Car> cars2 = new ArrayList<>();
        Car car6 = new Car("Karl's car", "A very old car", CarType.SEDAN);
        Car car7 = new Car("Igor's car", "Super car", CarType.SEDAN);
        Car car8 = new Car("Basem's car", "black car", CarType.SEDAN);
        Car car9 = new Car("Henri's car", "blablabla", CarType.SEDAN);
        Car car10 = new Car("Rando's car", "blublublu", CarType.SEDAN);
        cars2.add(car6);
        cars2.add(car7);
        cars2.add(car8);
        cars2.add(car9);
        cars2.add(car10);


        Model model1 = new Model("BMW M5", 2005, cars1);
        Model model2 = new Model("Mercedes CLK 200", 2002, cars2);

        List<Model> models = new ArrayList<>();
        models.add(model1);
        models.add(model2);


        List<Manufacturer> listOfManufacturers = new ArrayList<>();
        Manufacturer mf = new Manufacturer("Toyota", 1901, models);




        //1

        models.forEach(elem -> System.out.println(elem + "\n"));



        //2

        cars1.forEach(System.out::println);


        //3.
        listOfManufacturers.forEach(m -> System.out.println(m.yearOfCreation));


        //7
        models.forEach(model -> {
            System.out.println("For model " + model.name + ", we have cars:");
            model.cars.forEach(car -> {
                System.out.println(car.name);
            });
        });



        //9
        models
                .stream()
                .filter(model -> (model.productionStartYear % 2) != 0)
                .forEach(model -> System.out.println(model));



        //10
        listOfManufacturers.forEach(manufacturer -> manufacturer.models
                .stream()
                .filter(model -> (model.productionStartYear%2) ==0)
                        .forEach(model -> model.cars
                                .forEach(System.out::println)));


        //11
        listOfManufacturers
                .stream()
                .filter(manufacturer -> (manufacturer.yearOfCreation % 2) != 0)
                        .forEach(manufacturer -> manufacturer.models
                                .stream()
                                .filter(model -> (model.productionStartYear % 2) ==0)
                                .forEach(model -> model.cars
                                                .forEach(System.out::println)));

        /*
        Using functional programming mechanisms based on the given structure, display:

            1. a list of all Models,
            2. a list of all cars1,
            3. list of all manufacturer names,
            4. list of all manufacturers' establishment years,
            5. list of all model names,
            6. list of all years of starting production of models,
            7. list of all car names,
            8. list of all car descriptions,

            9. only models with an even year of production start,

            10. only cars from manufacturers with an even year of foundation,

            11. only cars with an even year of starting production of the model and an odd year of establishing the
            manufacturer,


            //These all are about filters.. and you can refer to already implemented code for "how to use filter".
            12. only CABRIO cars1 with an odd year of starting model production and an even year of establishing the
            manufacturer,
            13. only cars of the SEDAN type from a model newer than 2019 and the manufacturer's founding year less than
            1919*/













        /*
        List<String> names = List.of("Basem", "Karl", "Henri");

        //Imperative paradigm
        
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 4) {
                System.out.println(names.get(i));
            }
        }





        //Functional/Declarative paradigm
        names
                .stream()
                .filter(elem -> elem.length() > 4)
                .forEach(System.out::println);


    }




         */
    }
}
