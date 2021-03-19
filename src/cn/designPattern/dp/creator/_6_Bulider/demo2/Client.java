package cn.designPattern.dp.creator._6_Bulider.demo2;

/**
 * create by Freedom on 2021/2/4
 */
public class Client {
    public static void main(String[] args) {
        ComputerBuilder highComputerBuilder = new HighComputerBuilder();

        Director director = new Director();
        System.out.println(director.build(highComputerBuilder));


        LowComputerBuilder lowComputerBuilder = new LowComputerBuilder();
        System.out.println(director.build(lowComputerBuilder));


    }
}


//=================开始扩展, 我开始戒游戏了, 不想要高端电脑,低端的就行=================
class LowComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer(); //这里就是跟工厂方法最不一样的地方, 下面开始建造对象

    @Override
    public void setCpu() {
        computer.setCpu("低端cpu");
    }

    @Override
    public void setGpu() {
        computer.setGpu("低端gpu");
    }

    @Override
    public void setMemory() {
        computer.setMemory("低端memory");
    }

    @Override
    public void setHd() {
        computer.setHd("低端hd");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
