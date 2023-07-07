package HomeWork.Sorcerer;

public class Mage extends Sorcerer{

    public Mage(String name, int x, int y, String artifact) {
        super(name, x, y, 40, 1, 60, artifact);

    }

    @Override
    public int restoreHealth(int mana) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restoreHealth'");
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return String.format("Mage | Имя: %s | HP: %d | Мана: %d | Броня: %d | Позиция: x-%d , y-%d ", 
                             name, hp, mana, armor, coords.getX(), coords.getY());
    }

    @Override
    public String getName() {
        return name;
    }
}
