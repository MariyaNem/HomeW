package main.java.HW4.shields;

public class NoShield implements Shield {
    @Override
    public int defend() {
        return 0;
    }
    @Override
    public String toString() {
        return "Without shield";
    }
}
