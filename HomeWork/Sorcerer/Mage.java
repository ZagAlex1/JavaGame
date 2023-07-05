package HomeWork.Sorcerer;

public class Mage extends Sorcerer{

    public Mage(String name, int x, int y, int hp, int armor, int mana, String artifact) {
        super(name, x, y,  hp, armor, mana, artifact);

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInfo'");
    }

    @Override
    public String getName() {
        return name;
    }
}
