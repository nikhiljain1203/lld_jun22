package Decorator;

public class ChocoCone implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public ChocoCone() {

    }

    public ChocoCone(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
