package problems.pr2;

public class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        double salePrice;
        if (this.weight > 2000) {
            salePrice = super.getSalePrice() * 0.9;
        }
        else {
            salePrice = super.getSalePrice() * 0.8;
        }

        return salePrice;
    }
}
