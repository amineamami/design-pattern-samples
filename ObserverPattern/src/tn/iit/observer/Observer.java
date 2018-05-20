package tn.iit.observer;

public interface Observer {

	void update(float temperature, float humidity, float pressure);

	void display();
}
