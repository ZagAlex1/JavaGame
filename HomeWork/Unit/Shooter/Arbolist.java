package HomeWork.Unit.Shooter;

import java.util.ArrayList;

import HomeWork.Main;
import HomeWork.SearchAndCreate.SearchTargets;
import HomeWork.Unit.Countryman;
import HomeWork.Unit.Unit;

public class Arbolist extends Shooter{
    
    public Arbolist(String name, int x, int y) {
        super(name, x, y, 60, 3, 12, 10, 12, 75, 60);
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
            Attack(getCoords().findNearestEnemy(targets, this));
            return;
        }
    }
    
    private void Attack(Unit target){
        if(target != null){
            shoot(target);
            target.setArmor(-1);
        } 
    }

    @Override
    public String getInfo() {
        return String.format("Arbolist|HP:%d/%d|Броня:%d|Боезапас:%d|x:%d y:%d|%s & %s", 
                            hp, getMaxHp(), armor, numberOfArrows, coords.getX(), coords.getY(), getStatus(), isWaitCountry);
    }

    @Override
    public String toString() {
        return "A";
    }
}
