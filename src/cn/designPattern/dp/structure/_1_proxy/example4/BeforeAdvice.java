package cn.designPattern.dp.structure._1_proxy.example4;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("����ǰ��֪ͨ���ұ�ִ���ˣ�");
    }
}
