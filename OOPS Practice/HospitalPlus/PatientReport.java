public class PatientReport implements ReportGenerator {
    private Patient patient;

    public PatientReport(Patient patient) {
        this.patient = patient;
    }

    @Override
    public void generateReport() {
        System.out.println("Patient Report:");
        System.out.println("ID: " + patient.getPatientId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Contact: " + patient.getContactNumber());
    }
}
