package cn.designPattern.dp.behavior._1_observer.example2;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private String temperature;
    private String humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature = " + temperature + " humidity = " + humidity);
    }

    @Override
    public void update(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
