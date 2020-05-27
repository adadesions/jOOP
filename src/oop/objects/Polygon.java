package oop.objects;

public class Polygon extends Shape{
    private int numSide;

    public Polygon() {
//        BAD
//        super("red");
//        this.numSide = 0;

//        EXCELLENT
        this("red", 0);

    }

    public Polygon(int numSide) {
        this("red", numSide);
    }

    public Polygon(String color) {
        this(color, 0);
    }

    public Polygon(String color, int numSide) {
        super(color);
        this.numSide = numSide;
    }

    @Override
    public void printInfo() {
        System.out.printf("Color: %s, NumSide: %d\n", this.color, this.numSide);
    }

//    Overloading
    public void calculate() {
        System.out.println("Calculated: Null");
    }

    public void calculate(int num) {
        System.out.println("Calculated: " + num);
    }

    public void calculate(int num, String operator) {
        System.out.printf("Calculated: %s, %d\n", operator, num);
    }

    @Override
    public double area() {
        return 0;
    }
}

