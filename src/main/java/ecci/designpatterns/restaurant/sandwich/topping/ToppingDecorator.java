package ecci.designpatterns.restaurant.sandwich.topping;

import ecci.designpatterns.restaurant.sandwich.Sandwich;

/**
 * Base class to decorate sandwich objects.
 */
public abstract class ToppingDecorator extends Sandwich {

    public abstract String getDescription();
}
