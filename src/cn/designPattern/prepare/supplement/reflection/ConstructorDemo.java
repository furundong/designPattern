package cn.designPattern.prepare.supplement.reflection;

import java.lang.reflect.Constructor;

/**
 * create by Freedom on 2021/2/1
 * <p>
 * getConstructor(Class...)：获取某个public的Constructor；
 * getDeclaredConstructor(Class...)：获取某个Constructor；
 * getConstructors()：获取所有public的Constructor；
 * getDeclaredConstructors()：获取所有Constructor。
 */
public class ConstructorDemo {
    public static void main(String[] args) throws Exception {
        // 获取构造方法Integer(int):
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // 调用构造方法:
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);

        // 获取构造方法Integer(String)
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);
    }
}
