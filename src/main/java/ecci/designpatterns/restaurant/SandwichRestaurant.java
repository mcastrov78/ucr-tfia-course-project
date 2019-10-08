package ecci.designpatterns.restaurant;

import ecci.designpatterns.restaurant.order.Cashier;
import ecci.designpatterns.restaurant.order.ChiefChef;
import ecci.designpatterns.restaurant.order.OrderGenerator;

import java.util.Timer;
import java.util.TimerTask;

public class SandwichRestaurant {

    public static final void main(String args[]) {
        Timer timer = new Timer();
        Cashier cashier = new Cashier();
        ChiefChef chiefChef = new ChiefChef(cashier);

        TimerTask orderGenerator = new OrderGenerator(cashier);
        timer.schedule(orderGenerator, 0, 3000);
    }
}
