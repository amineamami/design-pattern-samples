package tn.iit.glid.command.impl;

import tn.iit.glid.Light;
import tn.iit.glid.command.Command;

public class LightCommand implements Command {

	private Light light;

	public LightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {

		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
