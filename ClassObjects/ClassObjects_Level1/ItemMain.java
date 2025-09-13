import java.util.Scanner;
class Item{
   private int itemCode;
   private String itemName;
  private  int itemPrice;

  public Item(int itemCode,String itemName,int itemPrice){
    this.itemCode=itemCode;
    this.itemName=itemName;
    this.itemPrice=itemPrice;
  }
  public void displayDetails(){
    System.out.println("Item Code: " + itemCode);
    System.out.println("Item Name: " + itemName);
    System.out.println("Price per unit: " + itemPrice);

    
    }
    public int calculateTotalCost(int quantity){
        return itemPrice *quantity;
    }

  }
  public class ItemMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the item code: ");
        int code=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the item  name :");
        String name=sc.nextLine();
        System.out.println("enter the price :");
        int price=sc.nextInt();

        Item item=new Item(code,name,price);
        item.displayDetails();

        System.out.println("enter the quantity :");
        int quantity=sc.nextInt();
        int total=item.calculateTotalCost(quantity);
        System.out.println("total price : " + total);
        

    }
  }



