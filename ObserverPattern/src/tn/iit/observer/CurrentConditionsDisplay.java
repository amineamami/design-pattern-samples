package tn.iit.observer;

public class CurrentConditionsDisplay implements Observer {

	
	

	@Override
	public void display() {
		System.out.println(CurrentConditionsDisplay.class+" is an observer");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("CurrentConditionsDisplay updated");
		
	}
	

	

}
