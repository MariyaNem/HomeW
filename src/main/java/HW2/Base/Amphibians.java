package main.java.HW2.Base;

public abstract class Amphibians extends Animal {
    public Amphibians(String name){
        super(name);
    }

    public String food(){
        return "насекомые, черви";
    }

}
