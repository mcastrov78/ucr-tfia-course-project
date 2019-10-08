package ecci.designpatterns.restaurant.orders;

/**
 * Subject or publisher part of the Observer pattern.
 */
public interface NewOrdersProcessor {

    public void registerObserver(Chef chef);
    public void removeObserver(Chef chef);
    public void notifyObservers();
}
