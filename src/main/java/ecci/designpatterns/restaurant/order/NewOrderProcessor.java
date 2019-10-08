package ecci.designpatterns.restaurant.order;

/**
 * Subject or publisher part of the Observer pattern.
 */
public interface NewOrderProcessor {

    public void registerObserver(Chef chef);
    public void removeObserver(Chef chef);
    public void notifyObservers();
}
