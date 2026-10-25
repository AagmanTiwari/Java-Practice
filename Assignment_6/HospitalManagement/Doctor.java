package HospitalManagement;

public class Doctor {

    int doctorID;
    String doctorName;
    String Specialization;

    Doctor(int doctorID, String doctorName, String Specialization) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.Specialization = Specialization;

    }

    void displayDoctor() {
        System.out.println("Doctor Id:" + doctorID);
        System.out.println("Doctor Name:" + doctorName);
        System.out.println("Specialization :" + Specialization);
    }

}
