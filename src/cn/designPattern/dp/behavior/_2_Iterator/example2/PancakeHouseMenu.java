package cn.designPattern.dp.behavior._2_Iterator.example2;

import cn.designPattern.dp.behavior._2_Iterator.bean.MenuItem;

import java.util.ArrayList;

/**
 * create by Freedom on 2020/7/2
 * <p>
 * 其中一个店铺就是我们的煎饼果子铺，他就是我们的早餐店
 */
public class PancakeHouseMenu {
    ArrayList<MenuItem> menuList;
    int size = 0;

    public PancakeHouseMenu() {
        menuList = new ArrayList<>();

        addItem("first pancake", "pancake with eggs", true, 2.99d);
        addItem("second pancake", "pancake with blueberries", true, 3.99d);
        addItem("third pancake", "pancake with sausage", true, 4.99d);
    }


    private void addItem(String name, String description, Boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuList.add(menuItem);
        size++;
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public Iterator<MenuItem> createIterator() {
        return new Ite();
    }

    public class Ite implements Iterator<MenuItem> {

        @Override
        public boolean hasNext() {
            return size != 0;
        }

        @Override
        public MenuItem next() {
            return menuList.get(--size);
        }
    }

    @Override
    public String toString() {
        return "PancakeHouseMenu{" +
                "menuList=" + menuList +
                ", size=" + size +
                '}';
    }
}
