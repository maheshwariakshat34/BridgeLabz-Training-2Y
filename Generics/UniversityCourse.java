import java.util.*;

abstract class CourseType { String name; CourseType(String name){this.name=name;} public String toString(){return name;} }
class ExamCourse extends CourseType { ExamCourse(String name){super(name);} }
class AssignmentCourse extends CourseType { AssignmentCourse(String name){super(name);} }
class ResearchCourse extends CourseType { ResearchCourse(String name){super(name);} }

class Course<T extends CourseType> {
    T courseType;
    Course(T courseType){this.courseType=courseType;}
    public String toString(){return courseType.toString();}
}

class UniversityCourse {
    public static void printCourses(List<? extends CourseType> list) {
        for (CourseType c : list) System.out.println(c);
    }

    public static void main(String[] args) {
        List<ExamCourse> exams = Arrays.asList(new ExamCourse("Math Exam"), new ExamCourse("Physics Exam"));
        List<ResearchCourse> research = Arrays.asList(new ResearchCourse("AI Research"));
        printCourses(exams);
        printCourses(research);
    }
}
