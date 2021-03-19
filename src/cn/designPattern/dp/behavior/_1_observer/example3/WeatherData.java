package cn.designPattern.dp.behavior._1_observer.example3;

import java.util.Observable;

//使用java内置的观察者模式
//这是具体的订阅者
public class WeatherData extends Observable {

    private String temperature;
    private String humidity;
    private String pressure;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        this.notifyObservers(temperature);
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
        this.setChanged();
        this.notifyObservers(humidity);
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
        setChanged();
        this.notifyObservers(getPressure());
    }
}
