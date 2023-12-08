package com.builder.macstore.peripheral;

public class RAM {
	private int ramSize;
	private String ramUnits;
	
	
	public RAM(int ramSize, String ramUnits) {
		super();
		this.ramSize = ramSize;
		this.ramUnits = ramUnits;
	}
	
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public String getRamUnits() {
		return ramUnits;
	}
	public void setRamUnits(String ramUnits) {
		this.ramUnits = ramUnits;
	}

	@Override
	public String toString() {
		return "RAM [ramSize=" + ramSize + ", ramUnits=" + ramUnits + "]";
	}
	
	

}
