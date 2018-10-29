package org.se.lab;

public class ToshibaRemoteControl extends RemoteControl {

	public ToshibaRemoteControl(Tv tv) {
		super(tv);
	}

	@Override
	public void setChannel(int channel) {
		super.tv.switchChannel(channel);
	}
}
