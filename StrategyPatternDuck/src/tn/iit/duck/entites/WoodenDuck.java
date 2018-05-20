package tn.iit.duck.entites;

import tn.iit.duck.behavior.FlyNoWay;
import tn.iit.duck.behavior.MuteQuack;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("WoodenDuck !");
	}

}
