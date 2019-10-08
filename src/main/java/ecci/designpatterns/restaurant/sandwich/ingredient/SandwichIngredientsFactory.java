package ecci.designpatterns.restaurant.sandwich.ingredient;

/**
 * Sandwich ingredient factory interface.
 */
public interface SandwichIngredientsFactory {

    Bread getBread();
    Meat getMeat();
    Vegetable[] getVegetables();
}
