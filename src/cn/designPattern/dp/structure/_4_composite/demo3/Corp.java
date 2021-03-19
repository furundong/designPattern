package cn.designPattern.dp.structure._4_composite.demo3;

/**
 * create by Freedom on 2021/3/3
 * <p>
 * 抽象类嘛，就应该抽象出一些共性的东西出来，然后看两个具体的实现类
 */
public abstract class Corp {
    //公司每个人都有名称
    private String name = "";
    //公司每个人都职位
    private String position = "";
    //公司每个人都有薪水
    private int salary = 0;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Corp{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
