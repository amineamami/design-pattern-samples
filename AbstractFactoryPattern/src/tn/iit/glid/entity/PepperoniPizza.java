package tn.iit.glid.entity;

import tn.iit.glid.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientfactory;

	public PepperoniPizza(	PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
		System.out.println("PepperoniPizza");
	}
	@Override
	public void prepare() {

	}
	
	

}
