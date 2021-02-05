package cn.designPattern.prepare.supplement.reflection.ormDemo;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * create by Freedom on 2021/2/2
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    //模拟hibernate....
    private final Class<?> cls;
    private final String tableName;
    //这里我就不连数据库了. 太浪费我时间....你们想连接的,建议用jdbc这里在crud方法上自己加数据源


    //哪个子类调的这个方法，得到的class就是子类处理的类型（非常重要）
    public BaseDaoImpl() {
        Class<?> clazz = this.getClass();  //拿到的是子类
        ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();  //BaseDao<User>
        cls = (Class<?>) pt.getActualTypeArguments()[0];
        tableName = cls.getSimpleName();
    }


    @Override
    public String save(T t) {
        //通过映射获取实体类中的属性
        Field[] fields = cls.getDeclaredFields();//获取类所有属性
        //将要拼接的sql拆开
        StringBuilder sqlbf1 = new StringBuilder("insert into " + tableName + " (");//存列名
        StringBuilder sqlbf2 = new StringBuilder(" values (");
        for (Field f : fields) {
            f.setAccessible(true);//私有属性设为可读
            sqlbf1.append(f.getName()).append(",");
            try {
                //如果这里是需要判断日期, 比如new Date(), 使用getType()：返回字段类型，也是一个Class实例
                // 请用simpleDateFormat将日期转换.
                if (f.get(t) == null) {
                    sqlbf2.append("null,");
                } else {
                    sqlbf2.append("'").append(f.get(t)).append("',");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String sql1 = sqlbf1.substring(0, sqlbf1.length() - 1) + ")";
        String sql2 = sqlbf2.substring(0, sqlbf2.length() - 1) + ")";
        return sql1 + sql2;
    }

    @Override
    public String findAll() {
        return "select * from " + tableName;
    }

    @Override
    public String findById(T t) {
        //通过映射获得所有属性
        Field[] fields = cls.getDeclaredFields();
        if (!hasFieldId(fields)) {
            try {
                throw new Exception("没有id");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //1=1  方便sql的拼接
        StringBuilder sqlsb = new StringBuilder("select * from " + tableName + " where 1=1");
        List<Object> params = new ArrayList<>();//存取属的值
        List<String> fieldNameList = new ArrayList<>();//存取属性名, 查完了用这个很快就能转化为bean, 建议重新写个方法. 我就提供思路
        //判读所有属性值是否为空
        boolean paramsFlag = true;
        for (Field f : fields) {
            f.setAccessible(true);//将属性设为可读的
            fieldNameList.add(f.getName());//将属性名全部添加到容器中
            try {
                //判断该属性的值是否为空  +""将任何类型转换为字符串
                if (f.get(t) != null) {
//                    sqlsb.append(" and ").append(f.getName()).append("=? ");//在sql上添加查询条件
                    params.add(f.get(t));//将该值添加到容器中
                    sqlsb.append(" and ").append(f.getName()).append("= ").append("'").append(f.get(t)).append("'");//在sql上添加查询条件
                    paramsFlag = false;//将属性值改为不全部为空
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (paramsFlag) {//属性值权为空  返回空的对象
            return null;
        }
        //返回该对象
        return sqlsb.toString();
    }


    //删除跟修改是一样的道理, 自己做把. 如果不想根据id删除,那么你就再定义一个方法, boolean delete(string name,string value,T t) name是字段名
    @Override
    public String deleteById(T t) {
        return null;
    }

    @Override
    public String updateById(T t) {
        StringBuilder condition = new StringBuilder();
        //通过映射获得所有属性
        Field[] fields = cls.getDeclaredFields();
        if (!hasFieldId(fields)) {
            try {
                throw new Exception("没有id");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //UPDATE Person SET FirstName = 'Fred' WHERE LastName = 'Wilson'
        StringBuilder sqlsb = new StringBuilder("update " + tableName + " set ");
        for (Field f : fields) {
            f.setAccessible(true);//私有属性设为可读
            if (f.getName().equals("id")) {
                try {
                    condition.append("id = '").append(f.get(t)).append("'");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                continue;
            }
            sqlsb.append(f.getName()).append("=");
            try {
                //如果这里是需要判断日期, 比如new Date(), 使用getType()：返回字段类型，也是一个Class实例
                // 请用simpleDateFormat将日期转换.
                if (f.get(t) == null) {
                    sqlsb.append("null and ");
                } else {
                    sqlsb.append("'").append(f.get(t)).append("' and ");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String sql1 = sqlsb.substring(0, sqlsb.length() - 5);
        sql1 += " where "+condition;
        return sql1;
    }

    boolean hasFieldId(Field[] fields) {
        List<String> list = new ArrayList<>();
        for (Field field : fields) {
            list.add(field.getName());
        }
        return list.contains("id");
    }
}
