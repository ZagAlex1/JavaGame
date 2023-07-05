package HomeWork.Sorcerer;

import HomeWork.Interfaces.IHealth;
import HomeWork.Unit.Unit;

public abstract class Sorcerer extends Unit implements IHealth{

    protected int mana;
    protected String artifact;

    public Sorcerer(String name, int x, int y, int hp, int armor, int mana, String artifact) {
        super(name, x, y, hp, armor);

        this.mana = mana;

        this.artifact = artifact;
    }

}
