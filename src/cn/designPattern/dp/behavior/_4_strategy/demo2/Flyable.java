package cn.designPattern.dp.behavior._4_strategy.demo2;

public interface Flyable {
    default void fly(){
        System.out.println("Ѽ���ܷ���");
    }
}
