package com.decorator.dosacorner.toppings;

import com.decorator.dosacorner.base.DosaBaseDecorator;

public class GratedCoconutTopping extends ToppingDecorator{
	private DosaBaseDecorator dosaBaseDecorator;
	private String toppingDescription = " topped with grated coconut";
	private double price = 10.0;
	
	public GratedCoconutTopping(DosaBaseDecorator dosaBaseDecorator) {
		this.dosaBaseDecorator = dosaBaseDecorator;
	}
	
	

	@Override
	public String getDosaDescription() {
		return dosaBaseDecorator.getDosaDescription() + toppingDescription;
	}
	@Override
	public double getCost() {
		return dosaBaseDecorator.getCost() + this.price;
	}

}
