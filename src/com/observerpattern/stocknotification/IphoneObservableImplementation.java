package com.observerpattern.stocknotification;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImplementation implements StocksObservable{

	private List<NotificationAlertObserver> observerList = new ArrayList<>();
	private int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);

	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifySubscribers() {
		for( NotificationAlertObserver observer : observerList) {
			observer.update();
		}

	}

	@Override
	public void setStockCount(int newStockCount) {
		if ( stockCount == 0 ) notifySubscribers();
		stockCount += newStockCount;
		

	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
