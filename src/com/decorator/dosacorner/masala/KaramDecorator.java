package com.decorator.dosacorner.masala;

import com.decorator.dosacorner.base.DosaBaseDecorator;

public class KaramDecorator extends MasalaDecorator{
	private DosaBaseDecorator dosaBaseDecorator;

	private String masalaDescription =" mixed with karam";
	private double price = 27.0;;


	public KaramDecorator(DosaBaseDecorator dosaBaseDecorator) {
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
