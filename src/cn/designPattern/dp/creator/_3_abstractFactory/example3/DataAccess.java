package cn.designPattern.dp.creator._3_abstractFactory.example3;

import java.lang.reflect.Constructor;

public class DataAccess {

    public static UserDao createUser(){
//        String absolutePath = new File(".").getAbsolutePath();  //c: ������Ŀ·����
//        InputStream resourceAsStream = DataAccess.class.getResourceAsStream("application.properties"); //������src��Ŀ¼��
        try {
            //����Ͳ�д��ȡapplication�ķ�������ͻȻ�䷢��Ҫ�������ݡ����Լ�д�� ���Ǹ���һ�����
            Class<?> aClass = Class.forName("cn.designPattern.dp.creator._3_abstractFactory.example3.MysqlUser");
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            return (UserDao) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
