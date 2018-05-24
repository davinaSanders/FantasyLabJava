package Rooms;

public class EnemyRoom extends Room {

    public EnemyRoom(String name, IObstacle obstacle){
        super(name, obstacle);
    }


    public String getName() {
        return this.name;
    }

    public IObstacle getEnemy() {
        return this.obstacle;
    }
}
