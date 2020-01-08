package cn.designPattern.dp.creator._3_abstractFactory.example2;

public class OracleDepartment implements DepartmentDao {
    @Override
    public void insert() {
        System.out.println("Oracle插入Department表");
    }

    @Override
    public void udpate() {
        System.out.println("Oracle更新Department表");
    }
}
