package HospitalManagement;

public class Patient {
    int patientId;
    String patientName;

    Doctor dr;

    Patient(int patientId, String patientName, Doctor dr) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dr = dr;
    }

    void displayPatient() {
        System.out.println("Patient Id:" + patientId);
        System.out.println("Patient Name:" + patientName);
        dr.displayDoctor();
    }
}
