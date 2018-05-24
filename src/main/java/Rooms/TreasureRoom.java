package Rooms;

public class TreasureRoom extends Room{

    public TreasureRoom(String name, IObstacle obstacle){
        super(name, obstacle);
    }

    public String getName() {
        return this.name;
    }

    public IObstacle getTreasure() {
        return this.obstacle;
    }
}
