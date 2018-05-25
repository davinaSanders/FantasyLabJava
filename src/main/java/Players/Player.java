package Players;




public abstract class Player{
    protected int health;
    protected int armourPoints;
    protected int wallet;
    protected String name;
    protected String race;
    protected String room;



    public Player(int health, int armourPoints, String name, String race, String room){
        this.health = health;
        this.armourPoints = armourPoints;
        this.wallet = 0;
        this.name = name;
        this.race = race;
        this.room = room;


    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public int getArmourPoints() {
        return this.armourPoints;
    }

    public int getHealth() {
        return this.health;
    }


    public int getWallet() {
        return wallet;
    }


    // methods for players health to be reduced by different percentages that would align with different attack types
    //methods for the wallet to  increase by value of the treasure objects in a room.




}
