import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}

class Electronics extends WarehouseItem { Electronics(String name) { super(name); } }
class Groceries extends WarehouseItem { Groceries(String name) { super(name); } }
class Furniture extends WarehouseItem { Furniture(String name) { super(name); } }

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void add(T item) { items.add(item); }
    public List<T> getItems() { return items; }
}

class SmartWarehouse {
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items) System.out.println(i);
    }

    public static void main(String[] args) {
        Storage<Electronics> eStore = new Storage<>();
        eStore.add(new Electronics("TV"));
        eStore.add(new Electronics("Laptop"));

        Storage<Furniture> fStore = new Storage<>();
        fStore.add(new Furniture("Chair"));
        fStore.add(new Furniture("Table"));

        displayAll(eStore.getItems());
        displayAll(fStore.getItems());
    }
}

