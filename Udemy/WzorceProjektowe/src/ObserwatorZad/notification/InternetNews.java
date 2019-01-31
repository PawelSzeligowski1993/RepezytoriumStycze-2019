package ObserwatorZad.notification;

import ObserwatorZad.weather.Weather;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(Weather weather) {
        System.out.println("InternetNews: Pogoda jest"+weather.getWeatherStatus()+"Cisnienie wynosi:" + weather.getPressure()+
                " Temperatura wynosi " + weather.getTemperature());

    }
}
