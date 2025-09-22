public class AppointmentReport implements ReportGenerator {
    private Appointment appointment;

    public AppointmentReport(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public void generateReport() {
        System.out.println("Appointment Report:");
        System.out.println("Appointment ID: " + appointment.getAppointmentId());
        System.out.println("Patient: " + appointment.getPatient().getName());
        System.out.println("Doctor: " + appointment.getDoctor().getName());
        System.out.println("Date: " + appointment.getAppointmentDate());
    }
}
