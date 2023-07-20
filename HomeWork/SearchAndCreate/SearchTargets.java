package HomeWork.SearchAndCreate;

import java.util.ArrayList;

import HomeWork.Unit.Countryman;
import HomeWork.Unit.Status;
import HomeWork.Unit.Unit;
import HomeWork.Unit.Shooter.Shooter;

public class SearchTargets {
    //Поиск союзного, живого и свободного бомжа
    public static Countryman findFrendlyCM(ArrayList<Unit> allUnits, Unit unit){
        for (Unit target : allUnits) {
            if(target instanceof Countryman && target.getStatus() == Status.Stand && target.team == unit.team){
                return (Countryman) target;
            }
        }
        return null;
    }

    public static Shooter findNotFullShooter(ArrayList<Unit> allUnits, Unit unit){
        for (Unit target : allUnits) {
            if(target instanceof Shooter && target.getStatus() != Status.Dead && target.team == unit.team){
                return (Shooter)target;
            }
        }
        return null;
    }
}
