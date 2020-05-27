package oop.myInterface;

enum ShapeTypes {
    InterCircle,
    Triangle
}

public interface Factory {
    public Shape build(String type);
    public String getFactoryName();
}
