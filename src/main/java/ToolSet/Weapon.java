package ToolSet;

public class Weapon implements IAttack{
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;

    }

    public String getName() {
        return this.name;
    }
}
