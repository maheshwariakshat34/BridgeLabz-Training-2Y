class Device{
    String deviceId;
    String status;
    Device(String id,String s){deviceId=id;status=s;}
    void displayStatus(){
        System.out.println("Device:"+deviceId+" Status:"+status);
    }
}
class Thermostat extends Device{
    double temperatureSetting;
    Thermostat(String id,String s,double t){
        super(id,s);temperatureSetting=t;
    }
    @Override void displayStatus(){
        System.out.println("Thermostat:"+deviceId+" Status:"+status+" Temp:"+temperatureSetting);
    }
}
public class SmartHome{
    public static void main(String[] args){
        Thermostat t = new Thermostat("T100", "ON", 24.5);
        t.displayStatus();
    }
}