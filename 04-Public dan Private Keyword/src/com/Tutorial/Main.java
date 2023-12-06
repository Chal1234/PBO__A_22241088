package com.Tutorial;

    class Player {
        // Data member
        String name; // default,bisa dibaca dan ditulis oleh di luar class
        public int exp;//public,bisa dibaca dan ditulis di luar class
        private int health;//private,hanya bisa dibaca oleh class itu sendiri


        //konstruktor
       Player (String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display(){
        System.out.println("hero 1 :" +this.name);
        System.out.println("hero health :" + this.health);
        System.out.println("hero exp :" +this.exp);
    }
    }
public class Main {
    public static void main(String[] args) {
        // membuat objek atau instansiasi objek
        Player hero_1 = new Player("Lancelot", 20, 100);

        //default
        System.out.println(hero_1.name);
        hero_1.name = "Bruno";
        System.out.println(hero_1.name);

        //public
        System.out.println(hero_1.exp);
        hero_1.exp  = 50;
        System.out.println(hero_1.exp);

        //private
        hero_1.display();
    }
}
