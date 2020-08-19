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

class currentConditionsDisplay{
    public void update(String temperature,String humidity,String pressure){
        System.out.println("temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
    }
}
class statisticsDisplay{
    public void update(String temperature,String humidity,String pressure){
        System.out.println("temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
    }
}
class forecastDisplay{
    public void update(String temperature,String humidity,String pressure){
        System.out.println("temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
    }
}
