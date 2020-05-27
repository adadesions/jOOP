package oop.objects;

import oop.myInterface.Shape;

public class Triangle implements Shape {
   private double base;
   private double height;

   private static int counter;

   public Triangle(double base, double height) {
      this.base = base;
      this.height = height;
      counter++;
   }

   @Override
   public double area() {
      return  0.5 * this.base * this.height;
   }

   public double perimeter() {
      return 3 * base;
   }

   @Override
   public void printInfo() {
      System.out.println("===========================");
      System.out.println("From Triangle class");
      System.out.printf("Base: %.2f, Height: %.2f\n", this.base, this.height);
      System.out.printf("Area: %.2f unit^2\n", this.area());
      System.out.printf("Perimeter: %.2f unit\n", this.perimeter());
      System.out.println("===========================");
   }

   public static int getCounter() {
      return counter;
   }

   public double getBase() {
      return base;
   }

   public void setBase(double base) {
      this.base = base;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }
}
