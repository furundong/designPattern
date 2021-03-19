package cn.designPattern.dp.creator._2_FactoryMethod.example3;


import java.lang.reflect.Constructor;

/*
    ͨ�����䷽ʽ����
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class<?> aClass = Class.forName(Singleton.class.getName());//�����������Զ���ʼ���� �򵥹�������˵���ˡ�
            //�õ��޲ι���  �� ���������ô����
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
