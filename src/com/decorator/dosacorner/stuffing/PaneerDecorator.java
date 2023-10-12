package com.decorator.dosacorner.stuffing;

import com.decorator.dosacorner.base.DosaBaseDecorator;

public class PaneerDecorator extends StuffingDecorator{
	private DosaBaseDecorator dosaBaseDecorator;

	private String stuffingDescription =" stuffed with paneer";
	private double price = 18.0;;


	public PaneerDecorator(DosaBaseDecorator dosaBaseDecorator) {
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
