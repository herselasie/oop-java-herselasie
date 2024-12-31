package VRMS;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Customer customer, String vehicleId, int rentalDays) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                vehicle.setAvailable(false);
                RentalTransaction transaction = new RentalTransaction(vehicle, customer, rentalDays);
                transactions.add(transaction);
                customer.addRental(vehicle);
                System.out.println("Rental processed: " + transaction);
                return;
            }
        }
        System.out.println("Vehicle not available for rental.");
    }

    public void returnVehicle(Customer customer, String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && !vehicle.isAvailable()) {
                vehicle.setAvailable(true);
                customer.completeRental(vehicle);
                System.out.println("Vehicle returned: " + vehicle.getModel());
                return;
            }
        }
        System.out.println("Vehicle not found in rentals.");
    }

    public void generateReport() {
        System.out.println("Rental Transactions Report:");
        for (RentalTransaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
