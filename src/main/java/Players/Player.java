package Players;




public abstract class Player{
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



}
