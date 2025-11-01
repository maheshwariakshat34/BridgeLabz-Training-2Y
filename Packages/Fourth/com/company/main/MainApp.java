package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.Payroll;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Akshat", "IT", 50000);
        Payroll payroll = new Payroll();
        System.out.println("Employee: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Salary before bonus: " + emp.getSalary());
        System.out.println("Salary after bonus: " + payroll.calculateBonus(emp));
    }
}
