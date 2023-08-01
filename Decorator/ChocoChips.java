package Decorator;

public class ChocoChips implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public ChocoChips(IceCreamConeConstituents iceCreamConeConstituents) {
        if(iceCreamConeConstituents == null) {
            throw new IllegalArgumentException("ChocoChips without base not allowed");
        }
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + "ChocoChips";
    }
}
