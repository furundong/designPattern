package cn.designPattern.prepare.supplement.reflection;

/**
 * create by Freedom on 2021/2/1
 */
public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        //���ַ�ʽ����Class
        //1. ͨ��class�ľ�̬����
        Class<String> aClass1 = String.class;

        //2. ʵ������
        String s = "s";
        Class<? extends String> aClass2 = s.getClass();

        // 3. ���֪��һ��class����������������ͨ����̬����Class.forName()��ȡ��
        Class cls = Class.forName("java.lang.String");


        //˵��string��jvm��ֻ��һ��Classʵ��
        System.out.println(aClass1 == aClass2 && aClass1 == cls && aClass2 == cls);

//        Class�����кܶ�ķ���, �������ܻ�ȡ����, �ж��Ƿ�������type, ���廹�ǿ�api��
    }
}
