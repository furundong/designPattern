package cn.designPattern.dp.creator._6_Bulider;

/*
�������ģʽ�Ƚϼ򵥣������õıȽ��١��Ͳ�д��ô��ϸ�ˡ�
��Product -> Builder -> ConcreteProduct -> Director
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteProduct());
        Product aProduct = director.getAProduct();
        aProduct.doSomething();
    }
}
/*
    �����͵Ĵ�ž���Щ�ˡ�
 */