package cn.designPattern.dp.creator._4_singleton.example5;

/*
��̬�ڲ���
 */
public enum  Singleton {
    INSTANCE;

    Singleton(){}
}
/*
Ӧ������򵥵ķ����ɣ�ö�ٹ��캯��Ϊ˽�У������ٴ���ö�ٶ���ö�ٶ���������ͳ�ʼ��������static���У���JVM��ClassLoader���Ʊ�֤���̵߳İ�ȫ�ԡ�
Singleton4.INSTANCE������Singleton4��Ψһʵ����
 */
