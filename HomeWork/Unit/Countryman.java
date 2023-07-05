package HomeWork.Unit;

public class Countryman extends Unit{

    private int numberOfReplenishments;
    private int bringArrows;

    public Countryman(String name, int x, int y, int hp, int armor, int numberOfReplenishments, int bringArrows) {
        super(name, x, y,  hp, armor);

        this.numberOfReplenishments = numberOfReplenishments;
        this.bringArrows = bringArrows;

    }

    public int getNumberOfReplenishments() {
        return numberOfReplenishments;
    }

    public int getBringArrows() {
        return bringArrows;
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return "Countryman{" +
                "numberOfReplenishments=" + numberOfReplenishments +
                ", bringArrows=" + bringArrows +
                ", hp=" + hp +
                ", armor=" + armor +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }
}
