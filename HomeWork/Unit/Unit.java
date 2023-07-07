package HomeWork.Unit;

import HomeWork.Interfaces.IBaseUnit;

public abstract class Unit implements IBaseUnit {

    protected String name;
    protected int hp;
    protected int armor;
    protected Coordinats coords;

    public Unit(String name, int x, int y, int hp, int armor) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        coords = new Coordinats(x, y);

    }

    public Coordinats getCoords(){
        return coords;
    }

    public int getHp() {
        return hp;
    }

    public boolean makeDamage(int damage) {
        hp -= damage;
        if(hp <= 0) return false;
        else return true;
    }

    

    public int getArmor() {
        return armor;
    }

    public boolean setArmor(int armor) {
        if (armor < 0) {
            return false;
        } else {
            this.armor += armor;
        }
        return true;
    }

    protected boolean makeMove() {
        return true;
    }
}
