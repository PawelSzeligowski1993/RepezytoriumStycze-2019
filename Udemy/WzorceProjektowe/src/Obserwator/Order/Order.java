package Obserwator.Order;

import java.util.HashSet;
import Obserwator.notification.Observer;
import java.util.Set;

public class Order implements Observable{

    private Long orderNumber;
    private OrdeStatus ordeStatus;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public Order(Long orderNumber, OrdeStatus ordeStatus) {
        this.orderNumber = orderNumber;
        this.ordeStatus = ordeStatus;
    }


    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }


    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }


    public void notifyObservers() {
        for (Observer observer : registeredObservers){
            observer.ubdate(this);
        }
    }

    public void changeOrderStatus(OrdeStatus ordeStatus){
        setOrdeStatus(ordeStatus);
        notifyObservers();
    }


    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrdeStatus getOrdeStatus() {
        return ordeStatus;
    }

    public void setOrdeStatus(OrdeStatus ordeStatus) {
        this.ordeStatus = ordeStatus;
    }
}
