package kg.geeks.game.players;

public abstract class GameEntity {
    private int health;
    private int damage;
    private String name;
    private int giveHealth;
    private boolean stunned;


    public GameEntity(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
        this.giveHealth = health;
        this.stunned = false;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getGiveHealth() {
        return giveHealth;
    }


    public boolean isStunned() {
        return stunned;
    }

    public void setStunned(boolean stunned) {
        this.stunned = stunned;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " +
                this.name + " health: " + this.health + " damage: " + this.damage;
    }
}
