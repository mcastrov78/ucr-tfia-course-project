package ecci.designpatterns.foodcourt.restaurants;

import ecci.designpatterns.foodcourt.Order;

public class PizzaRestaurant implements Restaurant {

    public PizzaRestaurant(UnifiedCashier unifiedCashier) {
        unifiedCashier.registerObserver(this);
    }

    public void update(Order order) {
        if (order.getRestaurantId() == 0) {
            System.out.println("Pizza Restaurant - NEW Order received");
        }
    }
}
