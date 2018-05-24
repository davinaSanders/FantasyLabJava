import Players.Warrior;
import ToolSet.IAttack;
import ToolSet.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {
    
    Warrior warrior;
    IAttack weapon;
    
    @Before
    public void before(){
        weapon = new Weapon("Dagger", 7);
        warrior = new Warrior(100, 80, "Daniel", "Wood Elf", weapon);
    }


    @Test
    public void hasName() {
        assertEquals("Daniel", warrior.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Wood Elf", warrior.getRace());
    }

    @Test
    public void hasArmourPoints() {
        assertEquals(80, warrior.getArmourPoints());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, warrior.getHealth());
    }

    @Test
    public void hasWallet(){
        assertEquals(0, warrior.getWallet());
    }

    @Test
    public void hasWeapon(){
        assertEquals(weapon, warrior.getWeapon());
    }


}
