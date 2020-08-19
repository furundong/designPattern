package cn.designPattern.dp.behavior._2_Iterator.example1;

import cn.designPattern.dp.behavior._2_Iterator.bean.MenuItem;

/**
 * create by Freedom on 2020/7/2
 * 此时我们需要一个点餐系统
 */
public interface Alice {
    void printMenu();
    void printBreakfastMenu();
    void printLunchMenu();
    void printVegetarianMenu();
    MenuItem isItemVegetarian(String name);
}
