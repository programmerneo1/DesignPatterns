package BridgeDesignPattern;

public class BridgeMain {
    public static void main(String args[]) {
        TextMessage textMessage = new TextMessage(new Email());
        textMessage.sendMessage();
        QRMessage qrMessage = new QRMessage(new SMS());
        qrMessage.sendMessage();
    }
}
