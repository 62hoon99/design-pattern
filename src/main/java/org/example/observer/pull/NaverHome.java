package org.example.observer.pull;

class NaverHome implements NaverWeatherService {
    private WeatherSubject weatherSubject;
    private String weather;

    public NaverHome(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
    }

    @Override
    public void refreshWeather() {
        this.weather = "현재 온도는 " + weatherSubject.getTemperature() + "도 입니다." + "\n"
        + "현재 습도는 " + weatherSubject.getHumidity() + "% 입니다.";
    }

    @Override
    public void printWeather() {
        System.out.println(weather);
    }
}
