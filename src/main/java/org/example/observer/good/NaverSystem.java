package org.example.observer.good;

import java.util.List;

class NaverSystem {
    private final List<NaverWeatherService> weatherServices;

    public NaverSystem(List<NaverWeatherService> weatherServices) {
        this.weatherServices = weatherServices;
    }

    public void refreshWeather() {
        weatherServices.forEach(weatherService -> weatherService.refreshWeather(WeatherStation.currentTemperature()));
    }

}
