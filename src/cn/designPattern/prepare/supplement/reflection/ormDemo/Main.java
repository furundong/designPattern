package cn.designPattern.prepare.supplement.reflection.ormDemo;

/**
 * create by Freedom on 2021/2/2
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new UserDao().save(new User("freedom", 12)));
        System.out.println(new UserDao().findById(new User("freedom", 12,"1")));
        System.out.println(new UserDao().findAll());
        System.out.println(new UserDao().updateById(new User("fr",12,"2")));
    }
}
