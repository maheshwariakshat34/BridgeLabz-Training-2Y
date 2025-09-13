class Course{
    String courseName;
    int duration;
    Course(String n,int d){courseName=n;duration=d;}
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    OnlineCourse(String n,int d,String p,boolean r){super(n,d);platform=p;isRecorded=r;}
}
class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;
    PaidOnlineCourse(String n,int d,String p,boolean r,double fee,double disc){super(n,d,p,r);this.fee=fee;discount=disc;}
    double finalFee(){return fee*(1-discount);}
}
public class CourseHierarchy{
    public static void main(String[] args){
        PaidOnlineCourse p = new PaidOnlineCourse("AI Basics",30,"Udemy",true,1000,0.2);
        System.out.println(p.courseName+" Platform:"+p.platform+" FinalFee:"+p.finalFee());
    }
}