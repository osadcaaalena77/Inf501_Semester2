package ru.itis.inf501.lab2_4_homework_iterator;

import java.util.Iterator;

public interface Set501<T> {
    int size();
    boolean checkEmpty();
    boolean contains(T o);
    void add(T o);
    void delete(T o);
    void clean();
}
