package ecci.designpatterns.restaurant.sandwich.ingredient;

/**
 * Mexican sandwich ingredient factory.
 */
public class MexicanSandwichIngredientsFactory implements SandwichIngredientsFactory {

    public Bread getBread() {
        return new TortaBread();
    }

    public Meat getMeat() {
        return new CarnitasMeat();
    }

    public Vegetable[] getVegetables() {
        Vegetable vegetables[] = {new AvocadoVegetable()};
        return vegetables;
    }

}
