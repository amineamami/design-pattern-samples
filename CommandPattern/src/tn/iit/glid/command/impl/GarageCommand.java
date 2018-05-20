package tn.iit.glid.command.impl;

import tn.iit.glid.GarageDoor;
import tn.iit.glid.command.Command;

public class GarageCommand implements Command {

	private GarageDoor garageDoor;

	public GarageCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.on();
		garageDoor.up();
	}

	@Override
	public void undo() {
		garageDoor.down();
		garageDoor.off();
	}

}
