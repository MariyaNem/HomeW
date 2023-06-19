package main.java.HW4.shields;

public class WoodShield implements Shield{

    @Override
    public int defend() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("Wood shield\nDefence:%d", this.defend());
    }
}
