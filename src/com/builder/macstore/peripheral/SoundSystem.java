package com.builder.macstore.peripheral;

public class SoundSystem {
	private String soundSystemDescription;
	
	public SoundSystem(String soundSystemDescription) {
		super();
		this.soundSystemDescription = soundSystemDescription;
	}

	public String getSoundSystemDescription() {
		return soundSystemDescription;
	}

	public void setSoundSystemDescription(String soundSystemDescription) {
		this.soundSystemDescription = soundSystemDescription;
	}

	@Override
	public String toString() {
		return "SoundSystem [soundSystemDescription=" + soundSystemDescription + "]";
	}
	
	
	
}
