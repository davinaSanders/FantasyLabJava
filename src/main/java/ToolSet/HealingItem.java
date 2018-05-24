package ToolSet;

public class HealingItem implements IHeal{
    private String name;
    private int healing;

    public HealingItem(String name, int healing){
        this.name = name;
        this.healing = healing;

    }

    public String getName() {
        return this.name;
    }

    public int getHeal() {
        return this.healing;
    }
}
