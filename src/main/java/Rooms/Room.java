package Rooms;

public abstract class Room {
    protected String name;
    IObstacle obstacle;

    public Room(String name, IObstacle obstacle){
        this.name = name;
        this.obstacle = obstacle;

    }


    // another class with an ArrayList of rooms to iterate through by index and change the players
    // room value once either a treasure's value is set to 0/an enemy's health is set to
    // 0 or both for the previous room.
}
