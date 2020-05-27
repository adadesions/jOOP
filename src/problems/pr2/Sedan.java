package problems.pr2;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        double salePrice;
        if (this.length > 20) {
            salePrice = super.getSalePrice() * 0.95;
        }
        else {
            salePrice = super.getSalePrice() * 0.9;
        }

        return salePrice;
    }

}
