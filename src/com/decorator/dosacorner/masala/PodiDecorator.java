package com.decorator.dosacorner.masala;

import com.decorator.dosacorner.base.DosaBaseDecorator;

public class PodiDecorator extends MasalaDecorator{
	private DosaBaseDecorator dosaBaseDecorator;

	private String masalaDescription =" mixed with podi ";
	private double price = 38.0;;


	public PodiDecorator(DosaBaseDecorator dosaBaseDecorator) {
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
