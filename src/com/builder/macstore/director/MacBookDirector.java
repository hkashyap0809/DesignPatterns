package com.builder.macstore.director;

import com.builder.macstore.builders.MacBuilder;
import com.builder.macstore.peripheral.Display;
import com.builder.macstore.peripheral.GPU;
import com.builder.macstore.peripheral.Processor;
import com.builder.macstore.peripheral.RAM;
import com.builder.macstore.peripheral.SoundSystem;
import com.builder.macstore.peripheral.Storage;

public class MacBookDirector {
	public void constructMacBookAIR(MacBuilder macBuilder) {
		macBuilder.setMacBookType("MACBOOK AIR ");
		macBuilder.setProcessor(new Processor("M1"));
		macBuilder.setRAM(new RAM(8, "GB"));
		macBuilder.setStorage(new Storage(2556, "GB"));
		macBuilder.setGPU(new GPU(19, "efficiency cores"));
		macBuilder.setDisplay(new Display(13.3, "inch", "Retina Display"));
		macBuilder.setSoundSystem(new SoundSystem("BEATS AUDIO"));
	}
	
	public void constructMacBookPRO(MacBuilder macBuilder) {
		macBuilder.setMacBookType("MACBOOK AIR ");
		macBuilder.setProcessor(new Processor("M1 PRO"));
		macBuilder.setRAM(new RAM(16, "GB"));
		macBuilder.setStorage(new Storage(16, "GB"));
	}
}
