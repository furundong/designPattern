package cn.designPattern.dp.creator._6_Bulider.demo1;

/**
 * ʵ�ֳ����ඨ������з��������ҷ���һ���齨�õĶ���
 *
 * ��������һ��������ࡣ ����������࣡����
 * Ȼ��builderȥ������Щ������ࡣ
 *
 * director�õ���Щ��
 */
public class ConcreteProduct extends Builder {
    private final Product product = new Product();
    //���ò�Ʒ���
    public void setPart(){
        /*
         * ��Ʒ���ڵ��߼�����, ��product���úá���󷵻ء����Ĵ���
         *
         */
        product.doSomething();
    }
    //�齨һ����Ʒ
    public Product buildProduct() {
        return product;
    }
}
