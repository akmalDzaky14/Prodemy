package tutorial.kelasTerbuka.OOP_21;
/*
 * File: Hero.java
 * Project: OOP_21
 * File Created: Wednesday, 14th June 2023 3:59:45 pm
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Wednesday, 14th June 2023 3:59:51 pm
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class Hero {
    String name;
    double defencePower;
    double attackPower;

    // Constructor
    Hero(String name, double defencePower, double attackPower) {
        this.name = name;
        this.defencePower = defencePower;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Attack Power : " + this.attackPower);
        System.out.println("Defence Power : " + this.defencePower);
    }
}
