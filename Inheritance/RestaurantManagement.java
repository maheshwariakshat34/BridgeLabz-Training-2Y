interface Worker{void performDuties();}
class PersonR{
    String name;
    int id;
    PersonR(String n,int i){name=n;id=i;}
}
class Chef extends PersonR implements Worker{
    Chef(String n,int i){
        super(n,i);
    }
    public void performDuties(){
        System.out.println("Chef "+name+" is cooking.");
    }
}
class Waiter extends PersonR implements Worker{
    Waiter(String n,int i){
        super(n,i);
    }
    public void performDuties(){
        System.out.println("Waiter "+name+" is serving.");
    }
}
public class RestaurantManagement{
    public static void main(String[] args){
        Worker[] w = {new Chef("Gordon",1), new Waiter("Sam",2)};
        for(Worker x:w) x.performDuties();
    }
}