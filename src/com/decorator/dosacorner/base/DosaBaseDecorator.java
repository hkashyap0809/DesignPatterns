package com.decorator.dosacorner.base;

public abstract class DosaBaseDecorator {
	
	private String dosaDescription;
	
	public String getDosaDescription() {
		return this.dosaDescription;
	}
	public void setDosaDescription(String batterDescription) {
		this.dosaDescription = batterDescription;
	}
	
	public abstract double getCost();
}
