package tutorial.kelasTerbuka.OOP_20;
/*
 * File: HeroStrength.java
 * Project: OOP_20
 * File Created: Wednesday, 14th June 2023 3:49:06 pm
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Wednesday, 14th June 2023 3:49:09 pm
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class HeroStrength extends Hero {
    String name = "Class Strength";

    @Override
    void display() {
        System.out.println("\nIni adalah " + this.name);
        this.dummyMethod();
    }

    @Override
    void dummyMethod() {
        System.out.println("Ini adalah sub-class");
    }

    void displaySuper() {
        System.out.println("\nIni adalah " + super.name);
        super.dummyMethod();
    }

}
