package HomeWork.Unit.Sorcerer;

import HomeWork.Unit.Status;
import HomeWork.Unit.Unit;

public abstract class Sorcerer extends Unit{
    protected int numOfHealthPoint;
    protected int mana;
    protected String artifact;

    public Sorcerer(String name, int x, int y, int hp, int armor, int mana, String artifact, int initiative, int maxHP, int numOfHealthPoint) {
        super(name, x, y, hp, armor, initiative, maxHP);

        this.mana = mana;
        this.numOfHealthPoint = numOfHealthPoint;
        this.artifact = artifact;
    }

    public void restoreHealth(Unit target) {
        target.takeHealth(numOfHealthPoint);
        setStatus(Status.ResHP);
        System.out.println("\nВосстановил хп: " + target + " на коор. " + target.getCoords().getX() + " " + target.getCoords().getY());
        mana -= 10;
    }

    protected boolean isVoidChakra(){
        if(mana <= 0){
            setStatus(Status.VoidMana);
            return true;
        }
        return false;
    }
}
