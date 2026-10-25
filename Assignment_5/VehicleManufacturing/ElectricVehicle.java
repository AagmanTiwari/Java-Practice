
package VehicleManufacturing;

public class ElectricVehicle extends MotorVehicle {
    double batteryCapacityKWh;
    double drivingRangeKm;
    double chargingTimeHours;

    ElectricVehicle(int vehicleId, String brand, int manufacturingYear,
            int engineCapacityCC, String fuelType,
            double batteryCapacityKWh, double drivingRangeKm,
            double chargingTimeHours) {
        super(vehicleId, brand, manufacturingYear, engineCapacityCC, fuelType);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.drivingRangeKm = drivingRangeKm;
        this.chargingTimeHours = chargingTimeHours;
    }

    double calculateEnergyConsumption() {
        return batteryCapacityKWh / drivingRangeKm;
    }

    void displayElectricVehicle() {
        displayMotorVehicle();
        System.out.println("Battery Capacity: " + batteryCapacityKWh + " kWh");
        System.out.println("Driving Range: " + drivingRangeKm + " km");
        System.out.println("Charging Time: " + chargingTimeHours + " hours");

        if (drivingRangeKm > 0) {
            System.out.println("Energy Consumption: "
                    + calculateEnergyConsumption() + " kWh/km");
        } else {
            System.out.println("Energy Consumption: Cannot calculate (range is zero)");
        }
    }
}
