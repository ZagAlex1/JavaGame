package HomeWork.Shooter;

import HomeWork.Unit.Unit;

public class Arbolist extends Shooter{
    public Arbolist(String name, int x, int y) {
        super(name, x, y, 55, 5, 12, 10);

    }

    @Override
    public void shoot(Unit target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shoot'");
    }

    @Override
    public int restock(int arrows) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restock'");
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return String.format("Arbolist | Имя: %s | HP: %d | Броня: %d | Кол-во стрел: %d | Позиция: x-%d , y-%d ", 
                             name, hp, armor, numberOfArrows, coords.getX(), coords.getY());
    }

    @Override
    public String getName() {
        return name;
    }

}
