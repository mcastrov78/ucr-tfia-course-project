package ecci.designpatterns.foodcourt.sandwich;

public class AmericanSandwichFactory implements SandwichFactory {

    public Bread getBread() {
        return new WhiteBread();
    }

    public Meat getMeat() {
        return new HamMeat();
    }
}
