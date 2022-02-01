package ee.sda.javaee10.exercise20;

public abstract class Shape {

    public abstract double calculatePerimeter();
    public abstract double calculateArea();

}



class Triangle extends Shape {

    private int a, b, c, h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        return (c * h) / 2;
    }
}

class Rectangle extends Shape {

    private int a, b;

    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}



