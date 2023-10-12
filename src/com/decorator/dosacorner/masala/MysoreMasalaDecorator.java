package com.decorator.dosacorner.masala;

import com.decorator.dosacorner.base.DosaBaseDecorator;

public class MysoreMasalaDecorator extends MasalaDecorator{
	private DosaBaseDecorator dosaBaseDecorator;

	private String masalaDescription =" mixed with mysore masala";
	private double price = 18.0;;


	public MysoreMasalaDecorator(DosaBaseDecorator dosaBaseDecorator) {
		this.dosaBaseDecorator = dosaBaseDecorator;
	}

	@Override
	public String getDosaDescription() {
		return dosaBaseDecorator.getDosaDescription() + this.masalaDescription;
	}

	@Override
	public double getCost() {
		return dosaBaseDecorator.getCost() + this.price;
	}

}
