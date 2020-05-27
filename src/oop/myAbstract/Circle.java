package oop.myAbstract;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Class Circle: Radius = " + this.radius);
        System.out.printf("Area = %.2f", this.area());
    }

}
