package cn.designPattern.dp.creator._3_abstractFactory.example2;

public class MySqlFactory implements IFactory {
    @Override
    public UserDao createUser() {
        return new MysqlUser();
    }

    @Override
    public DepartmentDao createDepartment() {
        return new MysqlDepartment();
    }
}
