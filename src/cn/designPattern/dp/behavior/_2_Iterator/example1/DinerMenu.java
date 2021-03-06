package cn.designPattern.dp.behavior._2_Iterator.example1;

import cn.designPattern.dp.behavior._2_Iterator.bean.MenuItem;

import java.util.Arrays;

/**
 * create by Freedom on 2020/7/2
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItem = 0;
    MenuItem[] menuList = new MenuItem[MAX_ITEMS];

    public DinerMenu() {

        addItem("first blt", "blt a Hotdog ", true, 1.99d);
        addItem("second pancake", "blt a soup on day", false, 3.99d);
        addItem("third pancake", "blt A bacon-lettuce-and-tomato sandwich carryout.", true, 5.88d);
    }


    private void addItem(String name, String description, Boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItem >= MAX_ITEMS) {
            System.out.println("menu is full,you can't add menuItem,sorry");
        } else {
            menuList[numberOfItem++] = menuItem;
        }
    }

    public MenuItem[] getMenuList() {
        return menuList;
    }

    @Override
    public String toString() {
        return "DinerMenu{" +
                "numberOfItem=" + numberOfItem +
                ", menuList=" + Arrays.toString(menuList) +
                '}';
    }
}
