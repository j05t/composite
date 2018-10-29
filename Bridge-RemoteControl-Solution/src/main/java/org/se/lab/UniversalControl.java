package org.se.lab;

public class UniversalControl extends RemoteControl {

	public UniversalControl(Tv tv) {
		super(tv);
	}

	@Override
	public void setChannel(int channel) {
		// do some extra stuff..
		super.tv.switchChannel(channel);
	}

}
