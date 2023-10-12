package com.observerpattern.stocknotification;

public class PushNotificationObserverImplementation implements NotificationAlertObserver{

	
	private String emailId;
	private StocksObservable observable;
	
	PushNotificationObserverImplementation(String emailId, StocksObservable observable){
		this.emailId = emailId;
		this.observable = observable;
	}
	
		
	@Override
	public void update() {
		sendEmail(emailId,"Product is back in stock");
		
	}

	private void sendEmail(String emailId, String message) {
		System.out.println("Push Notification sent to "+emailId);
	}


}
