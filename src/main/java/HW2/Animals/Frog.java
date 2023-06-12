package main.java.HW2.Animals;

import main.java.HW2.Base.Amphibians;

public class Frog extends Amphibians {
        public Frog(String name){

            super(name);
        }

        public String cleaning(){

            return "Раз в два дня";
        }
        public String swSpeed(){
            return "15 км/час";
        }

        public String toString(){
            return String.format("Лягушка %s", super.toString());
        }
}
