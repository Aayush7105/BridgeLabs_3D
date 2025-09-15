import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("P001", "Alice", 30, 1500, 5);
        inPatient.addRecord("Pneumonia", "No prior illness");

        OutPatient outPatient = new OutPatient("P002", "Bob", 25, 500);
        outPatient.addRecord("Flu", "Seasonal illness");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.viewRecords();
            }

            System.out.println("----------------------------");
        }
    }
}
