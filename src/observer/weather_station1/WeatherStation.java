package observer.weather_station1;

import observer.weather_station.CurrentConditionsDisplay;
import observer.weather_station.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        observer.weather_station.WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
