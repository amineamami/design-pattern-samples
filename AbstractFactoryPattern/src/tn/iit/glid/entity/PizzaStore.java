package tn.iit.glid.entity;

import tn.iit.glid.factory.PizzaIngredientFactory;

public class PizzaStore {

	private PizzaIngredientFactory ingredientFactory;

	public PizzaStore(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public Pizza createPizza(String item) {
		Pizza pizza = null;
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Sfax Style Cheese Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Sfax Style Pepperoni Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Sfax Style Clam Pizza");
		}
		return pizza;
	}
	
	public Pizza orderPizza(String item) {
		Pizza pizza = null;
		pizza = createPizza(item);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
