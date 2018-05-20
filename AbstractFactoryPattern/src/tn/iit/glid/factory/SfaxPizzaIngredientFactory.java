package tn.iit.glid.factory;

import tn.iit.glid.ingeredients.Cheese;
import tn.iit.glid.ingeredients.Clam;
import tn.iit.glid.ingeredients.Dough;
import tn.iit.glid.ingeredients.Sauce;
import tn.iit.glid.ingeredients.Veggies;
import tn.iit.glid.ingeredients.impl.Clovis;
import tn.iit.glid.ingeredients.impl.EggPlant;
import tn.iit.glid.ingeredients.impl.Garlic;
import tn.iit.glid.ingeredients.impl.MarinaraSauce;
import tn.iit.glid.ingeredients.impl.Onion;
import tn.iit.glid.ingeredients.impl.Parmesan;
import tn.iit.glid.ingeredients.impl.ThinDough;

public class SfaxPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new Parmesan();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new EggPlant() };
		return veggies;
	}

	public Clam createClam() {
		return new Clovis();
	}

}
