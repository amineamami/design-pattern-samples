package tn.iit.subject;

import java.util.ArrayList;
import java.util.List;

import tn.iit.observer.Observer;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(float temperature, float humidity, float pressure) {
		observers = new ArrayList<>();
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	@Override
	public synchronized void registerObserver(Observer observer) {
		if (observers.contains(observer)) {
			return;
		} else {
			observers.add(observer);
		}
	}

	@Override
	public synchronized void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		observers.forEach(observer -> observer.update(temperature, humidity, pressure));
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
