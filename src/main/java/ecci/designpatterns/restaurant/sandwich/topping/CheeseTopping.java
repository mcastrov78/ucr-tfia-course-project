package ecci.designpatterns.restaurant.sandwich.topping;

import ecci.designpatterns.restaurant.sandwich.Sandwich;

/**
 * Concrete cheese topping decorator.
 */
public class CheeseTopping extends ToppingDecorator {
    Sandwich sandwich;

    public CheeseTopping(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public void prepare() {
        sandwich.prepare();
    }

    public String getDescription() {
        return sandwich.getDescription() + "Cheese Topping - ";
    }

    public double getCost() {
        return sandwich.getCost() + .10;
    }
}
