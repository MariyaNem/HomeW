package main.java.HW2;

import main.java.HW2.Base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
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

    public List<SwimmingSpeed> swimmers() {
        List<SwimmingSpeed> swimmers = new ArrayList<>();
        for (Animal animal: terrarium) {
            if (animal instanceof SwimmingSpeed) {
                swimmers.add((SwimmingSpeed) animal);
            }
        }
        return swimmers;
    }


}
