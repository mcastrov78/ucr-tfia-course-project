package ecci.designpatterns.foodcourt;

import ecci.designpatterns.foodcourt.orders.Cashier;
import ecci.designpatterns.foodcourt.orders.ChiefChef;

import java.util.Timer;
import java.util.TimerTask;

public class FoodCourt {

    public static final void main(String args[]) {
        Timer timer = new Timer();
        Cashier cashier = new Cashier();
        ChiefChef chiefChef = new ChiefChef(cashier);

        TimerTask orderGenerator = new OrderGenerator(cashier);
        timer.schedule(orderGenerator, 0, 3000);
    }
}
