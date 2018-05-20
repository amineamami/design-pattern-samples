package tn.iit.observer;

public class StatisticsDisplay implements Observer {

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("StatisticsDisplay updated");
	}

	@Override
	public void display() {
		System.out.println(StatisticsDisplay.class + " is an observer");

	}

}
