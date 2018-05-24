package Rooms;

public class Enemy implements IObstacle{
    private String name;
    private int attack;
    private int health;
    private EnemyType enemyType;

    public Enemy(String name, int attack, int health, EnemyType enemyType){
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.enemyType = enemyType;
    }

}
