package tutorial.kelasTerbuka.OOP_24;
/*
 * File: HeroIntel.java
 * Project: OOP_24
 * File Created: Monday, 19th June 2023 10:48:56 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 10:49:07 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class HeroIntel extends Hero {
    HeroIntel(String name, double health) {
        super(name, health);
        /*
         * System.out.println(this.health) //Tidak bisa
         * karena bersifat private
         */
    }

    // visibility harus sama dengan superclass
    public void disply() {
        System.out.println("Name : " + this.name);
        System.out.println("HP : " + this.getHealth());
    }

    /*
     * Coba override final setter, hasilnya tidak bisa dilakukan
     * karena method setHealth dengan atribute double adalah final
     * void setHealth(double newHealth){
     * System.out.println("Mencoba memasukkan HP : " + newHealth);
     * }
     */

    // ini baru bisa, karena atributnya sama dan tidak di private
    void setHealth(String newHealth) {
        System.out.println("Mencoba memasukkan HP : " + newHealth);
    }
}
