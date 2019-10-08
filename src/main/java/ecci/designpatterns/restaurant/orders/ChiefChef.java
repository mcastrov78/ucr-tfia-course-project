package ecci.designpatterns.restaurant.orders;

import ecci.designpatterns.restaurant.saleslog.SalesLog;
import ecci.designpatterns.restaurant.sandwich.*;
import ecci.designpatterns.restaurant.sandwich.ingredient.ItalianSandwichIngredientsFactory;
import ecci.designpatterns.restaurant.sandwich.ingredient.MexicanSandwichIngredientsFactory;
import ecci.designpatterns.restaurant.sandwich.ingredient.SandwichIngredientsFactory;
import ecci.designpatterns.restaurant.sandwich.topping.CheeseTopping;
import ecci.designpatterns.restaurant.sandwich.topping.TomatoTopping;
import ecci.designpatterns.restaurant.sandwich.topping.ToppingType;

/**
 * Chief Chef is notified of new orders and prepares and delivers them.
 * (Observer or subscriber part of the Observer pattern.)
 */
public class ChiefChef implements Chef {

    public ChiefChef(Cashier cashier) {
        cashier.registerObserver(this);
    }

    public void update(Order order) {
        System.out.println("\nNEW Order received");
        Sandwich sandwich = createSandwich(order.getSandwichType());
        sandwich = addTopping(sandwich, order.getToppingType());
        sandwich.prepare();
        sandwich.heat();
        sandwich.cut();
        sandwich.box();
        closeOrder(sandwich);
    }

    private Sandwich createSandwich(SandwichType sandwichType) {
        Sandwich sandwich = null;
        SandwichIngredientsFactory sandwichIngredientsFactory = null;

        System.out.println("Sandwich Type: " + sandwichType);
        switch(sandwichType) {
            case MEXICAN:
                sandwichIngredientsFactory = new MexicanSandwichIngredientsFactory();
                sandwich = new MexicanSandwich(sandwichIngredientsFactory);
                break;
            case ITALIAN:
                sandwichIngredientsFactory = new ItalianSandwichIngredientsFactory();
                sandwich = new ItalianSandwich(sandwichIngredientsFactory);
                break;
        }

        return sandwich;
    }

    private Sandwich addTopping(Sandwich sandwich, ToppingType toppingType) {
        Sandwich decoratedSandwich = sandwich;

        System.out.println("Topping to add: " + toppingType);
        switch(toppingType) {
            case CHEESE:
                decoratedSandwich = new CheeseTopping(sandwich);
                break;
            case TOMATO:
                decoratedSandwich = new TomatoTopping(sandwich);
                break;
        }

        return decoratedSandwich;
    }

    private void closeOrder(Sandwich sandwich) {
        SalesLog salesLog = SalesLog.getInstance();
        salesLog.logSale(sandwich.getDescription(), sandwich.getCost());
        System.out.println("ORDER COMPLETE: " + sandwich.getDescription());
        System.out.println("ORDER COST: " + sandwich.getCost());
    }
}
