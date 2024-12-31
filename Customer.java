package VRMS;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    List<Vehicle> rentalHistory;
    List<Vehicle> currentRentals;

    public Customer(String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
        this.currentRentals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRental(Vehicle vehicle) {
        currentRentals.add(vehicle);
    }

    public void completeRental(Vehicle vehicle) {
        currentRentals.remove(vehicle);
        rentalHistory.add(vehicle);
    }
}
