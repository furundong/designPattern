package cn.designPattern.dp.creator._2_FactoryMethod.example1.supplement;

interface Food {
    void eat();
}

/**
 * create by Freedom on 2021/1/28
 * <p>
 * ��Ϊʹ�ù������� , �ᵼ������ı���. ��ô����ʹ�÷���, ���Խ���������.
 */
public class Client {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Hamburger hamburger = foodFactory.createFood(Hamburger.class);
        hamburger.eat();
        Noodle noodle = foodFactory.createFood(Noodle.class);
        noodle.eat();

        Lsf lsf = foodFactory.createFood(Lsf.class);
        lsf.eat();
        //��ʱ���ǿ��Կ���, ������÷��ͼ��Ϸ���, ��ô����չ��ʱ��, ��ʵ������Ҫ��չ����ֻ��Ҫһ����
    }
}


//============================================
//���Ƿ������˵Ĵ���

//=======================================
//��ʼ��չ
class Lsf implements Food {

    @Override
    public void eat() {
        System.out.println("�����Ϸ�");
    }
}

class Hamburger implements Food {

    @Override
    public void eat() {
        System.out.println("�Ժ���");
    }
}

class Noodle implements Food {

    @Override
    public void eat() {
        System.out.println("������");
    }
}

abstract class AbstractFoodFactory {
    public abstract <T extends Food> T createFood(Class<T> clazz);
}

class FoodFactory extends AbstractFoodFactory {

    @Override
    public <T extends Food> T createFood(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
