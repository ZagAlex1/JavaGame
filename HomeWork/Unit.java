package HomeWork;

public abstract class Unit {

    protected String name;
    protected int hp;
    protected int armor;
    protected int movePoints;

    public Unit(String name, int hp, int armor, int movePoints) {
        this.name = name;
        if(setHp(hp)){
            this.hp = hp;
        } else {
            this.hp = 1;
        }
        if(setArmor(armor)){
            this.armor = armor;
        } else {
            this.armor = 0;
        }
        if(setMovePoints(movePoints)){
            this.movePoints = movePoints;
        } else {
            this.movePoints = 1;
        }
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

    public int getMovePoints() {
        return movePoints;
    }

    public boolean setMovePoints(int movePoints) {
        if (movePoints < 0) {
            return false;
        } else {
            this.movePoints += movePoints;
        }
        return true;
    }

    protected boolean makeMove() {
        return true;
    }

}
