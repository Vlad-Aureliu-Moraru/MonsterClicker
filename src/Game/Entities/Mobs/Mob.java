package Game.Entities.Mobs;

import Game.Entities.generalEntity;

public class Mob extends generalEntity {
    private int level;
    private int money;
    private int atackDamage;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int getAtackDamage() {
        return atackDamage;
    }

    @Override
    public void setAtackDamage(int atackDamage) {
        this.atackDamage = atackDamage;
    }
}
