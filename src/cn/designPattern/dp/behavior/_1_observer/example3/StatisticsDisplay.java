package cn.designPattern.dp.behavior._1_observer.example3;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this + " o = " + o + ", arg = " + arg);
    }

}
