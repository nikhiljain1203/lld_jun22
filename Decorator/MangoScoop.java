package Decorator;

public class MangoScoop implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public MangoScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        if(iceCreamConeConstituents == null) {
            throw new IllegalArgumentException("Mango Scoop without base not allowed");
        }
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + "Mango Scoop";
    }
}
