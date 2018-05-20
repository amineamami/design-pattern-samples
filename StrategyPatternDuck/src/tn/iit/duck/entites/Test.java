package tn.iit.duck.entites;

import tn.iit.duck.behavior.FlyRocketPowered;

public class Test {

	public static void main(String[] args) {

		MallardDuck mallardDuck = new MallardDuck();
		WoodenDuck woodenDuck = new WoodenDuck();

		mallardDuck.performFly();
		mallardDuck.setFlyBehavior(new FlyRocketPowered());
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		woodenDuck.performFly();
		woodenDuck.performQuack();
		woodenDuck.swim();

	}

}
