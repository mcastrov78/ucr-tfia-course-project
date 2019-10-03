package ecci.designpatterns.foodcourt.restaurants;

public interface Cashier {

    public void registerObserver(Restaurant restaurant);
    public void removeObserver(Restaurant restaurant);
    public void notifyObservers();
}
