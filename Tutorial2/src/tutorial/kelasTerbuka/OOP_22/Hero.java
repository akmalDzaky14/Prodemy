package tutorial.kelasTerbuka.OOP_22;
/*
 * File: Hero.java
 * Project: OOP_22
 * File Created: Monday, 19th June 2023 8:04:50 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 9:02:36 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class Hero {
    // attribute
    String name;
    double attackPower, health;

    // constructor
    Hero(String nameInput, double attackInput, double healthInput) {
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    // attack method
    void attack(Hero enemy) {
        System.out.println();
        System.out.println(this.name + " Attacking " + enemy.name + " with " + this.attackPower);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage) {
        System.out.println(this.name + " recieve damage " + damage);
        if (damage > 0 && damage <= this.health) {
            this.health -= damage;
        } else {
            System.out.println("You are dead");
        }
    }

    void display() {
        System.out.println();
        System.out.printf("%s has %f HP and attacks with %.1f AP\n", this.name, this.health,
                this.attackPower);
    }

}
