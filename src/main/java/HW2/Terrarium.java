package main.java.HW2;

import main.java.HW2.Base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private Speed swSpeed = new Speed();
        private final List<Animal> terrarium = new ArrayList<>();

        public Terrarium addAnimal(Animal someAnimal){
            terrarium.add(someAnimal);
            return this;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("В террариумах находятся:\n");
            for (Animal animal: terrarium) {
                builder.append(animal)
                        .append('\n');
            }
            return builder.toString();
        }

        private List<SwimmingSpeed> getSwimmingSpeed(){
            List<SwimmingSpeed> result = new ArrayList<>(terrarium);
            result.add(swSpeed);
            return result;
        }

        public String getSpeed(){
            StringBuilder sb = new StringBuilder();
            for (SwimmingSpeed swimmingSpeed:getSwimmingSpeed()){
                sb.append(swimmingSpeed.swSpeed()).append("\n");
            }
            return sb.toString();
        }


}
