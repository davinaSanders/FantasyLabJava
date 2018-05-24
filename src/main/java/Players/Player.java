package Players;



public class Player{
    protected int health;
    protected int armourPoints;
    protected int wallet;
    protected String name;
    protected String race;
    protected Tools tools;


    public Player(int health, int armourPoints, int wallet, String name, String race, Tools tools){
        this.health = health;
        this.armourPoints = armourPoints;
        this.wallet = wallet;
        this.name = name;
        this.race = race;
        this.tools = tools;

    }



}
