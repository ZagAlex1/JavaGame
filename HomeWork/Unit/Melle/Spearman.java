package HomeWork.Unit.Melle;

import java.util.ArrayList;

import HomeWork.Unit.Unit;

public class Spearman extends Melee{

    public Spearman(String name, int x, int y) {
        super(name, x, y, 85, 5, 10, 55, 85);
    }

    @Override
    public void step(ArrayList<Unit> targets) {
        if(!isAlive()) return;

        Unit target = getCoords().findNearestEnemy(targets, this);
        attack(target);

        return;
    }

    @Override
    public String getInfo() {
        return String.format("Spearman|HP:%d/%d|Броня:%d|x:%d y:%d|%s", 
                            hp, getMaxHp(), armor, coords.getX(), coords.getY(), getStatus());
    }

    @Override
    public String toString() {
        return "P";
    }
}
