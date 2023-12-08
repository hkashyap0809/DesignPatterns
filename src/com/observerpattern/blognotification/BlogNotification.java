package com.observerpattern.blognotification;

import com.observerpattern.blognotification.publishers.Blog;
import com.observerpattern.blognotification.publishers.BlogPublisher;
import com.observerpattern.blognotification.subscribers.BlogSubscriber;
import com.observerpattern.blognotification.subscribers.NormalSubscriber;
import com.observerpattern.blognotification.subscribers.PremiumSubscriber;
import com.observerpattern.blognotification.subscribers.SUBSCRIBER_TYPE;

public class BlogNotification {
	
	public static void main(String[]args) {
		
		//created few blogs
		Blog blog1 = new Blog("1234","Learn CDN"," All about Content Delivery Network");
		Blog blog2 = new Blog("1234","Learn HTTP"," All about HTTP methods");
		
		
		//created few subscribers
		NormalSubscriber normalSubscriber1 = new NormalSubscriber("Harshit", "harshit@gmail.com");
		NormalSubscriber normalSubscriber2 = new NormalSubscriber("Jatin", "jatin@gmail.com");
		
		PremiumSubscriber premiumSubscriber1 = new PremiumSubscriber("Anjaneya", "anjaneya@gmail.com");
		PremiumSubscriber premiumSubscriber2 = new PremiumSubscriber("Prashant", "prashant@gmail.com");
		
		
		//blog publisher
		BlogPublisher blogPublisher = new BlogPublisher();
		
		blogPublisher.subscribeBlogNewsLetter(SUBSCRIBER_TYPE.NORMAL_SUBSCRIBER, normalSubscriber1);
		blogPublisher.subscribeBlogNewsLetter(SUBSCRIBER_TYPE.NORMAL_SUBSCRIBER, normalSubscriber2);
		
		blogPublisher.subscribeBlogNewsLetter(SUBSCRIBER_TYPE.PREMIUM_SUBSCRIBER, premiumSubscriber1);
		blogPublisher.subscribeBlogNewsLetter(SUBSCRIBER_TYPE.PREMIUM_SUBSCRIBER, premiumSubscriber2);
		
		
		System.out.println("Notifying Premium Subscriber");
		blogPublisher.notifySubcriber(SUBSCRIBER_TYPE.PREMIUM_SUBSCRIBER, blog1);
		System.out.println("Notifying All Subscriber");
		blogPublisher.notifyAllSubcriber(blog2);
			
		
	}

}
