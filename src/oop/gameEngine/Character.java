package oop.gameEngine;

public class Character {
    protected String charName;
    protected int power;
    protected int hp;
    protected int lv;

    public Character(String charName, int power, int hp, int lv) {
        this.charName = charName;
        this.power = power;
        this.hp = hp;
        this.lv = lv;
    }

    public void attacked(int damage) {
        this.hp -= damage;
        this.printAttacked(damage);
    }

    public void printAttacked(int damage) {
        System.out.printf("%s :: HP: %d, Damage: %d\n", this.charName, this.hp, damage);
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }
}
