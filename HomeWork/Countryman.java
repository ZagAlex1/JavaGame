package HomeWork;

public class Countryman extends Unit{
    private int numberOfReplenishments;
    private int bringArrows;


    public Countryman(String name, int hp, int armor, int movePoints, int numberOfReplenishments, int bringArrows) {
        super(name, hp, armor, movePoints);
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
    public String toString() {
        return "Countryman{" +
                "numberOfReplenishments=" + numberOfReplenishments +
                ", bringArrows=" + bringArrows +
                ", hp=" + hp +
                ", armor=" + armor +
                ", movePoints=" + movePoints +
                '}';
    }
}
