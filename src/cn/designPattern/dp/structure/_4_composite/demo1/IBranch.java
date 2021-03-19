package cn.designPattern.dp.structure._4_composite.demo1;

import java.util.ArrayList;

public interface IBranch {
    //�����Ϣ
    public String getInfo();

    //�������ݽڵ㣬�����з���������з�һ��
    public void add(IBranch branch);

    //����Ҷ�ӽڵ�
    public void add(ILeaf leaf);

    //����¼���Ϣ
    public ArrayList getSubordinateInfo();
}
