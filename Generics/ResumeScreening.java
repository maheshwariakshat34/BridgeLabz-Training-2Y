import java.util.*;

abstract class JobRole { String title; JobRole(String title){this.title=title;} public String toString(){return title;} }
class SoftwareEngineer extends JobRole { SoftwareEngineer(){super("Software Engineer");} }
class DataScientist extends JobRole { DataScientist(){super("Data Scientist");} }
class ProductManager extends JobRole { ProductManager(){super("Product Manager");} }

class Resume<T extends JobRole> {
    T role;
    Resume(T role){this.role=role;}
    public String toString(){return "Resume for " + role;}
}

class ResumeScreening {
    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole r : roles) System.out.println("Processing " + r);
    }

    public static void main(String[] args) {
        List<JobRole> jobs = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        processResumes(jobs);
    }
}
