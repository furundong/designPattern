package cn.designPattern.dp.behavior._2_Iterator.example2;

/**
 * 由于我们这里得店铺都没有 使用根据接口编写，所有这个就暂时使用泛型
 * <p>
 * 这个迭代器java已经内置了. 完全可以用java里面的Iterator
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();

}
