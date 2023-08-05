package Strategy;

public class PathCalFactory {
    public static PathCalculator getPCForMode(String mode) {
        if(mode.equals("car")) {
            return new CarPathCalculator();
        } else if (mode.equals("bike")) {
            return new BikePathCalculator();
        } else {
            throw new IllegalArgumentException("Mode not supported");
        }
    }
}

/*
 sparrow{
     fly() {
       flying behavour = new fastFlying()
     }
 }
 */
