package com.decorator.dosacorner.base;

public class NormalDosa extends DosaBaseDecorator{
	
	public NormalDosa() {
		this.setDosaDescription("Rice-Urad Dal Batter pan cooked");
	}
	
	@Override
	public double getCost() {
		return 32;
	}

}
