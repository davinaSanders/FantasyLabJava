package Rooms;

public abstract class Room {
    protected String name;
    IObstacle obstacle;

    public Room(String name, IObstacle obstacle){
        this.name = name;
        this.obstacle = obstacle;

    }
}
