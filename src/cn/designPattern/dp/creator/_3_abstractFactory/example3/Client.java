package cn.designPattern.dp.creator._3_abstractFactory.example3;

public class Client {
    public static void main(String[] args) {
        UserDao userDao = DataAccess.createUser();
        if (userDao != null) {
            userDao.insert();
            userDao.udpate();
        }
    }
}
