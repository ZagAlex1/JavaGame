package HomeWork;

import java.util.ArrayList;
import HomeWork.Melle.Rogue;
import HomeWork.Melle.Spearman;
import HomeWork.Shooter.Sniper;
import HomeWork.Unit.Unit;

public class Main {
    public static void main(String[] args) {
        ArrayList<Unit> goodTeam = new ArrayList<>();
        goodTeam.add(new Rogue("Leo", 5, 3));
        goodTeam.add(new Sniper("Bob", 7, 2, 40, 3, 10));
        goodTeam.add(new Spearman("Din", 3, 7, 30, 4, 25));

        ArrayList<Unit> evilTeam = new ArrayList<>();
        evilTeam.add(new Rogue("Rick", 9, 6));
        evilTeam.add(new Sniper("Lick", 2, 8, 40, 3, 45));
        evilTeam.add(new Spearman("Nick", 2, 5, 30, 4, 25));

        System.out.println();
        System.out.println("Индекс цели: " + goodTeam.get(0).getCoords().findNearestEnemy(evilTeam));

        System.out.println();
        System.out.println("Индекс цели: " + evilTeam.get(0).getCoords().findNearestEnemy(goodTeam));

    }
}
