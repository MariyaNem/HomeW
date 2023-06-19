package main.java.HW4.weapons;

public class Dagger implements Weapon {
    @Override
    public int damage() {
        return 15;
    }
    @Override
    public String toString() {
        return String.format("Dagger (max damage %d)", this.damage());
    }
}
