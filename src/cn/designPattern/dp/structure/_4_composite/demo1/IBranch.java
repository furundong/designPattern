package cn.designPattern.dp.structure._4_composite.demo1;

import java.util.ArrayList;

public interface IBranch {
    //获得信息
    public String getInfo();

    //增加数据节点，例如研发部下设的研发一组
    public void add(IBranch branch);

    //增加叶子节点
    public void add(ILeaf leaf);

    //获得下级信息
    public ArrayList getSubordinateInfo();
}
