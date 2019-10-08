package ecci.designpatterns.restaurant.sandwich.ingredient;

/**
 * Italian sandwich ingredient factory.
 */
public class ItalianSandwichIngredientsFactory implements SandwichIngredientsFactory {

    public Bread getBread() {
        return new CiabattaBread();
    }

    public Meat getMeat() {
        return new SalamiMeat();
    }

    public Vegetable[] getVegetables() {
        return new Vegetable[0];
    }
}
