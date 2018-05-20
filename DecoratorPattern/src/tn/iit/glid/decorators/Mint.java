package tn.iit.glid.decorators;

import tn.iit.glid.entity.Beverage;

public class Mint extends CondimentDecorator {

	public Mint(Beverage beverage) {
		super(300, "Mint", beverage);
	}

}
