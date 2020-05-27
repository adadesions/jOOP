package oop.patterns;

import oop.myInterface.Factory;
import oop.myInterface.InterCircle;
import oop.myInterface.Shape;
import oop.objects.Triangle;

public class ShapeFactory implements Factory {
    private String factoryName;
    private double radius;
    private double base;
    private double height;
    private static int counter;

    public ShapeFactory(double radius) {
        this(radius, 0, 0);
    }

    public ShapeFactory(double base, double height) {
        this(0, base, height);
    }

    public ShapeFactory(double radius, double base, double height) {
        this.radius = radius;
        this.base = base;
        this.height = height;
        this.factoryName = "Shape Factory";
    }

    @Override
    public Shape build(String type) {
        if (type.equals("Circle")) {
            InterCircle circle = new InterCircle(this.radius);
            counter++;

            return circle;
        }
        else if (type.equals("Triangle")) {
            Triangle triangle = new Triangle(this.base, this.height);
            counter++;

            return triangle;
        }

        return null;
    }

    @Override
    public String getFactoryName() {
        return this.factoryName;
    }
}
