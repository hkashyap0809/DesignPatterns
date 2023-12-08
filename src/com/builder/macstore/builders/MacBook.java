package com.builder.macstore.builders;

import com.builder.macstore.peripheral.Display;
import com.builder.macstore.peripheral.GPU;
import com.builder.macstore.peripheral.Processor;
import com.builder.macstore.peripheral.RAM;
import com.builder.macstore.peripheral.SoundSystem;
import com.builder.macstore.peripheral.Storage;

public class MacBook {
	
	private final String macBookType;
	private final Processor processor;
	private final Storage storage;
	private final RAM ram;
	private final GPU gpu;
	private final Display display;
	private final SoundSystem soundSystem;
	
	public MacBook(String macBookType, Processor processor, com.builder.macstore.peripheral.Storage storage,
			RAM ram, GPU gpu, Display display, SoundSystem soundSystem) {
		super();
		this.macBookType = macBookType;
		this.processor = processor;
		this.storage = storage;
		this.ram = ram;
		this.gpu = gpu;
		this.display = display;
		this.soundSystem = soundSystem;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("MacBook :[ ");
		stringBuilder.append(macBookType+", \n");
		stringBuilder.append(processor.toString()+", \n");
		stringBuilder.append(storage.toString()+", \n");
		stringBuilder.append(ram.toString()+", \n");
		stringBuilder.append(gpu.toString()+", \n");
		stringBuilder.append(display.toString()+", \n");
		stringBuilder.append(soundSystem.toString()+" ]");
		return stringBuilder.toString();
	}

	public String getMacBookType() {
		return macBookType;
	}

	public Processor getProcessor() {
		return processor;
	}

	public Storage getStorage() {
		return storage;
	}

	public RAM getRam() {
		return ram;
	}

	public GPU getGpu() {
		return gpu;
	}

	public Display getDisplay() {
		return display;
	}

	public SoundSystem getSoundSystem() {
		return soundSystem;
	}
	
	
	

}
