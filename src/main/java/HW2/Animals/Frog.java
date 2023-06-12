package main.java.HW2.Animals;

import main.java.HW2.Base.Amphibians;
import main.java.HW2.SwimmingSpeed;

public class Frog extends Amphibians implements SwimmingSpeed {
        public Frog(String name){

            super(name);
        }

        public String cleaning(){

            return "Раз в два дня";
        }
        @Override
        public int getSwimmingSpeed() {
            return 15;
        }
        @Override
        public String toString() {
        return String.format("Лягушка %s Скорость плавания: %d", super.toString(), getSwimmingSpeed());
        }
}
