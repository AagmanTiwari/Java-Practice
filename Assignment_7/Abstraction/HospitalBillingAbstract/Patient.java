
package Abstraction.HospitalBillingAbstract;

public abstract class Patient {
    int patientId;
    String patientName;
    int numberOfDays;

    Patient(int patientId, String patientName, int numberOfDays) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.numberOfDays = numberOfDays;
    }

    abstract double calculateBill();

    void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Number of Days: " + numberOfDays);
    }
}
