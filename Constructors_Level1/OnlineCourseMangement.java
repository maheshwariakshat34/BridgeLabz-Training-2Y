class Course{
    private static String instituteName = "Default Institute";

     
    private String courseName;
    private int duration;
    private double fee;

    public Course(String courseName, int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;

    }
    public void displayCourseDetails(){
        System.out.println("Course Name: " + courseName +
                           ", Duration: " + duration + " months" +
                           ", Fee: " + fee +
                           ", Institute: " + instituteName);
    }
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }


}



public class OnlineCourseMangement {

    public static void main(String[] args) {
        
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Data Science", 12, 30000);

        
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        
        Course.updateInstituteName("Tech Academy");

    
        c1.displayCourseDetails();
        c2.displayCourseDetails();
}
}