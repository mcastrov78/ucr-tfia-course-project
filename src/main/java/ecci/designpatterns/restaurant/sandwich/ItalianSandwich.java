package ecci.designpatterns.restaurant.sandwich;

import ecci.designpatterns.restaurant.sandwich.ingredient.SandwichIngredientsFactory;

/**
 * Represents an italian sandwich with a name, bread and meat.
 */
public class ItalianSandwich extends Sandwich {

    protected SandwichIngredientsFactory sandwichIngredientsFactory;

    public ItalianSandwich(SandwichIngredientsFactory sandwichIngredientsFactory) {
        this.name = "Italian Sandwich";
        this.sandwichIngredientsFactory = sandwichIngredientsFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        bread = sandwichIngredientsFactory.getBread();
        meat = sandwichIngredientsFactory.getMeat();
    }

    public double getCost() {
        return 6;
    }
}
