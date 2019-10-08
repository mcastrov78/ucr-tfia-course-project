package ecci.designpatterns.restaurant.sandwich;

import ecci.designpatterns.restaurant.sandwich.ingredient.SandwichIngredientsFactory;

/**
 * Represents an italian sandwich with a name, bread and meat.
 */
public class MexicanSandwich extends Sandwich {

    protected SandwichIngredientsFactory sandwichIngredientsFactory;

    public MexicanSandwich(SandwichIngredientsFactory sandwichIngredientsFactory) {
        this.name = "Mexican Sandwich";
        this.sandwichIngredientsFactory = sandwichIngredientsFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        bread = sandwichIngredientsFactory.getBread();
        meat = sandwichIngredientsFactory.getMeat();
        vegetables = sandwichIngredientsFactory.getVegetables();
    }

    public double getCost() {
        return 5;
    }
}
