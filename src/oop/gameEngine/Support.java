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
        int addHp = c.getHp() + (FACTOR * this.lv);
        c.setHp(addHp);
    }

}

