package cn.designPattern.dp.creator._3_abstractFactory.example2;

/*
    ����������dao�����ݿ�ʵ�ַ�ʽ����ôʵ�ֵģ�Ϊʲô����ø������������ĸ����ã��Ϳ�������һ�����ݿ��˵�ԭ��

     ���ݿ���User���Department�� �������ʵ����
 */
public class Client {
    public static void main(String[] args) {
//        IFactory oracleFactory = new OracleFactory(); //����Ҫ�ĸ������ˡ�ֻ��Ҫ�޸���� ����Ķ���jar�����������ˡ�
        IFactory mySqlFactory = new MySqlFactory();
        DepartmentDao departmentDao = mySqlFactory.createDepartment();
        departmentDao.insert();
        departmentDao.udpate();
        UserDao userDao = mySqlFactory.createUser();
        userDao.insert();
        userDao.udpate();
    }
}

/*
 ������չ�Ǻܷ���ã�������һ��sqlServerFactory��ֱ�����䡣 sqlServerUser�����ݹ���ֱ�ӵõ���ֱ�Ӳ���

 example1����˵���������������һ����Ʒ�ȼ�����ô��չ��������á�
 ������ͻȻ���˸���ƷSalary����ô������Ҫ�ھ���ķ�����������д����Գ��������⡣

    ���ǣ����˼��Ѿ��÷���Ū���ˡ�����������档

�Ǿ������԰ɡ� ��֤example3��˳����һ�䣬���󹤳��ǿ����ü򵥹�������ģ���Ϊ������ȱ�����ƣ��������������Ǿ��ü򵥹�����д�������̫������
 */