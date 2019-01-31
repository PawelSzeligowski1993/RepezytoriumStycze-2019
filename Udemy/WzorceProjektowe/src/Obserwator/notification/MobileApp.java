package Obserwator.notification;

import Obserwator.Order.Order;

public class MobileApp implements Observer{

    public void ubdate(Order order){
        System.out.println("Aplikacja mobilna - Zamowienie numer: " + order.getOrderNumber() + " zmienilo status na: " + order.getOrdeStatus());
    }
}
