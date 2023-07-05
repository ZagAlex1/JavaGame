package HomeWork.Unit;

import java.util.ArrayList;

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

    public int findNearestEnemy(ArrayList<Unit> targets){
        double minDistance = 0;
        int indexMinTarget = 0;

        if(targets.size() != 0){
            minDistance = (Math.pow(x - targets.get(0).coords.x,  2) + Math.pow(y - targets.get(0).coords.y,  2));
        }
        else{
            System.out.println("Список пуст!");
        }

        for (int i = 0; i < targets.size(); i++) {
            double tmp = Math.sqrt((Math.pow(x - targets.get(i).coords.x, 2) + Math.pow(y - targets.get(i).coords.y, 2)));
            System.out.printf("\nДистанция до %s по имени %s = %.2fм",targets.get(i).getClass().getSimpleName(),targets.get(i).getName(), tmp);
            if(tmp < minDistance){
                minDistance = tmp;
                indexMinTarget = i;
            }
        }
        System.out.printf("\nСамый близкий %s на расстоянии %.2f ", targets.get(indexMinTarget).getName(), minDistance);

        return indexMinTarget;
    }
}
