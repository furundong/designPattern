package cn.designPattern.prepare.supplement.type.demo4;

/**
 * create by Freedom on 2021/1/28
 */
public class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }

    public void setFirst(T first) {
        this.first = first;
    }
}
