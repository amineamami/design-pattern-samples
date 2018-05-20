package tn.iit.glid.command.impl;

import tn.iit.glid.command.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No command ");

	}

	@Override
	public void undo() {
		System.out.println("No command ");

	}

}
