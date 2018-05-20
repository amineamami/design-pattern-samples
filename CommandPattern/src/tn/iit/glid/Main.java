package tn.iit.glid;

import java.util.Arrays;

import tn.iit.glid.command.Command;
import tn.iit.glid.command.impl.GarageCommand;
import tn.iit.glid.command.impl.LightCommand;
import tn.iit.glid.command.impl.MacroCommand;
import tn.iit.glid.command.impl.NoCommand;
import tn.iit.glid.command.impl.StereoCommand;
import tn.iit.glid.invoker.SimpleRemoteControl;

public class Main {

	public static void main(String[] args) {

		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		GarageCommand garageCommand = new GarageCommand(new GarageDoor());
		StereoCommand StereoCommand = new StereoCommand(new Stereo());
		LightCommand lightCommand = new LightCommand(new Light());
		MacroCommand macroCommand = new MacroCommand(Arrays.asList(garageCommand, StereoCommand, lightCommand));
		Command[] slot = { garageCommand, StereoCommand, lightCommand, macroCommand , new NoCommand() };

		remoteControl.setCommand(slot);

		remoteControl.buttonWasPressed(0);
		System.out.println("****");
		remoteControl.buttonWasReleased();
		System.out.println("****");
		remoteControl.buttonWasPressed(1);
		System.out.println("****");
		remoteControl.buttonWasReleased();
	}

}
