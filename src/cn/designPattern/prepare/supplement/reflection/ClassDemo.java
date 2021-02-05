package cn.designPattern.prepare.supplement.reflection;

/**
 * create by Freedom on 2021/2/1
 */
public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        //三种方式建立Class
        //1. 通过class的静态变量
        Class<String> aClass1 = String.class;

        //2. 实例方法
        String s = "s";
        Class<? extends String> aClass2 = s.getClass();

        // 3. 如果知道一个class的完整类名，可以通过静态方法Class.forName()获取：
        Class cls = Class.forName("java.lang.String");


        //说明string在jvm种只有一份Class实例
        System.out.println(aClass1 == aClass2 && aClass1 == cls && aClass2 == cls);

//        Class里面有很多的方法, 比如你能获取包名, 判断是否是那种type, 具体还是看api把
    }
}
