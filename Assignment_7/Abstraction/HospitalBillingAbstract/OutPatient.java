
package Abstraction.HospitalBillingAbstract;

public class OutPatient extends Patient {
    double medicineCharges;

    OutPatient(int patientId, String patientName, double medicineCharges) {
        super(patientId, patientName, 0);
        this.medicineCharges = medicineCharges;
    }

    @Override
    double calculateBill() {
        return 800 + medicineCharges;
    }
}
