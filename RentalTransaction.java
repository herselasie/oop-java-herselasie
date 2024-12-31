package VRMS;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private double totalCost;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.totalCost = vehicle.calculateRentalCost(rentalDays);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "vehicle=" + vehicle.getModel() +
                ", customer=" + customer.getName() +
                ", rentalDays=" + rentalDays +
                ", totalCost=" + totalCost +
                '}';
    }
}
