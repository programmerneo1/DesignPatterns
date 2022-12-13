package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlertsObserverImp;
import ObserverDesignPattern.Observer.MobileAlertsObserverImp;
import ObserverDesignPattern.Observer.NotificationAlertsObserver;

public class Store {

    public static void main (String args[]) {
        StockObservable iphoneObservable = new IphoneObservableImpl();
        NotificationAlertsObserver observer1 = new EmailAlertsObserverImp("abc@gmail.com", iphoneObservable);
        NotificationAlertsObserver observer2 = new MobileAlertsObserverImp("7565097460", iphoneObservable);
        observer1.update();
        observer2.update();
    }
}
