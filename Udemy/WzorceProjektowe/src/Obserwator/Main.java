package Obserwator;

import Obserwator.Order.OrdeStatus;
import Obserwator.Order.Order;
import Obserwator.notification.Email;
import Obserwator.notification.MobileApp;
import Obserwator.notification.TextMessage;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrdeStatus.ZARAEJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();
        System.out.println("----------------");

        order.changeOrderStatus(OrdeStatus.WYSLANE);

        order.unregisterObserver(email);

        System.out.println("------------------");

        order.changeOrderStatus(OrdeStatus.ODEBRANE);



    }
}
