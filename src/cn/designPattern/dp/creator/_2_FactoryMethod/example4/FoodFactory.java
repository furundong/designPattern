package cn.designPattern.dp.creator._2_FactoryMethod.example4;

import java.util.HashMap;
import java.util.Map;

public class FoodFactory {

    private static final Map<String, Food> prMap = new HashMap<>(); //�������spring�����ˡ�

    public static synchronized Food createProduct(String type) { //��������˵��synchronizedû��lock�ã�������ֻ�ṩ˼·
        Food food = null;
        //�ж������Ƿ��У�û�оʹ����� �о�ֱ����
        if (prMap.containsKey(type)) {
            food = prMap.get(type);
        } else {
            if ("1".equals(type)) {   //Ϊʲô1��ǰ�治˵�ˡ�
                food = new Hamburger();
            } else if ("2".equals(type)) {
                food = new Noodle();
            }
            //����������
            prMap.put(type, food);
        }
        return food;
    }
}

/*
����򵥹����ɣ���������ù���������Ҳ�С���˵��ֻд˼·���ṩ��򵥵ķ�����
 */
