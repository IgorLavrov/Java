package ee.sda.javaee10.exercise21;

public class Cone extends ThreeDShape {

    private int radius, height, length;

    public Cone(int radius, int height, int length) {
        this.radius = radius;
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * length;
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * Math.pow(this.radius, 2) * this.height) / 3; //or whatever correct formula is, we do not care!
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
