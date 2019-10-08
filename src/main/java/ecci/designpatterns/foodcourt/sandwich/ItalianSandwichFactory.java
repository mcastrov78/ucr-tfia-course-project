package ecci.designpatterns.foodcourt.sandwich;

public class ItalianSandwichFactory implements SandwichFactory {

    public Bread getBread() {
        return new CiabattaBread();
    }

    public Meat getMeat() {
        return new SalamiMeat();
    }
}
