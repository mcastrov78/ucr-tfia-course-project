package ecci.designpatterns.foodcourt.restaurants;

import ecci.designpatterns.foodcourt.Order;

import java.util.ArrayList;
import java.util.List;

public class UnifiedCashier implements Cashier {
    private List<Restaurant> restaurants;
    private Order currentOrder;

    public UnifiedCashier() {
        restaurants = new ArrayList();
    }

    public void registerObserver(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void removeObserver(Restaurant restaurant) {
        if (restaurants.indexOf(restaurant) > 0) {
            restaurants.remove(restaurant);
        }
    }

    public void notifyObservers() {
        for (Restaurant restaurant: restaurants) {
            restaurant.update(currentOrder);
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
