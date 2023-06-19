package main.java.HW4;

import main.java.HW4.shields.MagicalShield;
import main.java.HW4.shields.SteelShield;
import main.java.HW4.shields.WoodShield;
import main.java.HW4.warriors.Archer;
import main.java.HW4.warriors.Rouge;
import main.java.HW4.weapons.Dagger;
import main.java.HW4.weapons.Bow;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Rouge> thieves = new Team<>();
        archers.addPers(new Archer("Archer1", 75, new Bow(10, "Forest bow"), new WoodShield()))
                .addPers(new Archer("Archer2", 100, new Bow(15, "Simple bow"), new MagicalShield()));
        thieves.addPers(new Rouge("Rouge1", 60, new Dagger(), new SteelShield()))
                .addPers(new Rouge("Rouge2", 65, new Dagger(), new MagicalShield()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thieves);
    }
}

