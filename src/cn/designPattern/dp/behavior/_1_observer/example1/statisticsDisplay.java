package cn.designPattern.dp.behavior._1_observer.example1;

/**
 * create by Freedom on 2021/3/2
 */
class statisticsDisplay{
    public void update(String temperature,String humidity,String pressure){
        System.out.println("temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
    }
}
