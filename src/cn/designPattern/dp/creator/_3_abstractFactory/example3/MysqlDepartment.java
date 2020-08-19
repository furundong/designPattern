package cn.designPattern.dp.creator._3_abstractFactory.example3;

public class MysqlDepartment implements DepartmentDao {

    @Override
    public void insert() {
        System.out.println("MySql插入department表");
    }

    @Override
    public void udpate() {
        System.out.println("MySql更新department表");
    }
}
