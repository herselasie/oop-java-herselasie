package VRMS;

public class Motorcycle extends Vehicle{
    private boolean fuel_efficient;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.fuel_efficient = fuel_efficient;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (fuel_efficient) cost -= 20; // less charge for fuel efficiency
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
