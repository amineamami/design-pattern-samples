package tn.iit.duck.entites;

import tn.iit.duck.behavior.FlyBehavior;
import tn.iit.duck.behavior.QuackBehavior;

public abstract class Duck {

	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;

	public abstract void display();
	
	public void swim() {
		System.out.println("Swimming !");
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void eat() {
		
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
