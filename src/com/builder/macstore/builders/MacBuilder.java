package com.builder.macstore.builders;

import com.builder.macstore.peripheral.Display;
import com.builder.macstore.peripheral.GPU;
import com.builder.macstore.peripheral.Processor;
import com.builder.macstore.peripheral.RAM;
import com.builder.macstore.peripheral.SoundSystem;
import com.builder.macstore.peripheral.Storage;

public interface MacBuilder {
	
	void setMacBookType(String macBookType);
	void setProcessor(Processor processor);
	void setStorage(Storage storage);
	void setRAM(RAM ram);
	void setGPU(GPU gpu);
	void setDisplay(Display display);
	void setSoundSystem(SoundSystem soundSystem);

}
