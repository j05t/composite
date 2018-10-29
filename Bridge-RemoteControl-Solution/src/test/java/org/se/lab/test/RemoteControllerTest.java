package org.se.lab.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.se.lab.RemoteControl;
import org.se.lab.SamsungTv;
import org.se.lab.ToshibaRemoteControl;
import org.se.lab.Tv;
import org.se.lab.UniversalControl;

public class RemoteControllerTest {
	private Tv tv;
	private RemoteControl control;

	@Before
	public void setup() {
		this.tv = new SamsungTv();
		this.control = new ToshibaRemoteControl(tv);
	}

	@Test
	public void testSwitchOn() {
		control.turnOn();
		assertTrue(tv.isOn());
	}

	@Test
	public void testSwitchOnAndOff() {
		control.turnOn();
		control.turnOff();
		assertFalse(tv.isOn());
	}

	@Test
	public void testSetChannel() {
		control.setChannel(1337);
		assertTrue(tv.getChannel() == 1337);
	}
	
	@Test
	public void testUseOtherControl() {
		this.control = new UniversalControl(this.tv);
		
		control.setChannel(1337);
		assertTrue(tv.getChannel() == 1337);
		
		control.turnOff();
		assertFalse(tv.isOn());
	}

}
