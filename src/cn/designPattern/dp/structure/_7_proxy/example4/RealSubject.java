package cn.designPattern.dp.structure._7_proxy.example4;

public class RealSubject implements Subject{
    @Override
    public void doSomething(String str) {
        System.out.println("RealSubject.doSomething str = " + str);
    }
}
