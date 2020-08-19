package cn.designPattern.dp.behavior._1_observer.example3;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        StatisticsDisplay statisticsDisplay2 = new StatisticsDisplay();
        weatherData.addObserver(statisticsDisplay);
        weatherData.addObserver(statisticsDisplay2);

        weatherData.setHumidity("set humidity to 40");
        weatherData.setHumidity("set humidity to 50");
    }
}
