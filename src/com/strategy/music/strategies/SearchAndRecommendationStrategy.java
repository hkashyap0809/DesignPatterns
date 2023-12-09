package com.strategy.music.strategies;

public interface SearchAndRecommendationStrategy {
	public void search(String searchString);
	public void recommend(String recommendString);

}
