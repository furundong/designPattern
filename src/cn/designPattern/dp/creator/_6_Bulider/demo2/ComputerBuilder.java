package cn.designPattern.dp.creator._6_Bulider.demo2;

/**
 * create by Freedom on 2021/2/4
 * <p>
 * 这个接口, 电脑建造类, 就是将对象的建造过程稳定下来,
 */
public interface ComputerBuilder {
    void setCpu();

    void setGpu();

    void setMemory();

    void setHd();

    Computer build();
}
