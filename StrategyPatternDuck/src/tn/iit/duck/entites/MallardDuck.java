package tn.iit.duck.entites;

import tn.iit.duck.behavior.FlyWithWings;
import tn.iit.duck.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("MallardDuck !");
	}

}
