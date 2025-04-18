package problem1.system;

import problem1.item.item.Item;

import java.util.ArrayList;
import java.util.List;

public class QMSystem {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public double getCost(){
        double cost=0;
        for(Item item: items) cost+= item.getPrice();
        return cost;
    }

    public void showItems(){
        System.out.println("Items of this Queue Management System are:");
        for(Item item: items){
            System.out.println("Item Name: " + item.getName() + "\t\tItem Price: "+item.getPrice()+"$");
        }
    }
}
