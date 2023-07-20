package HomeWork.Mathematic;

import java.util.ArrayList;

import HomeWork.Unit.Status;
import HomeWork.Unit.Unit;

public class Coordinats {
    private int x;
    private int y;

    public Coordinats(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double findDistance(Unit target){
        return Math.sqrt((Math.pow(x - target.getCoords().x, 2) + Math.pow(y - target.getCoords().y, 2)));
    }
    
    //Поиск ближайщего юнита из противоположной команды
    public Unit findNearestEnemy(ArrayList<Unit> targets, Unit unit){
        
        if(isNotEmptyList(targets)){
            Unit target = null;
            int index = 0;
            double minDistance = 10;

            for (int i = 0; i < targets.size(); i++) {
                if(targets.get(i).getStatus() == Status.Dead) continue; //Проверка на статут Dead
                else if(targets.get(i).team == unit.team) continue; //Проверка на союзного юнита

                //Рассчет расстояния
                double tmp = Math.sqrt((Math.pow(x - targets.get(i).getCoords().x, 2) + Math.pow(y - targets.get(i).getCoords().y, 2)));
            
                if(tmp < minDistance){
                    minDistance = tmp;
                    target = targets.get(i);
                    index = i;
                }
            }
            System.out.printf("Самый близкий %s на расстоянии %.2f \n", 
                              targets.get(index).getClass().getSimpleName(), minDistance);
            return target;
        }
        else{
            System.out.println("Список пуст!"); 
            return null;
        }
    }

    private boolean isNotEmptyList(ArrayList<Unit> list){
        if(list.size() != 0) return true;
        else return false;
    }

    public void newPosition(ArrayList<Unit> allUnits, Unit target){
        if(x < target.getCoords().x){
            
        }

    }

    private boolean isEmptyPoint(ArrayList<Unit> units, int pointX, int pointY){
        for (var unit : units) {
            if(pointX == unit.getCoords().x && pointY == unit.getCoords().y){
                return false;
            }
        }
        return true;
    }
}
