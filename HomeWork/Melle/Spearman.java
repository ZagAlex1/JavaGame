package HomeWork.Melle;

import HomeWork.Unit.Unit;

public class Spearman extends Melee{

    public Spearman(String name, int x, int y) {
        super(name, x, y, 90, 8, 10);

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
        return String.format("Spearman | Имя: %s | HP: %d | Броня: %d | Позиция: x-%d , y-%d ", 
                             name, hp, armor, coords.getX(), coords.getY());
    }

    @Override
    public String getName() {
        return name;
    }
}
