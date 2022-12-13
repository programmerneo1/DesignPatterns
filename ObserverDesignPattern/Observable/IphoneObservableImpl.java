package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertsObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertsObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertsObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertsObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertsObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) notifySubscriber();
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
