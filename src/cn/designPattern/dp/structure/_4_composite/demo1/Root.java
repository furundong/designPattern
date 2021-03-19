package cn.designPattern.dp.structure._4_composite.demo1;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 */
public class Root implements IRoot {

    //������ڵ��µ���֦�ڵ����Ҷ�ڵ㣬Subordinate����˼���¼�
    private ArrayList subordinateList = new ArrayList();
    //���ڵ������
    private String name = "";
    //���ڵ��ְλ
    private String position = "";
    //���ڵ��нˮ
    private int salary = 0;

    //ͨ�����캯�����ݽ����ܾ������Ϣ
    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //������֦�ڵ�
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    //����Ҷ�ӽڵ㣬�������飬ֱ���������ܾ���
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    //�õ��Լ�����Ϣ
    public String getInfo() {
        String info = "";
        info = "���ƣ�" + this.name;
        ;
        info = info + "\tְλ��" + this.position;
        info = info + "\tнˮ�� " + this.salary;
        return info;
    }

    //�õ��¼�����Ϣ
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }

}
