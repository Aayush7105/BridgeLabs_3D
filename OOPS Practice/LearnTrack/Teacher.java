public class Teacher extends User {
    private String specialization;

    public Teacher(int userId, String name, String email, String specialization) {
        super(userId, name, email);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
}
