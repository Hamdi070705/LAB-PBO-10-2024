package Praktikum3.Tugas3No1;

public class Senjata {
    String type;
    int damage = 50;

    public Senjata() {
    }

    public Senjata(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}

