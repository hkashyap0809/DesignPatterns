package com.builder.macstore.peripheral;

public class Display {
	private double screenSize;
	private String units;
	private String description;
	
	
	public Display(double screenSize, String units, String description) {
		super();
		this.screenSize = screenSize;
		this.units = units;
		this.description = description;
	} 
	
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Display [screenSize=" + screenSize + ", units=" + units + ", description=" + description + "]";
	}

	
}
