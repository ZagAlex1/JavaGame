package HomeWork.Shooter;

import HomeWork.Interfaces.IRangeAttack;
import HomeWork.Unit.Unit;

public abstract class Shooter extends Unit implements IRangeAttack{

    protected int numberOfArrows;
    protected int damage;

    public Shooter(String name, int x, int y, int hp, int armor, int numberOfArrows, int damage) {
        super(name, x, y, hp, armor);

        this.damage = damage;
        
        if(setNumberOfArrows(numberOfArrows)){
            this.numberOfArrows = numberOfArrows;
        } 
        else {
            this.numberOfArrows = 1;
        }
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public boolean setNumberOfArrows(int numberOfArrows) {
        if (numberOfArrows < 0) {
            return false;
        } else {
            this.numberOfArrows += numberOfArrows;
        }
        return true;
    }
}
