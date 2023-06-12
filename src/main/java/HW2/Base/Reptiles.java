package main.java.HW2.Base;

public abstract class Reptiles extends Animal {
    public Reptiles(String name){
        super(name);
    }

    public String food(){
        return "черви, гусеницы, тараканы, овощи";
    }
}
