import Players.Healer;
import ToolSet.HealingItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;
    HealingItem healingItem;

    @Before
    public void before(){
        healingItem = new HealingItem("Healing Herb", 40);
        healer = new Healer(100,30, "Sarah", "Human", healingItem);
    }

    @Test
    public void hasName() {
        assertEquals("Sarah", healer.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Human", healer.getRace());
    }

    @Test
    public void hasArmourPoints() {
        assertEquals(30, healer.getArmourPoints());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, healer.getHealth());
    }

    @Test
    public void hasWallet(){
        assertEquals(0, healer.getWallet());
    }

    @Test
    public void hasItem(){
        assertEquals(healingItem, healer.getItem());
    }

}
