package Strategy;

public class GoogleMaps {
    public void findPath(String from, String to, String mode) {
//        if (mode == ...) {
//            ......
//        } else if (mode == ....) {
//            ......
//        } -> Violates SRP, OCP

        PathCalculator pathCalculator = PathCalFactory.getPCForMode(mode);
        pathCalculator.findPath(from, to);
    }
}
