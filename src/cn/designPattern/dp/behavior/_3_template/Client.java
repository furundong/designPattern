package cn.designPattern.dp.behavior._3_template;

/**
 * create by Freedom on 2021/2/5
 */
public class Client {
    public static void main(String[] args) {
        TemplateTime concreteClass = new ConcreteClass();
        concreteClass.template();
    }
}
/*
非常简单，那如果我告诉你这就是模板方法模式你会不会很不屑呢？就这模式，太简单了，
我一直在使用呀！是的，你经常在使用，但你不知道这是模板方法模式，
那些所谓的高手就可以很牛地说：
“用模板方法模式就可以实现”
，你还要很崇拜地看着，哇，牛人，模板方法
模式是什么呀？这就是模板方法模式。
 */
