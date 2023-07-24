package HomeWork;

import java.util.ArrayList;
import HomeWork.SearchAndCreate.CreateNewTeam;
import HomeWork.Unit.Unit;
import HomeWork.View.View;

public class Main {
    public static ArrayList<Unit> goodTeam = CreateNewTeam.createNewRandomUnits(10, true);
    public static ArrayList<Unit> evilTeam = CreateNewTeam.createNewRandomUnits(10, false);

    public static ArrayList<Unit> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        allTeam.addAll(goodTeam);
        allTeam.addAll(evilTeam);
        
        for (int i = 0; i < 30; i++) {
            View.view();
            for (int j = 0; j < allTeam.size(); j++) {
            allTeam.get(j).step(allTeam);
            }
        }
        
    }
}
