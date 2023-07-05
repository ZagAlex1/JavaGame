package HomeWork.Melle;

import HomeWork.Interfaces.IMeleeAttack;
import HomeWork.Unit.Unit;

public abstract class Melee extends Unit implements IMeleeAttack{

    protected int damage;

    public Melee(String name, int x, int y, int hp, int armor, int damage) {
        super(name, x, y, hp, armor);

        this.damage = damage;

    }

}
