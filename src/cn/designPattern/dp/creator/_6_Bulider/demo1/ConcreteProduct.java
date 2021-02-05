package cn.designPattern.dp.creator._6_Bulider.demo1;

/**
 * 实现抽象类定义的所有方法，并且返回一个组建好的对象。
 *
 * 这个类就是一个具体的类。 是你操作的类！！！
 * 然后builder去构建这些具体的类。
 *
 * director得到这些。
 */
public class ConcreteProduct extends Builder {
    private final Product product = new Product();
    //设置产品零件
    public void setPart(){
        /*
         * 产品类内的逻辑处理, 把product设置好。最后返回。核心代码
         *
         */
        product.doSomething();
    }
    //组建一个产品
    public Product buildProduct() {
        return product;
    }
}
