package Decorator;

public class OrangeCone implements IceCreamConeConstituents {
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
