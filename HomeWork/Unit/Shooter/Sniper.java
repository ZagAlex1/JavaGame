package HomeWork.Unit.Shooter;

import java.util.ArrayList;

import HomeWork.SearchAndCreate.SearchTargets;
import HomeWork.Unit.Countryman;
import HomeWork.Unit.Unit;
import HomeWork.Main;

public class Sniper extends Shooter{

    private final int maxHp = 45;

    public Sniper(String name, int x, int y) {
        super(name, x, y, 45, 3, 15, 10);
    }
    
    @Override
    public void step(ArrayList<Unit> targets) {
        if(!isAlive()){
            return;  
        } 
        else if(super.isEmptyStock()){
            Countryman peaces = SearchTargets.findFrendlyCM(Main.allTeam, this);
            
            if(peaces != null){
                System.out.println("Бомж найден");
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
                System.out.printf("Я - %s, нанес урон по %s \n\n", name, target.getName());
            } 
    }

    @Override
    public String getInfo() {
        return String.format("Sniper|HP:%d/%d|Броня:%d|Боезапас:%d|x:%d y:%d|%s", 
                            hp, maxHp, armor, numberOfArrows, coords.getX(), coords.getY(), getStatus().toString());
    }
}
