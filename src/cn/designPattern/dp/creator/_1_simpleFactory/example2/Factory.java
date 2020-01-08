package cn.designPattern.dp.creator._1_simpleFactory.example2;

/**
 * 工厂类，用来创建对象
 */
public class Factory {
    public static Food getFood(int condition){
        Food food = null;
        switch (condition){
            case 1:
                food= new Hamburger();
            case 2:
                food= new Noodle();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + condition);
        }
        return food;
    }
}
