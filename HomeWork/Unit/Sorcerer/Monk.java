package HomeWork.Unit.Sorcerer;

import java.util.ArrayList;

import HomeWork.Unit.Unit;

public class Monk extends Sorcerer{
    public final int maxHp = 35;
    public Monk(String name, int x, int y, String artifact) {
        super(name, x, y, 35, 1, 70, artifact);

    }

    @Override
    public void step(ArrayList<Unit> targets) {
        
    }

    @Override
    public String getInfo() {
        return String.format("Monk|HP:%d/%d|Мана:%d|Броня:%d|x:%d y:%d|%s", 
                            hp, maxHp, mana, armor, coords.getX(), coords.getY(), getStatus());
    }
}
