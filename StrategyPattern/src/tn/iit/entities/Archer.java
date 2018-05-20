package tn.iit.entities;

import tn.iit.behavior.ArcFleche;

public class Archer extends Individu {

	public Archer() {
		armeBehavior = new ArcFleche();
	}
	@Override
	public void display() {
		System.out.println("Archer !");
	}

}
