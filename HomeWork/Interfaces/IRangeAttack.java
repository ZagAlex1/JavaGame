package HomeWork.Interfaces;

import HomeWork.Unit.Unit;

public interface IRangeAttack {
    
    void shoot(Unit target);
    
    int restock(int arrows);
}
