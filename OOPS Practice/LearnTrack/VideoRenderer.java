public class VideoRenderer implements CourseContentRenderer {
    @Override
    public void renderContent(String content) {
        System.out.println("Playing video: " + content);
    }
}
