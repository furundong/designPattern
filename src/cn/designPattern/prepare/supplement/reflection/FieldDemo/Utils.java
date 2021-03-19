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
        Field[] fields = aClass.getDeclaredFields(); //������ﶼ��Ҫ, ��ô�ҽ�����ʹ��getFields()����,Ȼ��ȡ����field[]�Ĳ���
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            //��������޸�, ��������ʲô�߼��ж�, ��ôʹ��Field.set(Object, Object) ,
            Object o = field.get(object);
            map.put(name, o);
        }
        return map;
    }
}
