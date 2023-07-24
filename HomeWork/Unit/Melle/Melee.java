package HomeWork.Unit.Melle;

import HomeWork.Unit.Status;
import HomeWork.Unit.Unit;

public abstract class Melee extends Unit {
    protected int damage;

    public Melee(String name, int x, int y, int hp, int armor, int damage) {
        super(name, x, y, hp, armor);
        this.damage = damage;
    }

    public boolean attack(Unit target) {
        if(getCoords().findDistance(target) <= 1){
            target.takeDamage(damage);
            setStatus(Status.Attack);
            return true;
        }
        else{
            move(target);
            return false;
        }   
    }

}
