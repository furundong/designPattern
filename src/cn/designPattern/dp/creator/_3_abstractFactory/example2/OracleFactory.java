package cn.designPattern.dp.creator._3_abstractFactory.example2;

public class OracleFactory implements IFactory {
    @Override
    public UserDao createUser() {
        return new OracleUser();
    }

    @Override
    public DepartmentDao createDepartment() {
        return new OracleDepartment();
    }
}
