package HomeWork;

public class Sniper extends Shooter{

    public Sniper(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon, int damage) {
        super(name, hp, armor, movePoints, numberOfArrows, weapon, damage);
    }

    public Sniper(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon){
        this(name, hp, armor, movePoints, numberOfArrows, weapon, 10);

    }

    @Override
    public String toString() {
        return "Sniper{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", movePoints=" + movePoints +
                '}';
    }
}
