package RoomTests;

import Rooms.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure("Gold", 70);
        treasureRoom = new TreasureRoom("Zsolt's vault", treasure);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt's vault", treasureRoom.getName());
    }

    @Test
    public void hasTreasure(){
        assertEquals(treasure, treasureRoom.getTreasure());
    }
}
