package com.builder.macstore.peripheral;

public class Processor {
	private String processorDescription;

	
	public Processor(String processorDescription) {
		super();
		this.processorDescription = processorDescription;
	}

	public String getProcessorDescription() {
		return processorDescription;
	}

	public void setProcessorDescription(String processorDescription) {
		this.processorDescription = processorDescription;
	}

	@Override
	public String toString() {
		return "Processor [processorDescription=" + processorDescription + "]";
	}
	

}
