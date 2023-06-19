package main.java.HW4.shields;

public class MagicalShield implements Shield {
    @Override
    public int defend() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Magical shield\nDefence:%d",this.defend());
    }
}