package main.java.HW2.Animals;

import main.java.HW2.Base.Reptiles;

public class Lizard extends Reptiles {
    public Lizard(String name){

        super(name);
    }

    public String cleaning(){

        return "раз в 8-15 дней";
    }
    public String swSpeed(){
        return "12 км/час";
    }

    public String toString(){

        return String.format("Ящерица %s", super.toString());
    }
}
