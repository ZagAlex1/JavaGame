package HomeWork.Melle;

import HomeWork.Unit.Unit;

public class Rogue extends Melee{

    public Rogue(String name, int x, int y) {
        super(name, x, y, 45, 3, 35);
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
        throw new UnsupportedOperationException("Unimplemented method 'getInfo'");
    }

    @Override
    public String getName() {
        return name;
    }
}
