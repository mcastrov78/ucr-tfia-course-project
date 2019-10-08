package ecci.designpatterns.foodcourt.sandwich;

public class ItalianSandwich extends Sandwich {

    SandwichFactory sandwichFactory;

    public ItalianSandwich(SandwichFactory sandwichFactory) {
        this.sandwichFactory = sandwichFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        bread = sandwichFactory.getBread();
        meat = sandwichFactory.getMeat();
    }
}
