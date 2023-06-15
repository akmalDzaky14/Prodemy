package tutorial.kelasTerbuka.OOP_19;
/*
 * File: HeroStrength.java
 * Project: OOP_19
 * File Created: Wednesday, 14th June 2023 3:39:40 pm
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Wednesday, 14th June 2023 3:41:41 pm
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class HeroStrength extends Hero {
    double defencePower;

    // overriding methods atau Polymorphism method
    @Override
    void display() {
        System.out.println("\nHero Strength");
        System.out.println("Hero name: " + this.name);
        System.out.println("Defence Power: " + this.defencePower);
    }
}
