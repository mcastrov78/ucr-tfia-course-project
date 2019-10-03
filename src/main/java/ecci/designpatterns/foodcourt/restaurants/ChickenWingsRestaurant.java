package ecci.designpatterns.foodcourt.restaurants;

import ecci.designpatterns.foodcourt.Order;

public class ChickenWingsRestaurant implements Restaurant {

    public ChickenWingsRestaurant(UnifiedCashier unifiedCashier) {
        unifiedCashier.registerObserver(this);
    }

    public void update(Order order) {
        if (order.getRestaurantId() == 2) {
            System.out.println("Chicken Wings Restaurant - NEW Order received");
        }
    }
}
