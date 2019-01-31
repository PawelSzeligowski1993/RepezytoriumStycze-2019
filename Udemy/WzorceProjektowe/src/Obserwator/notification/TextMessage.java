package Obserwator.notification;

import Obserwator.Order.Order;

public class TextMessage implements Observer{
    public void ubdate(Order order){
        System.out.println("SMS - Zamowienie numer: " + order.getOrderNumber() + " zmienilo status na: " + order.getOrdeStatus());
    }
}
