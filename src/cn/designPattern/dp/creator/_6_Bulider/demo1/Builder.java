package cn.designPattern.dp.creator._6_Bulider.demo1;

/**
 * 规范产品的组建，一般是由子类实现。
 */
public abstract class Builder {
    //设置产品的不同部分，以获得不同的产品
    public abstract void setPart();

    //建造产品
    public abstract Product buildProduct();  //这里把产建造好，准备返回。  其实这里的产品应该再抽象一把，往上提升。适应所有的。
}
