package cn.designPattern.prepare.supplement.type.demo5;

/**
 * create by Freedom on 2021/1/28
 */
public class Main {
    public static void main(String[] args) {
        Pair<Number> p1 = new Pair<>(12.3, 4.56);
        Pair<Integer> p2 = new Pair<>(123, 456);
        setSame(p1, 100);
        setSame(p2, 200);
        System.out.println(p1.getFirst() + ", " + p1.getLast());
        System.out.println(p2.getFirst() + ", " + p2.getLast());
        Number first = p1.getFirst();
        Number last = p1.getLast();
        Integer first1 = p2.getFirst();
        System.out.println("first1 = " + first1);
    }

    static void setSame(Pair<? super Integer> p, Integer n) {
        p.setFirst(n);
        p.setLast(n);
        //Object obj  = p.getFirst(); 这里只可能用object, 她的方法签名是? super Integer getFirst();,
    }

}
