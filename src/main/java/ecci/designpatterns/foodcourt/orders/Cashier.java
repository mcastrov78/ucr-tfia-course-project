package ecci.designpatterns.foodcourt.orders;

import ecci.designpatterns.foodcourt.Order;

import java.util.ArrayList;
import java.util.List;

public class Cashier implements NewOrdersProcessor {
    private List<Chef> chefs;
    private Order currentOrder;

    public Cashier() {
        chefs = new ArrayList();
    }

    public void registerObserver(Chef chef) {
        chefs.add(chef);
    }

    public void removeObserver(Chef chef) {
        if (chefs.indexOf(chef) > 0) {
            chefs.remove(chef);
        }
    }

    public void notifyObservers() {
        for (Chef chef : chefs) {
            chef.update(currentOrder);
        }
    }

    public void newOrderArrived() {
        notifyObservers();
    }

    public void setOrder(Order order) {
        this.currentOrder = order;
        newOrderArrived();
    }
}
