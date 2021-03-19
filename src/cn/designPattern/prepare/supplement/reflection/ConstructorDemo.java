package cn.designPattern.prepare.supplement.reflection;

import java.lang.reflect.Constructor;

/**
 * create by Freedom on 2021/2/1
 * <p>
 * getConstructor(Class...)����ȡĳ��public��Constructor��
 * getDeclaredConstructor(Class...)����ȡĳ��Constructor��
 * getConstructors()����ȡ����public��Constructor��
 * getDeclaredConstructors()����ȡ����Constructor��
 */
public class ConstructorDemo {
    public static void main(String[] args) throws Exception {
        // ��ȡ���췽��Integer(int):
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // ���ù��췽��:
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);

        // ��ȡ���췽��Integer(String)
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);
    }
}
