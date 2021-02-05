package cn.designPattern.dp.creator._2_FactoryMethod.example4;

import java.util.HashMap;
import java.util.Map;

public class FoodFactory {

    private static final Map<String, Food> prMap = new HashMap<>(); //这个就是spring容器了。

    public static synchronized Food createProduct(String type) { //可能有人说，synchronized没有lock好，我这里只提供思路
        Food food = null;
        //判断容器是否有，没有就创建， 有就直接拿
        if (prMap.containsKey(type)) {
            food = prMap.get(type);
        } else {
            if ("1".equals(type)) {   //为什么1在前面不说了。
                food = new Hamburger();
            } else if ("2".equals(type)) {
                food = new Noodle();
            }
            //放入容器中
            prMap.put(type, food);
        }
        return food;
    }
}

/*
很像简单工厂吧，这里如果用工厂方法，也行。我说了只写思路。提供最简单的方法。
 */
