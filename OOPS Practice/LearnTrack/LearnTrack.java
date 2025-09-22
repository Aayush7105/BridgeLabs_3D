import java.util.Arrays;

public class LearnTrack {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(101, "Dr. Smith", "smith@learntrack.com", "Computer Science");

        Student s1 = new Student(201, "Alice", "alice@mail.com", "CS");
        Student s2 = new Student(202, "Bob", "bob@mail.com", "Math");

        Course course1 = new Course(1001, "Java Programming", teacher1, Arrays.asList(s1, s2));

        course1.showEnrolledStudents();

        CourseContentRenderer video = new VideoRenderer();
        CourseContentRenderer pdf = new PdfRenderer();
        CourseContentRenderer html = new HtmlRenderer();

        System.out.println("\n--- Course Content ---");
        video.renderContent("JavaBasics.mp4");
        pdf.renderContent("JavaNotes.pdf");
        html.renderContent("Introduction.html");
    }
}
