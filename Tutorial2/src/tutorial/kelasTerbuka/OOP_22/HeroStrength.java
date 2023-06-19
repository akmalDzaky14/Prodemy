package tutorial.kelasTerbuka.OOP_22;

public class HeroStrength extends Hero {
    String type = "Strength";

    // subclass constructor
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
