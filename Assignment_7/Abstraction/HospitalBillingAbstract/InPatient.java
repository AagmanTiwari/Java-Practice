
package Abstraction.HospitalBillingAbstract;

public class InPatient extends Patient {

    InPatient(int patientId, String patientName, int numberOfDays) {
        super(patientId, patientName, numberOfDays);
    }

    @Override
    double calculateBill() {
        return (numberOfDays * 2500) + 1500;
    }
}
