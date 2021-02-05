package cn.designPattern.prepare.supplement.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * create by Freedom on 2021/1/28
 */
public class Demo3 {
    public static void main(String[] args) {
//在继承了泛型类型的情况下，子类可以获取父类的泛型类型。例如：IntPair可以获取到父类的泛型类型Integer。获取父类的泛型类型代码比较复杂：
        Class<B> clazz = B.class;
        Type t = clazz.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            Type[] types = pt.getActualTypeArguments(); // 可能有多个泛型类型
            Type firstType = types[0]; // 取第一个泛型类型
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

    //这里用不了除了integer其他的类型,因为继承的时候已经限制死了
//    public B(String s) {
//        super(s);
//    }

    public  void test() {
        B f = new B(11);
    }
}
