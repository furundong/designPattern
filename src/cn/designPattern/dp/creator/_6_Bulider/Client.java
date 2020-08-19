package cn.designPattern.dp.creator._6_Bulider;

/*
由于这个模式比较简单，而且用的比较少。就不写那么详细了。
从Product -> Builder -> ConcreteProduct -> Director
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteProduct());
        Product aProduct = director.getAProduct();
        aProduct.doSomething();
    }
}
/*
    创建型的大概就这些了。
 */