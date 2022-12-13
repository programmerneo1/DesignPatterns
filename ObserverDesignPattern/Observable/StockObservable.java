package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertsObserver;

public interface StockObservable {
    public void add(NotificationAlertsObserver observer);

    public void remove(NotificationAlertsObserver observer);

    public void notifySubscriber();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
