package cn.designPattern.dp.structure._4_composite.demo2;

/**
 * create by Freedom on 2021/3/3
 */
public class Leaf implements ILeaf {
    //С��Ҳ������
    private String name = "";
    //С��Ҳ��ְλ
    private String position = "";
    //С��Ҳ��нˮ������˭�����
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
