package Players;

import ToolSet.IAttack;
import ToolSet.IHeal;


public class SpellCaster extends Player implements IAttack, IHeal {
    private Creature creature;
    private IAttack spell;
    private IHeal healingItem;

    public SpellCaster(int health, int armourPoints,String name, String race, Creature creature,IAttack spell, IHeal healingItem){
        super(health, armourPoints,  name, race);
        this.creature = creature;
        this.spell = spell;
        this.healingItem = healingItem;

    }
}
