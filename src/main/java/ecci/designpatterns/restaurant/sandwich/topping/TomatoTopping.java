package ecci.designpatterns.restaurant.sandwich.topping;

import ecci.designpatterns.restaurant.sandwich.Sandwich;

/**
 * Concrete tomato topping decorator.
 */
public class TomatoTopping extends ToppingDecorator {
    Sandwich sandwich;

    public TomatoTopping(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public void prepare() {
        sandwich.prepare();
    }

    public String getDescription() {
        return sandwich.getDescription() + "Tomato Topping - ";
    }

    public double getCost() {
        return sandwich.getCost() + .75;
    }
}
