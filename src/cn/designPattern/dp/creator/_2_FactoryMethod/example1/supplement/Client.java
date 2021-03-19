package cn.designPattern.dp.creator._2_FactoryMethod.example1.supplement;

interface Food {
    void eat();
}

/**
 * create by Freedom on 2021/1/28
 * <p>
 * 因为使用工厂方法 , 会导致类外的爆棚. 那么我们使用泛型, 可以解决这个问题.
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
        //此时我们可以看到, 如果是用泛型加上反射, 那么在扩展的时候, 其实真正需要扩展的是只需要一个类
    }
}


//============================================
//这是服务器端的代码

//=======================================
//开始扩展
class Lsf implements Food {

    @Override
    public void eat() {
        System.out.println("吃螺蛳粉");
    }
}

class Hamburger implements Food {

    @Override
    public void eat() {
        System.out.println("吃汉堡");
    }
}

class Noodle implements Food {

    @Override
    public void eat() {
        System.out.println("吃面条");
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
