import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;
    private String diagnosis;
    private String history;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
