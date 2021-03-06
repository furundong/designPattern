package com.example.dataStructure.heap;

import java.util.Comparator;
import java.util.Set;

/**
 * create by Freedom on 2020/4/26
 */
public abstract class AbstractHeap<E> implements Heap<E> {
    private final Comparator<E> comparator;
    protected int size;

    public AbstractHeap(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public AbstractHeap() {
        this(null);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    protected int compare(E e1, E e2) {
        return comparator != null ? comparator.compare(e1, e2) : ((Comparable) e1).compareTo(e2);
    }

    public abstract Integer addAll(Set<E> set);

}
