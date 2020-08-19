package cn.designPattern.dp.creator._4_singleton.example5;

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println("instance = " + instance);
        System.out.println("instance1 = " + instance1);
        System.out.println(instance == instance1);
    }
}
