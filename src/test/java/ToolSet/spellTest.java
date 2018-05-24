package ToolSet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class spellTest {

    Spell spell;

    @Before
    public void before(){
        spell = new Spell("Ice Blast", 60);
    }

    @Test
    public void hasName(){
        assertEquals("Ice Blast", spell.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(60, spell.getDamage());
    }



}
