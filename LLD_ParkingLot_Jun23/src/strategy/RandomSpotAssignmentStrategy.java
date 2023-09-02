package strategy;

import models.Gate;
import models.ParkingSpot;
import models.ParkingSpotStatus;
import models.VehicleType;

import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
    @Override
    public ParkingSpot assignSpot(VehicleType type,
                                  Gate gate,
                                  List<ParkingSpot> parkingSpotList) {

        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                    parkingSpot.getSupportedVehicleTypes().contains(type)) {
                return parkingSpot;
            }
        }
        return null;

    }
}
