package ObserwatorZad.notification;

import ObserwatorZad.weather.Weather;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(Weather weather) {
        System.out.println("RadioNews: Pogoda jest"+weather.getWeatherStatus()+"Cisnienie wynosi:" + weather.getPressure()+
                " Temperatura wynosi " + weather.getTemperature());
    }
}
