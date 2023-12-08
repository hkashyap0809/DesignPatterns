package com.observerpattern.blognotification.publishers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.observerpattern.blognotification.subscribers.BlogSubscriber;
import com.observerpattern.blognotification.subscribers.SUBSCRIBER_TYPE;

public class BlogPublisher {
	private HashMap<Enum<SUBSCRIBER_TYPE>,List<BlogSubscriber>> subscriberMap;

	public BlogPublisher() {
		subscriberMap = new HashMap<>();
		for( SUBSCRIBER_TYPE subscriberType : SUBSCRIBER_TYPE.values()) {
			subscriberMap.put(subscriberType, new ArrayList<>());
		}
	}

	public void subscribeBlogNewsLetter(SUBSCRIBER_TYPE subscriberType,BlogSubscriber blogSubscriber) {
		List<BlogSubscriber> subscribers = subscriberMap.get(subscriberType);
		subscribers.add(blogSubscriber);
	}

	public void unsubscribeBlogNewsLetter(SUBSCRIBER_TYPE subscriberType,BlogSubscriber blogSubscriber) {
		List<BlogSubscriber> subscribers = subscriberMap.get(subscriberType);
		subscribers.remove(blogSubscriber);
	}

	public void notifySubcriber(SUBSCRIBER_TYPE subscriberTye,Blog blog) {
		List<BlogSubscriber> subscribers = subscriberMap.get(subscriberTye);
		for( BlogSubscriber subscriber : subscribers ) {
			subscriber.notifySubscriber(blog);
		}
	}


	public void notifyAllSubcriber(Blog blog) {
		for( Map.Entry<Enum<SUBSCRIBER_TYPE>, List<BlogSubscriber>> mapEntry : subscriberMap.entrySet()) {
			//String subscriberType = mapEntry.getKey();
			List<BlogSubscriber> subscribers = mapEntry.getValue();
			for( BlogSubscriber subscriber : subscribers ) {
				subscriber.notifySubscriber(blog);
			}
		}
	}

}
