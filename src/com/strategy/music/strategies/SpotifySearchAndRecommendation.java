package com.strategy.music.strategies;

public class SpotifySearchAndRecommendation implements SearchAndRecommendationStrategy{

	@Override
	public void search(String searchString) {
		System.out.println("Making GET Request on Spotify servers . . . ");
		System.out.println("Awaiting Response . . .");
		System.out.println("Parsing Search Results . . .");
	}

	@Override
	public void recommend(String recommendString) {
		System.out.println("Making GET Request on Spotify servers . . . ");
		System.out.println("Awaiting Response . . .");
		System.out.println("Parsing Recommendation Results . . .");

	}

}
