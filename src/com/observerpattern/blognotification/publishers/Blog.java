package com.observerpattern.blognotification.publishers;

public class Blog {
	
	private String blogId;
	private String blogTitle;
	private String blogDescription;
	
	
	public Blog(String blogId, String blogTitle, String blogDescription) {
		super();
		this.blogId = blogId;
		this.blogTitle = blogTitle;
		this.blogDescription = blogDescription;
	}
	
	public String getBlogId() {
		return blogId;
	}
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogDescription=" + blogDescription + "]";
	}
	
}
