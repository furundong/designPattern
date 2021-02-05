package cn.designPattern.prepare.supplement.reflection.MethodDemo;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * create by Freedom on 2021/2/1
 * Method getMethod(name, Class...)：获取某个public的Method（包括父类）
 * Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
 * Method[] getMethods()：获取所有public的Method（包括父类）
 * Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
 */
public class MethodDemo {
    public static void main2(String[] args) throws NoSuchMethodException {
        //getName()：返回方法名称，例如，"name"；
//        getReturnType()：返回方法返回值类型，也是一个Class实例，例如：String.class；
//        getParameterTypes()：返回方法的参数类型，是一个Class数组，例如：{String.class, int.class}；
//        getModifiers()：返回方法的修饰符，它是一个int，不同的bit表示不同的含义。

        Class<Student> studentClass = Student.class;
        Method getScore = studentClass.getDeclaredMethod("getScore", String.class);
        System.out.println(getScore.getName());
        System.out.println(Arrays.toString(getScore.getParameterTypes()));
        System.out.println(getScore.getReturnType());
        System.out.println(getScore.getModifiers());
    }

    public static void main(String[] args) throws Exception {
        Student student = new Student();
        //调用方法
        Class<Student> studentClass = Student.class;
        Method getScore = studentClass.getDeclaredMethod("getScore", String.class);
        //如果这里是static, 那么第一个参数填null就可以了. 当然你了你填具体对象也行.随你
        //如果方法是private的, 那么你在这里需要设置一下可见
        Object invoke = getScore.invoke(student, "1");
        //返回值就是该方法的返回值,返回void就是null
        System.out.println(invoke);
    }
}

