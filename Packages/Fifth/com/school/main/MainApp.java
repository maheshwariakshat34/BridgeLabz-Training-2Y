package com.school.main;

import com.school.data.Student;
import com.school.util.Analyzer;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Akshat", 92, 85, 78);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        System.out.println(s);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + a.findGrade(avg));
    }
}
