package tn.iit.glid.factory;

import tn.iit.glid.ingeredients.Cheese;
import tn.iit.glid.ingeredients.Clam;
import tn.iit.glid.ingeredients.Dough;
import tn.iit.glid.ingeredients.Sauce;

public interface PizzaIngredientFactory {

	Sauce createSauce();

	Cheese createCheese();

	Clam createClam();

	Dough createDough();
	
}
