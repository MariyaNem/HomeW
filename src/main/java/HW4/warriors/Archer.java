package main.java.HW4.warriors;
import main.java.HW4.shields.Shield;
import main.java.HW4.weapons.Throwing;

public class Archer extends Warrior<Throwing,Shield>{
    public Archer(String name, int hp, Throwing weapon,Shield shield){
        super(name, hp, weapon, shield);
    }
    public int range(){
        return rnd.nextInt((this.weapon).range + 1);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
