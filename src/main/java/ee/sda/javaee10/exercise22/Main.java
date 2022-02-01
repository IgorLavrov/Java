package ee.sda.javaee10.exercise22;

import ee.sda.javaee10.exercise21.Cone;
import ee.sda.javaee10.exercise21.Cube;

public class Main {

    public static void main(String[] args) {


        Cone cone = new Cone(5, 10, 12);
        cone.fill(25);


        Cone cone1 = new Cone(514, 1520, 12123);
        cone1.fill(25512223);


        Cone cone2 = new Cone(51524123, 104124123, 123132);
        cone2.fill(254512323);

        Cube cube = new Cube(10);
        cube.fill(1000);

    }
}
