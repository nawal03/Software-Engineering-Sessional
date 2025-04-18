package problem1.item.controller;

import problem1.item.item.Item;

public class Controller implements Item {
    @Override
    public String getName() {
        return "Web Based Controller";
    }

    @Override
    public double getPrice() {
        return 300.00;
    }
}
