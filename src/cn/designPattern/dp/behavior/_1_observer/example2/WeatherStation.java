package cn.designPattern.dp.behavior._1_observer.example2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        new statisticsDisplay(weatherData);
//        new forecastDisplay(weatherData);
        weatherData.setMeasurementChanged("36", "60", "30.4f");
        weatherData.setMeasurementChanged("37", "70", "40 .4f");
    }
}
