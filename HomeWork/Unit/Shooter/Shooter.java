package HomeWork.Unit.Shooter;

import HomeWork.Unit.Status;
import HomeWork.Unit.Unit;

public abstract class Shooter extends Unit{
    public final int maxNumberofArrow = 10;
    protected int numberOfArrows;
    protected int damage;
    public boolean isWaitCountry = false;

    public Shooter(String name, int x, int y, int hp, int armor, int numberOfArrows, int damage) {
        super(name, x, y, hp, armor);
        this.numberOfArrows = numberOfArrows;
        this.damage = damage;
    }

    //Метод стрельбы
    protected void shoot(Unit target) {
        if(target.getStatus() != Status.Dead){
            target.takeDamage(damage);
            numberOfArrows --;

            System.out.printf("Нанес урон по %s\n", target.getName());

            setStatus(Status.Shoot);
        }
        else{
            setStatus(Status.Stand);
        }
    }

    //Метод пополнения боезапаса
    public void restock(int arrows) {
        numberOfArrows += arrows;
    }

    public int getNumOfArr(){
        return numberOfArrows;
    }

    //Проверка на полный запас
    public boolean isFull() {
        if(numberOfArrows == maxNumberofArrow) return true;
        else return false;
    }

    //Проверка на пустой запас
    public boolean isEmptyStock(){
        if(numberOfArrows == 0){
            setStatus(Status.Empty);
            return true;
        }
        else return false;
    }
}
