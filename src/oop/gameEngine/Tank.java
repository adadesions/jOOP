package oop.gameEngine;

import java.lang.annotation.Documented;

public class Tank extends Character{
    private int def;

    public Tank() {
        this("NoName", 50, 30, 1500, 100);
    }

    public Tank(String charName, int power, int lv, int hp, int def) {
        super(charName, power, hp, lv);
        this.def = def;
    }

    @Override
    public void attacked(int damage) {
        // 100 - 100 = 0
        // 50 - 100 = -50(
        int calDamage = damage - this.def;
        this.hp = this.hp - calDamage;
        super.printAttacked(calDamage);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
