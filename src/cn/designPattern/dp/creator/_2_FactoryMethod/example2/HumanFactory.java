package cn.designPattern.dp.creator._2_FactoryMethod.example2;

public class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> c) {
//定义一个生产的人种
        Human human = null;
        try {
//产生一个人种
            System.out.println("c.getName() = " + c.getName());
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}
