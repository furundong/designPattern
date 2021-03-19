package cn.designPattern.dp.structure._4_composite.demo2;

/**
 * create by Freedom on 2021/3/3
 */
public class Leaf implements ILeaf {
    //小兵也有名称
    private String name = "";
    //小兵也有职位
    private String position = "";
    //小兵也有薪水，否则谁给你干
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return toString();
    }
}
