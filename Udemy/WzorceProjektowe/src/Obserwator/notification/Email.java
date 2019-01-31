package Obserwator.notification;

import Obserwator.Order.Order;

public class Email implements Observer {
    public void ubdate(Order order){
        System.out.println("Email Zamowienie numer: " + order.getOrderNumber() + " zmienilo status na: " + order.getOrdeStatus());
    }
}
