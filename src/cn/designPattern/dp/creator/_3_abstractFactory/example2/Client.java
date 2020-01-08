package cn.designPattern.dp.creator._3_abstractFactory.example2;

/*
    我们来看看dao的数据库实现方式是怎么实现的，为什么，你该个数据驱动，改改配置，就可以用另一种数据库了的原理。

     数据库有User表跟Department表。 就做这个实例。
 */
public class Client {
    public static void main(String[] args) {
//        IFactory oracleFactory = new OracleFactory(); //看你要哪个工厂了。只需要修改这里。 其余的都在jar包里面做好了。
        IFactory mySqlFactory = new MySqlFactory();
        DepartmentDao departmentDao = mySqlFactory.createDepartment();
        departmentDao.insert();
        departmentDao.udpate();
        UserDao userDao = mySqlFactory.createUser();
        userDao.insert();
        userDao.udpate();
    }
}

/*
 这样扩展是很方便得，你又来一个sqlServerFactory，直接扩充。 sqlServerUser，根据工厂直接得到，直接操作

 example1我们说到，如果是又来了一个产品等级，那么扩展是有问题得。
 比如你突然来了个产品Salary，那么，不是要在具体的方法里面重新写嘛，所以出现了问题。

    但是！！人家已经用反射弄好了。反射就是神奇。

那就来试试吧。 见证example3。顺带提一句，抽象工厂是可以用简单工厂代替的，因为两者优缺点相似！！！！所以我们就用简单工厂来写。类真的太多啦！
 */