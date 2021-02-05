package cn.designPattern.prepare.supplement.type.demo4;

/**
 * create by Freedom on 2021/1/28
 * 使用extends通配符
 */
public class Demo4 {
    public static void main2(String[] args) {
        int sum = PairHelper.add(new Pair<>(1, 2));
        //注意：传入的类型是Pair<Number>，实际参数类型是(Integer, Integer)。
        System.out.println("sum = " + sum);
        //这样是没有问题的.
    }

    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(123, 456);
        int n = PairHelper.add(p);   //如果没有使用extends 继承number, 会出现编译错误
        System.out.println(n);
    }

    //super跟extends差不多 , 他俩相反,用法相似 . 就不扩展了

}

