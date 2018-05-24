import Players.Creature;
import Players.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature creature;

    @Before
    public void before(){
        creature = new Creature("Smaug",50,100, CreatureType.DRAGON);
    }

    @Test
    public void hasName(){
        assertEquals("Smaug",creature.getName());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(50,creature.getAttack());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100,creature.getHealth());
    }

    @Test
    public void hasCreatureType(){
        assertEquals(CreatureType.DRAGON, creature.getType());
    }



}
