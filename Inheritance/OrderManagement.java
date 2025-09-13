class Order{
    String orderId;
    String orderDate;
    Order(String id,String d){orderId=id;orderDate=d;}
    String getOrderStatus(){return "Created";}
}
class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(String id,String d,String t){super(id,d);trackingNumber=t;}
    @Override String getOrderStatus(){return "Shipped with tracking "+trackingNumber;}
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(String id,String d,String t,String del){super(id,d,t);deliveryDate=del;}
    @Override String getOrderStatus(){return "Delivered on "+deliveryDate+" Tracking:"+trackingNumber;}
}
public class OrderManagement{
    public static void main(String[] args){
        Order o1=new Order("O1","2025-09-01");
        Order o2=new ShippedOrder("O2","2025-09-02","TRK123");
        Order o3=new DeliveredOrder("O3","2025-09-03","TRK456","2025-09-05");
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}