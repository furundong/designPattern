package cn.designPattern.dp.creator._6_Bulider.demo1;

/*
�������ģʽ�Ƚϼ򵥣������õıȽ��١��Ͳ�д��ô��ϸ�ˡ�
��Product -> Builder -> ConcreteProduct(�����Ĺ���Ӧ�����������) -> Director
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
