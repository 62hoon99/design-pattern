package org.example.observer.bad;

public class NaverSystem {

    private final NaverHome naverHome;
    private final NaverCafe naverCafe;
    private final NaverBlog naverBlog;

    public NaverSystem(NaverHome naverHome, NaverCafe naverCafe, NaverBlog naverBlog) {
        this.naverHome = naverHome;
        this.naverCafe = naverCafe;
        this.naverBlog = naverBlog;
    }

    public void refreshWeather() {
        int temperature = WeatherStation.currentTemperature();

        naverBlog.refreshWeather(temperature);
        naverCafe.refreshWeather(temperature);
        naverHome.refreshWeather(temperature);
    }
}
