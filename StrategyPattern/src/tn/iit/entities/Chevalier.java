package tn.iit.entities;

import tn.iit.behavior.Epee;

public class Chevalier extends Individu {

	public Chevalier() {
		armeBehavior = new Epee();
	}
	
	@Override
	public void display() {
		System.out.println("Chevalier !");
	}

}
