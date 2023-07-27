package HomeWork.Unit.Sorcerer;

import java.util.ArrayList;

import HomeWork.SearchAndCreate.SearchTargets;
import HomeWork.Unit.Status;
import HomeWork.Unit.Unit;

public class Monk extends Sorcerer{
    private int count = 0;
    public Monk(String name, int x, int y, String artifact) {
        super(name, x, y, 45, 2, 60, artifact, 30, 45, 10);

    }

    @Override
    public void step(ArrayList<Unit> targets) {
        if(!isAlive()) return;
        else if(isVoidChakra()){ 
            restoreMana();
            count++;
            return;
        }
        else{
            var target = SearchTargets.findFrendlyUnitWithNotFullHp(targets, this);

            if(target != null){
                super.restoreHealth(target);
            }
            count++;
        }
    }

    private void restoreMana(){
        if(count >= 3){
            System.out.println("\nМедитировал и восстановил ману");
            mana += 20;
            count = 0;
            setStatus(Status.Stand);
        }
        else{
            System.out.println("\nНет маны");
        }
    }

    @Override
    public String getInfo() {
        return String.format("Monk|HP:%d/%d|Мана:%d|Броня:%d|x:%d y:%d|%s", 
                            hp, getMaxHp(), mana, armor, coords.getX(), coords.getY(), getStatus());
    }
    
    @Override
    public String toString() {
        return "M";
    }
}
