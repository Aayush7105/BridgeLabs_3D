class Ques2 {
    String courseName;
    int duration;
    double fee;
    
    static String instituteName;
    
    public Ques2(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
        System.out.println("-------------------------");
    }
    
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    
    public static void main(String[] args) {
        Ques2.updateInstituteName("Tech Academy");

        Ques2 course1 = new Ques2("Java Programming", 6, 15000);
        Ques2 course2 = new Ques2("Web Development", 4, 12000);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        Ques2.updateInstituteName("Global Tech Institute");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
