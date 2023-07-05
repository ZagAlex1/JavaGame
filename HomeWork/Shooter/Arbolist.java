package HomeWork.Shooter;

import HomeWork.Unit.Unit;

public class Arbolist extends Shooter{
    public Arbolist(String name, int x, int y, int armor, int numberOfArrows, int damage) {
        super(name, x, y, 30, 5, 10, 30);

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInfo'");
    }

    @Override
    public String getName() {
        return name;
    }

}
