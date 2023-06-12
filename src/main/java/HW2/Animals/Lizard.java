package main.java.HW2.Animals;

import main.java.HW2.Base.Reptiles;
import main.java.HW2.SwimmingSpeed;

public class Lizard extends Reptiles implements SwimmingSpeed {
    public Lizard(String name){

        super(name);
    }

    public String cleaning(){

        return "раз в 8-15 дней";
    }
    @Override
    public int getSwimmingSpeed() {
        return 12;
    }

    @Override
    public String toString() {
        return String.format("Ящерица %s Скорость плавания: %d", super.toString(), getSwimmingSpeed());
    }
}
