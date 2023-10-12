package com.decorator.dosacorner.stuffing;

import com.decorator.dosacorner.base.DosaBaseDecorator;

public class AalooDecorator extends StuffingDecorator{
	private DosaBaseDecorator dosaBaseDecorator;

	private String stuffingDescription =" stuffed with aaloo";
	private double price = 18.0;;


	public AalooDecorator(DosaBaseDecorator dosaBaseDecorator) {
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
