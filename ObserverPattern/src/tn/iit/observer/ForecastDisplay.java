package tn.iit.observer;


public class ForecastDisplay implements  Observer {

	

	@Override
	public void display() {
		System.out.println(ForecastDisplay.class+" is an observer");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("ForecastDisplay updated");
	
	}

}
