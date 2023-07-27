package HomeWork.Unit;

import java.util.ArrayList;

import HomeWork.Main;
import HomeWork.SearchAndCreate.SearchTargets;
import HomeWork.Unit.Shooter.Shooter;

public class Countryman extends Unit{

    private int numberOfArrows = 20;
    public final int maxHP = 40;
    Shooter shooter;

    public Countryman(String name, int x, int y) {
        super(name, x, y, 40, 0);
    }
    @Override
    public void step(ArrayList<Unit> targets) {
        if(!isAlive()){
            if(shooter != null) shooter.isWaitCountry = false;
            return;
        }
        else if(!isNotEmpty()) return;

        if(shooter == null){
            shooter = SearchTargets.findNotFullShooter(Main.allTeam, this);
            if(shooter != null) shooter.isWaitCountry = true;
            else return;
        }
        else if(shooter != null && shooter.getStatus() == Status.Dead){
            shooter = SearchTargets.findNotFullShooter(Main.allTeam, this);
        }

        if(shooter != null && shooter.getStatus() == Status.Empty){
            if(getCoords().findDistance(shooter) <= 1){

                numberOfArrows = shooter.restock(numberOfArrows);

                System.out.printf("Пополнил запас %s на коор: %d %d\n",shooter.getName(), shooter.getCoords().getX(), shooter.getCoords().getY());
                shooter = null;
                setStatus(Status.Stand);
            }
            else{
                move(shooter);
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
    
    @Override
    public String toString() {
        return "C";
    }
}
