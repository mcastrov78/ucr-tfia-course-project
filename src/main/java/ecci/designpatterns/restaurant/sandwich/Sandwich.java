package ecci.designpatterns.restaurant.sandwich;

import ecci.designpatterns.restaurant.sandwich.ingredient.Bread;
import ecci.designpatterns.restaurant.sandwich.ingredient.Meat;
import ecci.designpatterns.restaurant.sandwich.ingredient.Vegetable;

/**
 * Represents a base sandwich with a name, bread and meat.
 */
public abstract class Sandwich {

    protected String name;
    protected Bread bread;
    protected Meat meat;
    protected Vegetable[] vegetables;

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

    public Vegetable[] getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetable vegetable[]) {
        this.vegetables = vegetables;
    }

    abstract public void prepare();

    abstract public double getCost();

    public void heat() {
        System.out.println("Heat for 2 minutes ...");
    }

    public void cut() {
        System.out.println("Cutting the sandwich in two halves ...");
    }

    public void box() {
        System.out.println("Place sandwich in box ...");
    }

    public String getDescription() {
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
        if (vegetables != null) {
            for (int i = 0; i < vegetables.length; i++) {
                result.append(vegetables[i]);
                result.append(" - ");
            }
        }

        return result.toString();
    }

}

