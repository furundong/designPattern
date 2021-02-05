package cn.designPattern.prepare.supplement.type;

/**
 * create by Freedom on 2021/1/28
 */
public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("freedom");
        System.out.println(student.getName());
        StudentType<Integer> studentType = new StudentType<>();
        studentType.setName(11111);
        System.out.println(studentType.getName());

        StudentStatic<String> like = StudentStatic.create("like");
        System.out.println("like.getName() = " + like.getName());
    }
}

//������ʹ�÷���

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class StudentType<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}


//��̬���� , ���T�������Ͳ���,  StudentStatic<T>��������������
class StudentStatic<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public StudentStatic(T name) {
        this.name = name;
    }

   /*  public static StudentStatic<T> create(T name) {
        return new StudentStatic<T>(name);
    }
        ��������ᵼ�±�����������޷��ھ�̬����create()�ķ��������ͷ���������ʹ�÷�������T
        ��ʵ���Ϻ����ͷ��Ͳ����йأ��㿴����һ�ھ������ˡ�

        ��Ϊ��ͨ�ķ�����ͨ�����ʵ�������õģ�����ʵ���Ĺ��̵����˹��췽����Ҳ����˵�����Ѿ�֪�����ʱ�������涨���<T>�ľ��������ˣ�

        ����̬��������Ҫ����ʵ�������ã�����Ҳ�Ͳ�֪��<T>�ľ������ͣ����������������������������Ա����ʱ��ͱ����ˡ�

        ��̬��������������ļ��ض����أ����ܷ�����ķ��ͣ���Ϊ�ڴ��������ʱ���ȷ��������˱��붨���Լ��ķ�������


    */

    //���ʱ������Է��� , ��static�����һ��t , ��������.
    //  <T>����static���棬��������Ϊ��Ȼ��̬������֪��StudentStatic����ľ������ͣ�����ֶ��ĸ�������������͡�
    //��ʵ���ϣ����<T>StudentStatic<T>���͵�<T>�Ѿ�û���κι�ϵ�ˡ�
//    public static <T> StudentStatic<T> create(T name) {
//        return new StudentStatic<T>(name);
//    }

    //�������հ汾����.
    public static <K> StudentStatic<K> create(K name) {
        return new StudentStatic<K>(name);
    }

}
