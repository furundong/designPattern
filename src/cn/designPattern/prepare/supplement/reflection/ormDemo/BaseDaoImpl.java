package cn.designPattern.prepare.supplement.reflection.ormDemo;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * create by Freedom on 2021/2/2
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    //ģ��hibernate....
    private final Class<?> cls;
    private final String tableName;
    //�����ҾͲ������ݿ���. ̫�˷���ʱ��....���������ӵ�,������jdbc������crud�������Լ�������Դ


    //�ĸ������������������õ���class�������ദ������ͣ��ǳ���Ҫ��
    public BaseDaoImpl() {
        Class<?> clazz = this.getClass();  //�õ���������
        ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();  //BaseDao<User>
        cls = (Class<?>) pt.getActualTypeArguments()[0];
        tableName = cls.getSimpleName();
    }


    @Override
    public String save(T t) {
        //ͨ��ӳ���ȡʵ�����е�����
        Field[] fields = cls.getDeclaredFields();//��ȡ����������
        //��Ҫƴ�ӵ�sql��
        StringBuilder sqlbf1 = new StringBuilder("insert into " + tableName + " (");//������
        StringBuilder sqlbf2 = new StringBuilder(" values (");
        for (Field f : fields) {
            f.setAccessible(true);//˽��������Ϊ�ɶ�
            sqlbf1.append(f.getName()).append(",");
            try {
                //�����������Ҫ�ж�����, ����new Date(), ʹ��getType()�������ֶ����ͣ�Ҳ��һ��Classʵ��
                // ����simpleDateFormat������ת��.
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
        //ͨ��ӳ������������
        Field[] fields = cls.getDeclaredFields();
        if (!hasFieldId(fields)) {
            try {
                throw new Exception("û��id");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //1=1  ����sql��ƴ��
        StringBuilder sqlsb = new StringBuilder("select * from " + tableName + " where 1=1");
        List<Object> params = new ArrayList<>();//��ȡ����ֵ
        List<String> fieldNameList = new ArrayList<>();//��ȡ������, ������������ܿ����ת��Ϊbean, ��������д������. �Ҿ��ṩ˼·
        //�ж���������ֵ�Ƿ�Ϊ��
        boolean paramsFlag = true;
        for (Field f : fields) {
            f.setAccessible(true);//��������Ϊ�ɶ���
            fieldNameList.add(f.getName());//��������ȫ����ӵ�������
            try {
                //�жϸ����Ե�ֵ�Ƿ�Ϊ��  +""���κ�����ת��Ϊ�ַ���
                if (f.get(t) != null) {
//                    sqlsb.append(" and ").append(f.getName()).append("=? ");//��sql����Ӳ�ѯ����
                    params.add(f.get(t));//����ֵ��ӵ�������
                    sqlsb.append(" and ").append(f.getName()).append("= ").append("'").append(f.get(t)).append("'");//��sql����Ӳ�ѯ����
                    paramsFlag = false;//������ֵ��Ϊ��ȫ��Ϊ��
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (paramsFlag) {//����ֵȨΪ��  ���ؿյĶ���
            return null;
        }
        //���ظö���
        return sqlsb.toString();
    }


    //ɾ�����޸���һ���ĵ���, �Լ�����. ����������idɾ��,��ô����ٶ���һ������, boolean delete(string name,string value,T t) name���ֶ���
    @Override
    public String deleteById(T t) {
        return null;
    }

    @Override
    public String updateById(T t) {
        StringBuilder condition = new StringBuilder();
        //ͨ��ӳ������������
        Field[] fields = cls.getDeclaredFields();
        if (!hasFieldId(fields)) {
            try {
                throw new Exception("û��id");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //UPDATE Person SET FirstName = 'Fred' WHERE LastName = 'Wilson'
        StringBuilder sqlsb = new StringBuilder("update " + tableName + " set ");
        for (Field f : fields) {
            f.setAccessible(true);//˽��������Ϊ�ɶ�
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
                //�����������Ҫ�ж�����, ����new Date(), ʹ��getType()�������ֶ����ͣ�Ҳ��һ��Classʵ��
                // ����simpleDateFormat������ת��.
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
