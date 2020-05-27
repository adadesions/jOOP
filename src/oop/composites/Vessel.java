package oop.composites;

public class Vessel {
    private String name;
    private double pressure;
    private boolean isIntoHeart;

    public Vessel(String name, double pressure, boolean isIntoHeart) {
        this.name = name;
        this.pressure = pressure;
        this.isIntoHeart = isIntoHeart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPressure() {

        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public boolean isIntoHeart() {
        return isIntoHeart;
    }

    public void setIntoHeart(boolean intoHeart) {
        isIntoHeart = intoHeart;
    }
}
