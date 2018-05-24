package Players;

public class Creature {
    private String name;
    private int attack;
    private int health;
    private CreatureType creatureType;


    public Creature(String name, int attack, int health, CreatureType creatureType){
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.creatureType = creatureType;

    }
}
