package HomeWork.SearchAndCreate;

import java.util.ArrayList;
import java.util.Random;

import HomeWork.Unit.Countryman;
import HomeWork.Unit.Team;
import HomeWork.Unit.Unit;
import HomeWork.Unit.Melle.Rogue;
import HomeWork.Unit.Melle.Spearman;
import HomeWork.Unit.Shooter.Arbolist;
import HomeWork.Unit.Shooter.Sniper;
import HomeWork.Unit.Sorcerer.Mage;
import HomeWork.Unit.Sorcerer.Monk;

public class CreateNewTeam {
    public static ArrayList<Unit> createNewRandomUnits(int count, boolean flag){
        ArrayList<Unit> units = new ArrayList<>();
        Random rnd = new Random();
        Team team;
        int y;

        if(flag){
            y = 1;
            team = Team.Blue;
        }
        else{
            y = 10;
            team = Team.Green;
        }

        for (int i = 0; i < count; i++) {
            Unit unit = null;
            int choice = rnd.nextInt(7);
            switch(choice){
                    case 1:
                        unit = new Rogue("Rick", i + 1, y);
                        unit.team = team;
                        units.add(unit);
                        break;
                    case 2:
                        unit = new Spearman("San",i + 1, y);
                        unit.team = team;
                        units.add(unit);
                        break;
                    case 3:
                        unit = new Arbolist("Aid", i + 1, y);
                        unit.team = team;
                        units.add(unit);
                        break;
                    case 4:
                        unit = new Sniper("Snake",i + 1, y);
                        unit.team = team;
                        units.add(unit);
                        break;
                    case 5:
                        unit = new Mage("Gandalf", i + 1, y, "Metla");
                        unit.team = team;
                        units.add(unit);
                        break;
                    case 6:
                        unit = new Monk("Mishu", i + 1, y, "Krest");
                        unit.team = team;
                        units.add(unit);
                        break;
                    default:
                        unit = new Countryman("Bomj", i + 1, y);
                        unit.team = team;
                        units.add(unit);
                        break;
                }
        }
        return units;
    }
}
