package cn.designPattern.dp.creator._5_Prototype.example3;

import java.util.ArrayList;

public class Thing implements Cloneable {
    //����һ��˽�б���
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Thing clone() throws CloneNotSupportedException {
        return (Thing) super.clone();
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }
}
