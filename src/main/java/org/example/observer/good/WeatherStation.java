package org.example.observer.good;

class WeatherStation {

    private static int temperature;

    private void measureTemperature() {
        // 1분 단위로 현재 온도를 측정해서 tempature 변수에 온도를 set 한다.
    }

    public static int currentTemperature() {
        return temperature;
    }
}
