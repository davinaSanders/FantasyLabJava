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

    public String getName() {
        return this.name;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getHealth() {
        return this.health;
    }

    public CreatureType getType() {
        return this.creatureType;
    }
}
