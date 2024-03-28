package org.example.rpg;

public abstract class Monster implements Bleedable,Poisonable{
    private String name;
    private  int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints,double damage){
        this.damage=damage;
        this.hitPoints=hitPoints;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
      return this.damage;
    }

    public abstract double attack();

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", damage=" + damage +
                '}';
    }
}
