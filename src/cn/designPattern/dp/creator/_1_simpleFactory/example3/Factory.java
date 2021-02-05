package cn.designPattern.dp.creator._1_simpleFactory.example3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 工厂类，用来创建对象
 */
public class Factory {
    public static Food getFood() throws IllegalAccessException, InstantiationException {
        Properties properties = new Properties();
        InputStream in = Factory.class.getResourceAsStream("application.properties");
        //        System.out.println(new File(".").getAbsolutePath()); 就是你当前的项目位置
        //这里我们并没有指定一个特定的路径给classloader，我们只是将文件名直接传给了它。
        // 如果我们将.properties文件和class文件放在同一个目录下，结果运行正常。如果我们将properties放到其他地方则会碰到null异常
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in!=null)
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Food food = null;
        Class<?> bean = null;
        try {
            bean = Class.forName(properties.getProperty("bean")); // 加载类并创建，默认是true
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        food = (Food) (bean != null ? bean.newInstance() : null);
        return food;
    }
}

/*
读取properties文件：

    通过 ResourceBundle.getBundle() 静态方法来获取（ResourceBundle是一个抽象类），这种方式来获取properties属性文件不需要加.properties后缀名，只需要文件名即可

1 　　 properties.getProperty(String key);
2     //config为属性文件名，放在包com.test.config下，如果是放在src下，直接用config即可
3     ResourceBundle resource = ResourceBundle.getBundle("com/test/config/config");  注意了，它不需要写后缀名
4     String key = resource.getString("keyWord");

区别：
一般来说，ResourceBundle类通常是用于针对不同的语言来使用的属性文件。
而如果你的应用程序中的属性文件只是一些配置，并不是针对多国语言的目的。那么使用Properties类就可以了。
 */

/*
    类加载方式：
       1. new Food() 直接第一次就加载
       2. 通过Class.forName()来加载类，然后调用类的newInstance()方法实例化对象。
            Class.forName(className,true,this.getClass.getClassLoader)，
            第二个参数表示加载完后是否立即初始化，
            第三个参数即前文提到的表示是当前类加载器。
       3. classLoader.loadClass()实际调用的是classLoader.loadClass(className,false)，第二个参数表示加载完成后是否连接，即用此方法加载类，加载完成后不会去初始化，
        用Class.forName()加载类加载完成后可以被初始化。你如果用实例化jdbc的Driver这种方式，就会报null异常

    对象加载方式：
        1. 反射。
        2. new()
        3. Cloneable接口，
        4. 序列化跟反序列化。  有一个深克隆跟浅克隆，后面原型模式会讲到，再写下去没完没了了。

普及一下，我是从百度copy来的
1.类加载过程
　　首先，jvm在执行时，遇到一个新的类时，会到内存中的方法区去找class文件，如果找到就直接拿来用，
如果没有找到，就会到硬盘中去找到这个class文件，将类文件加载到方法区，在类加载时，静态成员变量加载
到方法区的静态区域，非静态成员变量加载到方法区的非静态区域，加载静态成员变量的时候，会根据书写的顺序，
将所有的静态成员变量加载到静态方法区，然后给所有的静态成员变量赋默认值，赋默认值后，会根据静态成员
变量书写的位置，给静态成员变量赋显示值，和执行静态代码。当执行完所有的静态代码块时，类才算加载完成。

    类加载过程：
    1.JVM会先去方法区中找有没有相应类的.class存在。如果有，就直接使用；如果没有，则把相关类的.class加载到方法区。
    2.在.class加载到方法区时，会分为两部分加载：先加载非静态内容，在加载静态内容。
    3.在加载非静态内容：把.class中的所有非静态内容加载到方法区下的非静态区域内
    4.加载静态内容：
       4.1把.class中所有静态内容加载到方法区下的静态区域内。
       4.2静态内容加载完成之后，对所有的静态变量进行默认初始化。
       4.3所有的静态变量默认初始化完成之后，再进行显示初始化。
       4.4当静态区域下的所有静态变量显示初始化完后，执行静态代码块。
    5.当静态区域下的静态代码块，执行完之后，整个类的加载就完成了。

2.对象创建过程：
    1.在堆内存中开辟一块空间。
    2.给开辟空间分配一个地址。
    3.把对象的所有非静态成员加载到所开辟的空间下。
    4.所有的非静态成员加载完成之后，对所有非静态成员变量进行默认初始化。
    5.所有非静态成员变量默认初始化完成之后，调用构造函数。
    6.在构造函数入栈执行时，分为两部分：先执行构造函数中的隐式三步，在执行构造函数中书写的代码。
       6.1隐式三步：
    　　1.执行super语句
    　　2.对开辟空间下的所有非静态成员变量进行显示初始化
    　　3.执行构造代码块
    　6.2在隐式三步执行完之后，执行构造函数中书写的代码
    7.在整个构造函数执行完并弹栈后，把空间分配的地址赋值给一个引用对象
 */
