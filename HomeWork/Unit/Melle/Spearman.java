package HomeWork.Unit.Melle;

import java.util.ArrayList;

import HomeWork.Unit.Unit;

public class Spearman extends Melee{
    
    private final int maxHp = 90;

    public Spearman(String name, int x, int y) {
        super(name, x, y, 90, 8, 10);
    }

    @Override
    public void step(ArrayList<Unit> targets) {
        
    }

    @Override
    public String getInfo() {
        return String.format("Spearman|HP:%d/%d|Броня:%d|x:%d y:%d|%s", 
                            hp, maxHp, armor, coords.getX(), coords.getY(), getStatus());
    }
}
