package tn.iit.duck.behavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("cancane pas !");
	}

}
