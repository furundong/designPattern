package cn.designPattern.dp.creator._6_Bulider.demo2;

/**
 * create by Freedom on 2021/2/4
 */
public class HighComputerBuilder implements ComputerBuilder {

    Computer computer = new Computer();

    @Override
    public void setCpu() {
        computer.setCpu("高端cpu");
    }

    @Override
    public void setGpu() {
        computer.setGpu("高端gpu");
    }

    @Override
    public void setMemory() {
        computer.setMemory("高端memory");
    }

    @Override
    public void setHd() {
        computer.setHd("高端hd");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
