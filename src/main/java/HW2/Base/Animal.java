package main.java.HW2.Base;

import main.java.HW2.SwimmingSpeed;

public abstract class Animal implements SwimmingSpeed {
    protected String name;
    public Animal(String name){

        this.name = name;
    }

    public abstract String food();
    public abstract String cleaning();
    public abstract String swSpeed();

    @Override
    public String toString() {
        return String.format("по имени %s. Кормить: %s. Убирать террариум: %s", name, food(), cleaning());
    }
}
