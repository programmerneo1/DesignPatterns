package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertsObserverImp implements NotificationAlertsObserver {

    String mobNo;
    StockObservable observable;

    public MobileAlertsObserverImp(String mobNo, StockObservable observable) {
        this.observable = observable;
        this.mobNo = mobNo;
    }
    @Override
    public void update() {
        sentMsgToMobile(mobNo, "Product in stock, hurry-up");
    }

    private void sentMsgToMobile(String mobNo, String msg) {
        System.out.println("Msg has been sent to the given Mob No.");
    }
}
