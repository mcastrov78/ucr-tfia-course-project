package ecci.designpatterns.foodcourt;

import ecci.designpatterns.foodcourt.orders.Cashier;

import java.util.TimerTask;
import java.util.Random;

public class OrderGenerator extends TimerTask {

    Cashier unifiedCashier = null;

    public OrderGenerator(Cashier unifiedCashier) {
        this.unifiedCashier = unifiedCashier;
    }

    @Override
    public void run() {
        generateOrder();
    }

    public void generateOrder() {
        Random random = new Random();
        int sandwichType = random.nextInt(2);
        Order order = new Order();
        order.setSandwichType(sandwichType);

        System.out.println("\nNEW ORDER CAME IN: " + sandwichType);
        unifiedCashier.setOrder(order);
    }
}
