package cn.designPattern.dp.creator._2_FactoryMethod.example4;

/**
 * ��Ϊ�ӳٳ�ʼ����Lazy initialization����һ������������Ϻ󣬲��������ͷţ�������
 * �������ʼ״̬���ȴ��ٴα�ʹ�á��ӳٳ�ʼ���ǹ�������ģʽ��һ����չӦ�ã�
 * <p>
 * ��������Ӧ�÷���һ�������У������ǲ��Ǹ�springԽ��Խ�ӽ��ˣ�example3���滹�е��������������ż�
 * ����͸���example1��������������һ��̫�����ģʽ���κ�����������������д���������������������Ρ� �ã���Ȼ��˵�������ˣ�������ô������û˵��
 * �Ͷ�һ��map�ܼ򵥵ġ�
 * <p>
 * ע�⣺���ﲻ�ǹ��������ˡ�
 */
public class Client {
    public static void main(String[] args) {
        Food product = FoodFactory.createProduct("1");  //�����ǿ�����������
        product.eat();
    }
}
