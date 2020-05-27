package oop.myInterface;

public class InterCircle implements Shape, Circle {
    private double radius;
    private static double counter;

    public InterCircle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public void printInfo() {
        System.out.println("Class Circle: Radius = \n" + this.radius);
        System.out.printf("Area = %.2f\n", this.area());
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
