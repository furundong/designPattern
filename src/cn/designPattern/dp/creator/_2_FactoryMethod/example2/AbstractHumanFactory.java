package cn.designPattern.dp.creator._2_FactoryMethod.example2;


/**
 * 注意，我们在这里采用了泛型（Generic），通过定义泛型对createHuman的输入参数产
 * 生两层限制：
 * ● 必须是Class类型；
 * ● 必须是Human的实现类。
 * 其中的"T"表示的是，只要实现了Human接口的类都可以作为参数，泛型是JDK 1.5中的
 * 一个非常重要的新特性，它减少了对象间的转换，约束其输入参数类型，对Collection集合下
 * 的实现类都可以定义泛型。有关泛型的详细知识，请参考相关的Java语法文档。
 * <p>
 * 注意：设计模式种抽象类跟接口是一样的概念
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);  //T 只能写继承过Human的子类
}
