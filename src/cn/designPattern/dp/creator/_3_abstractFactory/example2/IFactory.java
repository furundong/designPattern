package cn.designPattern.dp.creator._3_abstractFactory.example2;

public interface IFactory {
    UserDao createUser();

    DepartmentDao createDepartment();
}
