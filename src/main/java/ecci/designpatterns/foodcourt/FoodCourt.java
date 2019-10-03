package ecci.designpatterns.foodcourt;

import ecci.designpatterns.foodcourt.restaurants.UnifiedCashier;
import ecci.designpatterns.foodcourt.restaurants.ChickenWingsRestaurant;
import ecci.designpatterns.foodcourt.restaurants.HamburgerRestaurant;
import ecci.designpatterns.foodcourt.restaurants.PizzaRestaurant;

import java.util.Timer;
import java.util.TimerTask;

public class FoodCourt {

    public static final void main(String args[]) {
        Timer timer = new Timer();
        UnifiedCashier unifiedCashier = new UnifiedCashier();
        PizzaRestaurant pizzaRestaurant = new PizzaRestaurant(unifiedCashier);
        HamburgerRestaurant hamburgerRestaurant = new HamburgerRestaurant(unifiedCashier);
        ChickenWingsRestaurant chickenWingsRestaurant = new ChickenWingsRestaurant(unifiedCashier);

        TimerTask orderGenerator = new OrderGenerator(unifiedCashier);
        timer.schedule(orderGenerator, 0, 3000);
    }
}
