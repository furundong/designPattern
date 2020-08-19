package cn.designPattern.dp.creator._5_Prototype.example4;

import java.io.*;
import java.util.ArrayList;

public class Thing implements Cloneable ,Serializable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    /* @Override
    protected Thing clone() throws CloneNotSupportedException {
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
            thing.arrayList = (ArrayList<String>)this.arrayList.clone();
            //千万不要些这种代码！ 如果你的成员i变量还有Date类型的呢。有10多个呢？一个个写？
            //二级制流写，他不香吗！看另一个
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //我们用二进制流来操作对象把， 就是序列化。稍后附上一个io继承图。
        // 没有这图我写不出来。哈哈哈哈。可以看到有关联的就是ObjectOutputStream
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos); //对象流(序列化流)装饰内存流，后面我们在学，记住io就是装饰者模式
            oos.writeObject(this);//开始序列化
            oos.close();  //关流只关上层流，具体为什么，等学到装饰着模式就知道了。

            //从内存中读取数据。到时候给内存流
            byte[] bytes = bos.toByteArray();

            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object o = ois.readObject();
            ois.close();

            return o;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }
}

/*
顺带提一句：
要使用clone方法，类的成员变量上不要增加final关键字。
    final类型你还想重赋值？？？？？学javase去吧!
 */