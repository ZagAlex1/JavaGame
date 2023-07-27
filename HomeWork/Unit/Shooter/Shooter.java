package HomeWork.Unit.Shooter;

import HomeWork.Unit.Status;
import HomeWork.Unit.Unit;

public abstract class Shooter extends Unit{
    public final int maxNumberofArrow;
    protected int numberOfArrows;
    protected int damage;
    public boolean isWaitCountry = false; //ждет ли шутер союзного бомжа

    public Shooter(String name, int x, int y, int hp, int armor, int numberOfArrows, int damage, int maxNumberofArrow, int initiative, int maxHP) {
        super(name, x, y, hp, armor, initiative, maxHP);
        this.numberOfArrows = numberOfArrows;
        this.damage = damage;
        this.maxNumberofArrow = maxNumberofArrow;
    }

    //Метод стрельбы
    protected void shoot(Unit target) {
        if(target.getStatus() != Status.Dead && target != null){
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
    public int restock(int arrows) {
        
        //Написать логику пополнения не трогая ход бомжа
        
        
        return 0; //заглушка
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
