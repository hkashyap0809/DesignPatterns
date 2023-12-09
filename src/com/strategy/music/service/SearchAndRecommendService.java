package com.strategy.music.service;

import com.strategy.music.strategies.SearchAndRecommendationStrategy;

public class SearchAndRecommendService {

	private SearchAndRecommendationStrategy searchAndRecommendationStrategy;

	public void setStrategy(SearchAndRecommendationStrategy searchAndRecommendationStrategy) {
		this.searchAndRecommendationStrategy = searchAndRecommendationStrategy;
	}

	public void search(String searchString) {
		searchAndRecommendationStrategy.search(searchString);

	}
	public void recommend(String recommendString) {
		searchAndRecommendationStrategy.search(recommendString);
	}

}
