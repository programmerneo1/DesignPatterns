package BridgeDesignPattern;

public class QRMessage extends Notification{
    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
    }
    @Override
    void sendMessage() {
        notificationSender.sendNotification();
    }
}
