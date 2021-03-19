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


//=================��ʼ��չ, �ҿ�ʼ����Ϸ��, ����Ҫ�߶˵���,�Ͷ˵ľ���=================
class LowComputerBuilder implements ComputerBuilder {

    private Computer computer = new Computer(); //������Ǹ����������һ���ĵط�, ���濪ʼ�������

    @Override
    public void setCpu() {
        computer.setCpu("�Ͷ�cpu");
    }

    @Override
    public void setGpu() {
        computer.setGpu("�Ͷ�gpu");
    }

    @Override
    public void setMemory() {
        computer.setMemory("�Ͷ�memory");
    }

    @Override
    public void setHd() {
        computer.setHd("�Ͷ�hd");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
