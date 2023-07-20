package HomeWork.Unit.Melle;

import HomeWork.Unit.Unit;

public abstract class Melee extends Unit {
    protected int damage;

    public Melee(String name, int x, int y, int hp, int armor, int damage) {
        super(name, x, y, hp, armor);

        this.damage = damage;

    }

    public void attack(Unit target) {
        throw new UnsupportedOperationException("Unimplemented method 'Attack'");
    }

}
