package cn.designPattern.dp.behavior._2_Iterator.example2;

import cn.designPattern.dp.behavior._2_Iterator.bean.MenuItem;

import java.util.Iterator;

/**
 * create by Freedom on 2020/7/2
 * 根据example1里面得问题， 那么我们自己封装一个迭代器对象。统一遍历解决
 */
public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Iterator<MenuItem> iterator = pancakeHouseMenu.createIterator();
        while (iterator.hasNext()) {
            MenuItem next = iterator.next();
            System.out.println("next = " + next);
        }
        DinerMenu dinerMenu = new DinerMenu();
        Iterator<MenuItem> iterator1 = dinerMenu.createIterator();
        while (iterator1.hasNext()) {
            MenuItem next = iterator1.next();
            System.out.println("next = " + next);
        }
    }
}
/*
此时就是一个迭代器模式，你所知道得一件事， 它依赖于一个名为迭代器得接口，这个方法告诉我们hasnext（），以及next（），
现在我们有这个接口，就可以实现各种对象集合，不管是数组，列表，散列表。
这里我用了内部类实现迭代器，你用实现是一样的。

随带提一句， java的迭代器删除会出bug，是因为他自己有删除的方法，然后你用迭代器的删除，就不会报错，
如果你用list的，那么他中间有两个变量是不一样的， 这里当然就出bug了。
 */
