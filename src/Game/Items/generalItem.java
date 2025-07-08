package Game.Items;

public class generalItem {
    private int ammount;
    private int maxAmmount;
    private boolean usable = true;
    private String name;
    private String rarity;

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getMaxAmmount() {
        return maxAmmount;
    }

    public void setMaxAmmount(int maxAmmount) {
        this.maxAmmount = maxAmmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}
