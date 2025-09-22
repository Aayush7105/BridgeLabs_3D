public class PdfRenderer implements CourseContentRenderer {
    @Override
    public void renderContent(String content) {
        System.out.println("Opening PDF Document: " + content);
    }
}
