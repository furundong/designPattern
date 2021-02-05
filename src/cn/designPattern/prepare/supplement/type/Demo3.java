package cn.designPattern.prepare.supplement.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * create by Freedom on 2021/1/28
 */
public class Demo3 {
    public static void main(String[] args) {
//�ڼ̳��˷������͵�����£�������Ի�ȡ����ķ������͡����磺IntPair���Ի�ȡ������ķ�������Integer����ȡ����ķ������ʹ���Ƚϸ��ӣ�
        Class<B> clazz = B.class;
        Type t = clazz.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            Type[] types = pt.getActualTypeArguments(); // �����ж����������
            Type firstType = types[0]; // ȡ��һ����������
//            System.out.println("firstType = " + firstType);
            Class<?> typeClass = (Class<?>) firstType;
            System.out.println(typeClass); // Integer
        }

    }
}


class A<T> {
    public A(T s) {
    }
}

class B extends A<Integer> {
    public B(Integer s) {
        super(s);
    }

    //�����ò��˳���integer����������,��Ϊ�̳е�ʱ���Ѿ���������
//    public B(String s) {
//        super(s);
//    }

    public  void test() {
        B f = new B(11);
    }
}
