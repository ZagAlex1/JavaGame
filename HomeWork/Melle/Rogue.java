package HomeWork.Melle;

import HomeWork.Unit.Unit;

public class Rogue extends Melee{

    public Rogue(String name, int x, int y) {
        super(name, x, y, 65, 4, 15);
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
        return String.format("Rogue | Имя: %s | HP: %d | Броня: %d | Позиция: x-%d , y-%d ", 
                             name, hp, armor, coords.getX(), coords.getY());
    }

    @Override
    public String getName() {
        return name;
    }
}
