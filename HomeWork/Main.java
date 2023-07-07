package HomeWork;

import java.util.ArrayList;
import java.util.Random;

import HomeWork.Melle.Rogue;
import HomeWork.Melle.Spearman;
import HomeWork.Shooter.Arbolist;
import HomeWork.Shooter.Sniper;
import HomeWork.Sorcerer.Mage;
import HomeWork.Sorcerer.Monk;
import HomeWork.Unit.Countryman;
import HomeWork.Unit.Unit;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        ArrayList<Unit> goodTeam = new ArrayList<>();

        ArrayList<Unit> evilTeam = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int choice = rnd.nextInt(6);
            if(i <= 9){
                switch(choice){
                    case 1:
                        goodTeam.add(new Rogue("Rick", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    case 2:
                        goodTeam.add(new Spearman("Van", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    case 3:
                        goodTeam.add(new Arbolist("Pol", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    case 4:
                        goodTeam.add(new Sniper("Hitch", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    case 5:
                        goodTeam.add(new Mage("Liman", rnd.nextInt(10), rnd.nextInt(10), "Metla"));
                        break;
                    case 6:
                        goodTeam.add(new Monk("ShiMun", rnd.nextInt(10), rnd.nextInt(10), "Krest"));
                        break;
                    default:
                        goodTeam.add(new Countryman("Bomj", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                }
            }
            else{
                switch(choice){
                    case 1:
                        evilTeam.add(new Rogue("Rick", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    case 2:
                        evilTeam.add(new Spearman("Van", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    case 3:
                        evilTeam.add(new Arbolist("Pol", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    case 4:
                        evilTeam.add(new Sniper("Hitch", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    case 5:
                        evilTeam.add(new Mage("Liman", rnd.nextInt(10), rnd.nextInt(10), "Metla"));
                        break;
                    case 6:
                        evilTeam.add(new Monk("ShiMun", rnd.nextInt(10), rnd.nextInt(10), "Krest"));
                        break;
                    default:
                        evilTeam.add(new Countryman("Bomj", rnd.nextInt(10), rnd.nextInt(10)));
                        break;
                    }    
                }
        }

        System.out.println("Команда Сил Света:");
        for (Unit unit : goodTeam) {
            System.out.println(unit.getInfo());
        }

        System.out.println();
        System.out.println("Команда Сил Тьмы:");
        for (Unit unit : evilTeam) {
            System.out.println(unit.getInfo());
        }

        goodTeam.get(1).getCoords().findNearestEnemy(evilTeam);
        System.out.println();
        evilTeam.get(3).getCoords().findNearestEnemy(goodTeam);

    }
}
