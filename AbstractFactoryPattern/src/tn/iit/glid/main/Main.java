package tn.iit.glid.main;

import tn.iit.glid.entity.PizzaStore;
import tn.iit.glid.factory.PizzaIngredientFactory;
import tn.iit.glid.factory.SfaxPizzaIngredientFactory;

public class Main {
	
	public static void main(String[] args) {
		
		PizzaIngredientFactory pizzaIngredientFactory = new SfaxPizzaIngredientFactory();
		PizzaStore pizzaStore = new PizzaStore(pizzaIngredientFactory);
		pizzaStore.orderPizza("cheese");
		
	}

}
