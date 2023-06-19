package tutorial.kelasTerbuka.OOP_23;
/*
 * File: HeroIntel.java
 * Project: OOP_23
 * File Created: Monday, 19th June 2023 9:09:04 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 9:09:17 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class HeroIntel extends Hero {
    String type = "Intel";

    HeroIntel(String name) {
        super(name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type : " + this.type);
    }
}
