package cn.designPattern.dp.creator._3_abstractFactory.example2;

public class OracleUser implements UserDao {
    @Override
    public void insert() {
        System.out.println("Oracle插入user表");
    }

    @Override
    public void udpate() {
        System.out.println("Oracle更新user表");
    }
}
