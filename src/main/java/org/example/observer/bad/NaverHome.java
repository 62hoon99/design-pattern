package org.example.observer.bad;

class NaverHome {
    private String weather;

    public void refreshWeather(int temperature) {
        this.weather = "현재 온도는 " + temperature + "도 입니다.";
    }

    public void printWeather() {
        System.out.println(weather);
    }
}
