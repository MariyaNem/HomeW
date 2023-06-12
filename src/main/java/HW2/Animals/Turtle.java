package main.java.HW2.Animals;

import main.java.HW2.Base.Reptiles;
import main.java.HW2.SwimmingSpeed;

public class Turtle extends Reptiles implements SwimmingSpeed {
    public Turtle(String name){

        super(name);
    }

    public String cleaning(){

        return "По мере загрязнения";
    }
    @Override
    public int getSwimmingSpeed() {
        return 16;
    }

    @Override
    public String toString() {
        return String.format("Черепаха %s Скорость плавания: %d", super.toString(), getSwimmingSpeed());
    }
}
