package cn.designPattern.dp.creator._6_Bulider.demo2;

/**
 * create by Freedom on 2021/2/4
 * <p>
 * ����ӿ�, ���Խ�����, ���ǽ�����Ľ�������ȶ�����,
 */
public interface ComputerBuilder {
    void setCpu();

    void setGpu();

    void setMemory();

    void setHd();

    Computer build();
}
