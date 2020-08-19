package cn.designPattern.dp.creator._3_abstractFactory.example2;

public class MysqlUser implements UserDao {
    @Override
    public void insert() {
        System.out.println("MySql插入user表");
    }

    @Override
    public void udpate() {
        System.out.println("MySql更新user表");
    }
}
