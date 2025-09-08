
public class Ques2 {
    double radius;

    Ques2(double radius) {
        this.radius = radius;
    }

    public void areaCircle() {
        System.out.printf("Area of circle: %.4f\n", Math.PI * radius * radius);
    }

    public void circumferenceCircle() {
        System.out.printf("Circumference of circle: %.4f\n", 2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Ques2 circle = new Ques2(2.5);
        circle.areaCircle();
        circle.circumferenceCircle();
    }
}
