package tn.iit.glid.entity;

import tn.iit.glid.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientfactory;

	public ClamPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory= ingredientfactory;
		System.out.println("ClamPizza");
	}
	@Override
	public void prepare() {

	}

}
