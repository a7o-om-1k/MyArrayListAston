package com.company;

public interface MyArrayList<T>
{
    boolean add(T t);
    boolean add(int index);
    T get(int index);
    T get(T t);
    void set(int index, T t);
    void remove(int index);
    void remove(T t);
    int size();
}
