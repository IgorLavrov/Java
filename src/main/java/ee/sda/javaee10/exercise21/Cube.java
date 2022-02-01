package ee.sda.javaee10.exercise21;

public class Cube extends ThreeDShape {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public void fill(int amount) {
        double diff = calculateVolume() - amount;
        String shapeName = this.getClass().getSimpleName();

        if (diff < 0) {
            System.out.println("Water overflown area of the " + shapeName);
        } else if (diff > 0 ) {
            System.out.println("Water is not enough to fill completely " + shapeName);
        } else {
            System.out.println("Water has just filled the " + shapeName + " to the brim.");
        }
    }

}
