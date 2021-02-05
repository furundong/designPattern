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

//基本的使用泛型

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


//静态方法 , 这个T就是类型参数,  StudentStatic<T>叫做参数化类型
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
        上述代码会导致编译错误，我们无法在静态方法create()的方法参数和返回类型上使用泛型类型T
        这实际上和类型泛型擦除有关，你看了下一节就明白了。

        因为普通的方法是通过类的实例来调用的，创建实例的过程调用了构造方法，也就是说对象已经知道这个时候类上面定义的<T>的具体类型了；

        而静态方法不需要对象实例来调用，所以也就不知道<T>的具体类型，虚拟机不允许这种情况发生，所以编译的时候就报错了。

        静态方法由于随着类的加载而加载，不能访问类的泛型（因为在创建对象的时候才确定），因此必须定义自己的泛型类型


    */

    //这个时候你可以发现 , 在static后面加一个t , 就能用了.
    //  <T>放在static后面，你可以理解为既然静态方法不知道StudentStatic里面的具体类型，你就手动的告诉它具体的类型。
    //但实际上，这个<T>StudentStatic<T>类型的<T>已经没有任何关系了。
//    public static <T> StudentStatic<T> create(T name) {
//        return new StudentStatic<T>(name);
//    }

    //所以最终版本如下.
    public static <K> StudentStatic<K> create(K name) {
        return new StudentStatic<K>(name);
    }

}
