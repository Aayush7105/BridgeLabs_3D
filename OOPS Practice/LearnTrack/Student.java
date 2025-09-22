public class Student extends User {
    private String major;

    public Student(int userId, String name, String email, String major) {
        super(userId, name, email);
        this.major = major;
    }

    public String getMajor() { return major; }
}
