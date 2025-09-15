import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int daysAdmitted;
    private List<String> records;
    private String diagnosis;
    private String history;

    public InPatient(String patientId, String name, int age, double roomCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return roomCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String diagnosis, String history) {
        this.diagnosis = diagnosis;
        this.history = history;
        records.add("Diagnosis: " + diagnosis + ", History: " + history);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : records) {
            System.out.println(record);
        }
    }
    public String getDiagnosis() {
        return diagnosis;
    }

    public String getHistory() {
        return history;
    }
}
