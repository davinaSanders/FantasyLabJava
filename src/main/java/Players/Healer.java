package Players;

import ToolSet.HealingItem;
import ToolSet.IHeal;

public class Healer extends Player implements IHeal {
    private IHeal healingItem;

    public Healer(int health, int armourPoints, String name, String race, IHeal healingItem){
        super(health, armourPoints, name, race);
        this.healingItem = healingItem;

    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public int getArmourPoints() {
        return this.armourPoints;
    }

    public int getHealth() {
        return this.health;
    }


    public int getWallet() {
        return wallet;
    }


    public IHeal getItem() {
        return this.healingItem;
    }
}
