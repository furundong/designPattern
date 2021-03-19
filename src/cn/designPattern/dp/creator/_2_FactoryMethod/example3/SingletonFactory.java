package cn.designPattern.dp.creator._2_FactoryMethod.example3;


import java.lang.reflect.Constructor;

/*
    通过反射方式创建
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class<?> aClass = Class.forName(Singleton.class.getName());//加载驱动，自动初始化。 简单工厂里面说过了。
            //得到无参构造  ， 反射就是这么无理
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
