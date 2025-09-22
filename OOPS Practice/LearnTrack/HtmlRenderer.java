public class HtmlRenderer implements CourseContentRenderer {
    @Override
    public void renderContent(String content) {
        System.out.println("Rendering HTML page: " + content);
    }
}
