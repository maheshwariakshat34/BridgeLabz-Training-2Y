class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName +
                               ", Patient ID: " + patientID +
                               ", Name: " + name +
                               ", Age: " + age +
                               ", Ailment: " + ailment);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

public class Hospital{
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Akshat", 25, "Flu");
        Patient p2 = new Patient(2, "Ravi", 30, "Fracture");

        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}

