package com.observerpattern.stocknotification;

public class StoreClient {

	public static void main(String[] args) {
		StocksObservable iphoneStockObservable = new IphoneObservableImplementation();

		NotificationAlertObserver observer1 = new EmailAlertObserverImplementaion("harshit@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer2 = new PushNotificationObserverImplementation("harshit@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer3 = new EmailAlertObserverImplementaion("anjaneya@gmail.com", iphoneStockObservable);


		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
//		iphoneStockObservable.notifySubscribers();
		iphoneStockObservable.setStockCount(0);
	}
}
