package Players;

public class SpellCaster extends Player implements Tools{
    private Creature creature;

    public SpellCaster(int health, int armourPoints, int wallet, String name, String race, Tools tools){
        super(health, armourPoints, wallet, name, race, tools);
        this.creature = creature;

    }
}
