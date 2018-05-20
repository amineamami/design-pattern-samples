package tn.iit.glid.decorators;

import tn.iit.glid.entity.Beverage;

public abstract class CondimentDecorator extends Beverage {

	private Beverage beverage;

	public CondimentDecorator(double price, String description, Beverage beverage) {
		super(price, description);
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return price + beverage.cost();
	}

	@Override
	public String getDescription() {
		return description + "&" + beverage.getDescription();
	}

}
