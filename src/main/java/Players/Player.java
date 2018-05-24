package Players;




public class Player{
    protected int health;
    protected int armourPoints;
    protected int wallet;
    protected String name;
    protected String race;



    public Player(int health, int armourPoints, String name, String race){
        this.health = health;
        this.armourPoints = armourPoints;
        this.wallet = 0;
        this.name = name;
        this.race = race;


    }



}
