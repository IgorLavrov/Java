package ee.sda.javaee10.exercise21;

import ee.sda.javaee10.exercise20.Shape;
import ee.sda.javaee10.exercise22.Fillable;

public abstract class ThreeDShape extends Shape implements Fillable {

    public abstract double calculateVolume();

}
