package Interface.e12;

import java.util.ArrayList;
import java.util.List;

class Bag{
    public static class Item{
        private String name;
        private int quantity;

        public Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
        public String getName(){
            return name;
        }
        public int getQuantity(){
            return quantity;
        }
        public void incrementQuantity(){
            quantity++;
        }
    }
    private ArrayList<Item> items;
    public Bag(){
        items = new ArrayList<Item>();
    }
    public void add(String itemName){
        for(Item it : items){
            if(it.getName().equals(itemName)){
                it.incrementQuantity();
                return;
            }
        }
        items.add(new Item(itemName, 1));
    }
    public int count(String itemName){
        for(Item it : items){
            if(it.getName().equals(itemName)) {
                return it.getQuantity();
            }
        }
        return 0;
    }
}
public class BagTester {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add("Car");
        bag.add("Tree");
        bag.add("Car");
        bag.add("shoe");
        bag.add("Tree");
        bag.add("Tree");
        bag.add("Car");
        bag.add("Car");

        System.out.println("Shoes: " + bag.count("shoe"));
        System.out.println("Trees: " + bag.count("Tree"));
        System.out.println("Cars: " + bag.count("Car"));
    }
}
