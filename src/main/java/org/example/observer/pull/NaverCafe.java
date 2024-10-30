package org.example.observer.pull;

class NaverCafe implements NaverWeatherService {
    private WeatherSubject weatherSubject;
    private String weather;

    public NaverCafe(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
    }

    @Override
    public void refreshWeather() {
        this.weather = "현재 온도는 " + weatherSubject.getTemperature() + "도 입니다.";
    }

    @Override
    public void printWeather() {
        System.out.println(weather);
    }

}
