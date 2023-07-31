package HomeWork.Unit.Shooter;

import java.util.ArrayList;

import HomeWork.SearchAndCreate.SearchTargets;
import HomeWork.Unit.Countryman;
import HomeWork.Unit.Unit;
import HomeWork.Main;

public class Sniper extends Shooter{

    public Sniper(String name, int x, int y) {
        super(name, x, y, 45, 2, 10, 15, 10, 80, 45);
    }
    
    @Override
    public void step(ArrayList<Unit> targets) {
        if(!isAlive()){
            return;  
        } 
        else if(super.isEmptyStock()){
            Countryman peaces = SearchTargets.findFrendlyCM(Main.allTeam, this);
            
            if(peaces != null){
                peaces.step(targets);
            }
            else return;
        }
        else{
            Attack(targets);
            return;
        }
    }

    private void Attack(ArrayList<Unit> targets){
        Unit target = getCoords().findNearestEnemy(targets, this);
            if(target != null){
                shoot(target);
            } 
    }

    @Override
    public String getInfo() {
        return String.format("Sniper|HP:%d/%d|Броня:%d|Боезапас:%d|x:%d y:%d|%s & %s", 
                            hp, getMaxHp(), armor, numberOfArrows, coords.getX(), coords.getY(), getStatus().toString(), isWaitCountry);
    }

    @Override
    public String toString() {
        return "S";
    }
}
