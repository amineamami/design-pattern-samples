 package tn.iit.glid.main;

import tn.iit.glid.decorators.Milk;
import tn.iit.glid.decorators.Mint;
import tn.iit.glid.entity.Beverage;
import tn.iit.glid.entity.Tea;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		Beverage tea = new Tea();
		System.out.println(tea);
		tea = new Mint(tea);
		tea = new Milk(tea);
		
		System.out.println(tea.cost()+" "+tea.getDescription());

	
	}

}
