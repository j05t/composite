package org.se.lab;

public class SamsungTv implements Tv {
	private boolean isOn = false;
	private int channel = 0;

	public void on() {
		this.isOn = true;
	}

	public void off() {
		this.isOn = false;
	}

	public void switchChannel(int channel) {
		this.channel = channel;
	}
	
	public boolean isOn() {
		return this.isOn;
	}

	public int getChannel() {
		return this.channel;
	}
}
