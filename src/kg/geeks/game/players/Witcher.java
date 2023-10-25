package kg.geeks.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CONTRIBUTION);
    }
    public boolean isAlive() {
        return getHealth() > 0;
    }
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (isAlive()) {
            int firstDeadHero = findFirstDeadHero(heroes);
            if (firstDeadHero != -1) {
                heroes[firstDeadHero].setHealth(heroes[firstDeadHero].getGiveHealth());
                System.out.println("Witcher " + this.getName() + " revives " + heroes[firstDeadHero].getName() + " and sacrificed themselves.");
                this.setHealth(0);
            }
        }
    }

    private int findFirstDeadHero(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].isAlive()) {
                return i;
            }
        }
        return -1;
    }



}
