package tutorial.kelasTerbuka.OOP_23;
/*
 * File: Hero.java
 * Project: OOP_23
 * File Created: Monday, 19th June 2023 9:09:10 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 9:09:14 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class Hero {
    String name;

    Hero(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Nama : " + this.name);
    }

    void attack(Hero enemy) {
        System.out.println("Menyerang");
    }
}
