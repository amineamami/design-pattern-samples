package tn.iit.glid.decorators;

import tn.iit.glid.entity.Beverage;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(200, "Milk", beverage);
	}


}
