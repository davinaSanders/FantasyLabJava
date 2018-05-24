package Rooms;

public class MysteryRoom extends Room {
        private IObstacle obstacle2;

    public MysteryRoom(String name, IObstacle obstacle, IObstacle obstacle2) {
        super(name, obstacle);
        this.obstacle2 = obstacle2;

    }
}
