package com.observerpattern.stocknotification;

public class EmailAlertObserverImplementaion implements NotificationAlertObserver{
	
	private String emailId;
	private StocksObservable observable;
	
	EmailAlertObserverImplementaion(String emailId, StocksObservable observable){
		this.emailId = emailId;
		this.observable = observable;
	}
	
		
	@Override
	public void update() {
		sendEmail(emailId,"Product is back in stock");
		
	}

	private void sendEmail(String emailId, String message) {
		System.out.println("Mail sent to "+emailId);
	}

}
