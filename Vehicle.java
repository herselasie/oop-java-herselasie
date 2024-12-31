package VRMS;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        if (vehicleId == null || vehicleId.isEmpty() || model == null || model.isEmpty() || baseRentalRate < 0) {
            throw new IllegalArgumentException("Invalid vehicle attributes.");
        }
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();

    public abstract void rent(VRMS.Customer customer, int days);
}