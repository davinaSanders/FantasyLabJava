package ToolSet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class weaponTest {

    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Dagger", 75);
    }

    @Test
    public void hasName(){
        assertEquals("Dagger", weapon.getName());
    }

    @Test
    public void hasAttack(){
        assertEquals(75, weapon.getAttack());
    }
}
