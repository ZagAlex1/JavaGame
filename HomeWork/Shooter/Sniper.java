package HomeWork.Shooter;

import HomeWork.Unit.Unit;

public class Sniper extends Shooter{

    public Sniper(String name, int x, int y, int hp, int armor, int numberOfArrows) {
        super(name, x, y, hp, armor, numberOfArrows, 10);

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
        return "Sniper{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                " Координаты: " + getCoords().getX() + " " + getCoords().getY() +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }
}
