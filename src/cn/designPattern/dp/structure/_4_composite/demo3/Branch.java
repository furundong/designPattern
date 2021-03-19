package cn.designPattern.dp.structure._4_composite.demo3;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 */
public class Branch extends Corp {
    //领导下边有哪些下级领导和小兵
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
