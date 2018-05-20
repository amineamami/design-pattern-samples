package tn.iit.glid.entity;

public abstract class Beverage {

	protected String description;
	protected double price;
	
	public Beverage(double price,String description) {
		this.price = price;
		this.description=description;
	}

	public double cost() {
		return price;
	}
	
	public String getDescription() {
		return description;
	}
	

}
