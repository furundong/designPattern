package cn.designPattern.dp.structure._5_Chain.demo1;

import java.util.ArrayList;
import java.util.Random;

/**
 * create by Freedom on 2021/3/8
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4),
                    "我要出去逛街"));
        }
//定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : arrayList) {
            if (women.getType() == 1) { //未结婚少女，请示父亲
                System.out.println("\n--------女儿向父亲请示------- ");
                father.HandleMessage(women);
            } else if (women.getType() == 2) { //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示------- ");
                husband.HandleMessage(women);
            } else if (women.getType() == 3) { //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------  ");
                son.HandleMessage(women);
            } else {
//暂时什么也不做
            }
        }
    }
}
/*
这段
代码有以下几个问题：
● 职责界定不清晰
对女儿提出的请示，应该在父亲类中做出决定，父亲有责任、有义务处理女儿的请示，
因此Father类应该是知道女儿的请求自己处理，而不是在Client类中进行组装出来，也就是说
原本应该是父亲这个类做的事情抛给了其他类进行处理，不应该是这样的。
● 代码臃肿
我们在Client类中写了if...else的判断条件，而且能随着能处理该类型的请示人员越
多，if...else的判断就越多，想想看，臃肿的条件判断还怎么有可读性？！
● 耦合过重
这是什么意思呢，我们要根据Women的type来决定使用IHandler的那个实现类来处理请
求。有一个问题是：如果IHandler的实现类继续扩展怎么办？修改Client类？与开闭原则违背
了！
● 异常情况欠考虑
妻子只能向丈夫请示吗？如果妻子（比如一个现代女性穿越到古代了，不懂什么“三从
四德”）向自己的父亲请示了，父亲应该做何处理？我们的程序上可没有体现出来，逻辑失
败了！

看看demo2
 */
