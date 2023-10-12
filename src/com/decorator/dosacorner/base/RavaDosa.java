package com.decorator.dosacorner.base;

public class RavaDosa extends DosaBaseDecorator{
	public RavaDosa() {
		this.setDosaDescription("Rava Batter pan cooked");
	}

	@Override
	public double getCost() {
		return 47;
	}
}
