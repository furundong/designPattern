package cn.designPattern.dp.structure._4_composite.demo3;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 */
public class Branch extends Corp {
    //�쵼�±�����Щ�¼��쵼��С��
    ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
