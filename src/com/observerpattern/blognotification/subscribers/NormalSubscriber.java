package com.observerpattern.blognotification.subscribers;

import com.observerpattern.blognotification.publishers.Blog;

public class NormalSubscriber implements BlogSubscriber{
	private String name;
	private String email;
	
	public NormalSubscriber(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	@Override
	public void notifySubscriber(Blog blog) {
		System.out.println("Email Sent to "+this.name + " at "+ this.email +" about blog: "+blog.getBlogTitle());
		
	}

	@Override
	public String toString() {
		return "NormalSubscriber [name=" + name + ", email=" + email + "]";
	}
	
	

}
