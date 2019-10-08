package ecci.designpatterns.restaurant.orders;

import ecci.designpatterns.restaurant.sandwich.SandwichType;
import ecci.designpatterns.restaurant.sandwich.topping.ToppingType;

/**
 * Sandwich order info with one possible topping.
 */
public class Order {

    private SandwichType sandwichType;
    private ToppingType toppingType;

    public SandwichType getSandwichType() {
        return sandwichType;
    }

    public void setSandwichType(SandwichType sandwichType) {
        this.sandwichType = sandwichType;
    }

    public ToppingType getToppingType() {
        return toppingType;
    }

    public void setToppingType(ToppingType toppingType) {
        this.toppingType = toppingType;
    }
}
