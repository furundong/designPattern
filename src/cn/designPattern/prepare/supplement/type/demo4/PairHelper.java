package cn.designPattern.prepare.supplement.type.demo4;

/**
 * create by Freedom on 2021/1/28
 */
class PairHelper {
    //    static int add(Pair<Number> p) { //这里最好使用extend
    static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
//        p.setFirst(p.getFirst().intValue()+100); 这里不能修改

        return first.intValue() + last.intValue();
    }


}
