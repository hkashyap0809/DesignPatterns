package com.builder.macstore;

import com.builder.macstore.builders.MacBook;
import com.builder.macstore.builders.MacBookBuilder;
import com.builder.macstore.builders.MacBuilder;
import com.builder.macstore.director.MacBookDirector;

public class MacStore {
	public static void main(String[] args) {
		MacBookDirector macBookDirector = new MacBookDirector();
		
		MacBookBuilder macBookBuilder = new MacBookBuilder();
		macBookDirector.constructMacBookAIR(macBookBuilder);
		MacBook macBook = macBookBuilder.getMacBook();
		
		System.out.println(macBook.toString());
		
		
		
	}
}
