package services;

import Repository.ParkingLotRepository;
import models.Gate;
import models.ParkingSpot;
import models.Vehicle;
import strategy.SpotAssignmentStrategy;

import java.util.List;

public class ParkingLotService {
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.parkingLotRepository = parkingLotRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public ParkingLotService(SpotAssignmentStrategy spotAssignmentStrategy) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }
    public ParkingSpot getparkingSpot(Vehicle vehicle, Gate gate) {

        List<ParkingSpot> parkingSpotList = parkingLotRepository.getAllParkingSpots();

        return spotAssignmentStrategy.assignSpot(vehicle.getVehicleType(), gate, parkingSpotList);
    }
}
