package com.strategy.music;

import com.strategy.music.service.SearchAndRecommendService;
import com.strategy.music.strategies.LastFMSearchAndRecommendation;
import com.strategy.music.strategies.SpotifySearchAndRecommendation;

public class SearchAndRecommend {
	public static void main(String[] args) {
		SearchAndRecommendService searchAndRecommendService = new SearchAndRecommendService();
		
		searchAndRecommendService.setStrategy(new SpotifySearchAndRecommendation());
		searchAndRecommendService.search("Linkin Park");
		
		
		
		searchAndRecommendService.setStrategy(new LastFMSearchAndRecommendation());
		searchAndRecommendService.search("Boulevard Of Broken Dreams");
	}

}
