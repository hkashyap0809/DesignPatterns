package com.observer.blognotification.subscribers;

import com.observer.blognotification.publishers.Blog;

public interface BlogSubscriber {
	void notifySubscriber(Blog blog);
}
