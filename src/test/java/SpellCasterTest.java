import Players.Creature;
import Players.CreatureType;
import Players.SpellCaster;
import ToolSet.HealingItem;
import ToolSet.IAttack;
import ToolSet.IHeal;
import ToolSet.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellCasterTest {
    SpellCaster spellcaster;
    IAttack spell;
    IHeal healingItem;
    Creature creature;
    
    @Before
    public void before(){
        creature = new Creature("Davina", 40, 100, CreatureType.YOSHI);
        spell = new Spell("Fireball", 20);
        healingItem = new HealingItem("Potion", 10);
        spellcaster = new SpellCaster(100, 30, "Ruri", "Elf", creature, spell, healingItem);
        
    }


    @Test
    public void hasName() {
        assertEquals("Ruri", spellcaster.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Elf", spellcaster.getRace());
    }

    @Test
    public void hasArmourPoints() {
        assertEquals(30, spellcaster.getArmourPoints());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, spellcaster.getHealth());
    }

    @Test
    public void hasWallet(){
        assertEquals(0, spellcaster.getWallet());
    }
    
    @Test
    public void hasSpell(){
        assertEquals(spell, spellcaster.getSpell());
    }

    @Test
    public void hasCreature(){
        assertEquals(creature, spellcaster.getCreature());
    }

    @Test
    public void hasHealingItem(){
        assertEquals(healingItem, spellcaster.getHealingItem());
    }
}
