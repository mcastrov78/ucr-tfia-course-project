package ecci.designpatterns.foodcourt;

import ecci.designpatterns.foodcourt.restaurants.UnifiedCashier;

import java.util.TimerTask;
import java.util.Random;

public class OrderGenerator extends TimerTask {

    UnifiedCashier unifiedCashier = null;

    public OrderGenerator(UnifiedCashier unifiedCashier) {
        this.unifiedCashier = unifiedCashier;
    }

    @Override
    public void run() {
        generateOrder();
    }

    public void generateOrder() {
        Random random = new Random();
        int restaurantId = random.nextInt(3);
        Order order = new Order();

        System.out.println("Generated restaurantId: " + restaurantId);
        order.setRestaurantId(restaurantId);
        unifiedCashier.setOrder(order);
    }
}
