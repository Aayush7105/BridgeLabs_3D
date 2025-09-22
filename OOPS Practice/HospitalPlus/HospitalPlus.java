import java.util.Date;

public class HospitalPlus {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Alice Johnson", 30, "123-456-7890");

        Doctor doctor1 = new Doctor(101, "Dr. Smith", "Cardiology");

        Appointment appointment1 = new Appointment(1001, patient1, doctor1, new Date());

        ReportGenerator patientReport = new PatientReport(patient1);
        patientReport.generateReport();

        System.out.println();

        ReportGenerator appointmentReport = new AppointmentReport(appointment1);
        appointmentReport.generateReport();
    }
}
