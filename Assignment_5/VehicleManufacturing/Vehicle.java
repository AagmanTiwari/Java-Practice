
package VehicleManufacturing;

import java.time.Year;

public class Vehicle {
    int vehicleId;
    String brand;
    int manufacturingYear;

    Vehicle(int vehicleId, String brand, int manufacturingYear) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
    }

    int calculateAge() {
        return Year.now().getValue() - manufacturingYear;
    }

    void displayVehicle() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Vehicle Age: " + calculateAge() + " years");
    }
}
