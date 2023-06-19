package tutorial.kelasTerbuka.OOP_22;
/*
 * File: HeroStrength.java
 * Project: OOP_22
 * File Created: Monday, 19th June 2023 8:05:05 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 9:02:31 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class HeroStrength extends Hero {
    String type = "Strength";

    // subclass constructor, wajib ada jika di superclass terdapat constructor
    public HeroStrength(String nameInput, double attackInput, double healthInput) {
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void display() {
        System.out.println();
        super.display();
        System.out.println("Type: " + type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " recieve damage " + damage);
        System.out.println("Damage reduced to " + (0.5 * damage));
        if (health > 0 && this instanceof HeroStrength) {
            this.health -= 0.5 * damage;
        } else {
            System.out.println("You are dead");
        }
    }
}
