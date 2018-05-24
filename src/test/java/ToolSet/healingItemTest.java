package ToolSet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class healingItemTest {
    HealingItem healingItem;

    @Before
    public void before() {
        healingItem = new HealingItem("Potion", 50);

    }

    @Test
    public void hasName(){
        assertEquals("Potion", healingItem.getName());
    }

    @Test
    public void canHeal(){
        assertEquals(50, healingItem.getHeal());
    }

}
