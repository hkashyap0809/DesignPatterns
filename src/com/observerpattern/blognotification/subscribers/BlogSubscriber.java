package com.observerpattern.blognotification.subscribers;

import com.observerpattern.blognotification.publishers.Blog;

public interface BlogSubscriber {
	void notifySubscriber(Blog blog);
}
