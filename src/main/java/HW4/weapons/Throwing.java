package main.java.HW4.weapons;

public abstract class Throwing implements Weapon {
    public int range;

    @Override
    public String toString() {
        return String.format("Throwing. Damage %d, distance %d ", damage(),range);
    }
    public int getRange() {
        return range;
    }
    public Throwing(int range){
        this.range = range;
    }
}