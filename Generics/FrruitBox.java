import java.util.*;

class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
    public String toString() { return name; }
}

class Apple extends Fruit {
    Apple(String name) { super(name); }
}

class Mango extends Fruit {
    Mango(String name) { super(name); }
}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    public void add(T fruit) { fruits.add(fruit); }
    public void display() {
        for (T fruit : fruits) System.out.println(fruit);
    }

    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple("Apple"));
        box.add(new Mango("Mango"));
        box.display();
    }
}
