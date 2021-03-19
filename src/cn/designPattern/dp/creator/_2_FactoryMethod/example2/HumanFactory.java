package cn.designPattern.dp.creator._2_FactoryMethod.example2;

public class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> c) {
//����һ������������
        Human human = null;
        try {
//����һ������
            System.out.println("c.getName() = " + c.getName());
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("�������ɴ���");
        }
        return (T) human;
    }
}
