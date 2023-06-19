package main.java.HW4.shields;

public class SteelShield implements Shield {

    @Override
    public int defend() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format("Steel shield\nDefence:%d", this.defend());
    }
}
