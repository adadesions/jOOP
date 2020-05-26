package oop.objects;

public class Hero {
//  modifier type  variable name;
    private String heroName;
    private String team;
    private int power;

    private static int numCreated;
    private static String target;

//    Constructor
    public Hero(String heroName, String team, int power) {
        this.heroName = heroName;
        this.team = team;
        this.power = power;
        numCreated++;
    }

//    Getter and Setter
    public String getHeroName() {
        return this.heroName;
    }

    public void setHeroName(String newHeroName) {
        this.heroName = newHeroName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public static int getNumCreated() {
        return numCreated;
    }

    public static String getTarget() {
        return target;
    }

    public static void setTarget(String target) {
        Hero.target = target;
    }
}
