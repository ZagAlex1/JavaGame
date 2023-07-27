package HomeWork.Unit.Sorcerer;

import java.util.ArrayList;

import HomeWork.SearchAndCreate.SearchTargets;
import HomeWork.Unit.Unit;

public class Mage extends Sorcerer{
    
    public Mage(String name, int x, int y, String artifact) {
        super(name, x, y, 50, 2, 50, artifact, 25, 50, 15);

    }

    @Override
    public void step(ArrayList<Unit> targets) {
        if(!isAlive() || isVoidChakra()){
            return;
        }
        else{
            var target = SearchTargets.findFrendlyUnitWithNotFullHp(targets, this);

            if(target != null){
                super.restoreHealth(target);
            }
        }
    }

    @Override
    public String getInfo() {
        return String.format("Mage|HP:%d/%d|Мана:%d|Броня:%d|x:%d y:%d|%s", 
                            hp, getMaxHp(), mana, armor, coords.getX(), coords.getY(), getStatus());
    }

    @Override
    public String toString() {
        return "G";
    }
}
