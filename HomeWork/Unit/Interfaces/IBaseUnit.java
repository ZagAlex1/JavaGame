package HomeWork.Unit.Interfaces;

import java.util.ArrayList;

import HomeWork.Unit.Unit;

public interface IBaseUnit {

    void step(ArrayList<Unit> targets);

    String getInfo();
}
