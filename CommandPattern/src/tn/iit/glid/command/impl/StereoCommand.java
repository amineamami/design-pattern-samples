package tn.iit.glid.command.impl;

import tn.iit.glid.Stereo;
import tn.iit.glid.command.Command;

public class StereoCommand implements Command {

	private Stereo stereo;

	public StereoCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();

	}

	@Override
	public void undo() {
		stereo.off();

	}

}
