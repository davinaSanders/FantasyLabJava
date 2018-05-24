package RoomTests;

import Rooms.Enemy;
import Rooms.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Paul", 50, 100, EnemyType.MISCHEVIOUS_IMP);
    }

    @Test
    public void canGetName(){
        assertEquals("Paul", enemy.getName());
    }

    @Test
    public void canGetEnemyType(){
        assertEquals(EnemyType.MISCHEVIOUS_IMP, enemy.getType());
    }

    @Test
    public void canGetAttack(){
        assertEquals(50,enemy.getAttack());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, enemy.getHealth());
    }



}
