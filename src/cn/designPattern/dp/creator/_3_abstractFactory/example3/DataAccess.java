package cn.designPattern.dp.creator._3_abstractFactory.example3;

import java.lang.reflect.Constructor;

public class DataAccess {

    public static UserDao createUser(){
//        String absolutePath = new File(".").getAbsolutePath();  //c: 到你项目路径下
//        InputStream resourceAsStream = DataAccess.class.getResourceAsStream("application.properties"); //不包括src的目录下
        try {
            //这个就不写读取application的方法，我突然间发现要处理数据。就自己写。 就是告诉一个概念。
            Class<?> aClass = Class.forName("cn.designPattern.dp.creator._3_abstractFactory.example3.MysqlUser");
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            return (UserDao) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
