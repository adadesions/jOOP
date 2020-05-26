package oop.objects;

public class Circle extends Shape {
    private double radius;
    private static int counter;

    public Circle(double radius,  String color) {
        super(color);
        this.radius = radius;
        counter++;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void printInfo() {
        System.out.println("===========================");
        System.out.println("From Circle class");
        System.out.printf("Radius: %.2f\n", this.radius);
        System.out.printf("Area: %.2f unit^2\n", this.area());
        System.out.printf("Circumference: %.2f unit\n", this.circumference());
        System.out.println("===========================");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCounter() {
        return counter;
    }
}
