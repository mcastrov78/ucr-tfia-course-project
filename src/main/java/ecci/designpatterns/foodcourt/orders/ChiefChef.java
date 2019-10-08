package ecci.designpatterns.foodcourt.orders;

import ecci.designpatterns.foodcourt.Order;
import ecci.designpatterns.foodcourt.sandwich.*;

public class ChiefChef implements Chef {

    public ChiefChef(Cashier cashier) {
        cashier.registerObserver(this);
    }

    public void update(Order order) {
        Sandwich sandwich = null;
        SandwichFactory sandwichFactory = null;

        if (order.getSandwichType() == 0) {
            System.out.println("Chief Chef - NEW Order received - Sandwich Type: " + order.getSandwichType());
            sandwichFactory = new AmericanSandwichFactory();
            sandwich = new AmericanSandwich(sandwichFactory);
            sandwich.setName("American Sandwich");

        }
        else if (order.getSandwichType() == 1) {
            System.out.println("Chief Chef - NEW Order received - Sandwich Type: " + order.getSandwichType());
            sandwichFactory = new ItalianSandwichFactory();
            sandwich = new ItalianSandwich(sandwichFactory);
            sandwich.setName("Italian Sandwich");
        }

        sandwich.prepare();
        sandwich.heat();
        sandwich.cut();
        sandwich.box();

        System.out.println("ORDER COMPLETE: " + sandwich.toString());
    }

}
