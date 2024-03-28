package org.example.rpg;

public class WereWolf extends Monster implements Bleedable,Poisonable{
    public WereWolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage()+bleed()+poison();
    }

    @Override
    public double bleed() {
        return getDamage()*0.2;
    }

    @Override
    public double poison() {
        return getDamage()*0.1;
    }}


