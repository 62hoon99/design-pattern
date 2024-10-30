package org.example.observer.pull;

class NaverBlog implements NaverWeatherService {
    private String weather;
    private WeatherSubject weatherSubject;

    public NaverBlog(String weather) {
        this.weather = weather;
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
