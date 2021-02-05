package cn.designPattern.dp.creator._5_Prototype.example4;

public class Client {
    public static void main(String[] args) {
//产生一个对象
        Thing thing = new Thing();
//设置一个值
        thing.setValue("zhangsan");
//拷贝一个对象
        Thing cloneThing = (Thing) thing.clone();
        cloneThing.setValue("lisi");
        System.out.println(thing.getArrayList());
        System.out.println(cloneThing.getArrayList());
    }
}

/*
看看，运行问题。深克隆
Caused by: java.io.NotSerializableException: cn.designPattern.dp.creator._5_Prototype.example4.Thing
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
	at cn.designPattern.dp.creator._5_Prototype.example4.Thing.clone(Thing.java:31)
	... 1 more

	忘记序列化了。。。。。。
 */
