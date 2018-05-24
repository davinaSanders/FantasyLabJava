package RoomTests;

import Rooms.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;


    @Before
    public void before(){
        treasure = new Treasure("Sapphires", 40);
    }

    @Test
    public void hasName(){
        assertEquals("Sapphires", treasure.getName());
    }

    @Test
    public void hasValue(){
        assertEquals(40, treasure.getValue());
    }
}
