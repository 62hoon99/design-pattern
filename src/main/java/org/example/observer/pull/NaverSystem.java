package org.example.observer.pull;

import java.util.List;

class NaverSystem implements WeatherSubject {
    private final List<NaverWeatherService> weatherServices;
    private static final String SECRET_KEY = "key";

    public NaverSystem(List<NaverWeatherService> weatherServices) {
        this.weatherServices = weatherServices;
    }

    public void refreshWeather() {
        weatherServices.forEach(NaverWeatherService::refreshWeather);
    }

    @Override
    public int getTemperature() {
        return WeatherStation.currentTemperature(SECRET_KEY);
    }

    @Override
    public int getHumidity() {
        return WeatherStation.currentHumidity(SECRET_KEY);
    }

}
