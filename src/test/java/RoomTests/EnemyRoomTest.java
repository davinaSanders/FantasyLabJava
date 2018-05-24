package RoomTests;

import Rooms.Enemy;
import Rooms.EnemyRoom;
import Rooms.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {
    EnemyRoom enemyRoom;
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Joe", 78, 100, EnemyType.MALICIOUS_YOSHI);
        enemyRoom = new EnemyRoom("Sandy's Lair", enemy);
    }

    @Test
    public void hasName(){
        assertEquals("Sandy's Lair", enemyRoom.getName());
    }

    @Test
    public void hasEnemy(){
        assertEquals(enemy, enemyRoom.getEnemy());
    }
}
