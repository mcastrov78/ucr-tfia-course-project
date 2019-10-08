package ecci.designpatterns.foodcourt.sandwich;

public abstract class Sandwich {

    String name;
    Bread bread;
    Meat meat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    abstract public void prepare();

    public void heat() {
        System.out.println("Heat for 2 minutes ...");
    }

    public void cut() {
        System.out.println("Cutting the sandwich in two halves ...");
    }

    public void box() {
        System.out.println("Place sandwich in box ...");
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(name + ": ");

        if (bread != null) {
            result.append(bread);
            result.append(" - ");
        }
        if (meat != null) {
            result.append(meat);
            result.append(" - ");
        }

        return result.toString();
    }

}

