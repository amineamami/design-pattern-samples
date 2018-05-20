package tn.iit.glid.factory;

import tn.iit.glid.ingeredients.Cheese;
import tn.iit.glid.ingeredients.Clam;
import tn.iit.glid.ingeredients.Dough;
import tn.iit.glid.ingeredients.Sauce;
import tn.iit.glid.ingeredients.impl.Mozzarella;
import tn.iit.glid.ingeredients.impl.Palourde;
import tn.iit.glid.ingeredients.impl.PlumTomatoSauce;

public class TunisianPizzaIngredientFactory implements PizzaIngredientFactory {

	public TunisianPizzaIngredientFactory() {
		System.out.println("TunisianPizzaIngredient");
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();
	}

	@Override
	public Clam createClam() {
		return new Palourde();
	}

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}

}
