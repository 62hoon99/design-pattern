package org.example.observer.pull;

class WeatherStation {

    private static int temperature;
    private static int humidity;

    private void measureTemperature() {
        // 1분 단위로 현재 온도를 측정해서 temperature 변수에 온도를 set 한다.
    }

    private void measureHumidity() {
        // 1분 단위로 현재 온도를 측정해서 humidity 변수에 온도를 set 한다.
    }

    public static int currentTemperature(String pwd) {
        // 등록된 패스워드를 가진 클라이언트만 접근 가능하다.
        return temperature;
    }

    public static int currentHumidity(String pwd) {
        // 등록된 패스워드를 가진 클라이언트만 접근 가능하다.
        return humidity;
    }
}
