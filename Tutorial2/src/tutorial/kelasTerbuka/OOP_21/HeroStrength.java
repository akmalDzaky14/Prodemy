package tutorial.kelasTerbuka.OOP_21;
/*
 * File: HeroStrength.java
 * Project: OOP_21
 * File Created: Wednesday, 14th June 2023 4:00:06 pm
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Wednesday, 14th June 2023 4:00:09 pm
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class HeroStrength extends Hero {
    String attribute = "Strength";

    // define contructor HeroStrength berdasarkan constructor superclass
    // karena ketika superclass memiliki constructor, maka sub-class juga harus
    // punya
    HeroStrength(String name, double defence, double attack) {
        super(name, defence, attack);
    }

    @Override
    void display() {
        System.out.println("Hero " + this.attribute);
        super.display();
    }
}
