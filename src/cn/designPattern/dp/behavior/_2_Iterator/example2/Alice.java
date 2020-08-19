package cn.designPattern.dp.behavior._2_Iterator.example2;

import cn.designPattern.dp.behavior._2_Iterator.bean.MenuItem;

/**
 * create by Freedom on 2020/7/2
 * 此时我们需要一个点餐系统 , 想了下自己实现吧。 后面我用泛型
 */
public interface Alice {
    void printMenu();
    void printBreakfastMenu();
    void printLunchMenu();
    void printVegetarianMenu();
    MenuItem isItemVegetarian(String name);
}
