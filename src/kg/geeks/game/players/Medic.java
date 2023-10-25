package kg.geeks.game.players;

public class Medic extends Hero {
    private int healPoints;
    private int selfHeal;


    public Medic(int health, int damage, String name, int healPoints, int selfHeal) {
        super(health, damage, name, SuperAbility.HEAL);
        this.healPoints = healPoints;
        this.selfHeal = selfHeal;
    }

    public int getSelfHeal() {
        return selfHeal;
    }
    public void magicHeal() {
        int selfHeal = 10;
        this.setHealth(this.getHealth() + selfHeal);
        System.out.println("Medic " + this.getName() + " healed themselves for " + selfHeal + " health points.");
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);
            }
        }
        magicHeal();
    }
}
