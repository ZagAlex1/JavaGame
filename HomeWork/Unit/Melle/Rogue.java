package HomeWork.Unit.Melle;

import java.util.ArrayList;

import HomeWork.Unit.Unit;

public class Rogue extends Melee{
    public final int maxHp = 65;
    public Rogue(String name, int x, int y) {
        super(name, x, y, 65, 4, 15);
    }

    @Override
    public void step(ArrayList<Unit> targets) {
        
    }

    @Override
    public String getInfo() {
        return String.format("Rogue|HP:%d/%d|Броня:%d|x:%d y:%d|%s", 
                            hp, maxHp, armor, coords.getX(), coords.getY(), getStatus());
    }
}
