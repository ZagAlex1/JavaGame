package HomeWork.Melle;

import HomeWork.Unit.Unit;

public class Spearman extends Melee{

    public Spearman(String name, int x, int y, int hp, int armor, int damage) {
        super(name, x, y, hp, armor, damage);

    }

    @Override
    public void attack(Unit target) {
        throw new UnsupportedOperationException("Unimplemented method 'Attack'");
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInfo'");
    }

    @Override
    public String getName() {
        return name;
    }
}
