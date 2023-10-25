package kg.geeks.game.players;
import java.util.Random;


public class Thor extends Hero{
    private Random random;

    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
        random = new Random();

    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (random.nextBoolean()) {
            boss.setStunned(true);
            System.out.println("Thor " + this.getName() + " stunned the boss. The boss will skip the next round.");
        }
    }
}
