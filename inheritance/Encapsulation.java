package inheritance;

public class Encapsulation {
    private String fullname;
    private int healthPercentage;
    private String weapon;

    public Encapsulation(String fullname) {
        this(fullname, 100, "sword");
    }

    public Encapsulation(String fullname, int health, String weapon) {
        this.fullname = fullname;
        if(health <= 0) {
            this.healthPercentage = 1;
        } else if(health > 100) {
            this.healthPercentage = 100;

        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public void losehealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if(healthPercentage < 0) {
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthremaining() {
        return healthPercentage;
    }

    public void restorehealth(int extrahealth) {
        healthPercentage = healthPercentage + extrahealth;
        if(healthPercentage > 100) {
            System.out.println("player restored to 100%");
            this.healthPercentage = 100;
        }
    }
}
