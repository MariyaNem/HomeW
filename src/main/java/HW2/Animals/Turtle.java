package main.java.HW2.Animals;

import main.java.HW2.Base.Reptiles;

public class Turtle extends Reptiles {
    public Turtle(String name){

        super(name);
    }

    public String cleaning(){

        return "По мере загрязнения";
    }
    public String swSpeed(){
        return "16 км/час";
    }

    public String toString(){
        return String.format("Черепаха %s", super.toString());
    }
}
