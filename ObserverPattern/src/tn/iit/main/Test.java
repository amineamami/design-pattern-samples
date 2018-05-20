package tn.iit.main;

import tn.iit.observer.CurrentConditionsDisplay;
import tn.iit.observer.ForecastDisplay;
import tn.iit.observer.StatisticsDisplay;
import tn.iit.subject.WeatherData;

public class Test {

	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData(10,50,20);
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		
		weatherData.registerObserver(conditionsDisplay);
		weatherData.registerObserver(statisticsDisplay);
		weatherData.registerObserver(forecastDisplay);
		
		weatherData.notifyObserver();
	}
}
