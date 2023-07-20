package HomeWork.Unit;

import java.util.ArrayList;

import HomeWork.SearchAndCreate.SearchTargets;
import HomeWork.Unit.Shooter.Shooter;

public class Countryman extends Unit{

    private int numberOfArrows;
    public final int maxHP = 40;

    public Countryman(String name, int x, int y) {
        super(name, x, y, 40, 0);

        this.numberOfArrows = 20;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }
    

    @Override
    public void step(ArrayList<Unit> targets) {
        if(!isAlive() || !isNotEmpty()) return;

        Shooter shooter = SearchTargets.findNotFullShooter(targets, this);
        if(shooter != null && !shooter.isFull()){
            
            if(getCoords().findDistance(shooter) <= 1){
                int tmp = shooter.maxNumberofArrow - shooter.getNumOfArr();
                
                if(numberOfArrows - tmp >= 0){
                    shooter.restock(tmp);
                    numberOfArrows -= tmp;
                }
                else{
                    //Логика пересчета
                }
            }
            else{
                move(targets, shooter);
            }

            setStatus(Status.Busy);
        }
        else{
            setStatus(Status.Stand);
            return;
        }
    }

    private boolean isNotEmpty(){
        if(numberOfArrows != 0)return true;
        else return false;
    }

    @Override
    public String getInfo() {
        return String.format("Countryman|HP:%d/%d|Броня:%d|Кол-во припасов:%d|x:%d y:%d|%s", 
                            hp, maxHP, armor, numberOfArrows, coords.getX(), coords.getY(), getStatus().toString());
    } 
}
