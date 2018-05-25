package Players;

import ToolSet.HealingItem;
import ToolSet.IHeal;

public class Healer extends Player implements IHeal {
    private IHeal healingItem;

    public Healer(int health, int armourPoints, String name, String race, String room,IHeal healingItem){
        super(health, armourPoints, name, race, room);
        this.healingItem = healingItem;

    }

    public IHeal getItem() {
        return this.healingItem;
    }
}
