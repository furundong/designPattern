package cn.designPattern.prepare.supplement.reflection.FieldDemo;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

/**
 * create by Freedom on 2021/2/1
 *
 * Field getField(name)：根据字段名获取某个public的field（包括父类）
 * Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
 * Field[] getFields()：获取所有public的field（包括父类）
 * Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
 */
public class FieldDemo {
    public static void main2(String[] args) throws Exception {
        Class stdClass = Student.class;
        // 获取public字段"score":
        Field score = stdClass.getField("score");
        System.out.println(score);
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        Field grade = stdClass.getDeclaredField("grade");
        System.out.println(grade);

        System.out.println(Arrays.toString(stdClass.getFields()));
        System.out.println(Arrays.toString(stdClass.getDeclaredFields()));


        //那么这个field对象, 里面也是有很多信息的.
//        getName()：返回字段名称，例如，"name"；
//        getType()：返回字段类型，也是一个Class实例，例如，String.class；
//        getModifiers()：返回字段的修饰符，它是一个int，不同的bit表示不同的含义。
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

