package oop.objects;

public class Rectangle {
    private double width;
    private double height;

    private static int counter;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        counter++;
    }

    public double area() {
        return this.width * this.height;
    }

    public double  perimeter() {
        return 2 * width + 2 * height;
    }

    public void printInfo() {
        System.out.println("===========================");
        System.out.println("From Rectangle class");
        System.out.printf("Width: %.2f, Height: %.2f\n", this.width, this.height);
        System.out.printf("Area: %.2f unit^2\n", this.area());
        System.out.printf("Perimeter: %.2f unit\n", this.perimeter());
        System.out.println("===========================");
    }

    public static int getCounter() {
        return counter;
    }
}
