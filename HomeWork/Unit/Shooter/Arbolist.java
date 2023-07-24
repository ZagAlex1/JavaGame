package HomeWork.Unit.Shooter;

import java.util.ArrayList;

import HomeWork.Unit.Unit;

public class Arbolist extends Shooter{
    public final int maxHp = 55;
    public Arbolist(String name, int x, int y) {
        super(name, x, y, 55, 5, 12, 10);
    }

    @Override
    public void step(ArrayList<Unit> targets) {
        
    }

    @Override
    public String getInfo() {
        return String.format("Arbolist|HP:%d/%d|Броня:%d|Боезапас:%d|x:%d y:%d|%s", 
                            hp, maxHp, armor, numberOfArrows, coords.getX(), coords.getY(), getStatus());
    }

    @Override
    public String toString() {
        return "A";
    }
}
