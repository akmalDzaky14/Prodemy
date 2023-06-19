package tutorial.kelasTerbuka.OOP_24;
/*
 * File: Hero.java
 * Project: OOP_24
 * File Created: Monday, 19th June 2023 10:49:01 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 10:49:03 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class Hero {
    public String name;
    private double health;

    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // getter
    public double getHealth() {
        return this.health;
    }

    // setter
    final void setHealth(double newHealth) {
        this.health = newHealth;
    }

    // bisa di overload karena tidak di private
    void setHealth(String mode) {
        if (mode.equals("reset")) {
            this.health = 100;
        }
    }

    public void disply() {
        System.out.println("Name : " + this.name);
        System.out.println("HP: " + this.getHealth());
    }
}
