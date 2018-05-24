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

    public String getName() {
        return this.name;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getHealth() {
        return this.health;
    }

    public EnemyType getType() {
        return this.enemyType;
    }
}
