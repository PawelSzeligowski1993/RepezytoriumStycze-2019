package ObserwatorZad.weather;

import ObserwatorZad.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Weather implements Observable{

    private int temperature;
    private int pressure;
    private WeatherStatus weatherStatus;

    Set<Observer> registeredObservers = new HashSet<>();

    public Weather(int temperature, int pressure, WeatherStatus weatherStatus) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.weatherStatus = weatherStatus;
    }

    @Override
    public void registerObserver(Observer observer) { registeredObservers.add(observer);

    }

    @Override
    public void unregisterObserver(Observer observer) { registeredObservers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers){
            observer.updateForecast(this);

        }

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public WeatherStatus getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(WeatherStatus weatherStatus) {
        this.weatherStatus = weatherStatus;
    }
}
