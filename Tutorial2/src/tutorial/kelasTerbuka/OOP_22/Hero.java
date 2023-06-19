package tutorial.kelasTerbuka.OOP_22;

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
