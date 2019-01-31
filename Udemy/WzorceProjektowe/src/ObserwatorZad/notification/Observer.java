package ObserwatorZad.notification;

import ObserwatorZad.weather.Weather;

public interface Observer {

    void updateForecast(Weather weather);
}
