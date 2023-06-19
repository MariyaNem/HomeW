package main.java.HW4.warriors;

import main.java.HW4.shields.Shield;
import main.java.HW4.weapons.Dagger;

public class Rouge extends Warrior<Dagger, Shield>{

    public Rouge(String name, int hp, Dagger weapon, Shield shield){
        super(name, hp, weapon, shield);

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
