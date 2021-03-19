package cn.designPattern.dp.structure._4_composite.demo3;

/**
 * create by Freedom on 2021/3/3
 * <p>
 * ���������Ӧ�ó����һЩ���ԵĶ���������Ȼ�����������ʵ����
 */
public abstract class Corp {
    //��˾ÿ���˶�������
    private String name = "";
    //��˾ÿ���˶�ְλ
    private String position = "";
    //��˾ÿ���˶���нˮ
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
