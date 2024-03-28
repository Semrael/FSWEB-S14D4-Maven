package org.example.rpg;

public class MonsterMain {
    public static void main(String[] args) {
        //Monster is abstract; cannot be instantiated
        //Monster mon = new Monster("M1", 2, 2);
        //System.out.println(mon);

        Monster troll = new Troll("koca trol", 2, 3);
        System.out.println(troll.getName());
        System.out.println(troll.attack());
        Monster wereWolf= new WereWolf("Scott",5,5);
        System.out.println(wereWolf.getName());
        System.out.println(wereWolf.attack());
        System.out.println();
        System.out.println("KURT ADAM: " +wereWolf);
        System.out.println("KOCA TROLL:" +troll);
    }

}
