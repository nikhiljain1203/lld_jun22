package Decorator;

public class Client {

    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents =
                new ChocoChips(new MangoScoop(new OrangeCone()));

        System.out.println(iceCreamConeConstituents.getCost());
        System.out.println(iceCreamConeConstituents.getDescription());
    }
}
