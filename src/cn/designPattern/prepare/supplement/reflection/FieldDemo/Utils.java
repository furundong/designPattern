package cn.designPattern.prepare.supplement.reflection.FieldDemo;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * create by Freedom on 2021/2/1
 */
class Utils {
    public static Map<String, Object> getObjValue(Object object) throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        Class<?> aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields(); //如果这里都想要, 那么我建议再使用getFields()方法,然后取两个field[]的并集
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            //如果你想修改, 或者是有什么逻辑判断, 那么使用Field.set(Object, Object) ,
            Object o = field.get(object);
            map.put(name, o);
        }
        return map;
    }
}
