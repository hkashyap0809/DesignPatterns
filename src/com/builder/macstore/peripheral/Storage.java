package com.builder.macstore.peripheral;

public class Storage {
	private double storageSize;
	private String storageUnits;
	
	public Storage(double storageSize, String storageUnits) {
		super();
		this.storageSize = storageSize;
		this.storageUnits = storageUnits;
	}
	public double getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(double storageSize) {
		this.storageSize = storageSize;
	}
	public String getStorageUnits() {
		return storageUnits;
	}
	public void setStorageUnits(String storageUnits) {
		this.storageUnits = storageUnits;
	}
	
	@Override
	public String toString() {
		return "Storage [storageSize=" + storageSize + ", storageUnits=" + storageUnits + "]";
	}
}
