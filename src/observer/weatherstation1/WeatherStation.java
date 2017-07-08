package observer.weatherstation1;

import observer.weatherstation.CurrentConditionsDisplay;
import observer.weatherstation.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        observer.weatherstation.WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
