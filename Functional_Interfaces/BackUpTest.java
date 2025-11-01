import java.io.Serializable;

class BackupData implements Serializable {
    String data = "System Backup Data";
}

public class BackUpTest {
    public static void main(String[] args) {
        BackupData b = new BackupData();
        System.out.println("Backup ready for serialization: " + b.data);
    }
}
