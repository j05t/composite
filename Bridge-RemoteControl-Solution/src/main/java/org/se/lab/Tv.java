package org.se.lab;

public interface Tv {
	public void on();
	public void off();
	public void switchChannel(int channel);
	
	public boolean isOn();
	public int getChannel();
}
