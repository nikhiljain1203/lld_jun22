package services;

import Repository.TicketRepository;
import exception.NoParkingSpotFoundException;
import models.*;
import strategy.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;
    private ParkingSpotService parkingSpotService;
    private TicketRepository ticketRepository;
    private ParkingLotService parkingLotService;
    public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType, Long gateId) throws NoParkingSpotFoundException {

        //Flow:
        //1. Get vehicle from DB using vehicleNumber
        //2. If Vehicle is not found, register vehicle
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);
        if(vehicle == null) {
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
        }

        Gate gate = gateService.getGate(gateId);

        //3. Assign Parking Spot
        ParkingSpot parkingSpot = parkingLotService.getparkingSpot(vehicle, gate);
        if(parkingSpot == null) {
            throw new NoParkingSpotFoundException("No Parking Spot Found");
        }

        //4. Update parking Spot as Occupied
        parkingSpot = parkingSpotService.assignParkingSpot(parkingSpot);
        //5. Generate Ticket

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime(new Date());


        // 6. Save ticket in DB
        ticketRepository.save(ticket);

        return ticket;
    }
}
