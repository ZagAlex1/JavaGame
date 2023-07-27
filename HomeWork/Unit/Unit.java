package HomeWork.Unit;

import HomeWork.Mathematic.Coordinats;
import HomeWork.Unit.Interfaces.IBaseUnit;

public abstract class Unit implements IBaseUnit {
    public Team team;
    protected String name;
    protected int hp;
    protected int armor;
    protected Coordinats coords;

    private Status status = Status.Stand;

    public Unit(String name, int x, int y, int hp, int armor) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.coords = new Coordinats(x, y);
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status value){
        status = value;
    }

    public Coordinats getCoords(){
        return coords;
    }

    public int getHp() {
        return hp;
    }

    //Геттер армора.
    public int getArmor() {
        return armor;
    }

    //Сеттер армора.
    public void setArmor(int armor) {
        this.armor += armor;
    }

    //Метод передвижения
    protected void move(Unit target){
        getCoords().newPosition(target);
        setStatus(Status.Move);
    }

    //Проверка, жив ли персонаж
    protected boolean isAlive(){
        if(hp > 0){
            return true;
        }
        else{
            setStatus(Status.Dead);
            return false;
        }
    }

    //Метод на получение урона
    public void takeDamage(int damage) { 
        if(hp > 0){
            hp = hp - (damage - armor);
            isAlive();
        }
        else status = Status.Dead;
    }

    //Метод на восстановление здоровья
    public void takeHealth(int health){
        
    }

    //вернуть имя
    public String getName(){
        return name;
    }
}
