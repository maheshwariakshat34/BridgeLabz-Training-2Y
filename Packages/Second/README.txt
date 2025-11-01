Folder Structure Explanation:

Package structure: com.university.department.cse

When compiled, the folder should look like this:

src/
 └── com/
      └── university/
           └── department/
                └── cse/
                     └── Course.java
 └── MainApp.java

Compilation Command:
javac com/university/department/cse/Course.java MainApp.java

Run Command:
java MainApp

Explanation:
- The 'Course' class is inside a nested package.
- The 'MainApp' class imports and uses it.
- Folder names must exactly match the package declaration (case-sensitive).
