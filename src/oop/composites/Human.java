package oop.composites;

public class Human {
    private String name;
    private Organ brain;
    private Organ lungs;
    private Organ liver;
    private Organ heart;
    private Vessel vein;
    private Vessel artery;
    private Bone femur;
    private Bone sternum;

    public Human(String name, Organ brain, Organ lungs, Organ liver, Organ heart,
                 Vessel vein, Vessel artery, Bone femur, Bone sternum)
    {
        this.brain = brain;
        this.lungs = lungs;
        this.liver = liver;
        this.heart = heart;
        this.vein = vein;
        this.artery = artery;
        this.femur = femur;
        this.sternum = sternum;
    }

    public void think(String subject) {
        System.out.println("I'm thinking about " + subject);
    }

    public void pulse() {
        System.out.println("Pulse: " + this.vein.getPressure());
    }

    public Vessel getVein() {
        return vein;
    }

    public void setVein(Vessel vein) {
        this.vein = vein;
    }
}
