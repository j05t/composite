package org.se.lab;

public abstract class RemoteControl {
	protected Tv tv;
	
	public RemoteControl (Tv tv) {
		this.tv = tv;
	}
	
	public abstract void setChannel(int channel);
	
	public void turnOn() {
		tv.on();
	}
	
	public void turnOff() {
		tv.off();
	};
}
