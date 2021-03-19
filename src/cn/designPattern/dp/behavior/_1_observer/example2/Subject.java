package cn.designPattern.dp.behavior._1_observer.example2;


public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
