import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String title;
    private Teacher teacher;
    private List<Student> enrolledStudents;

    public Course(int courseId, String title, Teacher teacher) {
        this.courseId = courseId;
        this.title = title;
        this.teacher = teacher;
        this.enrolledStudents = new ArrayList<>();
    }

    public Course(int courseId, String title, Teacher teacher, List<Student> students) {
        this.courseId = courseId;
        this.title = title;
        this.teacher = teacher;
        this.enrolledStudents = new ArrayList<>(students);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + title + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName() + " (" + s.getMajor() + ")");
        }
    }

    public String getTitle() { return title; }
    public Teacher getTeacher() { return teacher; }
}
