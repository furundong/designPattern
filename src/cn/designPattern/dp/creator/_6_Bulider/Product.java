package cn.designPattern.dp.creator._6_Bulider;

/*
通常是实现了模板方法模式，也就是有模板方法和基本方法。
就是说你要的产品要那些，比如我要高配的电脑，中配的电脑。
然后里面有cpu，gpu，memery,SSD，此时，都要设置把。然么就可以设置一个建造者，去实现建造者的接口，每个电脑属性都要设置，不然会报错。
 */
public class Product {
    public void doSomething(){
//独立业务处理
    }
}
