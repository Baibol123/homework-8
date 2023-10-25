package kg.geeks.game.players;

public class Magic extends Hero {
    private int boostAmount;
    public Magic(int health, int damage, String name, int boostAmount) {
        super(health, damage, name, SuperAbility.BOOST);
        this.boostAmount=boostAmount;
    }

    public int getBoostAmount() {
        return boostAmount;
    }
    public void boostHeroes(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero != this && hero.isAlive()) {
                int newDamage = hero.getDamage() + boostAmount;
                hero.setDamage(newDamage);
                System.out.println("Magic " + this.getName() + " boosted " + hero.getName() + " by " + boostAmount + " damage.");
            }
        }
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boostHeroes(heroes);
    }
}
