package HomeWork.Unit.Sorcerer;

import HomeWork.Unit.Unit;

public abstract class Sorcerer extends Unit{

    protected int mana;
    protected String artifact;

    public Sorcerer(String name, int x, int y, int hp, int armor, int mana, String artifact) {
        super(name, x, y, hp, armor);

        this.mana = mana;

        this.artifact = artifact;
    }

    public int restoreHealth(int mana) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restoreHealth'");
    }

}
