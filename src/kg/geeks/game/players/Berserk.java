package kg.geeks.game.players;

public class Berserk extends Hero {
    private int blockedDamage;
    private int rageDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
        this.rageDamage = 0;
    }

    public int getBlockedDamage() {
        return blockedDamage;
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }
    public void berserkRage() {
        this.rageDamage += 10;
        System.out.println("Berserk " + this.getName() + " activated Rage. Damage increased by 10.");
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - this.blockedDamage);
        System.out.println("Berserk " + this.getName() + " reverted " + blockedDamage);
        berserkRage();
    }

}
