package org.example.observer.good;

class NaverHome implements NaverWeatherService {
    private String weather;

    @Override
    public void refreshWeather(int temperature) {
        this.weather = "현재 온도는 " + temperature + "도 입니다.";
    }

    @Override
    public void printWeather() {
        System.out.println(weather);
    }
}
