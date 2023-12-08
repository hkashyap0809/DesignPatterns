package com.builder.macstore.peripheral;

public class GPU {
	private int noOfCores;
	private String gpuDescription;
	
	public GPU(int noOfCores, String gpuDescription) {
		super();
		this.noOfCores = noOfCores;
		this.gpuDescription = gpuDescription;
	}

	public int getNoOfCores() {
		return noOfCores;
	}

	public void setNoOfCores(int noOfCores) {
		this.noOfCores = noOfCores;
	}

	public String getGpuDescription() {
		return gpuDescription;
	}

	public void setGpuDescription(String gpuDescription) {
		this.gpuDescription = gpuDescription;
	}

	@Override
	public String toString() {
		return "GPU [noOfCores=" + noOfCores + ", gpuDescription=" + gpuDescription + "]";
	}
	
	
	
	
}
