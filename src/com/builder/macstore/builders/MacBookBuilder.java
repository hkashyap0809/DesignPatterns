package com.builder.macstore.builders;

import com.builder.macstore.peripheral.Display;
import com.builder.macstore.peripheral.GPU;
import com.builder.macstore.peripheral.Processor;
import com.builder.macstore.peripheral.RAM;
import com.builder.macstore.peripheral.SoundSystem;
import com.builder.macstore.peripheral.Storage;

public class MacBookBuilder implements MacBuilder{
	private String macBookType;
	private Processor processor;
	private Storage Storage;
	private RAM ram;
	private GPU gpu;
	private Display display;
	private SoundSystem soundSystem;

	
	@Override
	public void setMacBookType(String macBookType) {
		this.macBookType = macBookType;
		
	}
	
	@Override
	public void setProcessor(Processor processor) {
		this.processor = processor;
		
	}

	@Override
	public void setStorage(Storage storage) {
		this.Storage = storage;
		
	}

	@Override
	public void setRAM(RAM ram) {
		this.ram = ram;
		
	}

	@Override
	public void setGPU(GPU gpu) {
		this.gpu = gpu;
		
	}

	@Override
	public void setDisplay(Display display) {
		this.display = display;
		
	}

	@Override
	public void setSoundSystem(SoundSystem soundSystem) {
		this.soundSystem = soundSystem;
		
	}
	
	public MacBook getMacBook() {
		return new MacBook(macBookType, processor, Storage, ram, gpu, display, soundSystem);
	}

}

	
