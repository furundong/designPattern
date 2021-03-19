package cn.designPattern.dp.creator._6_Bulider.demo2;

/**
 * create by Freedom on 2021/2/4
 */
public class Director {

    public Director() {
    }

    public Computer build(ComputerBuilder computerBuilder) {
        computerBuilder.setCpu();
        computerBuilder.setGpu();
        computerBuilder.setMemory();
        computerBuilder.setHd();
        return computerBuilder.build();
    }
}
