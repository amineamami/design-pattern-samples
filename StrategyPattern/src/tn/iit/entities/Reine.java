package tn.iit.entities;

import tn.iit.behavior.Couteau;

public class Reine extends Individu {

	public Reine() {
		armeBehavior = new Couteau();
	}

	@Override
	public void display() {
		System.out.println("Reine !");
	}

}
