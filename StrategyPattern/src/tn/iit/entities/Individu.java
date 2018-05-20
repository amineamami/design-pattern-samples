package tn.iit.entities;

import tn.iit.behavior.ArmeBehavior;

public abstract class Individu {

	protected ArmeBehavior armeBehavior;
	
	
	public void combattre() {
		armeBehavior.utiliseArme();
	}
	
	public abstract void display();
	
}
