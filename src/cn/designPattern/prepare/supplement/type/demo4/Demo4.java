package cn.designPattern.prepare.supplement.type.demo4;

/**
 * create by Freedom on 2021/1/28
 * ʹ��extendsͨ���
 */
public class Demo4 {
    public static void main2(String[] args) {
        int sum = PairHelper.add(new Pair<>(1, 2));
        //ע�⣺�����������Pair<Number>��ʵ�ʲ���������(Integer, Integer)��
        System.out.println("sum = " + sum);
        //������û�������.
    }

    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(123, 456);
        int n = PairHelper.add(p);   //���û��ʹ��extends �̳�number, ����ֱ������
        System.out.println(n);
    }

    //super��extends��� , �����෴,�÷����� . �Ͳ���չ��

}

