package HomeWork.Unit;

import java.util.ArrayList;

import HomeWork.Main;
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

    //Геттер армора. Нигде не учитывается
    public int getArmor() {
        return armor;
    }

    //Сеттер армора. В данный момент нигде не используется
    public boolean setArmor(int armor) {
        if (armor < 0) {
            return false;
        } else {
            this.armor += armor;
        }
        return true;
    }
    //Метод передвижения
    protected void move(ArrayList<Unit> allUnits, Unit target){
        getCoords().newPosition(allUnits, target);
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
        if(isAlive()){
            hp = hp - (damage - armor);
        }
        else return;
    }

    //вернуть имя
    public String getName(){
        return name;
    }
}
