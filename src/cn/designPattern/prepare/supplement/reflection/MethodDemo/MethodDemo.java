package cn.designPattern.prepare.supplement.reflection.MethodDemo;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * create by Freedom on 2021/2/1
 * Method getMethod(name, Class...)����ȡĳ��public��Method���������ࣩ
 * Method getDeclaredMethod(name, Class...)����ȡ��ǰ���ĳ��Method�����������ࣩ
 * Method[] getMethods()����ȡ����public��Method���������ࣩ
 * Method[] getDeclaredMethods()����ȡ��ǰ�������Method�����������ࣩ
 */
public class MethodDemo {
    public static void main2(String[] args) throws NoSuchMethodException {
        //getName()�����ط������ƣ����磬"name"��
//        getReturnType()�����ط�������ֵ���ͣ�Ҳ��һ��Classʵ�������磺String.class��
//        getParameterTypes()�����ط����Ĳ������ͣ���һ��Class���飬���磺{String.class, int.class}��
//        getModifiers()�����ط��������η�������һ��int����ͬ��bit��ʾ��ͬ�ĺ��塣

        Class<Student> studentClass = Student.class;
        Method getScore = studentClass.getDeclaredMethod("getScore", String.class);
        System.out.println(getScore.getName());
        System.out.println(Arrays.toString(getScore.getParameterTypes()));
        System.out.println(getScore.getReturnType());
        System.out.println(getScore.getModifiers());
    }

    public static void main(String[] args) throws Exception {
        Student student = new Student();
        //���÷���
        Class<Student> studentClass = Student.class;
        Method getScore = studentClass.getDeclaredMethod("getScore", String.class);
        //���������static, ��ô��һ��������null�Ϳ�����. ��Ȼ��������������Ҳ��.����
        //���������private��, ��ô����������Ҫ����һ�¿ɼ�
        Object invoke = getScore.invoke(student, "1");
        //����ֵ���Ǹ÷����ķ���ֵ,����void����null
        System.out.println(invoke);
    }
}

