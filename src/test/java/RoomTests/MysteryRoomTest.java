package RoomTests;

import Rooms.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MysteryRoomTest {
    MysteryRoom mysteryRoom;
    Enemy enemy;
    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure("Diamonds", 100);
        enemy = new Enemy("Joe", 78, 100, EnemyType.MALICIOUS_YOSHI);
        mysteryRoom = new MysteryRoom("Tomb of John", enemy, treasure);
    }

    @Test
    public void hasName(){
        assertEquals("Tomb of John", mysteryRoom.getName());
    }

    @Test
    public void hasEnemy(){
        assertEquals(enemy, mysteryRoom.getEnemy());
    }

    @Test
    public void hasTreasure(){
        assertEquals(treasure, mysteryRoom.getTreasure());
    }
}
