package cn.designPattern.dp.behavior._1_observer.example2;

class forecastDisplay {
    public void update(String temperature, String humidity, String pressure) {
        System.out.println("temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
    }
}
