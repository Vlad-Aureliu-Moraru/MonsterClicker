package Game.Entities.PlayerDesc;

import Game.Entities.generalEntity;
import Game.Items.generalItem;

public class Player extends generalEntity {
    private int money;
    private int experience;
    private int maxExperience;
    private int level;
    private PlayerInventory inventory = new PlayerInventory();

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMaxExperience() {
        return maxExperience;
    }

    public void setMaxExperience(int maxExperience) {
        this.maxExperience = maxExperience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void addToPlayerInventory(generalItem item){

    }
}
