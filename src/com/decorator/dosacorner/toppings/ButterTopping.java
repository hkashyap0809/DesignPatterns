package com.decorator.dosacorner.toppings;

import com.decorator.dosacorner.base.DosaBaseDecorator;

public class ButterTopping extends ToppingDecorator{
	private DosaBaseDecorator dosaBaseDecorator;
	private String toppingDescription = " topped with butter";
	private double price = 10.0;
	
	public ButterTopping(DosaBaseDecorator dosaBaseDecorator) {
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
