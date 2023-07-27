package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

import HomeWork.SearchAndCreate.CreateNewTeam;
import HomeWork.Unit.Status;
import HomeWork.Unit.Unit;
import HomeWork.View.View;

public class Main {
    public static ArrayList<Unit> goodTeam = CreateNewTeam.createNewRandomUnits(10, true);
    public static ArrayList<Unit> evilTeam = CreateNewTeam.createNewRandomUnits(10, false);

    public static ArrayList<Unit> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        allTeam.addAll(goodTeam);
        allTeam.addAll(evilTeam);
        allTeam.sort((o1, o2) -> o2.getInit() - o1.getInit()); //сортировка по инициативе
        
        while (true) {
            View.view();
            if(isDeadInTeam(evilTeam) || isDeadInTeam(goodTeam)) break;
            
            new Scanner(System.in).nextLine();
            for (int j = 0; j < allTeam.size(); j++) {
                allTeam.get(j).step(allTeam);
            }
            //new Scanner(System.in).nextLine();
        }
    }

    private static boolean isDeadInTeam(ArrayList<Unit> units){
        for (Unit unit : units) {
            if(unit.getStatus() != Status.Dead) return false;
        }
        return true;
    }
}
