package com.decorator.dosacorner.stuffing;

import com.decorator.dosacorner.base.DosaBaseDecorator;

public class OnionDecorator extends StuffingDecorator{
	private DosaBaseDecorator dosaBaseDecorator;
	
	private String stuffingDescription =" stuffed with onion";
	private double price = 18.0;;
	

	public OnionDecorator(DosaBaseDecorator dosaBaseDecorator) {
		this.dosaBaseDecorator = dosaBaseDecorator;
	}

	@Override
	public String getDosaDescription() {
		return dosaBaseDecorator.getDosaDescription() + this.stuffingDescription;
	}

	@Override
	public double getCost() {
		return dosaBaseDecorator.getCost() + this.price;
	}

}
