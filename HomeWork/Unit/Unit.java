package HomeWork.Unit;



import HomeWork.Interfaces.IBaseUnit;

public abstract class Unit implements IBaseUnit {

    protected String name;
    protected int hp;
    protected int armor;
    protected Coordinats coords;

    public Unit(String name, int x, int y, int hp, int armor) {
        this.name = name;
        coords = new Coordinats(x, y);

        if(setHp(hp)){
            this.hp = hp;
        } 
        else {
            this.hp = 1;
        }

        if(setArmor(armor)){
            this.armor = armor;
        } 
        else {
            this.armor = 0;
        }
    }

    public Coordinats getCoords(){
        return coords;
    }

    public int getHp() {
        return hp;
    }

    public boolean setHp(int hp) {
        if (hp < 0) {
            return false;
        } else {
            this.hp += hp;
        }
        return true;
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
