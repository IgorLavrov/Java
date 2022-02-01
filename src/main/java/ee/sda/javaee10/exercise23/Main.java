package ee.sda.javaee10.exercise23;

public class Main {

    public static void main(String[] args) {

        Zoo zoo1 = new Zoo();


        zoo1.addAnimals("Lion", 50);
        zoo1.addAnimals("Fox", 24);
        zoo1.addAnimals("Cheetah", 21);
        zoo1.addAnimals("Shark", 245);
        zoo1.addAnimals("Rabbit", 66);


        System.out.println(zoo1.getNumberOfAllAnimals());
        System.out.println(zoo1.getAnimalsCount());

    }
}
