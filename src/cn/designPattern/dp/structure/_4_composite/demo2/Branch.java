package cn.designPattern.dp.structure._4_composite.demo2;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 */
public class Branch implements IBranch {
    //�쵼�±�����Щ�¼��쵼��С��
    ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
    //�쵼Ҳ���ˣ�Ҳ������
    private String name = "";
    //�쵼���쵼��ͬ��Ҳ��ְλ����
    private String position = "";
    //�쵼Ҳ����нˮ��
    private int salary = 0;

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String getInfo() {
        return toString();
    }
}
