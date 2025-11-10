import java.util.*;

public class EmployeeDepartment {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");
        empDept.put(106, "Sales");

        
        empDept.put(104, "Finance");


        String dept = "HR";
        System.out.println("Employees in " + dept + ":");
        for (Map.Entry<Integer, String> e : empDept.entrySet()) {
            if (e.getValue().equals(dept)) System.out.println(e.getKey());
        }


        Map<String, Integer> deptCount = new HashMap<>();
        for (String d : empDept.values()) {
            deptCount.put(d, deptCount.getOrDefault(d, 0) + 1);
        }

        System.out.println("\nTotal employees per department:");
        for (Map.Entry<String, Integer> e : deptCount.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
