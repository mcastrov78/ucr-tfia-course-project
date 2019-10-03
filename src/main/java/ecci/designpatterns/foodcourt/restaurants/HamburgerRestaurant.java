package ecci.designpatterns.foodcourt.restaurants;

import ecci.designpatterns.foodcourt.Order;

public class HamburgerRestaurant implements Restaurant {

    public HamburgerRestaurant(UnifiedCashier unifiedCashier) {
        unifiedCashier.registerObserver(this);
    }

    public void update(Order order) {
        if (order.getRestaurantId() == 1) {
            System.out.println("Hamburguer Restaurant - NEW Order received");
        }
    }
}
