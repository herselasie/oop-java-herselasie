package VRMS;

public class Car extends Vehicle{
    private boolean hasGPS;

    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasGPS = hasGPS;
}


    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasGPS) cost += 10; // Extra charge for GPS
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
