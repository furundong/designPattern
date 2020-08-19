package cn.designPattern.dp.behavior._2_Iterator.example1;

import cn.designPattern.dp.behavior._2_Iterator.bean.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * create by Freedom on 2020/7/2
 */
public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> menuList1 = pancakeHouseMenu.getMenuList();
        for (MenuItem menuItem : menuList1) {
            System.out.println("menuItem = " + menuItem);
        }

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] menuList = dinerMenu.getMenuList();

        System.out.println(Arrays.toString(menuList));
    }
}
/*
此时我们就可以看出问题在哪里，pancake煎饼用的是arraylist，而diner用的数组，造成了遍历都不统一，
如果这个时候扩大营业，出来了第三种hashtable，那岂不是跟麻烦了。

1. 我们的旗下店铺都没有根据接口去编写代码
2. alice也没有实现api
3. 如果出现了第三种存储方式，又需要重新写了。
4. 我们的main需要知道店铺里面的数据结构，这个就违反了开闭原则
5. 打印菜单都是遍历，我们是重复的代码

但是现在两个店铺都不肯让步，那么我们该怎么办！如果我们可以让菜单的实现（店铺）都用都一个相同的接口，那么这个问题就可以解决。
但是getMenuList()返回值不一样， 但是店铺是一样的。 那么我们觉得解决了。
 */
