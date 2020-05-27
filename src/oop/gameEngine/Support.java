package oop.gameEngine;

public class Support extends Character {
//    properties => wisdom, mana
//    defaults => wisdom: 100, mana: 10
//    methods => heal -- Add more hp
//               powerUp --> Add more power
//               defUp --> Add more def
//    Every time using a method, mana minus one
    private int wisdom;
    private int mana;

    public Support(String charName) {
        this(charName, 80, 10, 10, 100, 10);
    }

    public Support(String charName, int lv) {
        this(charName, 80, 10, lv, 100, 10);
    }

    public Support(String charName, int power, int hp, int lv, int wisdom, int mana) {
        super(charName, power, hp, lv);
        this.wisdom = wisdom;
        this.mana = mana;
    }

    public void heal(Character c) {
        final int FACTOR = 2;
        final int paidMana = 1;

        // TODO: Check enough mana!

        int addHp = c.getHp() + (FACTOR * this.lv);
        c.setHp(addHp);
        this.useMana(paidMana);

        System.out.printf("%s :: HP: %d hp up by %s\n", c.getCharName(), c.getPower(), this.charName);
    }

    public void powerUp(Character c) {
        final int FACTOR = 3;
        int addPower = c.getPower() + (int) (FACTOR * this.wisdom/2);
        c.setPower(addPower);
        this.useMana(1);

        System.out.printf("%s :: power: %d power up by %s\n", c.getCharName(), c.getPower(), this.charName);
    }

    public void defUp(Tank tanker) {
        final double FACTOR = 1.5;
        int addDef = tanker.getDef() + (int) (FACTOR * this.wisdom / this.lv);
        tanker.setDef(addDef);
        this.useMana(5);

        System.out.printf("%s :: def: %d def up by %s\n", tanker.getCharName(), tanker.getDef(), this.charName);
    }

    // DRY => Don't Repeat Yourself
    public void useMana(int paid) {
        this.mana -= paid;
    }

    public void printInfo() {
        System.out.printf("Name: %s, Class: Support\n", this.charName);
        System.out.printf("Lv.%s HP: %d POWER: %d\n", this.lv, this.hp, this.power);
        System.out.printf("Wisdom: %d Mana: %d\n", this.wisdom, this.mana);
    }

}

