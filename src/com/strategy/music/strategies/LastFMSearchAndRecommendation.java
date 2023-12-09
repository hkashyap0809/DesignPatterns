package com.strategy.music.strategies;

public class LastFMSearchAndRecommendation implements SearchAndRecommendationStrategy {

	@Override
	public void search(String searchString) {
		System.out.println("Making GET Request on LAST FM servers . . . ");
		System.out.println("Awaiting Response . . .");
		System.out.println("Parsing Search Results . . .");
	}

	@Override
	public void recommend(String recommendString) {
		System.out.println("Making GET Request on LAST FM servers . . . ");
		System.out.println("Awaiting Response . . .");
		System.out.println("Parsing Recommendation Results . . .");

	}

}
