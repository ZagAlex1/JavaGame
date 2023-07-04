package HomeWork;

public abstract class Sorcerer extends Unit{

    protected int mana;
    protected String artifact;
    public Sorcerer(String name, int hp, int armor, int movePoints, int mana, String artifact) {
        super(name, hp, armor, movePoints);
        this.mana = mana;
        this.artifact = artifact;
    }

    public int getMana() {
        return mana;
    }


}
