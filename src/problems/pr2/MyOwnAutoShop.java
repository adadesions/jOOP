package problems.pr2;

public class MyOwnAutoShop {
    public static void main() {
        Sedan s = new Sedan(240, 10000, "Red", 30);
        Ford f1 = new Ford(450, 50000, "Yellow", 1992, 10000);
        Ford f2 = new Ford(450, 50000, "Black", 1992, 12000);
        Car c = new Car(200, 5000, "Blue");

        System.out.println("Sedan s1 price: " + s.getSalePrice());
        System.out.println("Ford f1 price: " + f2.getSalePrice());
        System.out.println("Ford f2 price: " + f1.getSalePrice());
        System.out.println("Car c1 price: " + c.getSalePrice());
    }
}
