package ecci.designpatterns.restaurant.orders;

import ecci.designpatterns.restaurant.sandwich.SandwichType;
import ecci.designpatterns.restaurant.sandwich.topping.ToppingType;

import java.util.TimerTask;
import java.util.Random;

/**
 * Generates random sandwich orders and passes information to cashier.
 */
public class OrderGenerator extends TimerTask {

    Cashier cashier = null;

    public OrderGenerator(Cashier unifiedCashier) {
        this.cashier = unifiedCashier;
    }

    @Override
    public void run() {
        generateOrder();
    }

    public void generateOrder() {
        Random random = new Random();
        int sandwichType = random.nextInt(SandwichType.values().length);
        int toppingType = random.nextInt(ToppingType.values().length);

        Order order = new Order();
        order.setSandwichType(SandwichType.values()[sandwichType]);
        order.setToppingType(ToppingType.values()[toppingType]);

        cashier.setOrder(order);
    }
}
