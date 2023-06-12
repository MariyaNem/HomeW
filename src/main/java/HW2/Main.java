package main.java.HW2;

import main.java.HW2.Animals.Frog;
import main.java.HW2.Animals.Lizard;
import main.java.HW2.Animals.Turtle;
import main.java.HW2.Base.Animal;

public class Main {
    public static void main(String[] args){
        Animal turtle = new Turtle("Леонид");
        Animal lizard = new Lizard("Василиса");
        Animal frog = new Frog("Попрыгушка");


        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(turtle).addAnimal(lizard).addAnimal(frog);
        System.out.println(terrarium);

        System.out.println(terrarium.getSpeed());

    }
}
