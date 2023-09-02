package models;

public class Vehicle extends BaseEntity{
    private VehicleType vehicleType;
    private String number;

    public Vehicle(String number, VehicleType type) {
        super();
        this.number = number;
        this.vehicleType = type;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
