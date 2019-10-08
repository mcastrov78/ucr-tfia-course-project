package ecci.designpatterns.foodcourt.sandwich;

public class AmericanSandwich extends Sandwich {

    SandwichFactory sandwichFactory;

    public AmericanSandwich(SandwichFactory sandwichFactory) {
        this.sandwichFactory = sandwichFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        bread = sandwichFactory.getBread();
        meat = sandwichFactory.getMeat();
    }
}
