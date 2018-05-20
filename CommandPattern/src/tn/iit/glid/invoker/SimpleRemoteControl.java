package tn.iit.glid.invoker;

import tn.iit.glid.command.Command;
import tn.iit.glid.command.impl.NoCommand;

public class SimpleRemoteControl {

	Command[] slot ;
	Command lastCommand;
	

	public SimpleRemoteControl() {
		slot = new Command[5];
		lastCommand = new NoCommand();
		Command noCommand = new NoCommand();
		for (int i = 0; i < 5; i++) {
			slot[i] = noCommand;
		}
	}

	public void setCommand(Command[] commandes) {
		for (int i = 0; i < commandes.length; i++) {
			slot[i] = commandes[i];
		}
	}

	public void buttonWasPressed(int index) {
		slot[index].execute();
		lastCommand= slot[index];
	}

	public void buttonWasReleased() {
		lastCommand.undo();
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < 5; i++) {
			s += "Slot[" + i + "] " + slot[i].getClass().getName() + " " + slot[i].getClass().getName() + "\n";
		}
		return s;
	}

}