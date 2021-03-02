package cn.designPattern.dp.behavior._1_observer.example1;

public class WeatherData {

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    private String temperature;
    private String humidity;
    private String pressure;


    //实例变量声明
    public void measurementsChanged(){
        String temperature = getTemperature();
        String humidity = getHumidity();
        String pressure = getPressure();
    }

}

