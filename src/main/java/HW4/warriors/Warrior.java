package main.java.HW4.warriors;

import main.java.HW4.shields.Shield;
import main.java.HW4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<T1 extends Weapon, T2 extends Shield> extends Person {
    protected T1 weapon;
    protected T2 shield;
    protected static Random rnd = new Random();


    public Warrior(String name, int hp, T1 weapon, T2 shield){
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }
    @Override
    public String toString() {
        String res = String.format("Name: %s\nHP: %d\nWeapon: %s\nShield: %s",getName(),getHp(),weapon,shield);
        return res;
    }
    public int harm(){
        int damage = 0;
        boolean isHit = rnd.nextBoolean();
        if(isHit){
            damage = rnd.nextInt(10, weapon.damage()+1);
        }
        return damage;
    }
    public void reduce(int damage){
        if(damage >0){
            int res = damage-shield.defend()/2;
            this.setHp(this.getHp()-res);
        }

        if(this.getHp()<0){
            this.setHp(0);
        }

    }
    public int defence(){
        return shield.defend();
    }
}
