package ecci.designpatterns.foodcourt.orders;

public interface NewOrdersProcessor {

    public void registerObserver(Chef chef);
    public void removeObserver(Chef chef);
    public void notifyObservers();
}
