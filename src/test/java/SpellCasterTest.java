import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellCasterTest {


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
}
