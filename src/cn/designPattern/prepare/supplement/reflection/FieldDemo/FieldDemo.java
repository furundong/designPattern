package cn.designPattern.prepare.supplement.reflection.FieldDemo;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

/**
 * create by Freedom on 2021/2/1
 *
 * Field getField(name)�������ֶ�����ȡĳ��public��field���������ࣩ
 * Field getDeclaredField(name)�������ֶ�����ȡ��ǰ���ĳ��field�����������ࣩ
 * Field[] getFields()����ȡ����public��field���������ࣩ
 * Field[] getDeclaredFields()����ȡ��ǰ�������field�����������ࣩ
 */
public class FieldDemo {
    public static void main2(String[] args) throws Exception {
        Class stdClass = Student.class;
        // ��ȡpublic�ֶ�"score":
        Field score = stdClass.getField("score");
        System.out.println(score);
        // ��ȡ�̳е�public�ֶ�"name":
        System.out.println(stdClass.getField("name"));
        // ��ȡprivate�ֶ�"grade":
        Field grade = stdClass.getDeclaredField("grade");
        System.out.println(grade);

        System.out.println(Arrays.toString(stdClass.getFields()));
        System.out.println(Arrays.toString(stdClass.getDeclaredFields()));


        //��ô���field����, ����Ҳ���кܶ���Ϣ��.
//        getName()�������ֶ����ƣ����磬"name"��
//        getType()�������ֶ����ͣ�Ҳ��һ��Classʵ�������磬String.class��
//        getModifiers()�������ֶε����η�������һ��int����ͬ��bit��ʾ��ͬ�ĺ��塣
        Class<?> type = grade.getType();
        System.out.println("type = " + type);
        System.out.println(grade.getModifiers());
        System.out.println("score = " + score.getModifiers());


    }

    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.name = "freedom";
        student.score = 11;
        Map<String, Object> map = Utils.getObjValue(student);
        System.out.println(map);
    }
}

