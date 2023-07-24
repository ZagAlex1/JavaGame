package HomeWork.Unit.Melle;

import java.util.ArrayList;

import HomeWork.Unit.Unit;

public class Rogue extends Melee{
    public final int maxHp = 65;
    private int numberOfAttack = 2;
    public Rogue(String name, int x, int y) {
        super(name, x, y, 650, 2, 10);
    }

    //Имеет двойной ход и возможность при атаке снимать 1 броню
    @Override
    public void step(ArrayList<Unit> targets) {
        if(!isAlive()) return;
        
        Unit target = getCoords().findNearestEnemy(targets, this);
        for (int i = 0; i < numberOfAttack; i++) {
             boolean flag = attack(target);
             if(flag) target.setArmor(-1);
        }
    }

    @Override
    public String getInfo() {
        return String.format("Rogue|HP:%d/%d|Броня:%d|x:%d y:%d|%s", 
                            hp, maxHp, armor, coords.getX(), coords.getY(), getStatus());
    }

    @Override
    public String toString() {
        return "R";
    }
}
