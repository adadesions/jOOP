package oop.composites;

public class Organ {
    private String name;
    private String part;
    private int expire;

    public Organ(String name, String part, int expire) {
        this.name = name;
        this.part = part;
        this.expire = expire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }
}
