package com.observer.blognotification.subscribers;

import com.observer.blognotification.publishers.Blog;

public class PremiumSubscriber implements BlogSubscriber{

	
	private String name;
	private String email;
	
	public PremiumSubscriber(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	@Override
	public void notifySubscriber(Blog blog) {
		System.out.println("Email Sent to "+this.name + " at "+ this.email +" about blog: "+blog.getBlogTitle());
		
	}

	@Override
	public String toString() {
		return "PremiumSubscriber [name=" + name + ", email=" + email + "]";
	}
	

}
