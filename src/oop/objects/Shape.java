package oop.objects;

public class Shape {
    protected String color;
    private static int counter;

    public Shape(String color) {
        this.color = color;
    }

    public double area() { // Signature
        return -1;         // Method Body
    }

    public double perimeter() {
        return -1;
    }

    public double circumference() {
        return 2 * Math.PI;
    }

    public void printInfo() {
        System.out.println("Print Information from Shape class");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCounter() {
        return counter;
    }
}
