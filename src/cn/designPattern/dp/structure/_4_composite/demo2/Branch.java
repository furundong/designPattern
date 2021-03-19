package cn.designPattern.dp.structure._4_composite.demo2;

import java.util.ArrayList;

/**
 * create by Freedom on 2021/3/3
 */
public class Branch implements IBranch {
    //领导下边有哪些下级领导和小兵
    ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
    //领导也是人，也有名字
    private String name = "";
    //领导和领导不同，也是职位区别
    private String position = "";
    //领导也是拿薪水的
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
