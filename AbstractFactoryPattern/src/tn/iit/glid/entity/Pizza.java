package tn.iit.glid.entity;

import tn.iit.glid.ingeredients.Cheese;
import tn.iit.glid.ingeredients.Clam;
import tn.iit.glid.ingeredients.Dough;
import tn.iit.glid.ingeredients.Sauce;
import tn.iit.glid.ingeredients.Veggies;

public abstract class Pizza {

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Veggies veggies[];
	protected Clam clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Cuire durant 25mn à 350°");
	}

	public void cut() {
		System.out.println("Couper en morceaux à la diagonale");
	}

	public void box() {
		System.out.println("Placer la pizza dans un boitier officiel");
	}

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}
}
