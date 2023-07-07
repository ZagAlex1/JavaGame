package HomeWork.Unit;

public class Countryman extends Unit{

    private int numberOfReplenishments;
    private int bringArrows;

    public Countryman(String name, int x, int y) {
        super(name, x, y, 30, 0);

        this.numberOfReplenishments = 10;
        this.bringArrows = 10;

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
        return String.format("Countryman | Имя: %s | HP: %d | Броня: %d | Количество пополнений: %d | Позиция: x-%d , y-%d ", 
                             name, hp, armor, numberOfReplenishments, coords.getX(), coords.getY());
    }

    @Override
    public String getName() {
        return name;
    }
}
