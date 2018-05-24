package Players;

import ToolSet.IAttack;

public class Warrior extends Player implements IAttack {

    private IAttack weapon;

    public Warrior(int health, int armourPoints, String name, String race, IAttack weapon){
        super(health, armourPoints,name, race);

        this.weapon = weapon;

    }

    public IAttack getWeapon() {
        return this.weapon;
    }
}
