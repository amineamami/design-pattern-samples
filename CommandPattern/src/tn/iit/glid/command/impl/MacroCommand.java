package tn.iit.glid.command.impl;

import java.util.List;

import tn.iit.glid.command.Command;

public class MacroCommand implements Command {

	private List<Command> macroCommand;
	
	public MacroCommand(List<Command> macCommands) {
		this.macroCommand=macCommands;
	}

	@Override
	public void execute() {
		macroCommand.forEach(Command::execute);
	}

	@Override
	public void undo() {
		macroCommand.forEach(Command::undo);
	}
	
	public List<Command> getMacroCommand() {
		return macroCommand;
	}

}
