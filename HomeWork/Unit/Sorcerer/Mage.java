package HomeWork.Unit.Sorcerer;

import java.util.ArrayList;

import HomeWork.Unit.Unit;

public class Mage extends Sorcerer{
    public final int maxHp = 40;
    public Mage(String name, int x, int y, String artifact) {
        super(name, x, y, 40, 1, 60, artifact);

    }

    @Override
    public void step(ArrayList<Unit> targets) {
        
    }

    @Override
    public String getInfo() {
        return String.format("Mage|HP:%d/%d|Мана:%d|Броня:%d|x:%d y:%d|%s", 
                            hp,maxHp, mana, armor, coords.getX(), coords.getY(), getStatus());
    }
}
