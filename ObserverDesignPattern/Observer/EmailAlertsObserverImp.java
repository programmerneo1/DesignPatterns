package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertsObserverImp implements NotificationAlertsObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertsObserverImp(String emailId, StockObservable observable) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product in stock, hurry-up!");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("Msg has been to the given emailId");
    }
}
