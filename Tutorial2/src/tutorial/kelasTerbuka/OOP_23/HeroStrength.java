package tutorial.kelasTerbuka.OOP_23;
/*
 * File: HeroStrength.java
 * Project: OOP_23
 * File Created: Monday, 19th June 2023 9:08:58 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 9:09:20 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class HeroStrength extends Hero {
    String type = "Strength";

    HeroStrength(String name) {
        super(name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type : " + this.type);
    }
}
